package com.hzx.conc.common.enumeration;

/**
 * 验证码类型枚举
 */
public enum CodeTypeEnum {

    /**
     * 验证码类型 ： 1-注册，2-登录，3-修改手机号
     */

    REGISTER(1, "REGISTER"),
    LOGIN(2, "LOGIN"),
    EDIT(3, "EDIT");

    private final Integer code;
    private final String desc;

    CodeTypeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static String getDescriptionByCode(Integer code) {
        for (CodeTypeEnum value : CodeTypeEnum.values()) {
            if (value.getCode().equals(code)) {
                return value.getDesc();
            }
        }
        return null;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

}
