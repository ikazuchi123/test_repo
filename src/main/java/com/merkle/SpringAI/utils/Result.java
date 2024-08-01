package com.merkle.GenAI.utils;

import java.io.Serializable;

/**
 * @author dannywang
 *
 */
public class Result<T> implements Serializable {
    private String message;

    private int code;

    private Boolean success;

    private Object data;

    public Result() {

    }

    public Result(int code, String message, Boolean status, Object response) {
        this.code = code;
        this.message = message;
        this.data = response;
        this.setSuccess(status);
    }

    public Result(int code, String message, Boolean status) {
        this(code, message, status, null);
    }

    public String getmessage() {
        return message;
    }

    public void setmessage(String message) {
        this.message = message;
    }

    public int getcode() {
        return code;
    }

    public void setcode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }
}
