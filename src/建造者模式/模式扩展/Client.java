package 建造者模式.模式扩展;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lcl100
 * @create 2021-07-24 12:15
 */
public class Client {
    public static void main(String[] args) {
        before();
        after();
    }

    /**
     * 采用建造者模式之前创建请求头的方法
     */
    public static void before() {
        // 创建请求头
        Map<String, String> headers = new HashMap<>();
        headers.put("Accept", "image/webp,*/*");
        headers.put("Accept-Encoding", "gzip, deflate, br");
        headers.put("Accept-Language", "zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2");
        headers.put("Connection", "keep-alive");
        headers.put("Cookie", "__yjs_duid=1_5ac5370244e75e94b6b4846a999e60ad1619953026830;");
        headers.put("Host", "www.baidu.com");
        headers.put("Referer", "https://www.baidu.com/");
        headers.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:90.0) Gecko/20100101 Firefox/90.0");
        // 使用请求头
    }

    /**
     * 采用建造者模式之后创建请求头的方法
     */
    public static void after() {
        // 创建请求头
        RequestHeader requestHeader = new RequestHeader.Builder()
                .accept("image/webp,*/*")
                .acceptEncoding("gzip, deflate, br")
                .acceptLanguage("zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2")
                .connection("keep-alive")
                .cookie("__yjs_duid=1_5ac5370244e75e94b6b4846a999e60ad1619953026830;")
                .host("www.baidu.com")
                .referer("https://www.baidu.com/")
                .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:90.0) Gecko/20100101 Firefox/90.0")
                .build();
        Map<String, String> headers = requestHeader.getHeaders();
        // 使用请求头
        System.out.println(requestHeader.toString());
    }
}

