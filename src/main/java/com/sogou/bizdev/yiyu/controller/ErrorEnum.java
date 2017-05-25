package com.sogou.bizdev.yiyu.controller;

/**
 * Created by shangyan200758 on 2016/3/4.
 */
public enum ErrorEnum {

    PARAM_ERROR(1, "参数错误"),

    PARAM_NULL(2, "参数为空"),

    USERNAME_PASSWORD_ERROR(101, "用户名或密码错误"),

    CRM_AUTH_ERROR(102, "没有CRM系统权限"),

    LOGIN_EXPIRE_ERROR(103, "登录异常，请重新登录或联系adpp_oppm@sogou-inc.com"),

    USER_OFFLINE_ERROR(104, "用户已被强制下线，请联系adpp_oppm@sogou-inc.com"),

    CRM_API_ERROR(105, "调用CRM接口异常"),

    SYSTEM_ERROR(500, "系统异常");

    private int code;
    private String message;

    private ErrorEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public static String getMessage(int code) {
        for (ErrorEnum em : ErrorEnum.values()) {
            if (em.getCode() == code) {
                return em.getMessage();
            }
        }
        return null;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
