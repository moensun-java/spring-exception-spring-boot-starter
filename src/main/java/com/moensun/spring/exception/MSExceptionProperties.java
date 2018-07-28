package com.moensun.spring.exception;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by Bane.Shi.
 * Copyright MoenSun
 * User: Bane.Shi
 * Date: 2018/7/28
 * Time: 21:30
 */
@ConfigurationProperties(prefix = "ms.spring.exception")
public class MSExceptionProperties {
    private String resourcePath;

    private String[] resourcePaths;

    public String getResourcePath() {
        return resourcePath;
    }

    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    public String[] getResourcePaths() {
        return resourcePaths;
    }

    public void setResourcePaths(String[] resourcePaths) {
        this.resourcePaths = resourcePaths;
    }
}
