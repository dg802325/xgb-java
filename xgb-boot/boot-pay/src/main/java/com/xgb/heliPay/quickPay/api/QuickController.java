package com.xgb.heliPay.quickPay.api;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.xgb.heliPay.quickPay.entity.request.*;
import com.xgb.heliPay.quickPay.entity.response.*;
import com.xgb.heliPay.quickPay.service.HttpClientService;
import com.xgb.heliPay.quickPay.service.MessageHandle;
import com.xgb.heliPay.utils.Des3Encryption;
import com.xgb.lang.R;
import org.apache.commons.httpclient.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: 邓根
 * @Date: 2019/9/27 14:29
 * @Description:
 */
public class QuickController extends QuickBase {


    /**
     * 创建普通订单接口
     * @param requestVo
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/createOrder")
    public R createOrder(CreateOrderVo requestVo) {
        Map<String,Object> paramMap = new HashMap<>();
        logger.info("--------进入创建订单接口----------");
        try {
            Map reqestMap = MessageHandle.getReqestMap(requestVo);
            logger.info("请求参数：" + reqestMap);
            Map<String, Object> resultMap = HttpClientService.getHttpResp(reqestMap, REQUEST_URL_QUICKPAY);
            logger.info("响应结果：" + resultMap);

            if ((Integer) resultMap.get("statusCode") != HttpStatus.SC_OK) {
                return R.error(999,"创建失败");
            }

            String resultMsg = (String) resultMap.get("response");
            if (!isJSON(resultMsg)) {
                return R.error(998,resultMsg);
            }

            CreateOrderResponseVo responseVo = JSONObject.parseObject(resultMsg, CreateOrderResponseVo.class);
            if (!MessageHandle.checkSign(responseVo)) {
                return R.error(997,"验签失败");
            }

            if (!"0000".equals(responseVo.getRt2_retCode())) {
                return R.error(996, responseVo.getRt3_retMsg());
            }

            paramMap.put("P2_customerNumber", responseVo.getRt4_customerNumber());
            paramMap.put("P3_orderId", responseVo.getRt5_orderId());
            paramMap.put("P5_phone", requestVo.getP13_phone());
            return R.ok(paramMap,"成功");
        } catch (Exception e) {
            logger.info("交易异常：" + e.getMessage(), e);
            return R.error(995, "交易异常：" + e.getMessage());
        }
    }

    /**
     * 创建普通订单接口
     * @param requestVo
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/createFenOrder")
    public R createFenOrder(CreateFenOrderVo requestVo) {
        requestVo.setP24_ruleJson(Des3Encryption.encode(ENCRYPT_KEY_COMMON, requestVo.getP24_ruleJson())); //给分账参数加密
        requestVo.setSignatureType(SIGNATURE_ALGORITHM);
        Map<String,Object> paramMap = new HashMap<>();
        logger.info("--------进入创建订单接口----------");
        try {
            Map reqestMap = MessageHandle.getReqestMap(requestVo);
            logger.info("请求参数：" + reqestMap);
            Map<String, Object> resultMap = HttpClientService.getHttpResp(reqestMap, REQUEST_URL_QUICKPAY);
            logger.info("响应结果：" + resultMap);

            if ((Integer) resultMap.get("statusCode") != HttpStatus.SC_OK) {
                return R.error(999,"创建失败");
            }

            String resultMsg = (String) resultMap.get("response");
            if (!isJSON(resultMsg)) {
                return R.error(998,resultMsg);
            }

            CreateOrderResponseVo responseVo = JSONObject.parseObject(resultMsg, CreateOrderResponseVo.class);
            if (!MessageHandle.checkSign(responseVo)) {
                return R.error(997,"验签失败");
            }

            if (!"0000".equals(responseVo.getRt2_retCode())) {
                return R.error(996, responseVo.getRt3_retMsg());
            }

            paramMap.put("P2_customerNumber", responseVo.getRt4_customerNumber());
            paramMap.put("P3_orderId", responseVo.getRt5_orderId());
            paramMap.put("P5_phone", requestVo.getP13_phone());
            return R.ok(paramMap,"成功");
        } catch (Exception e) {
            logger.info("交易异常：" + e.getMessage(), e);
            return R.error(995, "交易异常：" + e.getMessage());
        }
    }

    @ResponseBody
    @RequestMapping("agreementBindCardValidateCode")
    public JSONObject agreementBindCardValidateCode(AgreementBindCardValidateCodeVo requestVo, Model model) {
        logger.info("--------进入发送短信接口----------");
        JSONObject json = new JSONObject();
        try {
            Map reqestMap = MessageHandle.getReqestMap(requestVo);
            Map<String, Object> resultMap = HttpClientService.getHttpResp(reqestMap, REQUEST_URL_QUICKPAY);
            logger.info("响应结果：" + resultMap);

            if ((Integer) resultMap.get("statusCode") != HttpStatus.SC_OK) {
                json.put("code", "01");
                json.put("message", "请求失败");
                return json;
            }

            String resultMsg = (String) resultMap.get("response");
            if (!isJSON(resultMsg)) {
                json.put("code", "01");
                json.put("message", resultMsg);
                return json;
            }

            AgreementSendValidateCodeResponseVo responseVo = JSONObject.parseObject(resultMsg, AgreementSendValidateCodeResponseVo.class);
            if (!MessageHandle.checkSign(responseVo)) {
                json.put("code", "01");
                json.put("message", "验签失败");
                return json;
            }

            if (!"0000".equals(responseVo.getRt2_retCode())) {
                json.put("code", "01");
            } else {
                json.put("code", "00");
            }
            json.put("message", responseVo.getRt3_retMsg());
            return json;

        } catch (Exception e) {
            logger.info("异常：" + e.getMessage(), e);
            json.put("code", "01");
            json.put("message", "请求异常：" + e.getMessage());
        }
        return json;
    }

    @ResponseBody
    @RequestMapping("sendValidateCode")
    public R sendValidateCode(SendValidateCodeVo requestVo, Model model) {
        logger.info("--------进入发送短信接口----------");
        Map<String,Object> paramsMap = new HashMap<>();
        try {
            Map reqestMap = MessageHandle.getReqestMap(requestVo);
            Map<String, Object> resultMap = HttpClientService.getHttpResp(reqestMap, REQUEST_URL_QUICKPAY);
            logger.info("响应结果：" + resultMap);

            if ((Integer) resultMap.get("statusCode") != HttpStatus.SC_OK) {
                return R.error(999,"请求失败");
            }

            String resultMsg = (String) resultMap.get("response");
            if (!isJSON(resultMsg)) {
                return R.error(998,resultMsg);
            }

            sendValidateCodeResponseVo responseVo = JSONObject.parseObject(resultMsg, sendValidateCodeResponseVo.class);
            if (!MessageHandle.checkSign(responseVo)) {
                return R.error(997,"验签失败");
            }

            if (!"0000".equals(responseVo.getRt2_retCode())) {
                return R.error(995,responseVo.getRt3_retMsg());
            } else {
                paramsMap.put("hcode","00");
            }
            paramsMap.put("phone",responseVo.getRt6_phone());
            paramsMap.put("orderId",requestVo.getP3_orderId());
            paramsMap.put("customerNumber",requestVo.getP2_customerNumber());
            return R.ok(paramsMap,"成功");
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(996,"请求异常：" + e.getMessage());
        }
    }

    @ResponseBody
    @RequestMapping(value = "/confirmPay")
    public R confirmPay(ConfirmPayVo requestVo) {
        Map<String,Object> paramsMap = new HashMap<>();
        logger.info("--------进入确认支付接口----------");
        try {
            Map reqestMap = MessageHandle.getReqestMap(requestVo);
            Map<String, Object> resultMap = HttpClientService.getHttpResp(reqestMap, REQUEST_URL_QUICKPAY);
            logger.info("响应结果：" + resultMap);

            if ((Integer) resultMap.get("statusCode") != HttpStatus.SC_OK) {
                return R.error(999,"请求失败");
            }

            String resultMsg = (String) resultMap.get("response");
            if (!isJSON(resultMsg)) {
                return R.error(998,"resultMsg");
            }
            ConfirmPayResponseVo responseVo = JSONObject.parseObject(resultMsg, ConfirmPayResponseVo.class);
            if (!MessageHandle.checkSign(responseVo)) {
                return R.error(998,"验签失败");
            }
            if(!"0000".equals(responseVo.getRt2_retCode())){
                return R.error(997,responseVo.getRt3_retMsg());
            }
            paramsMap.put("rt2_retCode",responseVo.getRt2_retCode());
            paramsMap.put("rt5_orderId",responseVo.getRt5_orderId());
            paramsMap.put("rt6_serialNumber",responseVo.getRt6_serialNumber());
            paramsMap.put("rt9_orderStatus",responseVo.getRt9_orderStatus());
            paramsMap.put("rt10_bindId",responseVo.getRt10_bindId());
            paramsMap.put("rt11_bankId",responseVo.getRt11_bankId());
            paramsMap.put("rt12_onlineCardType",responseVo.getRt12_onlineCardType());
            paramsMap.put("rt13_cardAfterFour",responseVo.getRt13_cardAfterFour());
            paramsMap.put("rt14_userId",responseVo.getRt14_userId());
            paramsMap.put("rt3_retMsg",responseVo.getRt3_retMsg());
            paramsMap.put("rt8_orderAmount",responseVo.getRt8_orderAmount());
            return R.ok(paramsMap,"成功");
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(998,e.getMessage());
        }
    }

    @RequestMapping(value = "/bindCard")
    public ModelAndView bindCard(BindCardVo requestVo, Model model) {
        logger.info("--------进入绑卡接口----------");
        ModelAndView mav = new ModelAndView();
        mav.setViewName("quickPayApi/response");
        try {
            Map reqestMap = MessageHandle.getReqestMap(requestVo);
            Map<String, Object> resultMap = HttpClientService.getHttpResp(reqestMap, REQUEST_URL_QUICKPAY);
            logger.info("响应结果：" + resultMap);

            if ((Integer) resultMap.get("statusCode") != HttpStatus.SC_OK) {
                mav.addObject("message", "请求失败");
                return mav;
            }

            String resultMsg = (String) resultMap.get("response");
            if (!isJSON(resultMsg)) {
                mav.addObject("message", resultMsg);
                return mav;
            }
            BindCardResponseVo responseVo = JSONObject.parseObject(resultMsg, BindCardResponseVo.class);
            if (!MessageHandle.checkSign(responseVo)) {
                mav.addObject("message", "验签失败");
                return mav;
            }
            mav.addObject("json", JSONObject.toJSON(responseVo));
        } catch (Exception e) {
            e.printStackTrace();
            mav.addObject("message", "交易异常：" + e.getMessage());
        }
        return mav;
    }

    @ResponseBody
    @RequestMapping("bindPayValidateCode")
    public R bindPayValidateCode(BindPayValidateCodeVo requestVo) {
        logger.info("--------进入发送短信接口----------");
        requestVo.setSignatureType(SIGNATURE_ALGORITHM);
        JSONObject json = new JSONObject();
        try {
            Map reqestMap = MessageHandle.getReqestMap(requestVo);
            Map<String, Object> resultMap = HttpClientService.getHttpResp(reqestMap, REQUEST_URL_QUICKPAY);
            logger.info("响应结果：" + resultMap);

            if ((Integer) resultMap.get("statusCode") != HttpStatus.SC_OK) {
                return R.error(999,"请求失败");
            }

            String resultMsg = (String) resultMap.get("response");
            if (!isJSON(resultMsg)) {
                return R.error(998,resultMsg);
            }

            BindPayValidateCodeResponseVo responseVo = JSONObject.parseObject(resultMsg, BindPayValidateCodeResponseVo.class);
            if (!MessageHandle.checkSign(responseVo)) {
                return R.error(997,"验签失败");
            }

            if (!"0000".equals(responseVo.getRt2_retCode())) {
                return R.error(996,responseVo.getRt3_retMsg());
            }
            return R.ok(responseVo.getRt3_retMsg());
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(995,e.getMessage());
        }
    }

    @RequestMapping(value = "/bindCardPay")
    public R bindCardPay(BindCardPayVo requestVo) {
        logger.info("--------进入绑卡支付接口----------");
        requestVo.setP18_ruleJson(Des3Encryption.encode(ENCRYPT_KEY_COMMON, requestVo.getP18_ruleJson())); //给分账参数加密
        requestVo.setSignatureType(SIGNATURE_ALGORITHM);
        try {
            Map reqestMap = MessageHandle.getReqestMap(requestVo);
            Map<String, Object> resultMap = HttpClientService.getHttpResp(reqestMap, REQUEST_URL_QUICKPAY);
            logger.info("响应结果：" + resultMap);

            if ((Integer) resultMap.get("statusCode") != HttpStatus.SC_OK) {
                return R.error(999,"请求失败");
            }

            String resultMsg = (String) resultMap.get("response");
            if (!isJSON(resultMsg)) {
                return R.error(998,resultMsg);
            }

            BindCardPayResponseVo responseVo = JSONObject.parseObject(resultMsg, BindCardPayResponseVo.class);
            if (!MessageHandle.checkSign(responseVo)) {
                return R.error(997,"验签失败");
            }
            return R.ok("json",JSONObject.toJSON(responseVo),"成功");
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(996,"交易异常：" + e.getMessage());
        }
    }

    @ResponseBody
    @RequestMapping(value = "/queryOrder")
    public R queryOrder(QueryOrderVo requestVo, Model model) {
        logger.info("--------进入订单查询接口----------");
        try {
            Map reqestMap = MessageHandle.getReqestMap(requestVo);
            Map<String, Object> resultMap = HttpClientService.getHttpResp(reqestMap, REQUEST_URL_QUICKPAY);
            logger.info("响应结果：" + resultMap);

            if ((Integer) resultMap.get("statusCode") != HttpStatus.SC_OK) {
                return R.error(999,"请求失败");
            }

            String resultMsg = (String) resultMap.get("response");
            if (!isJSON(resultMsg)) {
                return R.error(998,resultMsg);
            }

            QueryOrderResponseVo responseVo = JSONObject.parseObject(resultMsg, QueryOrderResponseVo.class);
            if (!MessageHandle.checkSign(responseVo)) {
                return R.error(997,"验签失败");
            }
            return R.ok("json",JSONObject.toJSON(responseVo),"验签失败");
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(996,"交易异常：" + e.getMessage());
        }
    }


    @ResponseBody
    @RequestMapping(value = "/bankCardbindList")
    public R bankCardbindList(BankCardbindListVo requestVo) {
        logger.info("--------查询绑卡列表----------");
        try {
            Map reqestMap = MessageHandle.getReqestMap(requestVo);
            Map<String, Object> resultMap = HttpClientService.getHttpResp(reqestMap, REQUEST_URL_QUICKPAY);
            logger.info("响应结果：" + resultMap);

            if ((Integer) resultMap.get("statusCode") != HttpStatus.SC_OK) {
                return R.error(999,"请求失败");
            }

            String resultMsg = (String) resultMap.get("response");
            if (!isJSON(resultMsg)) {
                return R.error(998,resultMsg);
            }
            BankCardBindResponseVo responseVo = JSONObject.parseObject(resultMsg, BankCardBindResponseVo.class);
            if (!MessageHandle.checkSign(responseVo)) {
                return R.error(997,"验签失败");
            }
            return R.ok("json",JSONObject.toJSON(responseVo),"验签失败");
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(996,"交易异常：" + e.getMessage());
        }
    }


    @ResponseBody
    @RequestMapping(value = "/bankCardUnbind")
    public R bankCardUnbind(BankCardUnbindVo requestVo) {
        logger.info("--------解绑银行卡----------");
        try {
            Map reqestMap = MessageHandle.getReqestMap(requestVo);
            Map<String, Object> resultMap = HttpClientService.getHttpResp(reqestMap, REQUEST_URL_QUICKPAY);
            logger.info("响应结果：" + resultMap);

            if ((Integer) resultMap.get("statusCode") != HttpStatus.SC_OK) {
                return R.error(999,"请求失败");
            }

            String resultMsg = (String) resultMap.get("response");
            if (!isJSON(resultMsg)) {
                return R.error(998,resultMsg);
            }
            BankCardUnbindResponseVo responseVo = JSONObject.parseObject(resultMsg,BankCardUnbindResponseVo.class);
            if (!MessageHandle.checkSign(responseVo)) {
                return R.error(997,"验签失败");
            }
            return R.ok("json",JSONObject.toJSON(responseVo),"验签失败");
        } catch (Exception e) {
            e.printStackTrace();
            return R.error(996,"交易异常：" + e.getMessage());
        }
    }

    public static boolean isJSON(String test) {
        try {
            JSONObject.parseObject(test);
        } catch (JSONException ex) {
            return false;
        }
        return true;
    }

}
