package com.kerwin.shiro.shiro;

import org.apache.shiro.web.filter.AccessControlFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @className: MysessionFilter
 * @version: v1.0.0
 * @author: d.w
 * @date: 2019-12-02 16:28
 */
public class MysessionFilter extends AccessControlFilter
{
    @Override
    protected boolean isAccessAllowed(ServletRequest servletRequest, ServletResponse servletResponse, Object o) throws Exception
    {
        return false;
    }

    @Override
    protected boolean onAccessDenied(ServletRequest servletRequest, ServletResponse servletResponse) throws Exception
    {
        return false;
    }

}
