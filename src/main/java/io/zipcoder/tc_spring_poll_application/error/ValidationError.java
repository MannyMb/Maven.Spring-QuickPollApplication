package io.zipcoder.tc_spring_poll_application.error;

public class ValidationError {
    String code;
    String message;

    public ValidationError() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}