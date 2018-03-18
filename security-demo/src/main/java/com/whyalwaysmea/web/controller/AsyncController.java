package com.whyalwaysmea.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Callable;

/**
 * @Author: HanLong
 * @Date: Create in 2018/3/16 21:33
 * @Description:
 */
@RestController
public class AsyncController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("/test")
    public Callable<String> test() throws InterruptedException {
        logger.info("进入了主线程");

        Callable<String> callable = new Callable<String>() {
            @Override
            public String call() throws Exception {
                logger.info("进入了子线程");
                Thread.sleep(5000);
                logger.info("结束了子线程");
                return "success";
            }
        };
        logger.info("主线程结束");
        return callable;
    }
}
