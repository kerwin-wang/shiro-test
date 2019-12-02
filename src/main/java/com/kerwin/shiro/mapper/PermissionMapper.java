package com.kerwin.shiro.mapper;

import com.kerwin.shiro.entity.Permission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author sy
 * @since 2019-12-02
 */
public interface PermissionMapper extends BaseMapper<Permission> {
    Permission queryByUsername(String username);
}
