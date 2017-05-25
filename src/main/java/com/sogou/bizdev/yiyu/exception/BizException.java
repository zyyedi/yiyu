package com.sogou.bizdev.yiyu.exception;

/**
 * Created by zhangyiyu on 25/05/2017.
 */
/**
 * 业务异常类
 *
 * @author qianlei
 */
public class BizException extends Exception {

    private static final long serialVersionUID = 1L;

    private Integer errorCode;
    private String message;
    private BizErrorEnum bizErrorEnum;

    public BizException(String message) {
        this.message = message;
    }

    public BizException(BizErrorEnum en) {
        this.errorCode = en.getCode();
        this.message = en.getMessage();
        this.bizErrorEnum = en;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public BizErrorEnum getBizErrorEnum() {
        return bizErrorEnum;
    }

    public void setBizErrorEnum(BizErrorEnum bizErrorEnum) {
        this.bizErrorEnum = bizErrorEnum;
    }

}

