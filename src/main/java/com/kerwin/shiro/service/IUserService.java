package com.kerwin.shiro.service;

import com.kerwin.shiro.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author wd
 * @since 2019-12-02
 */
public interface IUserService extends IService<User>
{
    /**
     * 功能描述:
     * 〈通过id获取user〉
     *
     * @param id id
     * @return : com.kerwin.shiro.entity.User
     * @author : d.w
     * @date : 2019/12/05 9:57
     */
    User getUser(Long id);

    /**
     * 功能描述:
     * 〈更新user〉
     *
     * @param user user实体
     * @return : int
     * @author : d.w
     * @date : 2019/12/05 9:57
     */
    int updateUser(User user);

    /**
     * 功能描述:
     * 〈添加user〉
     *
     * @param user user实体
     * @return : int
     * @author : d.w
     * @date : 2019/12/05 9:57
     */
    int insertUser(User user);

    /**
     * 功能描述:
     * 〈通过姓名获取user〉
     *
     * @param userName 姓名
     * @return : com.kerwin.shiro.entity.User
     * @author : d.w
     * @date : 2019/12/05 9:58
     */
    User getUserByUserName(String userName);

}
