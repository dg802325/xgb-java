package com.xgb.controller;

import com.xgb.common.SessionUtil;
import com.xgb.jwt.JWTToken;
import com.xgb.lang.R;
import com.xgb.lang.RequestUtils;
import com.xgb.model.SysUser;
import com.xgb.service.SysUserService;
import com.xgb.utils.CookieUtils;
import com.xgb.utils.MD5Util;
import com.xgb.utils.MyUtils;
import eu.bitwalker.useragentutils.Browser;
import eu.bitwalker.useragentutils.UserAgent;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/admin")
public class LoginController {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private SysUserService sysUserService;

    @Value("${server.token.time}")
    int tokenTime;

    @GetMapping("/getAdminList")
    public R getAdminList(){
        Map<String,Object> map = new HashMap<>();
        map.put("admin","admin");
        return R.ok(map,"查询成功");
    }

    @PostMapping("/login")
    public R login(SysUser sysUser, HttpServletResponse response, HttpServletRequest request){
        String pwd = MD5Util.toMd5(sysUser.getPassword());
        JWTToken jToken = new JWTToken(null);
        jToken.setPassword(pwd.toCharArray());
        jToken.setUsername(sysUser.getUserName());
        jToken.setUserType("admin-token");
        try {
            Subject subject = org.apache.shiro.SecurityUtils.getSubject();
            subject.login(jToken);
            Object adminToken = org.apache.shiro.SecurityUtils.getSubject().getPrincipal();
            response.addHeader("admin-token", adminToken.toString());
            CookieUtils.setCookie(response, "admin-token", adminToken.toString(), tokenTime);
            Map map = new HashMap();
            map.put("admin-token", adminToken);
            map.put("uerName", sysUser.getUserName());

            //更新登录地址 ip 登录时间  插入操作日志
            SysUser user = sysUserService.selectUserByPassword(sysUser.getUserName(),MD5Util.toMd5(sysUser.getPassword()));
            //获取用户ip地址
            user.setLastLoginIp(RequestUtils.getIpAddr(request));
            user.setLastLogin(new Date());
            // 获取浏览器信息
            Browser browser = UserAgent.parseUserAgentString(request.getHeader("User-Agent")).getBrowser();
            user.setLastLoginArea(browser.toString());
            sysUserService.update(user);
            return R.ok(map, "登录成功");
        } catch (Exception e) {
            return R.error(999, "账号密码错误");
        }
    }

    @ResponseBody
    @RequestMapping(value = "/getUserInfo", method = RequestMethod.GET)
    public R getUser(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        String id  = SessionUtil.getSysUserId();
        if(MyUtils.isEmpty(id)){
            return R.error(666,"token失效");
        }
        SysUser user = sysUserService.selectByPrimaryKey(id);
        map.put("userName", user.getUserName());
        map.put("id", user.getId());
        map.put("sex",user.getSex());
        map.put("password",user.getPassword());
        map.put("nickName",user.getNickName());
        map.put("email",user.getEmail());
        map.put("headerUrl",user.getUserHeaderUrl());
        map.put("loginThisTime",new Date());
        map.put("loginArea",RequestUtils.getIpAddr(request));
        return R.ok(map, "获取用户信息");
    }

    @ResponseBody
    @RequestMapping(value = "/toUserOut", method = RequestMethod.POST)
    public R signOut() {
        String id  = SessionUtil.getSysUserId();
        SysUser sysUser = sysUserService.selectByPrimaryKey(id);
        //最后登录时间
        sysUser.setLastLogin(new Date());
        int num = sysUserService.update(sysUser);
        if (num > 0) {
            return R.ok("成功");
        } else {
            return R.error(999, "失败");
        }
    }

    /**
     * 验证token合法性
     *
     * @param token
     * @return
     */
    @RequestMapping(value = "/admin/vrifyToken", method = RequestMethod.GET)
    @ResponseBody
    public boolean vrifyToken(String token) {
        if (MyUtils.isEmpty(token)) {
            return false;
        }
        try {
            Claims claims = Jwts.parser().setSigningKey("boot").parseClaimsJws(token).getBody();
            if (claims == null || claims.getExpiration().before(new Date())) {//过期
                return false;
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }


}
