package com.whyalwaysmea.core.properties;


/**
 * @Author: HanLong
 * @Date: Create in 2018/3/18 15:21
 * @Description:
 */
public class BrowserProperties {

    private String loginPage = SecurityConstants.DEFAULT_LOGIN_PAGE_URL;

    public String getLoginPage() {
        return loginPage;
    }

    public void setLoginPage(String loginPage) {
        this.loginPage = loginPage;
    }
}
