package com.xgb.controller;

import com.alibaba.fastjson.JSONObject;
import com.xgb.lang.R;
import com.xgb.utils.HttpClientUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: 邓根
 * @Date: 2019/10/9 18:08
 * @Description:
 */
@RequestMapping("/admin/")
@RestController
public class BankCardInformationController {


    @GetMapping("getBankCardByNo")
    public R getBankCardByNo(String bankCardNo){
        Map<String,String> map = new HashMap<String,String>();
        map.put("_input_charset","utf-8");
        map.put("cardNo",bankCardNo);
        map.put("cardBinCheck","true");
        String s = HttpClientUtils.sendGet("https://ccdcapi.alipay.com/validateAndCacheCardInfo.json", map);
        JSONObject jsonObject = JSONObject.parseObject(s);
        String bank = jsonObject.getString("bank");
        System.out.println(bank);
        return R.error(999,"未查询到");
    }
}
