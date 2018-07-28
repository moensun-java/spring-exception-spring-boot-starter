package com.moensun.spring.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.com.moensun.spring.resource.MSResourceBundle;

/**
 * Created by Bane.Shi.
 * Copyright MoenSun
 * User: Bane.Shi
 * Date: 2018/7/28
 * Time: 21:29
 */
@Configuration
@EnableConfigurationProperties(
        value = {
                MSExceptionProperties.class
        }
)
public class MSExceptionConfiguration {

    @Autowired
    private MSExceptionProperties exceptionProperties;

    @Bean
    @ConditionalOnMissingBean
    public MSResourceBundle msResourceBundle(){
        MSResourceBundle  msResourceBundle = new MSResourceBundle();
        msResourceBundle.setResourceBundle(exceptionProperties.getResourcePath());
        msResourceBundle.setResourceBundles(exceptionProperties.getResourcePaths());
        return msResourceBundle;
    }

}
