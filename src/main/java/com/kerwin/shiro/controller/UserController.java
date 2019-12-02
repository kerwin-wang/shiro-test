package com.kerwin.shiro.controller;

import com.kerwin.shiro.entity.User;
import com.kerwin.shiro.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
    @Autowired
    private IUserService userService;

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/login")
    public String login(User user, Model model) {
        //使用 shiro 登录验证
        //1 认证的核心组件：获取 Subject 对象
        Subject subject = SecurityUtils.getSubject();
        //2 将登陆表单封装成 token 对象
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user.getPassword());
//        token.setRememberMe(true);
        try {
            //3 让 shiro 框架进行登录验证：
            subject.login(token);
        } catch (Exception e) {
            e.printStackTrace();
            model.addAttribute("errorMsg",e.getMessage());
            return "error";
        }
        return "index";
    }

    @GetMapping("/logout")
    public String logout(){
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return "login";
    }

    @RequestMapping("/home")
    public String home(){
        log.info("this is user home");
        User user = userService.getUser(1L);
        log.info(user.toString());
        return "home";
    }

    @RequestMapping("/error")
    public String error(){
        return "error";
    }

    @GetMapping("/index")
    public String index(){
        return "index";
    }
}
