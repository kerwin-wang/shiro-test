package com.kerwin.shiro.mapper;

import com.kerwin.shiro.entity.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author sy
 * @since 2019-12-02
 */
public interface RoleMapper extends BaseMapper<Role>
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
    List<Role> queryByUsername(String username);

}
