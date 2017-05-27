package com.sogou.bizdev.yiyu.exception;

/**
 * Created by zhangyiyu on 26/05/2017.
 */
public class ResultUtil {
    public static void addError(Result result, BizException e) {
        ResultError error = new ResultError();
        error.setMessage(e.getMessage());
        result.addError(error);
    }

    public static void addEnumError(Result result, BizErrorEnum en) {
        ResultError error = new ResultError();
        error.setCode(en.getCode());
        error.setMessage(en.getMessage());
        result.addError(error);
    }

    public static void addEnumError(Result result, ErrorEnum en) {
        ResultError error = new ResultError();
        error.setCode(en.getCode());
        error.setMessage(en.getMessage());
        result.addError(error);
    }
}
