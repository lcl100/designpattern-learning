package 建造者模式.模式扩展;


import java.util.HashMap;
import java.util.Map;

/**
 * @author lcl100
 * @create 2021-07-24 12:14
 * @desc 请求头的设置，采用建造者模式
 */
public class RequestHeader {
    private String host;
    private String userAgent;
    private String accept;
    private String acceptLanguage;
    private String acceptEncoding;
    private String referer;
    private String connection;
    private String cookie;
    private String origin;

    private RequestHeader(Builder builder) {
        this.host = builder.host;
        this.userAgent = builder.userAgent;
        this.accept = builder.accept;
        this.acceptLanguage = builder.acceptLanguage;
        this.acceptEncoding = builder.acceptEncoding;
        this.referer = builder.referer;
        this.connection = builder.connection;
        this.cookie = builder.cookie;
        this.origin = builder.origin;
    }

    public Map<String, String> getHeaders() {
        Map<String, String> headers = new HashMap<>();
        if (host != null && !"".equals(host)) {
            headers.put("Host", host);
        }
        if (userAgent != null && !"".equals(userAgent)) {
            headers.put("User-Agent", userAgent);
        }
        if (accept != null && !"".equals(accept)) {
            headers.put("Accept", accept);
        }
        if (acceptLanguage != null && !"".equals(acceptLanguage)) {
            headers.put("Accept-Language", acceptLanguage);
        }
        if (acceptEncoding != null && !"".equals(acceptEncoding)) {
            headers.put("Accept-Encoding", acceptEncoding);
        }
        if (referer != null && !"".equals(referer)) {
            headers.put("Referer", referer);
        }
        if (connection != null && !"".equals(connection)) {
            headers.put("Connection", connection);
        }
        if (cookie != null && !"".equals(cookie)) {
            headers.put("Cookie", cookie);
        }
        if (origin != null && !"".equals(origin)) {
            headers.put("Origin", origin);
        }
        return headers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Map<String, String> headers = getHeaders();
        for (String key : headers.keySet()) {
            sb.append(key + ":" + headers.get(key) + "\n");
        }
        return sb.toString();
    }

    public static final class Builder {
        private String host;
        private String userAgent;
        private String accept;
        private String acceptLanguage;
        private String acceptEncoding;
        private String referer;
        private String connection;
        private String cookie;
        private String origin;

        public Builder() {
        }

        public Builder host(String val) {
            this.host = val;
            return this;
        }

        public Builder userAgent(String val) {
            this.userAgent = val;
            return this;
        }

        public Builder accept(String val) {
            this.accept = val;
            return this;
        }

        public Builder acceptLanguage(String val) {
            this.acceptLanguage = val;
            return this;
        }

        public Builder acceptEncoding(String val) {
            this.acceptEncoding = val;
            return this;
        }

        public Builder referer(String val) {
            this.referer = val;
            return this;
        }

        public Builder connection(String val) {
            this.connection = val;
            return this;
        }

        public Builder cookie(String val) {
            this.cookie = val;
            return this;
        }

        public Builder origin(String val) {
            this.origin = val;
            return this;
        }

        public RequestHeader build() {
            return new RequestHeader(this);
        }
    }
}
