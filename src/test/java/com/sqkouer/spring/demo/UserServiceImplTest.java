package com.sqkouer.spring.demo;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

/**
 * ${DESCRIPTION}
 *
 * @author hongxubing
 * @create 2017-06-26 17:02
 **/
 @RunWith(SpringJUnit4ClassRunner.class)
 @ContextConfiguration(locations = {"/applicationContext.xml","/Springmvc.xml"})
public class UserServiceImplTest {

    @Autowired
  UserService userService;

    @Autowired
    ApplicationContext applicationContext;

   @Test
    public void testUserService() {
       String className = "com.sqkouer.spring.demo";
       try {
           Class<?> classz = Class.forName(className);
           Object usrv = applicationContext.getBean(classz);
       } catch (Exception e) {

       }
       Assert.notNull(userService);
    }
}
