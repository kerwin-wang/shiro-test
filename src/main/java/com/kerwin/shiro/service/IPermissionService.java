package com.kerwin.shiro.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kerwin.shiro.entity.Permission;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author sy
 * @since 2019-12-02
 */
public interface IPermissionService extends IService<Permission>
{
    /**
     * 功能描述:
     * 〈通过姓名获取权限〉
     *
     * @param username 姓名
     * @return : java.util.List<com.kerwin.shiro.entity.Permission>
     * @author : d.w
     * @date : 2019/12/05 10:11
     */
    List<Permission> getPermissionByUserName(String username);

}
