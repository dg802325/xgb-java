package com.xgb.controller;

import com.xgb.entity.R;
import com.xgb.model.HlbCompanyAuthen;
import com.xgb.service.HlbCompanyAuthenService;
import com.xgb.service.SysChinaDivistionService;
import com.xgb.util.MyTools;
import com.xgb.util.UUIDUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/admin/")
public class HeliPayController {

//    private static Logger logger = LoggerFactory.getLogger(HeliPayController.class);
//
////    //支付接口url
////    @Value("${pay.url}")
////    private String payUrl;
//
//    RestTemplate restTemplate = new RestTemplate();
//
//    @Autowired
//    private HlbCompanyAuthenService hlbCompanyAuthenService;
//    @Autowired
//    private SysChinaDivistionService sysChinaDivistionService;
//
//    @PostMapping("toEntryResult")
//    public R toEntryResult(HlbCompanyAuthen hlbCompanyAuthen){
//        logger.info("------request-address----------------：/admin/toEntryResult");
//        hlbCompanyAuthen.setId(UUIDUtils.getUUID());
//        R r = null;
//        try {
//            //准备传入的参数
//            Map<String, Object> map= new HashMap<>();
//            map.put("signName", hlbCompanyAuthen.getCompanyName());//企业名称
//            map.put("showName", hlbCompanyAuthen.getShowName());//展示名称
//            map.put("orderNo", hlbCompanyAuthen.getId());
//            map.put("merchantType", hlbCompanyAuthen.getMerchantType());//
//            map.put("merchantCategory", hlbCompanyAuthen.getMerchantCategory());//
//            if(MyTools.isNotEmpty(hlbCompanyAuthen.getWebSite())){
//                map.put("webSite", hlbCompanyAuthen.getWebSite());//
//            }
//            if(MyTools.isNotEmpty(hlbCompanyAuthen.getWebSite())){
//                map.put("accessUrl", hlbCompanyAuthen.getAccessUrl());//
//            }
//            map.put("legalPerson", hlbCompanyAuthen.getLegalPerson());//法人姓名
//            map.put("legalPersonID", hlbCompanyAuthen.getLegalPersonId());//法人身份证号
//            map.put("orgNum", hlbCompanyAuthen.getOrgNum());//组织代码机构证
//            map.put("businessLicense", hlbCompanyAuthen.getBusinessLicense());//营业执照
//            //获得用户所选区县的区县编码
//            //获得省
//            map.put("province",sysChinaDivistionService.selectByPrimaryKey(hlbCompanyAuthen.getProvinceId()).getDivisionName());
//            //获得市
//            map.put("city",sysChinaDivistionService.selectByPrimaryKey(hlbCompanyAuthen.getCityId()).getDivisionName());
//            map.put("address", hlbCompanyAuthen.getAddress());//详细地址
//            map.put("regionCode", hlbCompanyAuthen.getRegionCode());//区域编码
//            map.put("industryTypeCode", hlbCompanyAuthen.getIndustryTypeCode());//行业类型编码
//            map.put("linkman", hlbCompanyAuthen.getLinkman());//联系人
//            map.put("linkPhone", hlbCompanyAuthen.getLinkPhone());//联系人电话
//            map.put("email", hlbCompanyAuthen.getEmail());//联系人邮箱
//            if(MyTools.isNotEmpty(hlbCompanyAuthen.getBindMobile())){
//                map.put("bindMobile", hlbCompanyAuthen.getBindMobile());//绑定手机
//            }
//            if(MyTools.isNotEmpty(hlbCompanyAuthen.getServicePhone())){
//                map.put("servicePhone", hlbCompanyAuthen.getBindMobile());//绑定手机
//            }
//            map.put("bankCode", hlbCompanyAuthen.getBankCode());//结算联行号
//            map.put("accountName", hlbCompanyAuthen.getAccountName());//开户名
//            map.put("accountNo", hlbCompanyAuthen.getAccountNo());//开户帐号
//            map.put("settleBankType", hlbCompanyAuthen.getSettleBankType());//结算卡类型
//            map.put("settlementPeriod", hlbCompanyAuthen.getSettlementPeriod());//默认t1
//            map.put("settlementMode", hlbCompanyAuthen.getSettlementMode());//默认自主结算
//            if(MyTools.isNotEmpty(hlbCompanyAuthen.getAuthorizationFlag())){
//                if("true".equals(hlbCompanyAuthen.getAuthorizationFlag())){
//                    map.put("authorizationFlag", true);
//                }else {
//                    map.put("authorizationFlag", false);
//                }
//            }
//            map.put("unionPayQrCode", hlbCompanyAuthen.getUnionPayQrCode());//
//            if(MyTools.isNotEmpty(hlbCompanyAuthen.getNeedPosFunction())){
//                if("true".equals(hlbCompanyAuthen.getNeedPosFunction())){
//                    map.put("needPosFunction", true);
//                }else {
//                    map.put("needPosFunction", false);
//                }
//            }
//            map.put("industryTypeCode", hlbCompanyAuthen.getIndustryTypeCode());//
//            map.put("merchantCategory", "OFFLINE_RETAIL");//默认经营类别 线下零售
//            if(MyTools.isNotEmpty(hlbCompanyAuthen.getAgreeprotocol())){
//                if("true".equals(hlbCompanyAuthen.getAgreeprotocol())){
//                    map.put("agreeProtocol", true);
//                }else {
//                    map.put("agreeProtocol", false);
//                }
//            }
//            map.put("callbackUrl", hlbCompanyAuthen.getCallbackUrl());
//            map.put("settlementAuth", hlbCompanyAuthen.getSettlementAuth());
//            map.put("settleMode", hlbCompanyAuthen.getSettleMode());//默认按商户结算
//            if(MyTools.isNotEmpty(hlbCompanyAuthen.getIdCardStartDate())){
//                map.put("idCardStartDate", hlbCompanyAuthen.getIdCardStartDate());//
//            }
//            if(MyTools.isNotEmpty(hlbCompanyAuthen.getIdCardEndDate())){
//               map.put("idCardEndDate", hlbCompanyAuthen.getIdCardEndDate());//
//            }
//            if(MyTools.isNotEmpty(hlbCompanyAuthen.getAccountIdCard())){
//                map.put("businessDateLimit", hlbCompanyAuthen.getAccountIdCard());//
//            }
//            if(MyTools.isNotEmpty(hlbCompanyAuthen.getMcc())){
//                map.put("mcc", hlbCompanyAuthen.getMcc());//
//            }
//            r = restTemplate.postForObject("http://127.0.0.1:10040/incoming/toEntryResult", null,R.class);
//            System.out.println(r);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return R.error(999,"失败了");
//    }

}