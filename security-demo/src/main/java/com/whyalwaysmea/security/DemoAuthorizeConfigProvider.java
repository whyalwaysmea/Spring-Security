package com.whyalwaysmea.security;

import com.whyalwaysmea.core.authentication.AuthorizeConfigProvider;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.stereotype.Component;

/**
 * @Author: HanLong
 * @Date: Create in 2018/3/31 15:09
 * @Description:    跟业务相关的权限配置
 */
@Component
@Order(Integer.MAX_VALUE)
public class DemoAuthorizeConfigProvider implements AuthorizeConfigProvider {


    @Override
    public void config(ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry config) {
//        config.antMatchers("/user")
//                .hasRole("ADMIN");

        config.anyRequest().access("@rbacPermission.hasPermission(request, authentication)");
    }
}
