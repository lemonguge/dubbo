package cn.homjie.dubbo.travel.api;

/**
 * @author jiehong.jh
 * @date 2018/3/17
 */
public class ErrorCodeBuilder {

    private DefaultErrorCode errorCode = new DefaultErrorCode();

    public ErrorCodeBuilder setCode(String code) {
        errorCode.code = code;
        return this;
    }

    public ErrorCodeBuilder setMessage(String message) {
        errorCode.message = message;
        return this;
    }

    public ErrorCode create() {
        return errorCode;
    }

    private static class DefaultErrorCode implements ErrorCode {
        private String code;
        private String message;

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
