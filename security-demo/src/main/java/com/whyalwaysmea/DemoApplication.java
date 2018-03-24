package com.whyalwaysmea;


import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: HanLong
 * @Date: Create in 2018/2/1 21:45
 * @Description:
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.whyalwaysmea")
@EnableAspectJAutoProxy
public class DemoApplication {

    /**
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


}