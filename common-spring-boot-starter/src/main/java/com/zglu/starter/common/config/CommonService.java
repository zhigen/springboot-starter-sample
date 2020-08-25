package com.zglu.starter.common.config;

import org.springframework.stereotype.Service;

/**
 * @author zglu
 */
@Service
public class CommonService {
    private CommonProperties commonProperties;

    public CommonService(CommonProperties commonProperties) {
        this.commonProperties = commonProperties;
    }

    public String doSomething() {
        return "Common say: " + commonProperties.getMessage();
    }
}
