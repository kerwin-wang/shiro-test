package com.kerwin.shiro.service;

import com.kerwin.shiro.entity.Role;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author sy
 * @since 2019-12-02
 */
public interface IRoleService extends IService<Role> {
    List<Role> getRoleByUsername(String username);
}
