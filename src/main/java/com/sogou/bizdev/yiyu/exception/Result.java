package com.sogou.bizdev.yiyu.exception;

import com.sogou.crm.orgn.api.error.type.ErrorCodeType;
import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shangyan200758 on 2016/3/4.
 */
public class Result {

    private boolean success = true;
    private Object data = null;
    private String errorMsg;
    private int errorCode;
    private List<ResultError> errors = new ArrayList<ResultError>();

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        this.success = false;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.success = false;
        this.errorCode = errorCode;
    }

    public void setError(int errorCode, String errorMsg) {
        this.success = false;
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public void setError(ErrorEnum error) {
        this.success = false;
        this.errorCode = error.getCode();
        this.errorMsg = error.getMessage();
    }

    public void setError(ErrorCodeType errorCodeType) {
        this.success = false;
        this.errorCode = ErrorEnum.CRM_API_ERROR.getCode();
        if (errorCodeType != null) {
            this.errorMsg = StringUtils.join(errorCodeType.getMessage(), "; ");
        } else {
            this.errorMsg = ErrorEnum.CRM_API_ERROR.getMessage();
        }
    }

    public void addError(ResultError error) {
        errors.add(error);
        success = false;
    }
}
