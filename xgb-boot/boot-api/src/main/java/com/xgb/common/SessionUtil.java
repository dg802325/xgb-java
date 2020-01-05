package com.xgb.common;

import com.alibaba.fastjson.JSONObject;
import com.auth0.jwt.JWT;
import com.xgb.model.SysUser;
import com.xgb.util.CookieUtils;
import com.xgb.util.MyTools;
import com.xgb.util.RequestUtils;

public class SessionUtil {
    //获取后台登陆用户
    public static String getSysUserId() {

        String token = CookieUtils.getCookie(RequestUtils.getRequest(), "boot-backend");
        if (MyTools.isEmpty(token)||"undefined".equals(token)) {
            return null;
        }
        System.out.println("SessionUtil token is :"+token);
        SysUser sysUser = JSONObject.parseObject(JWT.decode(token).getSubject()).toJavaObject(SysUser.class);
        return sysUser.getId();
    }

}