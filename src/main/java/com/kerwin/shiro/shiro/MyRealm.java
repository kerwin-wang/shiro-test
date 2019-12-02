package com.kerwin.shiro.shiro;

import com.kerwin.shiro.entity.User;
import com.kerwin.shiro.service.IPermissionService;
import com.kerwin.shiro.service.IRoleService;
import com.kerwin.shiro.service.IUserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @className: MyRealm
 * @version: v1.0.0
 * @author: d.w
 * @date: 2019-12-02 16:03
 */
@Component("myRealm")
public class MyRealm extends AuthorizingRealm
{
    @Autowired
    private IUserService userService;

    @Autowired
    private IRoleService roleService;

    @Autowired
    private IPermissionService permissionService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection)
    {
//        String username = (String) principalCollection.getPrimaryPrincipal();
//        SecurityUtils.getSubject().getSession();
//        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
//
//        List<Role> roleByUsername = roleService.getRoleByUsername(username);
//        Permission permissionByUserName = permissionService.getPermissionByUserName(username);
//        Set<String> roleNames =
//                Set<String> permNames =
//        authorizationInfo.setRoles(roleNames);
//        authorizationInfo.setStringPermissions(permNames);
//        return authorizationInfo;

        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException
    {

        String userName = (String) authenticationToken.getPrincipal();
        User user = userService.getUserByUserName(userName);
        if (user == null)
        {
            //登陆失败
            return null;
        }
        return new SimpleAuthenticationInfo(user.getUsername(), user.getPassword(), this.getClass().getSimpleName());
    }

}
