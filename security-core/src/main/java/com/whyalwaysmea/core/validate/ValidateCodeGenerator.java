package com.whyalwaysmea.core.validate;

import org.springframework.web.context.request.ServletWebRequest;

/**
 * @Author: HanLong
 * @Date: Create in 2018/3/24 9:51
 * @Description:
 */
public interface ValidateCodeGenerator {

    ImageCode generate(ServletWebRequest request);

}
