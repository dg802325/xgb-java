package com.xgb.common;

import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.JWT;
import com.xgb.lang.HttpKit;
import com.xgb.model.SysUser;
import com.xgb.utils.CookieUtils;
import com.xgb.utils.MyUtils;

public class SessionUtil {
    //获取后台登陆用户
    public static String getSysUserId() {

        String token = CookieUtils.getCookie(HttpKit.getRequest(), "boot-admin");
        if (MyUtils.isEmpty(token)||"undefined".equals(token)) {
            return null;
        }
        System.out.println("SessionUtil token is :"+token);
        SysUser sysUser = JSONObject.parseObject(JWT.decode(token).getSubject()).toJavaObject(SysUser.class);
        return sysUser.getId();
    }

}