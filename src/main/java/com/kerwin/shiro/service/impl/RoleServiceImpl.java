package com.kerwin.shiro.service.impl;

import com.kerwin.shiro.entity.Role;
import com.kerwin.shiro.mapper.RoleMapper;
import com.kerwin.shiro.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author sy
 * @since 2019-12-02
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> getRoleByUsername(String username)
    {
        return roleMapper.queryByUsername(username);
    }

}
