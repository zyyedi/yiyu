package com.sogou.bizdev.yiyu.exception;

/**
 * Created by zhangyiyu on 26/05/2017.
 */
public class ResultError {
    private int code;  //error code, 用于 error enum 来指示错误
    private String message;

    public ResultError(){}

    public ResultError(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }



}
