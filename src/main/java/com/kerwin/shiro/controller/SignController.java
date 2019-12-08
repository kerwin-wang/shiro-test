package com.kerwin.shiro.controller;

import com.kerwin.shiro.entity.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @ClassName: SignController
 * @version: v1.0.0
 * @Author: d.w
 * @Date: 2019-12-08 14:10
 */
@Controller
public class SignController extends BaseController
{
    @PostMapping("/signIn")
    public String login(User user, Model model)
    {
        //使用 shiro 登录验证
        //1 认证的核心组件：获取 Subject 对象
        Subject subject = SecurityUtils.getSubject();
        //2 将登陆表单封装成 token 对象
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user.getPassword());
        //        token.setRememberMe(true);
        try
        {
            //3 让 shiro 框架进行登录验证：
            subject.login(token);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            model.addAttribute("errorMsg", e.getMessage());
            return "error";
        }
        return "index";
    }
}
