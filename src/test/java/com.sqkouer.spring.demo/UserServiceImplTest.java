package com.sqkouer.spring.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
 @ContextConfiguration("/applicationContext.xml")
public class UserServiceImplTest {

  //@Qualifier
    @Autowired
  UserService userService;

   @Test
    public void testUserService() {
       Assert.notNull(userService);
    }
}
