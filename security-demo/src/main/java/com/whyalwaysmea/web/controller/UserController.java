package com.whyalwaysmea.web.controller;

import com.whyalwaysmea.dto.User;
import com.whyalwaysmea.dto.UserQueryCondition;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: HanLong
 * @Date: Create in 2018/3/8 21:38
 * @Description:
 */
@RestController
@RequestMapping("/user")
public class UserController {

    /**
     * 获取当前的用户
     * @return  完整的Authentication
     */
    @GetMapping("/me1")
    public Object currentUser() {
        return SecurityContextHolder.getContext().getAuthentication();
    }

    @GetMapping("/me2")
    public Object currentUser(Authentication authentication) {
        return authentication;
    }

    /**
     * @param userDetails
     * @return 只包含了userDetails
     */
    @GetMapping("/me3")
    public Object cuurentUser(@AuthenticationPrincipal UserDetails userDetails) {
        return userDetails;
    }

    @PutMapping("/{id:\\d+}")
    public User update(@Valid @RequestBody User user, @PathVariable("id") String id, BindingResult result) {
        System.out.println(id);
        System.out.println(user);
        user.setUserName("update name");
        return user;
    }

    @RequestMapping( method = RequestMethod.GET)
    public List<User> getUsers(UserQueryCondition userQueryCondition, @PageableDefault(page = 1, size = 20, sort = "username,asc") Pageable pageable) {
        // 反射工具，打印对象的属性，值
        System.out.println(ReflectionToStringBuilder.toString(pageable, ToStringStyle.MULTI_LINE_STYLE));
        System.out.println(ReflectionToStringBuilder.toString(userQueryCondition, ToStringStyle.MULTI_LINE_STYLE));

        List<User> users = new ArrayList<>();
        users.add(new User("Hehe", "123456"));
        users.add(new User("Tom", "654321"));
        users.add(new User("Rose", "142536"));
        return users;
    }

    // 正则表达式
    @GetMapping("/{id:\\d+}")
    public User getInfo(@PathVariable String id) {
        User user = new User();
        user.setUserName("tom");
        return user;
    }

}
