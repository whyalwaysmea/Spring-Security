package com.whyalwaysmea.security;

import org.springframework.core.annotation.Order;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;

import javax.servlet.http.HttpServletRequest;
import java.util.HashSet;
import java.util.Set;

/**
 * @Author: HanLong
 * @Date: Create in 2018/3/31 16:04
 * @Description:   跟业务相关的权限配置
 */
@Component("rbacPermission")
public class RbacPermission {

    private AntPathMatcher antPathMatcher = new AntPathMatcher();

    public boolean hasPermission(HttpServletRequest request, Authentication authentication) {
        Object principal = authentication.getPrincipal();
        boolean hasPermission = false;
        if(principal instanceof UserDetails) {
            String username = ((UserDetails) principal).getUsername();
            // 读取用户所拥有的权限url
            Set<String> urls = new HashSet<>();
            urls.add("/user");
            for (String url : urls) {
                if(antPathMatcher.match(url, request.getRequestURI())) {
                    hasPermission = true;
                    break;
                }
            }

        }
        return hasPermission;
    }
}
