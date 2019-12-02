package com.kerwin.shiro.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @className: UserController
 * @version: v1.0.0
 * @author: d.w
 * @date: 2019-12-02 15:36
 */
@Slf4j
@Controller
@RequestMapping("/user")
public class UserController
{
    @RequestMapping("/home")
    public String home(){
        log.info("this is user home");
        return "home";
    }
}
