package com.xmh.integrate.entity;

/**
 * 描述：
 *
 * @author xmh
 * @date 2020/12/25 17:12
 */
public class Equipment extends AbstractEntity {

    private String name = "xmh";
    private String code = "xmh";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
