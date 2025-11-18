/**
 * ========================================
 * 深度分析：HTTP网关客户端
 * ========================================
 *
 * 原始文件: c13/nim5/ez8/h5_proto/HttpGatewayClient.java
 *
 * 核心功能：
 * 1. HTTP请求封装
 * 2. AES-256加密（CBC模式）
 * 3. GZIP压缩
 * 4. Base64编码
 *
 * 请求流程：
 * JSON数据 → GZIP压缩 → Base64编码 → AES加密 → HTTP POST
 *
 * 响应流程：
 * HTTP响应 → AES解密 → Base64解码 → GZIP解压 → JSON数据
 *
 * ========================================
 */

package com.gateway.http;

import android.util.Base64;
import org.json.JSONObject;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.SecureRandom;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * HTTP网关客户端
 *
 * 负责所有与后端服务器的通信
 * 使用多层加密和压缩保护数据传输
 */
public class HttpGatewayClient {

    // ========================================
    // 静态常量（已解密）
    // ========================================

    /**
     * AES加密密钥
     *
     * 原始: {18, -63, 110, -6, 107, -11, 61, 100}
     * 密钥: {85, -77, 11, -97, 5, -79, 92, 29}
     * 解密: 需要运行工具确认
     */
    private static final String AES_KEY;  // 待解密

    /**
     * HTTP Content-Type
     *
     * 原始: {-2, -9, -96, -122, 48, -82, -81, -29, -10, -24, -66, -59, 51, -66, -95, -7}
     * 密钥: {-97, -121, -48, -22, 89, -51, -50, -105}
     * 解密: "application/json" (预测)
     */
    private static final String CONTENT_TYPE;  // 待解密

    /**
     * HTTP User-Agent
     *
     * 原始: {-117, -117, -51, -110, 33, -114, 63, -50, -69, -126, -30, -114,
     *        47, -113, 29, -45, -32, -43, -113, -46}
     * 密钥: {-49, -25, -95, -30, 70, -22, 115, -89}
     * 解密: 需要运行工具确认
     */
    private static final String USER_AGENT;  // 待解密

    private final String baseUrl;

    // ========================================
    // 构造函数
    // ========================================

    /**
     * 构造HTTP客户端
     *
     * @param baseUrl 服务器基础URL
     */
    public HttpGatewayClient(String baseUrl) {
        // 原始: 连接baseUrl字符串
        // 可能添加了http://或https://前缀
        this.baseUrl = formatUrl(baseUrl);
    }

    /**
     * 构造HTTP客户端（带端口和协议）
     *
     * @param host 主机名
     * @param port 端口
     * @param useHttps 是否使用HTTPS
     */
    public HttpGatewayClient(String host, int port, boolean useHttps) {
        // 解密协议字符串
        String protocol;
        if (useHttps) {
            // encrypted: {-90, -52, -32, 48, 34, 73, -114, 90}
            // key: {-50, -72, -108, 64, 81, 115, -95, 117}
            protocol = "https://";  // 预测
        } else {
            // encrypted: {-121, -70, 3, -76, 23, -100, -9}
            // key: {-17, -50, 119, -60, 45, -77, -40, -101}
            protocol = "http://";  // 预测
        }
        // 格式: protocol + host + ":" + port
        this.baseUrl = protocol + host + ":" + port;
    }

    // ========================================
    // 核心API调用方法
    // ========================================

    /**
     * 调用加密API
     *
     * 完整流程：
     * 1. JSON对象 → toString()
     * 2. GZIP压缩
     * 3. Base64编码
     * 4. AES加密
     * 5. HTTP POST请求
     * 6. 响应解密（逆序处理）
     *
     * @param endpoint API端点
     * @param requestData 请求JSON数据
     * @return 响应JSON数据
     */
    private JSONObject callAPI(String endpoint, JSONObject requestData) throws Exception {
        // 步骤1: JSON转字符串
        String jsonString = requestData.toString();

        // 步骤2: 获取字节（UTF-8编码）
        byte[] jsonBytes = jsonString.getBytes("UTF-8");

        // 步骤3: GZIP压缩
        byte[] compressed = gzipCompress(jsonBytes);

        // 步骤4: Base64编码
        String base64Encoded = Base64.encodeToString(compressed, Base64.NO_WRAP);

        // 步骤5: AES加密
        byte[] encrypted = aesEncryptString(base64Encoded).getBytes("UTF-8");

        // 步骤6: HTTP请求
        byte[] responseBytes = sendHttpRequest(endpoint, encrypted);

        // 步骤7: 解析响应（UTF-8）
        String responseString = new String(responseBytes, "UTF-8");

        // 步骤8: 返回JSON
        return new JSONObject(responseString);
    }

