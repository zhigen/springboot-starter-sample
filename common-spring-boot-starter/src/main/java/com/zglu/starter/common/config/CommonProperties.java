package com.zglu.starter.common.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author zglu
 */
@ConfigurationProperties(prefix = "zglu.common")
public class CommonProperties {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
