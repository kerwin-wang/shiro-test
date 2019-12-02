package com.kerwin.shiro.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kerwin.shiro.entity.User;
import com.kerwin.shiro.mapper.UserMapper;
import com.kerwin.shiro.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
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

    @Override
    public int updateUser(User user)
    {
        return userMapper.updateById(user);
    }

    @Override
    public int insertUser(User user)
    {
        return userMapper.insert(user);
    }

    @Override
    public User getUserByUserName(String userName)
    {
        QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.eq("username",userName);

        return userMapper.selectOne(userQueryWrapper);
    }

}