    /**
     * 调用明文API（无加密）
     *
     * 用于某些不需要加密的端点
     *
     * @param endpoint API端点
     * @param requestData 请求JSON数据
     * @return 响应JSON数据
     */
    private JSONObject callAPIPlaintext(String endpoint, JSONObject requestData)
            throws Exception {
        // 直接发送JSON字符串，不加密
        byte[] requestBytes = requestData.toString().getBytes("UTF-8");
        byte[] responseBytes = sendHttpRequest(endpoint, requestBytes);
        return new JSONObject(new String(responseBytes, "UTF-8"));
    }

    // ========================================
    // HTTP请求实现
    // ========================================

    /**
     * 发送HTTP POST请求
     *
     * 设置的请求头：
     * - Content-Type: application/json
     * - User-Agent: [自定义UA]
     * - Content-Length: [数据长度]
     *
     * 超时设置：
     * - 连接超时: 10秒
     * - 读取超时: 30秒
     *
     * @param endpoint API端点路径
     * @param requestBody 请求体字节数组
     * @return 响应体字节数组
     */
    private byte[] sendHttpRequest(String endpoint, byte[] requestBody)
            throws IOException {

        // 构建完整URL
        String fullUrl = this.baseUrl + endpoint;
        HttpURLConnection connection =
            (HttpURLConnection) new URL(fullUrl).openConnection();

        try {
            // 设置请求方法: POST
            // encrypted: {22, -109, -23, -112}
            // key: {70, -36, -70, -60, 122, -88, -26, 18}
            // result: "POST"
            connection.setRequestMethod("POST");

            // 配置连接
            connection.setDoOutput(true);   // 允许输出
            connection.setDoInput(true);    // 允许输入
            connection.setUseCaches(false); // 不使用缓存

            // 设置Content-Type头
            // encrypted: {18, 65, 88, 26, -34, -122, -19, -16, 5, 87, 70, 11}
            // key: {81, 46, 54, 110, -69, -24, -103, -35}
            // result: "Content-Type"
            connection.setRequestProperty("Content-Type", CONTENT_TYPE);

            // 设置User-Agent头
            // encrypted: {4, 21, -54, -35, -33, 16, 27, -44, 63, 18}
            // key: {81, 102, -81, -81, -14, 81, 124, -79}
            // result: "User-Agent"
            connection.setRequestProperty("User-Agent", USER_AGENT);

            // 设置Content-Length头
            // encrypted: {32, 105, -20, -121, 34, 5, 32, 96, 47, 99, -20, -108, 51, 3}
            // key: {99, 6, -126, -13, 71, 107, 84, 77}
            // result: "Content-Length"
            connection.setRequestProperty("Content-Length",
                                         String.valueOf(requestBody.length));

            // 设置超时
            connection.setConnectTimeout(10000);  // 10秒连接超时
            connection.setReadTimeout(30000);     // 30秒读取超时

            // 发送请求体
            OutputStream out = connection.getOutputStream();
            try {
                out.write(requestBody);
                out.flush();
            } finally {
                out.close();
            }

            // 检查响应码
            int responseCode = connection.getResponseCode();
            if (responseCode != 200) {
                // 处理错误响应
                InputStream errorStream = connection.getErrorStream();
                String errorBody = "";

                if (errorStream != null) {
                    try {
                        // 读取错误消息（UTF-8编码）
                        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
                        byte[] chunk = new byte[8192];
                        int bytesRead;
                        while ((bytesRead = errorStream.read(chunk)) != -1) {
                            buffer.write(chunk, 0, bytesRead);
                        }
                        errorBody = new String(buffer.toByteArray(), "UTF-8");
                    } finally {
                        errorStream.close();
                    }
                }

                // 抛出异常
                // encrypted: {94, -12, -125, -110, ...}
                // key: {22, -96, -41, -62, ...}
                // result: "HTTP request failed with code: "
                throw new IOException(
                    "HTTP request failed with code: " + responseCode +
                    ", body: " + errorBody
                );
            }

            // 读取成功响应
            InputStream in = connection.getInputStream();
            try {
                ByteArrayOutputStream buffer = new ByteArrayOutputStream();
                byte[] chunk = new byte[8192];
                int bytesRead;
                while ((bytesRead = in.read(chunk)) != -1) {
                    buffer.write(chunk, 0, bytesRead);
                }
                return buffer.toByteArray();
            } finally {
                in.close();
            }

        } finally {
            connection.disconnect();
        }
    }

    // ========================================
    // 压缩/解压
    // ========================================

