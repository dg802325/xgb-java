package com.xgb.config;

import com.alibaba.fastjson.JSONObject;
import com.xgb.jwt.JWTToken;
import com.xgb.model.SysUser;
import com.xgb.service.SysUserService;
import com.xgb.utils.MyUtils;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Mr.Li
 * @create 2018-07-12 15:23
 * @desc
 **/
@Component
public class MyRealm extends AuthorizingRealm {

    @Autowired
    private SysUserService sysUserService;

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
        JWTToken token = (JWTToken) authcToken;
        String userType = token.getUserType();
        if ("boot-admin".equals(userType)) {
            SysUser user = sysUserService.selectUserByPassword(token.getUsername(), new String(token.getPassword()));
            if (MyUtils.isNotEmpty(user)) {
                SysUser idUser = new SysUser();
                idUser.setId(user.getId());
                String sign = Jwts.builder().setSubject(JSONObject.toJSONString(idUser))
                        .setHeaderParam("role", "server")
                        .setExpiration(new Date(System.currentTimeMillis() + 3600 * 1000))
                        .signWith(SignatureAlgorithm.HS512, "boot")
                        .compact();
                if (token.getToken() == null) {
                    token.setToken(sign);
                }
            }else {
                return null;
            }
        }
        return new SimpleAuthenticationInfo(token.getToken(), token.getToken(), getName());
    }


    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        Object backendToken = org.apache.shiro.SecurityUtils.getSubject().getPrincipal();
        SysUser sysUser = JSONObject.parseObject(Jwts.parser().setSigningKey("boot").parseClaimsJws(backendToken.toString()).getBody().getSubject(), SysUser.class);

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        Map conditions = new HashMap();
        conditions.put("userId", sysUser.getId());
        //根据userId查询用户权限
        List<String> strings = sysUserService.selectPermissionByUserId(sysUser.getId());
        info.addStringPermissions(strings);
        return info;
    }


    /**
     * 清除缓存权限信息
     */
    public void clearCachedAuthorizationInfo(String principal) {
        SimplePrincipalCollection principals = new SimplePrincipalCollection(principal, getName());
        clearCachedAuthorizationInfo(principals);
    }


    /**
     * 重写方法,清除当前用户的的 授权缓存
     *
     * @param principals
     */
    @Override
    public void clearCachedAuthorizationInfo(PrincipalCollection principals) {
        super.clearCachedAuthorizationInfo(principals);
    }

    /**
     * 重写方法，清除当前用户的 认证缓存
     *
     * @param principals
     */
    @Override
    public void clearCachedAuthenticationInfo(PrincipalCollection principals) {
        super.clearCachedAuthenticationInfo(principals);
    }

    @Override
    public void clearCache(PrincipalCollection principals) {
        super.clearCache(principals);
    }

    /**
     * 自定义方法：清除所有 授权缓存
     */
    public void clearAllCachedAuthorizationInfo() {
        getAuthorizationCache().clear();
    }

    /**
     * 自定义方法：清除所有 认证缓存
     */
    public void clearAllCachedAuthenticationInfo() {
        getAuthenticationCache().clear();
    }

    /**
     * 自定义方法：清除所有的  认证缓存  和 授权缓存
     */
    public void clearAllCache() {
        clearAllCachedAuthenticationInfo();
        clearAllCachedAuthorizationInfo();
    }
}
