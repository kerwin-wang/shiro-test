package com.kerwin.shiro.service.impl;

import com.kerwin.shiro.entity.User;
import com.kerwin.shiro.dao.UserMapper;
import com.kerwin.shiro.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统用户 服务实现类
 * </p>
 *
 * @author sy
 * @since 2019-12-02
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUser(Long id)
    {
        return userMapper.selectById(id);
    }

}