    /**
     * GZIP压缩
     *
     * 将数据压缩以减小传输大小
     *
     * @param data 原始数据
     * @return 压缩后的数据
     */
    private byte[] gzipCompress(byte[] data) throws IOException {
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        try (GZIPOutputStream gzip = new GZIPOutputStream(buffer)) {
            gzip.write(data);
        }
        return buffer.toByteArray();
    }

    /**
     * GZIP解压
     *
     * 解压服务器返回的压缩数据
     *
     * @param compressed 压缩的数据
     * @return 解压后的数据
     */
    private byte[] gzipDecompress(byte[] compressed) throws IOException {
        try (GZIPInputStream gzip = new GZIPInputStream(
                new ByteArrayInputStream(compressed))) {
            ByteArrayOutputStream buffer = new ByteArrayOutputStream();
            byte[] chunk = new byte[8192];
            int bytesRead;
            while ((bytesRead = gzip.read(chunk)) != -1) {
                buffer.write(chunk, 0, bytesRead);
            }
            return buffer.toByteArray();
        }
    }

    // ========================================
    // AES加密/解密
    // ========================================

    /**
     * AES加密字符串
     *
     * 算法：AES-256-CBC
     * 密钥：从AES_KEY派生（需要运行时获取）
     * IV：随机生成16字节
     * 输出：Base64(IV + 加密数据)
     *
     * 安全特性：
     * - 每次加密生成新的随机IV
     * - 使用CBC模式防止模式攻击
     * - 密钥长度32字节（256位）
     *
     * @param plaintext 明文字符串
     * @return Base64编码的加密数据（包含IV）
     */
    public static String aesEncryptString(String plaintext) throws Exception {
        // 步骤1: 获取密钥
        // 从某个来源获取AES_KEY，然后转为32字节
        byte[] keyBytes = getAesKeyBytes();  // 32字节

        // 步骤2: 创建密钥规范
        // encrypted: {115, 94, 23}
        // key: {50, 27, 68, 45, 106, 117, -110, 69}
        // result: "AES"
        SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");

        // 步骤3: 生成随机IV（16字节）
        byte[] iv = new byte[16];
        new SecureRandom().nextBytes(iv);
        IvParameterSpec ivSpec = new IvParameterSpec(iv);

        // 步骤4: 创建加密器
        // encrypted: {50, 62, -114, -85, 82, -20, -88, -88, 61, 20, -115, -27,
        //           117, -50, -125, -23, 20}
        // key: {115, 123, -35, -124, 17, -86, -22, -121}
        // result: "AES/CBC/PKCS5Padding"
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, keySpec, ivSpec);

        // 步骤5: 加密
        byte[] encrypted = cipher.doFinal(plaintext.getBytes("UTF-8"));

        // 步骤6: 合并IV和加密数据
        byte[] combined = new byte[16 + encrypted.length];
        System.arraycopy(iv, 0, combined, 0, 16);
        System.arraycopy(encrypted, 0, combined, 16, encrypted.length);

