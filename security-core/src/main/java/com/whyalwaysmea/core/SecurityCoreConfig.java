package com.whyalwaysmea.core;

import com.whyalwaysmea.core.properties.SecurityProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: HanLong
 * @Date: Create in 2018/3/18 15:32
 * @Description:
 */
@Configuration
@EnableConfigurationProperties(SecurityProperties.class)
public class SecurityCoreConfig {
}
