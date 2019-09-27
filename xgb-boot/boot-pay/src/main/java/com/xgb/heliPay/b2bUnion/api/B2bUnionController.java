package com.xgb.heliPay.b2bUnion.api;

import com.xgb.heliPay.b2bUnion.service.Disguiser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Auther: 邓根
 * @Date: 2019/9/27 19:50
 * @Description:
 */
@RestController
public class B2bUnionController extends B2bUnionBase {

    @ResponseBody
    @RequestMapping(value = "/toEntryResult")
    public static String onlineRequestForm(String P1_bizType,String P2_orderId,String P3_customerNumber,String P4_orderAmount,String P5_bankId,String P6_business,String P7_timestamp,String P8_goodsName,
                                           String P9_period,String P10_periodUnit,String P11_callbackUrl,String P12_serverCallbackUrl,String P13_orderIp,String P14_onlineCardType,String P15_desc){
        Map<String,String> sPara = new LinkedHashMap<>();
        sPara.put("P1_bizType",P1_bizType);
        sPara.put("P2_orderId",P2_orderId);
        sPara.put("P3_customerNumber",P3_customerNumber);
        sPara.put("P4_orderAmount",P4_orderAmount);
        sPara.put("P5_bankId",P5_bankId);
        sPara.put("P6_business",P6_business);
        sPara.put("P7_timestamp",P7_timestamp);
        sPara.put("P8_goodsName", P8_goodsName);
        sPara.put("P9_period",P9_period);
        sPara.put("P10_periodUnit",P10_periodUnit);
        sPara.put("P11_callbackUrl",P11_callbackUrl);
        sPara.put("P12_serverCallbackUrl",P12_serverCallbackUrl);
        sPara.put("P13_orderIp",P13_orderIp);
        sPara.put("P14_onlineCardType",P14_onlineCardType);
        sPara.put("P15_desc", P15_desc);
//        sPara.put("P17_signatureType","MD5");
        String valuepinjie = valuepinjie(sPara);
        System.out.println("---商户编号---："+"C1800537538");
        System.out.println("---签名密钥---："+"MFFKNSpVggyKdFXXGhKEg7QoS4nWssUA");
        System.out.println("---待签名串---："+valuepinjie);
        String sign = Disguiser.disguiseMD5(valuepinjie);
        System.out.println("-----加密sign串：" + sign);
        sPara.put("sign", sign);

        String html = createAutoFormHtml(ONLINE_URL, sPara,"UTF-8");   //生成自动跳转的Html表单
        System.out.println(html);
        return html;
    }

    public static String valuepinjie(Map<String,String> params){
        Set<Map.Entry<String, String>> entries = params.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        StringBuffer sb = new StringBuffer();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            String k = (String) entry.getKey();
            Object v = entry.getValue();
            if ( !"sign".equals(k) ) {
                if(null==v){
                    System.out.println("-----拼接参数："+k+"："+v);
                    sb.append("&");
                }else {
                    System.out.println("-----拼接参数："+k+":"+v);
                    sb.append("&"+v);
                }
            }
        }
        return sb.toString()+"&MFFKNSpVggyKdFXXGhKEg7QoS4nWssUA";
    }


    /**
     * 功能：前台交易构造HTTP POST自动提交表单<br>
     * @param hiddens 以MAP形式存储的表单键值<br>
     * @param encoding 上送请求报文域encoding字段的值<br>
     * @return 构造好的HTTP POST交易表单<br>
     */
    public static String createAutoFormHtml(String reqUrl, Map<String, String> hiddens,String encoding) {
        StringBuffer sf = new StringBuffer();
        sf.append("<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset="+encoding+"\"/></head><body>");
        sf.append("<form id = \"pay_form\" action=\"" + reqUrl
                + "\" method=\"post\">");
        if (null != hiddens && 0 != hiddens.size()) {
            Set<Map.Entry<String, String>> set = hiddens.entrySet();
            Iterator<Map.Entry<String, String>> it = set.iterator();
            while (it.hasNext()) {
                Map.Entry<String, String> ey = it.next();
                String key = ey.getKey();
                String value = ey.getValue();
                sf.append("<input type=\"hidden\" name=\"" + key + "\" id=\""
                        + key + "\" value=\"" + value + "\"/>");
            }
        }
        sf.append("</form>");
        sf.append("</body>");
        sf.append("<script type=\"text/javascript\">");
        sf.append("document.all.pay_form.submit();");
        sf.append("</script>");
        sf.append("</html>");
        return sf.toString();
    }
}
