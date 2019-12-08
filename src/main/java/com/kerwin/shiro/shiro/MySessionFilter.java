package com.kerwin.shiro.shiro;

import com.kerwin.shiro.entity.User;
import com.kerwin.shiro.service.IUserService;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.AccessControlFilter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @className: MySessionFilter
 * @version: v1.0.0
 * @author: d.w
 * @date: 2019-12-02 16:28
 */
public class MySessionFilter extends AccessControlFilter
{
    @Autowired
    private IUserService userService;

    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue)
            throws Exception {

        Subject subject =    this.getSubject(request, response);
        if(subject==null) {
            return false;
        }

        String username=  (String) subject.getPrincipal();

        Session session = subject.getSession();
        User sessionUser =(User)session.getAttribute("sessionUser");
        if(sessionUser==null) {
            //根据用户名到数据库中查询
            sessionUser=userService.getUserByUserName(username);
        }
        session.setAttribute("sessionUser", sessionUser);

        return true;
    }

    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
        return true;
    }

}
