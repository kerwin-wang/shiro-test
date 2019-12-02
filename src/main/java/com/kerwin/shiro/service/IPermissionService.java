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
    List<Permission> getPermissionByUserName(String username);

}
