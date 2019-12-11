package com.xgb.controller;

import com.xgb.common.SessionUtil;
import com.xgb.entity.JWTToken;
import com.xgb.entity.R;
import com.xgb.util.MD5Util;
import com.xgb.model.SysUser;
import com.xgb.service.SysUserService;
import com.xgb.util.CookieUtils;
import com.xgb.util.MyTools;
import com.xgb.util.RequestUtils;
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
    public R login(SysUser sysUser, HttpServletResponse response,String code, HttpServletRequest request){
        Object str = RequestUtils.getRequest().getSession().getAttribute("verifyCode");
        if (MyTools.isNotEmpty(str)&&str.toString().equals(code)) {
            return R.error(999,"验证码错误");
        }
        String pwd = MD5Util.toMd5(sysUser.getPassword());
        JWTToken jToken = new JWTToken(null);
        jToken.setPassword(pwd.toCharArray());
        jToken.setUsername(sysUser.getUserName());
        jToken.setUserType("boot-admin");
        try {
            Subject subject = org.apache.shiro.SecurityUtils.getSubject();
            subject.login(jToken);
            Object adminToken = org.apache.shiro.SecurityUtils.getSubject().getPrincipal();
            response.addHeader("boot-admin", adminToken.toString());
            CookieUtils.setCookie(response, "boot-admin", adminToken.toString(), tokenTime);
            Map map = new HashMap();
            map.put("boot-admin", adminToken);
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
    @GetMapping("/getUserInfo")
    public R getUser(HttpServletRequest request) {
        Map<String, Object> map = new HashMap<>();
        String id  = SessionUtil.getSysUserId();
        if(MyTools.isEmpty(id)){
            return R.error(666,"token失效");
        }
        SysUser user = sysUserService.selectByPrimaryKey(id);
        map.put("userName", user.getUserName());//登录名
        map.put("id", user.getId());//id
        map.put("sex",user.getSex());//性别
        map.put("password",user.getPassword());//密码
        map.put("nickName",user.getNickName());//昵称
        map.put("email",user.getEmail());//邮箱
        map.put("headerUrl",user.getUserHeaderUrl());//头像
        map.put("loginThisTime",new Date());//登录时间
        map.put("loginArea",RequestUtils.getIpAddr(request));//本次登录
        map.put("departmentName","测试岗位");//岗位
        map.put("roleName","顶级管理员");//职位名称
        map.put("lastLogin",user.getLastLogin());//上次登录
        return R.ok(map, "获取用户信息");
    }

    @ResponseBody
    @PostMapping("/toUserOut")
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
    @GetMapping("/vrifyToken")
    @ResponseBody
    public boolean vrifyToken(String token) {
        if (MyTools.isEmpty(token)) {
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
