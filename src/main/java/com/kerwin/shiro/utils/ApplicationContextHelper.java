package com.kerwin.shiro.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @ClassName: ApplicationContextHelper
 * @version: v1.0.0
 * @Author: d.w
 * @Date: 2019-12-08 9:01
 */
@Component
public class ApplicationContextHelper implements ApplicationContextAware
{
    private static ApplicationContext application;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
    {
        if (application == null)
        {
            application = applicationContext;
        }
    }

    public static ApplicationContext getApplicationContext()
    {
        return application;
    }

    public static Object getBean(String name)
    {
        return application.getBean(name);
    }

    public static <T> T getBean(Class<T> clazz)
    {
        return application.getBean(clazz);
    }

    public static <T> T getBean(String name, Class<T> clazz)
    {
        return application.getBean(name, clazz);
    }

}
