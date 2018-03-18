package com.whyalwaysmea.dto;

import io.swagger.annotations.ApiModelProperty;

/**
 * @Author: HanLong
 * @Date: Create in 2018/3/9 22:16
 * @Description:
 */
public class UserQueryCondition {

    private String username;

    private int age;

    private int ageTo;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAgeTo() {
        return ageTo;
    }

    public void setAgeTo(int ageTo) {
        this.ageTo = ageTo;
    }
}
