package com.kerwin.shiro.controller;

import com.kerwin.shiro.entity.User;
import org.apache.shiro.SecurityUtils;
import org.springframework.stereotype.Controller;

/**
 * @ClassName: BaseController
 * @version: v1.0.0
 * @Author: d.w
 * @Date: 2019-12-07 17:39
 */
@Controller
public class BaseController
{
    public User getCurrentUser()
    {
        return (User) SecurityUtils.getSubject().getPrincipal();
    }

    public String getUsername()
    {
        return getCurrentUser().getUsername();
    }

    public String getUserId()
    {
        return getCurrentUser().getUserId();
    }

}
