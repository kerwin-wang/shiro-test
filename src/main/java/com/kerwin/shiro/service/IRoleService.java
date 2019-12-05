package com.kerwin.shiro.service;

import com.kerwin.shiro.entity.Role;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author sy
 * @since 2019-12-02
 */
public interface IRoleService extends IService<Role>
{
    /**
     * 功能描述:
     * 〈通过姓名获取角色〉
     *
     * @param username 姓名
     * @return : java.util.List<com.kerwin.shiro.entity.Role>
     * @author : d.w
     * @date : 2019/12/05 10:10
     */
    List<Role> getRoleByUsername(String username);

}
