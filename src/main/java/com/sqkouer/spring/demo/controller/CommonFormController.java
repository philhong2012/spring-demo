package com.sqkouer.spring.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ${DESCRIPTION}
 *
 * @author hongxubing
 * @create 2017-07-06 15:48
 **/
@RequestMapping("/commonForm")
@Controller
public class CommonFormController {
    Logger logger = LoggerFactory.getLogger(CommonFormController.class);
    @RequestMapping("/create")
    public ModelAndView create() {
        return new ModelAndView("CommonFormEdit","name","程序员");
    }


    @RequestMapping("/save")
    public ModelAndView save(HttpServletRequest request, HttpServletResponse response) {
        logger.debug("request: {}",request.getParameterMap());
        //return new ModelAndView("commonFormEdit");

        return  null;
    }
}
