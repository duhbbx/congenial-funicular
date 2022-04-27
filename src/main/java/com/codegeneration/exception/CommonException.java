package com.codegeneration.exception;

public class CommonException extends RuntimeException {

    public CommonException(String msg) {
        super(msg);
    }

    public CommonException(Throwable cause) {
        super(cause);
    }

}
