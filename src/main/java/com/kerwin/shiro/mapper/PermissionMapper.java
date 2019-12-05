package com.kerwin.shiro.mapper;

import com.kerwin.shiro.entity.Permission;
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
public interface PermissionMapper extends BaseMapper<Permission>
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
    List<Permission> queryByUsername(String username);

}
