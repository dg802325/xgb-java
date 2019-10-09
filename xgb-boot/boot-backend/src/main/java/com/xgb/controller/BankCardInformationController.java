package com.xgb.controller;

import com.alibaba.fastjson.JSONObject;
import com.xgb.lang.R;
import com.xgb.model.ChinaBankCode;
import com.xgb.service.ChinaBankCodeService;
import com.xgb.utils.HttpClientUtils;
import com.xgb.utils.MyUtils;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private ChinaBankCodeService chinaBankCodeService;

    @GetMapping("getBankCardByNo")
    public R getBankCardByNo(String bankCardNo){
        Map<String,String> codeMap = new HashMap<String,String>();
        codeMap.put("_input_charset","utf-8");
        codeMap.put("cardNo",bankCardNo);
        codeMap.put("cardBinCheck","true");
        String s = HttpClientUtils.sendGet("https://ccdcapi.alipay.com/validateAndCacheCardInfo.json", codeMap);
        JSONObject jsonObject = JSONObject.parseObject(s);
        //获得银行编码
        String bank = jsonObject.getString("bank");
        //获得银行图标 ?d=cashier&t=银行代码
        Map<String,String> pngMap = new HashMap<>();
        pngMap.put("d","cashier");
        pngMap.put("t",bank);
//        String s1 = HttpClientUtils.sendGet("https://apimg.alipay.com/combo.png", pngMap);
        String bankNameByBankCode = chinaBankCodeService.getBankNameByBankCode(bank);
        if(MyUtils.isEmpty(bankNameByBankCode)){

        }
        System.out.println(bank);
        return R.error(999,"未查询到");
    }
}
