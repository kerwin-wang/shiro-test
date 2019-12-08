package com.kerwin.shiro.controller;

import com.google.common.collect.Maps;
import com.kerwin.shiro.entity.User;
import com.kerwin.shiro.utils.R;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @ClassName: CustomerController
 * @version: v1.0.0
 * @Author: d.w
 * @Date: 2019-12-08 9:00
 */
@Controller
@RequestMapping("/customer")
public class CustomerController extends BaseController
{
    @GetMapping("/add")
    @ResponseBody
    public R add()
    {
        return R.success("添加成功");
    }

    @GetMapping("/update")
    @ResponseBody
    public R update()
    {
        Map<String, Object> map = Maps.newHashMap();
        User currentUser = getCurrentUser();
        map.put("user", currentUser);
        return R.success("修改成功", map);
    }

}
