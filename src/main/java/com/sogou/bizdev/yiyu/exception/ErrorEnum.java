package com.sogou.bizdev.yiyu.exception;

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

    SYSTEM_ERROR(500, "系统异常"),

    GROUP_ID_NOT_NULL(10, "groupId 为空"),

    GROUP_ID_ERROR(11, "groupId 参数错误"),

    GROUP_NAME_NOT_NULL(12, "groupName 不为空"),

    PLAN_ID_NOT_NULL(13, "planId 为空"),

    PLAN_ID_ERROR(14, "planId 参数错误"),

    PLAN_NAME_NOT_NULL(15, "planName 不为空"),

    BUDGET_NOT_NULL(16, "budget 为空"),

    BUDGET_ERROR(17, "budget 参数错误"),

    CHANNEL_NOT_NULL(18, "groupChannel 为空"),

    CHANNEL_ID_NOT_NULL(19, "channelId 为空"),

    CHANNEL_ID_ERROR(20, "channelId 参数错误"),

    CHANNEL_PRICE_NOT_NULL(21, "price 为空"),

    CHANNEL_PRICE_ERROR(22, "price 参数错误"),

    CHANNEL_GROUP_ID_NOT_NULL(23, " channel 中 groupId 为空"),

    CHANNEL_GROUP_ID_ERROR(24, "channel 中 groupId 参数错误"),

    ID_IN_CHANNEL_NOT_NULL(25, "channelId 为空"),

    ID_IN_CHANNEL_ID_ERROR(26, "channelId 参数错误");



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
