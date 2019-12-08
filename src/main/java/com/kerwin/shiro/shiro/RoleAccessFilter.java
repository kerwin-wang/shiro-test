package com.kerwin.shiro.shiro;

import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authz.AuthorizationFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @ClassName: RoleAccessFilter
 * @version: v1.0.0
 * @Author: d.w
 * @Date: 2019-12-08 13:14
 */
public class RoleAccessFilter extends AuthorizationFilter
{
    @Override
    protected boolean isAccessAllowed(ServletRequest servletRequest, ServletResponse servletResponse, Object o) throws Exception
    {
        Subject subject = getSubject(servletRequest, servletResponse);
        String[] roles = (String[]) o;
        if (roles == null || roles.length == 0)
        {
            return false;
        }
        for (String role : roles)
        {
            if (subject.hasRole(role))
            {
                return true;
            }
        }
        return false;
    }

}
