package cn.homjie.dubbo.travel.api;

/**
 * @author jiehong.jh
 * @date 2018/3/17
 */
public interface ErrorCode {

    String getCode();

    String getMessage();

    default String toJson() {
        return "{ code: " + getCode() + ", message: " + getMessage() + "}";
    }

    enum StandardErrorCode implements ErrorCode {
        OK("200", "OK"),
        BAD_REQUEST("400", "Bad Request"),
        UNAUTHORIZED("401", "Unauthorized"),
        FORBIDDEN("403", "Forbidden"),
        INTERNAL_SERVER_ERROR("500", "Internal Server Error");

        private String code;
        private String message;

        StandardErrorCode(String code, String message) {
            this.code = code;
            this.message = message;
        }

        @Override
        public String getCode() {
            return code;
        }

        @Override
        public String getMessage() {
            return message;
        }

        @Override
        public String toString() {
            return toJson();
        }
    }
}
