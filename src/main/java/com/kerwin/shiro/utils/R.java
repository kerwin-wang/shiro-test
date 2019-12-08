package com.kerwin.shiro.utils;

import java.util.Map;

/**
 * @ClassName: R
 * @version: v1.0.0
 * @Author: d.w
 * @Date: 2019-12-08 9:14
 */
public class R
{
    private Status status;

    private String msg;

    private Map<String, Object> data;

    public R(Status status)
    {
        this.status = status;
    }

    public static R success(String msg)
    {
        R r = new R(Status.SUCCESS);
        r.msg = msg;
        return r;
    }

    public static R success(String msg, Map<String, Object> data)
    {
        R r = new R(Status.SUCCESS);
        r.msg = msg;
        r.data = data;
        return r;
    }

    public static R error(String msg)
    {
        R r = new R(Status.ERROR);
        r.msg = msg;
        return r;
    }

    public Status getStatus()
    {
        return status;
    }

    public void setStatus(Status status)
    {
        this.status = status;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    public Map<String, Object> getData()
    {
        return data;
    }

    public void setData(Map<String, Object> data)
    {
        this.data = data;
    }

    enum Status
    {
        /**
         * 状态枚举
         *
         * @param null
         * @auther: d.w
         * @date: 2019-12-08 09:17
         */
        SUCCESS("success"),
        ERROR("error");

        private String msg;

        Status(String msg)
        {
            this.msg = msg;
        }
    }

}
