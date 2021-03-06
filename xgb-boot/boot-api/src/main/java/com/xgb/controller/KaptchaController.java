package com.xgb.controller;

import com.xgb.util.RequestUtils;
import com.xgb.util.VerifyCodeUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class KaptchaController {

    @RequestMapping(value = "/admin/kaptcha",method = RequestMethod.GET)
    public void getCode(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        resp.setHeader("Pragma", "No-cache");
        resp.setHeader("Cache-Control", "no-cache");
        resp.setDateHeader("Expires", 0);
        resp.setContentType("image/jpeg");

        //生成随机字串
        String verifyCode = VerifyCodeUtils.generateVerifyCode(4);
        //存入会话session
        RequestUtils.getRequest().getSession().setAttribute("verifyCode", verifyCode);
        //生成图片
        int w = 200, h = 75;
        VerifyCodeUtils.outputImage(w, h, resp.getOutputStream(), verifyCode);
    }
}
