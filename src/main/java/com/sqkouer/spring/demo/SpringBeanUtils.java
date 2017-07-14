package com.sqkouer.spring.demo;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * ${DESCRIPTION}
 *
 * @author hongxubing
 * @create 2017-07-13 17:55
 **/
public class SpringBeanUtils implements ApplicationContextAware {
    public static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        applicationContext = applicationContext;
    }

    public static <T> T getBean(String beanName) {
        return (T)applicationContext.getBean(beanName);
    }


    public static <T> T getBean(Class<T> classz) {
        return applicationContext.getBean(classz);
    }
}
