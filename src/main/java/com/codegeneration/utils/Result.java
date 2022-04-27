package com.codegeneration.utils;

import lombok.Data;

@Data
public class Result<T> {

    private boolean success;

    private String msg;

    private int code = 0;

    private T data;

    public Result(boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public Result() {
        this(false, "");
    }

    public Result(boolean success, String msg, T data) {
        this.success = success;
        this.msg = msg;
        this.data = data;
    }

    public Result(boolean success, String msg, int code, T data) {
        this.success = success;
        this.msg = msg;
        this.data = data;
        this.code = code;
    }

    public static <T> Result<T> fail(String msg) {
        return new Result<>(false, msg);
    }

    public static <T> Result<T> success(String msg, T t) {
        Result<T> result = new Result<>(true, msg, t);
        result.setCode(20000);
        return result;
    }

    public static <T> Result<T> success(T t) {
        return new Result<>(true, "", 20000, t);
    }
}

