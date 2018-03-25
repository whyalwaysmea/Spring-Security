package com.whyalwaysmea.code;

import com.whyalwaysmea.core.validate.image.ImageCode;
import com.whyalwaysmea.core.validate.ValidateCodeGenerator;
import org.springframework.web.context.request.ServletWebRequest;

/**
 * @Author: HanLong
 * @Date: Create in 2018/3/24 10:11
 * @Description:
 */
//@Component("imageCodeGenerator")
public class ImageCodeGenerator implements ValidateCodeGenerator{


    @Override
    public ImageCode generate(ServletWebRequest request) {
        System.out.println("自定义的图形验证码生成器");
        return null;
    }
}
