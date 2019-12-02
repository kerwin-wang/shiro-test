package com.kerwin.shiro.service.impl;

import com.kerwin.shiro.entity.Permission;
import com.kerwin.shiro.mapper.PermissionMapper;
import com.kerwin.shiro.service.IPermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author sy
 * @since 2019-12-02
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements IPermissionService
{

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public List<Permission> getPermissionByUserName(String username)
    {
        return permissionMapper.queryByUsername(username);
    }

}
