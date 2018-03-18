package com.whyalwaysmea.dto;

import com.whyalwaysmea.validator.MyConstraint;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @Author: HanLong
 * @Date: Create in 2018/3/8 21:40
 * @Description:
 */
public class User {

    @MyConstraint(message = "自定义的校验器")
    private String userName;

    @NotBlank
    private String password;

    public User() {

    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
