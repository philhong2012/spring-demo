package com.sqkouer.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

/**
 * ${DESCRIPTION}
 *
 * @author hongxubing
 * @create 2017-06-26 16:53
 **/
@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {
    public User getUser(String id) {
        return null;
    }

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService = (UserService) context.getBean("userService");

        Assert.notNull(userService);
    }
}
