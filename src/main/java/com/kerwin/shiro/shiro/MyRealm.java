package com.kerwin.shiro.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
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
    private JdbcTemplate jdbcTemplate;



    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection)
    {
        String userName = (String) principalCollection.getPrimaryPrincipal();

        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException
    {

        String userName = (String) authenticationToken.getPrincipal();
        String password = (String) authenticationToken.getCredentials();

        return null;
    }

}
