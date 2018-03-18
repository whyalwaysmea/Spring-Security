package com.whyalwaysmea.service.impl;

import com.whyalwaysmea.service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @Author: HanLong
 * @Date: Create in 2018/3/16 20:51
 * @Description:
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String greeting(String name) {
        System.out.println("greeting");
        return "hello "+name;
    }

}
