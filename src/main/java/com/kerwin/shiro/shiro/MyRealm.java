package com.kerwin.shiro.shiro;

import com.kerwin.shiro.entity.Permission;
import com.kerwin.shiro.entity.Role;
import com.kerwin.shiro.entity.User;
import com.kerwin.shiro.service.IPermissionService;
import com.kerwin.shiro.service.IRoleService;
import com.kerwin.shiro.service.IUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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
        String username = (String) principalCollection.getPrimaryPrincipal();
        SecurityUtils.getSubject().getSession();
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();

        List<Role> roleList = roleService.getRoleByUsername(username);
        List<Permission> permissionList = permissionService.getPermissionByUserName(username);
        Set<String> roleNames = roleList.stream().map(Role::getName).collect(Collectors.toSet());
        Set<String> permNames = permissionList.stream().map(Permission::getName).collect(Collectors.toSet());
        authorizationInfo.setRoles(roleNames);
        authorizationInfo.setStringPermissions(permNames);
        return authorizationInfo;
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