        // 步骤7: Base64编码
        return Base64.encodeToString(combined, Base64.NO_WRAP);
    }

    /**
     * AES解密字符串
     *
     * 算法：AES-256-CBC
     * 输入：Base64(IV + 加密数据)
     * 输出：明文字符串
     *
     * @param ciphertext Base64编码的加密数据
     * @return 解密后的明文
     */
    public static String aesDecryptString(String ciphertext) throws Exception {
        // 步骤1: Base64解码
        byte[] combined = Base64.decode(ciphertext, Base64.DEFAULT);

        // 步骤2: 验证长度
        if (combined.length < 16) {
            // encrypted: {83, 104, 45, 35, 7, 65, -76, 74, ...}
            // key: {-74, -30, -115, -58, -88, -57, 82, -33}
            // result: "Encrypted data too short, must include IV"
            throw new IllegalArgumentException(
                "Encrypted data too short, must include IV"
            );
        }

        // 步骤3: 提取IV和加密数据
        byte[] iv = new byte[16];
        System.arraycopy(combined, 0, iv, 0, 16);

        int encryptedLength = combined.length - 16;
        byte[] encrypted = new byte[encryptedLength];
        System.arraycopy(combined, 16, encrypted, 0, encryptedLength);

        // 步骤4: 创建解密器
        byte[] keyBytes = getAesKeyBytes();
        SecretKeySpec keySpec = new SecretKeySpec(keyBytes, "AES");
        IvParameterSpec ivSpec = new IvParameterSpec(iv);

        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(Cipher.DECRYPT_MODE, keySpec, ivSpec);

        // 步骤5: 解密
        byte[] decrypted = cipher.doFinal(encrypted);

        // 步骤6: 转为字符串
        return new String(decrypted, "UTF-8");
    }

    /**
     * 获取AES密钥字节（32字节）
     *
     * 从AES_KEY字符串派生32字节密钥
     * 如果长度不足，填充0
     * 如果超过32字节，截断
     */
    private static byte[] getAesKeyBytes() throws Exception {
        // 需要调用某个解密函数获取AES_KEY
        // 然后转为字节并调整到32字节
        String key = decryptAesKey();  // 待实现
        byte[] keyBytes = key.getBytes("UTF-8");

        byte[] result = new byte[32];
        if (keyBytes.length >= 32) {
            System.arraycopy(keyBytes, 0, result, 0, 32);
        } else {
            System.arraycopy(keyBytes, 0, result, 0, keyBytes.length);
            // 剩余部分为0
        }
        return result;
    }

    // ========================================
    // API端点方法
    // ========================================

    /**
     * 获取配置
     *
     * 端点: /api/v1/config/get (预测)
     *
     * @param params 参数
     * @return 配置JSON
     */
    public JSONObject getConfig(JSONObject params) throws Exception {
        JSONObject request = new JSONObject();
        // encrypted: {-15, -66, 90, -88}
        // key: {-112, -54, 53, -59, 39, 39, 68, 46}
        // result: "data" (预测)
        request.put("data", params);

        // encrypted: {13, -87, 95, -58, 84, -18, -33, -59, 70, -92, 67, -33,
        //           28, -4, -63, -115, 71, -68, 108, -64, 21, -2, -121, -115}
        // key: {34, -56, 47, -81, 123, -104, -18, -22}
        // result: "/api/v1/config/get" (预测)
        return callAPI("/api/v1/config/get", request);
    }

    /**
     * 更新日志
     *
     * 端点: /api/v1/log/update (预测)
     *
     * @param request 日志请求对象
     * @return 通用响应
     */
    public CommonResponse updateLog(UpdateLogRequest request) throws Exception {
        // encrypted: {12, 80, -74, -22, -27, 8, 84, -100, 71, 93, -86, -13,
        //           -83, 26, 74, -58, 83, 85, -89, -9, -81, 50, 10, -44}
        // key: {35, 49, -58, -125, -54, 126, 101, -77}
        // result: "/api/v1/log/update" (预测)
        return CommonResponse.fromJSONObject(
            callAPI("/api/v1/log/update", request.toJSONObject())
        );
    }

    /**
     * 更新事件
     *
     * 端点: /api/v1/event/update (预测)
     *
     * @param request 事件请求对象
     * @return 通用响应
     */
    public CommonResponse updateEvent(UpdateEventRequest request) throws Exception {
        // encrypted: {19, -2, 10, -94, -58, 125, -74, 20, 88, -13, 22, -69,
        //           -114, 111, -88, 78, 76, -5, 27, -65, -116, 78, -15, 94, 82, -21}
        // key: {60, -97, 122, -53, -23, 11, -121, 59}
        // result: "/api/v1/event/update" (预测)
        return CommonResponse.fromJSONObject(
            callAPI("/api/v1/event/update", request.toJSONObject())
        );
    }
}

/**
 * ========================================
 * 完整的请求流程总结
 * ========================================
 *
 * 客户端 → 服务器：
 * 1. 构建JSON请求对象
 * 2. JSON.toString() → 字符串
 * 3. GZIP压缩 → 二进制
 * 4. Base64编码 → 字符串
 * 5. AES-256-CBC加密（随机IV） → 二进制
 * 6. HTTP POST → 服务器
 *
 * 服务器 → 客户端：
 * 1. HTTP响应 ← 服务器
 * 2. AES-256-CBC解密 ← 二进制
 * 3. Base64解码 ← 字符串
 * 4. GZIP解压 ← 二进制
 * 5. JSON.parse() ← 字符串
 * 6. 处理JSON对象
 *
 * ========================================
 * 安全分析
 * ========================================
 *
 * 加密强度：
 * - ✓ AES-256：强加密算法
 * - ✓ CBC模式：防止模式攻击
 * - ✓ 随机IV：每次加密不同
 * - ✓ GZIP压缩：减小传输大小
 *
 * 潜在问题：
 * - ⚠ 密钥硬编码：AES_KEY在代码中
 * - ⚠ 无证书固定：HTTPS可能被中间人攻击
 * - ⚠ 无完整性校验：缺少HMAC或签名
 * - ⚠ 明文API：callAPIPlaintext不加密
 *
 * 待解密的关键信息：
 * 1. AES_KEY - 解密密钥的真实值
 * 2. 所有API端点的完整路径
 * 3. Content-Type和User-Agent的值
 * 4. 服务器地址
 *
 * ========================================
 */
