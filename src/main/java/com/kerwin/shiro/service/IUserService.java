package com.kerwin.shiro.service;

import com.kerwin.shiro.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author sy
 * @since 2019-12-02
 */
public interface IUserService extends IService<User> {
    User getUser(Long id);

    int updateUser(User user);

    int insertUser(User user);

    User getUserByUserName(String userName);
}
