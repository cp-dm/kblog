package com.kakaobank.exception;

public class UtilException extends RuntimeException {
    public UtilException() {
        super();
    }

    public UtilException(String message, Throwable cause) {
        super(message, cause);
    }
}
