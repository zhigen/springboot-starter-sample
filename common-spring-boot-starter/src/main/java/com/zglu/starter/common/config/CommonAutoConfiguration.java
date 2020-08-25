package com.zglu.starter.common.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zglu
 */
@Configuration
@EnableConfigurationProperties(CommonProperties.class)
@ConditionalOnClass(CommonService.class)
@ConditionalOnProperty(prefix = "zglu.common", value = "enable", matchIfMissing = true)
public class CommonAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(value = CommonService.class)
    public CommonService commonService(CommonProperties commonProperties) {
        return new CommonService(commonProperties);
    }
}
