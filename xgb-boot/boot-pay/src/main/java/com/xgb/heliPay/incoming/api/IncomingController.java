package com.xgb.heliPay.incoming.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.xgb.heliPay.incoming.entity.*;
import com.xgb.heliPay.incoming.enums.MerchantEntryStatus;
import com.xgb.heliPay.incoming.service.EntryService;
import com.xgb.lang.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.xgb.heliPay.incoming.enums.MerchantEntryCodeEnum.SUCCESS;

/**
 * @Auther: 邓根
 * @Date: 2019/9/27 13:50
 * @Description:  进件api
 */
@RequestMapping("/incoming")
public class IncomingController extends IncomingBase {

    private static final String tempDir = System.getProperty("java.io.tmpdir");

    static {
        if (tempDir == null) {
            throw new IllegalStateException("没设置系统临时文件存储路径");
        }
    }
    @Autowired
    private EntryService entryService;

    /**
     * 进件接口调用
     */
    @ResponseBody
    @RequestMapping(value = "/toEntryResult",method = RequestMethod.POST)
    public R toEntryResult(MerchantEntryParam param, String firstClassMerchantNo) {
        Map<String,Object> map = new HashMap<>();
        /** 请求参数加密、签名 **/
        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(param),
                firstClassMerchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);
        try {
            Map res = entryService.postForm(MERCHANT_ENTRY_INTERFACE, encryptAndSign.getCont(), encryptAndSign.getSign(), firstClassMerchantNo,
                    MERCHANT_ENTRY_URL, Map.class, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);
            logger.info(res);
            res.put("entryStatus", MerchantEntryStatus.valueOf((String) res.get("entryStatus")).getDesc());
            map.put("entryStatus",res.get("entryStatus"));
            map.put("orderNo",res.get("orderNo"));
            map.put("merchantNo",res.get("merchantNo"));
        }catch (Exception e){
            return R.error(999,e.getMessage());
        }
        return R.ok(map);
    }

    /**
     * 进件查询接口调用
     */
    @ResponseBody
    @RequestMapping(value = "/doEntryQuery")
    public R doEntryQuery(String firstClassMerchantNo, String orderNo) {
        /** 请求参数加密、签名 **/
        Map<String, String> param = new HashMap<>();
        param.put("orderNo", orderNo);
        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(param),
                firstClassMerchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);
        MerchantEntryParam merchantEntryParam = null;
        try {
            merchantEntryParam = entryService.postForm(MERCHANT_ENTRY_QUERY_INTERFACE, encryptAndSign.getCont(), encryptAndSign.getSign(), firstClassMerchantNo,
                    MERCHANT_ENTRY_URL, MerchantEntryParam.class, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);
        }catch (RuntimeException e){
            return R.error(999,e.getMessage());
        }

        return R.ok("merchantEntryParam",merchantEntryParam,"查询结果");
    }

    /**
     * 进件查询接口调用
     */
    @RequestMapping(value = "/signContract")
    public ModelAndView signContract(String firstClassMerchantNo, String email, String phone, String legalPerson, String legalPersonID, String signName, String address) {
        ModelAndView mav = new ModelAndView();
        /** 请求参数加密、签名 **/
        Map<String, String> param = new HashMap<>();
        param.put("email", email);
        param.put("phone", phone);
        param.put("legalPerson", legalPerson);
        param.put("legalPersonID", legalPersonID);
        param.put("signName", signName);
        param.put("address", address);
        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(param),
                firstClassMerchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

        entryService.postForm(SIGN_CONTRACT, encryptAndSign.getCont(), encryptAndSign.getSign(), firstClassMerchantNo,
                MERCHANT_ENTRY_URL, SignContractParam.class,ENCRYPT_KEY_COMMON,SIGNKEY_COMMON);
        return mav;
    }


    /**
     * 扫码产品开通 调用
     */
    @ResponseBody
    @RequestMapping(value = "/doOpenAppPay")
    public R doOpenAppPay(@ModelAttribute OpenAppPayProductParam productParam, String firstClassMerchantNo) {
        /** 请求参数加密、签名 **/
        System.out.println("参数："+JSON.toJSONString(productParam));
        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(productParam),
                firstClassMerchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

        OpenAppPayProductParam product = entryService.postForm(PRODUCT_OPENING_INTERFACE, encryptAndSign.getCont(), encryptAndSign.getSign(), firstClassMerchantNo,
                MERCHANT_ENTRY_URL, OpenAppPayProductParam.class, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

        return R.ok("product", JSONObject.toJSONString(product),"返回结果");
    }

    /**
     * 代付产品开通 调用
     */
    @RequestMapping(value = "/doOpenTransfer")
    public R doOpenTransfer(@ModelAttribute OpenTransferProductParam productParam, String firstClassMerchantNo) {
        /** 请求参数加密、签名 **/
        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(productParam),
                firstClassMerchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

        OpenTransferProductParam product = entryService.postForm(PRODUCT_OPENING_INTERFACE, encryptAndSign.getCont(), encryptAndSign.getSign(), firstClassMerchantNo,
                MERCHANT_ENTRY_URL, OpenTransferProductParam.class, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);
        return R.ok("product", JSONObject.toJSONString(product),"返回结果");
    }


    /**
     * 结算产品开通 调用
     */
    @RequestMapping(value = "/doOpenSettlement")
    public R doOpenSettlement(@ModelAttribute OpenSettlementProductParam productParam, String firstClassMerchantNo) {
        /** 请求参数加密、签名 **/
        System.out.println("参数："+JSON.toJSONString(productParam));
        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(productParam),
                firstClassMerchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

        OpenSettlementProductParam product = entryService.postForm(PRODUCT_OPENING_INTERFACE, encryptAndSign.getCont(), encryptAndSign.getSign(), firstClassMerchantNo,
                MERCHANT_ENTRY_URL, OpenSettlementProductParam.class, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);
        return R.ok("product", JSONObject.toJSONString(product),"返回结果");
    }


    /**
     * 网银产品开通 调用
     */
    @ResponseBody
    @RequestMapping(value = "/doOpenOnline")
    public R doOpenOnline(@ModelAttribute OpenOnlineProductParam productParam, String firstClassMerchantNo) {
        /** 请求参数加密、签名 **/

        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(productParam),
                firstClassMerchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

        System.out.println("参数："+JSON.toJSONString(productParam));
        OpenOnlineProductParam res = entryService.postForm(PRODUCT_OPENING_INTERFACE, encryptAndSign.getCont(), encryptAndSign.getSign(), firstClassMerchantNo,
                MERCHANT_ENTRY_URL, OpenOnlineProductParam.class, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

        return R.ok("product", JSONObject.toJSONString(res),"返回结果");
    }

    /**
     * 鉴权产品开通 调用
     */
    @RequestMapping(value = "/doAuthentic")
    public R doAuthentic(@ModelAttribute OpenAuthenticationParam productParam, String firstClassMerchantNo) {
        /** 请求参数加密、签名 **/
        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(productParam),
                firstClassMerchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

        OpenAuthenticationParam openProduct = entryService.postForm(PRODUCT_OPENING_INTERFACE, encryptAndSign.getCont(), encryptAndSign.getSign(), firstClassMerchantNo,
                MERCHANT_ENTRY_URL, OpenAuthenticationParam.class, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);
        logger.info(openProduct.getAuthenticated());
        return R.ok("product", JSONObject.toJSONString(openProduct),"返回结果");
    }


    /**
     * 快捷产品开通 调用
     */
    @ResponseBody
    @RequestMapping(value = "/doOpenQuickPay")
    public R doOpenQuickPay(@ModelAttribute OpenQuickPayProductParam productParam, String firstClassMerchantNo) {
        /** 请求参数加密、签名 **/
        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(productParam),
                firstClassMerchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

        OpenQuickPayProductParam openQuickPayProductParam = entryService.postForm(PRODUCT_OPENING_INTERFACE, encryptAndSign.getCont(), encryptAndSign.getSign(), firstClassMerchantNo,
                MERCHANT_ENTRY_URL, OpenQuickPayProductParam.class, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);
        return R.ok("product", JSONObject.toJSONString(openQuickPayProductParam),"返回结果");
    }

    /**
     * 虚拟账户支付产品开通 调用
     */
    @RequestMapping(value = "/doOpenAccountPay")
    public R doOpenAccountPay(@ModelAttribute OpenAccountPayProductParam productParam, String firstClassMerchantNo) {
        /** 请求参数加密、签名 **/
        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(productParam),
                firstClassMerchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

        OpenAccountPayProductParam res = entryService.postForm(PRODUCT_OPENING_INTERFACE, encryptAndSign.getCont(), encryptAndSign.getSign(), firstClassMerchantNo,
                MERCHANT_ENTRY_URL, OpenAccountPayProductParam.class, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);
        return R.ok("product", JSONObject.toJSONString(res),"返回结果");
    }



    /**
     * 扫码产品费率查询 调用
     */
    @RequestMapping(value = "/doAppPayQuery")
    public ModelAndView doAppPayQuery(@ModelAttribute AppPayProductQueryParam productParam, String firstClassMerchantNo) {
        ModelAndView mav = new ModelAndView();
        /** 请求参数加密、签名 **/
        mav.setViewName("entry/product/doOpenAppPayResult");
        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(productParam),
                firstClassMerchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

        OpenAppPayProductParam product = entryService.postForm(PRODUCT_QUERY_INTERFACE, encryptAndSign.getCont(), encryptAndSign.getSign(), firstClassMerchantNo,
                MERCHANT_ENTRY_URL, OpenAppPayProductParam.class, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);
        mav.addObject("openAppPayProductParam", product);
        return mav;
    }

    /**
     * 鉴权产品费率查询 调用
     */
    @RequestMapping(value = "/doAuthenticQuery")
    public ModelAndView doAuthenticQuery(@ModelAttribute AuthenticationQueryProductParam productParam, String firstClassMerchantNo) {
        ModelAndView mav = new ModelAndView();
        /** 请求参数加密、签名 **/
        mav.setViewName("entry/product/doOpenAuthenticResult");
        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(productParam),
                firstClassMerchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

        OpenAuthenticationParam openProduct = entryService.postForm(PRODUCT_QUERY_INTERFACE, encryptAndSign.getCont(), encryptAndSign.getSign(), firstClassMerchantNo,
                MERCHANT_ENTRY_URL, OpenAuthenticationParam.class, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);
        mav.addObject("openAuthenticationParam", openProduct);
        return mav;
    }


    /**
     * 网银产品费率查询 调用
     */
    @RequestMapping(value = "/doOnlineQuery")
    public ModelAndView doOnlineQuery(@ModelAttribute OnlineProductQueryParam productParam, String firstClassMerchantNo) {
        ModelAndView mav = new ModelAndView();
        /** 请求参数加密、签名 **/
        mav.setViewName("entry/product/doOpenOnlineResult");
        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(productParam),
                firstClassMerchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

        OpenOnlineProductParam openProduct = entryService.postForm(PRODUCT_QUERY_INTERFACE, encryptAndSign.getCont(), encryptAndSign.getSign(), firstClassMerchantNo,
                MERCHANT_ENTRY_URL, OpenOnlineProductParam.class, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);
        mav.addObject("openOnlineProductParam", openProduct);
        return mav;
    }

    /**
     * 代付产品费率查询 调用
     */
    @RequestMapping(value = "/doTransferQuery")
    public ModelAndView doTransferQuery(@ModelAttribute TransferProductQueryParam productParam, String firstClassMerchantNo) {
        ModelAndView mav = new ModelAndView();
        /** 请求参数加密、签名 **/
        mav.setViewName("entry/product/doOpenTransferResult");
        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(productParam),
                firstClassMerchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

        OpenTransferProductParam res = entryService.postForm(PRODUCT_QUERY_INTERFACE, encryptAndSign.getCont(), encryptAndSign.getSign(), firstClassMerchantNo,
                MERCHANT_ENTRY_URL, OpenTransferProductParam.class, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);
        mav.addObject("openTransferProductParam", res);
        return mav;
    }


    /**
     * 代付产品费率查询 调用
     */
    @RequestMapping(value = "/doSettlementQuery")
    public ModelAndView doSettlementQuery(@ModelAttribute SettlementProductQueryParam productParam, String firstClassMerchantNo) {
        ModelAndView mav = new ModelAndView();
        /** 请求参数加密、签名 **/
        mav.setViewName("entry/product/doOpenSettlementResult");
        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(productParam),
                firstClassMerchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

        OpenSettlementProductParam res = entryService.postForm(PRODUCT_QUERY_INTERFACE, encryptAndSign.getCont(), encryptAndSign.getSign(), firstClassMerchantNo,
                MERCHANT_ENTRY_URL, OpenSettlementProductParam.class, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);
        mav.addObject("openSettlementProductParam", res);
        return mav;
    }


    /**
     * 快捷产品费率查询 调用
     */
    @RequestMapping(value = "/doQuickPayQuery")
    public ModelAndView doQuickPayQuery(@ModelAttribute QuickPayProductQueryParam productParam, String firstClassMerchantNo) {
        ModelAndView mav = new ModelAndView();
        /** 请求参数加密、签名 **/
        mav.setViewName("entry/product/doOpenQuickPayResult");
        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(productParam),
                firstClassMerchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

        OpenQuickPayProductParam openQuickPayProductParam = entryService.postForm(PRODUCT_QUERY_INTERFACE, encryptAndSign.getCont(), encryptAndSign.getSign(), firstClassMerchantNo,
                MERCHANT_ENTRY_URL, OpenQuickPayProductParam.class, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);
        mav.addObject("openQuickPayProductParam", openQuickPayProductParam);
        return mav;
    }

    /**
     * 虚拟账户支付产品费率查询 调用
     */
    @RequestMapping(value = "/doAccountPayQuery")
    public ModelAndView doAccountPayQuery(@ModelAttribute AccountPayProductQueryParam productParam, String firstClassMerchantNo) {
        ModelAndView mav = new ModelAndView();
        /** 请求参数加密、签名 **/
        mav.setViewName("entry/product/doOpenAccountPayResult");
        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(productParam),
                firstClassMerchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

        OpenAccountPayProductParam openProduct = entryService.postForm(PRODUCT_QUERY_INTERFACE, encryptAndSign.getCont(), encryptAndSign.getSign(), firstClassMerchantNo,
                MERCHANT_ENTRY_URL, OpenAccountPayProductParam.class, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);
        mav.addObject("openAccountPayProductParam", openProduct);
        return mav;
    }

    /**
     * 商户资质上传 调用
     */
    @RequestMapping(value = "/doUpload")
    public ModelAndView doUpload(@ModelAttribute MerchantCredentialParam param, String firstClassMerchantNo, @RequestParam MultipartFile file) throws IOException {
        ModelAndView mav = new ModelAndView();
        /** 请求参数加密、签名 **/

        File tempFile = new File(tempDir, file.getOriginalFilename());
        file.transferTo(tempFile);

        // 文件签名
        try (InputStream is = new FileInputStream(tempFile)){
            param.setFileSign(DigestUtils.md5DigestAsHex(is));
        }

        mav.setViewName("entry/doUploadResult");
        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(param),
                firstClassMerchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

        Map res = entryService.postForm(CREDENTIAL_UPLOAD_INTERFACE, encryptAndSign.getCont(), encryptAndSign.getSign(), firstClassMerchantNo,
                MERCHANT_ENTRY_URL, Map.class, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON, tempFile);
        mav.addObject("json", JSON.toJSONString(res));
        return mav;
    }


    /**
     * 商户资质上传结果查询 调用
     */
    @RequestMapping(value = "/doCredentialQuery")
    public ModelAndView doCredentialQuery(@ModelAttribute MerchantCredentialParam param, String firstClassMerchantNo) {
        ModelAndView mav = new ModelAndView();
        /** 请求参数加密、签名 **/
        mav.setViewName("entry/doUploadResult");
        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(param),
                firstClassMerchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

        Map res = entryService.postForm(CREDENTIAL_QUERY_INTERFACE, encryptAndSign.getCont(), encryptAndSign.getSign(), firstClassMerchantNo,
                MERCHANT_ENTRY_URL, Map.class, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);
        mav.addObject("json", JSON.toJSONString(res));
        return mav;
    }

    /**
     * 微信进件报备 调用
     */
    @RequestMapping(value = "/doWxApply")
    public ModelAndView doWxApply(@ModelAttribute WXPublicApplyParam param, String firstClassMerchantNo) {
        ModelAndView mav = new ModelAndView();
        /** 请求参数加密、签名 **/
        mav.setViewName("entry/doUploadResult");
        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(param),
                firstClassMerchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

        Map res = entryService.postForm(WX_PUBLIC_APPLY_INTERFACE, encryptAndSign.getCont(), encryptAndSign.getSign(), firstClassMerchantNo,
                MERCHANT_ENTRY_URL, Map.class, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);
        mav.addObject("json", JSON.toJSONString(res));
        return mav;
    }

    @RequestMapping(value = "/doWxApplyQuery")
    public ModelAndView doWxApplyQuery(@ModelAttribute WXPublicApplyParam param, String firstClassMerchantNo) {
        ModelAndView mav = new ModelAndView();
        /** 请求参数加密、签名 **/
        mav.setViewName("entry/doUploadResult");
        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(param),
                firstClassMerchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

        Map res = entryService.postForm(WX_PUBLIC_APPLY_QUERY_INTERFACE, encryptAndSign.getCont(), encryptAndSign.getSign(), firstClassMerchantNo,
                MERCHANT_ENTRY_URL, Map.class, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);
        mav.addObject("json", JSON.toJSONString(res));
        return mav;
    }

    /**
     * APP报备 调用
     */
    @RequestMapping(value = "/doAppApply")
    public R doAppApply(@ModelAttribute AppApplyParam param, String firstClassMerchantNo) {
        /** 请求参数加密、签名 **/
        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(param),
                firstClassMerchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

        Map res = entryService.postForm(APP_APPLY_INTERFACE, encryptAndSign.getCont(), encryptAndSign.getSign(), firstClassMerchantNo,
                MERCHANT_ENTRY_URL, Map.class, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);
        return R.ok("product", JSONObject.toJSONString(res),"返回结果");
    }

    /**
     * APP报备查询 调用
     */
    @RequestMapping(value = "/doAppApplyQuery")
    public ModelAndView doAppApplyQuery(@ModelAttribute AppApplyParam param, String firstClassMerchantNo) {
        ModelAndView mav = new ModelAndView();
        /** 请求参数加密、签名 **/
        mav.setViewName("entry/doUploadResult");
        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(param),
                firstClassMerchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

        Map res = entryService.postForm(APP_APPLY_QUERY_INTERFACE, encryptAndSign.getCont(), encryptAndSign.getSign(), firstClassMerchantNo,
                MERCHANT_ENTRY_URL, Map.class, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);
        mav.addObject("json", JSON.toJSONString(res));
        return mav;
    }


    @RequestMapping(value = "toMerchantAgreement")
    public ModelAndView toMerchantAgreement(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("entry/toMerchantAgreement");
        return mav;
    }

    @RequestMapping(value = "toMerchantAgreementQuery")
    public ModelAndView toMerchantAgreementQuery(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("entry/toMerchantAgreementQuery");
        return mav;
    }

    @RequestMapping(value = "doMerchantAgreementQuery")
    public ModelAndView doMerchantAgreementQuery(@ModelAttribute MerchantAgreementParam param, String merchantNo){
        ModelAndView mav = new ModelAndView();
        /** 请求参数加密、签名 **/
        mav.setViewName("entry/toMerchantAgreementQueryResult");
        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(param),
                merchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

        MerchantAgreementParam merchantAgreementParam = entryService.postForm(MERCHANT_AGREEMENT_QUERY,
                encryptAndSign.getCont(), encryptAndSign.getSign(), merchantNo, MERCHANT_ENTRY_URL, MerchantAgreementParam.class, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);
        logger.info(merchantAgreementParam.toString());
        mav.addObject("res", merchantAgreementParam);
        return mav;
    }


    @RequestMapping(value = "/doSettlementCardAlteration")
    public ModelAndView doSettlementCardAlteration(@ModelAttribute MerchantEntryAlterationParam param, String firstClassMerchantNo,@RequestParam("file") List<MultipartFile> files) throws IOException {
        ModelAndView mav = new ModelAndView();
        /** 请求参数加密、签名 **/

        Map<String,String> fileSigns = new HashMap<>();

        File authorizationForSettlement = null;
        if (!files.get(0).isEmpty()) {
            authorizationForSettlement = new File(tempDir, files.get(0).getOriginalFilename());
            try {
                files.get(0).transferTo(authorizationForSettlement);
            } catch (IOException e) {
                e.printStackTrace();
            }
            try (InputStream is = new FileInputStream(authorizationForSettlement)){
                fileSigns.put("authorizationForSettlement", DigestUtils.md5DigestAsHex(is));
            }
        } else {
            authorizationForSettlement = File.createTempFile("tmp",null);
            fileSigns.put("authorizationForSettlement",null);
            files.get(0).transferTo(authorizationForSettlement);
        }


        File accountOpeningCertificate = null;
        if (!files.get(1).isEmpty()) {
            accountOpeningCertificate = new File(tempDir, files.get(1).getOriginalFilename());
            files.get(1).transferTo(accountOpeningCertificate);
            try (InputStream is = new FileInputStream(accountOpeningCertificate)){
                fileSigns.put("accountOpeningCertificate",DigestUtils.md5DigestAsHex(is));
            }
        } else {
            accountOpeningCertificate = File.createTempFile("tmp",null);
            fileSigns.put("accountOpeningCertificate",null);
            files.get(1).transferTo(accountOpeningCertificate);
        }


        File frontOfIdCard = null;
        if (!files.get(2).isEmpty()) {
            frontOfIdCard = new File(tempDir, files.get(2).getOriginalFilename());
            files.get(2).transferTo(frontOfIdCard);
            try (InputStream is = new FileInputStream(frontOfIdCard)){
                fileSigns.put("frontOfIdCard",DigestUtils.md5DigestAsHex(is));
            }
        } else {
            frontOfIdCard = File.createTempFile("tmp",null);
            fileSigns.put("frontOfIdCard",null);
            files.get(2).transferTo(frontOfIdCard);
        }


        File backOfIdCard = null;
        if (!files.get(3).isEmpty()) {
            backOfIdCard = new File(tempDir, files.get(3).getOriginalFilename());
            files.get(3).transferTo(backOfIdCard);
            try (InputStream is = new FileInputStream(backOfIdCard)){
                fileSigns.put("backOfIdCard",DigestUtils.md5DigestAsHex(is));
            }
        } else {
            backOfIdCard = File.createTempFile("tmp",null);
            fileSigns.put("backOfIdCard",null);
            files.get(3).transferTo(backOfIdCard);
        }


        File handheldOfIdCard = null;
        if (!files.get(4).isEmpty()) {
            handheldOfIdCard = new File(tempDir, files.get(4).getOriginalFilename());
            files.get(4).transferTo(handheldOfIdCard);
            try (InputStream is = new FileInputStream(handheldOfIdCard)){
                fileSigns.put("handheldOfIdCard",DigestUtils.md5DigestAsHex(is));
            }
        } else {
            handheldOfIdCard = File.createTempFile("tmp",null);
            fileSigns.put("handheldOfIdCard",null);
            files.get(4).transferTo(handheldOfIdCard);
        }


        File handheldOfBankCard = null;
        if (!files.get(5).isEmpty()) {
            handheldOfBankCard = new File(tempDir, files.get(5).getOriginalFilename());
            files.get(5).transferTo(handheldOfBankCard);
            try (InputStream is = new FileInputStream(handheldOfBankCard)){
                fileSigns.put("handheldOfBankCard",DigestUtils.md5DigestAsHex(is));
            }
        } else {
            handheldOfBankCard = File.createTempFile("tmp",null);
            fileSigns.put("handheldOfBankCard",null);
            files.get(5).transferTo(handheldOfBankCard);
        }

        File subleaseCertificate = null;
        if (!files.get(6).isEmpty()) {
            subleaseCertificate = new File(tempDir, files.get(6).getOriginalFilename());
            files.get(6).transferTo(subleaseCertificate);
            try (InputStream is = new FileInputStream(subleaseCertificate)){
                fileSigns.put("subleaseCertificate",DigestUtils.md5DigestAsHex(is));
            }
        } else {
            subleaseCertificate = File.createTempFile("tmp",null);
            fileSigns.put("subleaseCertificate",null);
            files.get(6).transferTo(subleaseCertificate);
        }



        param.setFileSigns(fileSigns);
        logger.info("fileSigns:"+fileSigns);
        /** 请求参数加密、签名 **/
        mav.setViewName("entry/toEntryAlterationResult");

        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(param),
                firstClassMerchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

        MerchantEntryAlterationParam merchantEntryAlterationParam = entryService.postForm(MERCHANT_ENTRY_SETTLECARD_ALTERATION_INTERFACE, encryptAndSign.getCont(), encryptAndSign.getSign(), firstClassMerchantNo,
                MERCHANT_ENTRY_URL, MerchantEntryAlterationParam.class, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON,authorizationForSettlement,accountOpeningCertificate,frontOfIdCard,backOfIdCard,handheldOfIdCard,handheldOfBankCard,subleaseCertificate);
        logger.info("test:"+merchantEntryAlterationParam.toString());
        mav.addObject("res", merchantEntryAlterationParam);
        return mav;
    }

    @RequestMapping(value = "/doQueryAlteration")
    public ModelAndView doQueryAlteration(@ModelAttribute MerchantEntryAlterationParam param, String firstClassMerchantNo) {
        ModelAndView mav = new ModelAndView();
        /** 请求参数加密、签名 **/
        mav.setViewName("entry/toEntryAlterationQueryResult");
        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(param),
                firstClassMerchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

        MerchantEntryAlterationParam merchantEntryAlterationParam = entryService.postForm(MERCHANT_ENTRY_ALTERATION_QUERY_INTERFACE, encryptAndSign.getCont(), encryptAndSign.getSign(), firstClassMerchantNo,
                MERCHANT_ENTRY_URL, MerchantEntryAlterationParam.class, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);
        logger.info(merchantEntryAlterationParam.toString());
        mav.addObject("res", merchantEntryAlterationParam);
        return mav;
    }

    @RequestMapping(value = "/doInfoAlteration")
    public ModelAndView doInfoAlteration(@ModelAttribute MerchantEntryAlterationParam param, String firstClassMerchantNo) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("entry/toInfoAlterationResult");
        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(param),
                firstClassMerchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

        MerchantEntryAlterationParam merchantEntryAlterationParam = entryService.postForm(MERCHANT_ENTRY_INFO_ALTERATION_INTERFACE, encryptAndSign.getCont(), encryptAndSign.getSign(), firstClassMerchantNo,
                MERCHANT_ENTRY_URL, MerchantEntryAlterationParam.class, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);
        logger.info(merchantEntryAlterationParam.toString());
        mav.addObject("res", merchantEntryAlterationParam);

        return mav;
    }


    @RequestMapping(value = "/doUploadAlterationAptitude")
    public ModelAndView doUploadAlterationAptitude(@ModelAttribute MerchantEntryAlterationParam param, String firstClassMerchantNo,@RequestParam MultipartFile file) throws IOException {
        ModelAndView mav = new ModelAndView();

        /** 请求参数加密、签名 **/

        File tempFile = new File(tempDir, file.getOriginalFilename());
        file.transferTo(tempFile);

        // 文件签名
        try (InputStream is = new FileInputStream(tempFile)){
            param.setFileSign(DigestUtils.md5DigestAsHex(is));
        }

        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(param),
                firstClassMerchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);



        MerchantEntryAlterationParam merchantEntryAlterationParam = entryService.postForm(MERCHANT_ENTRY_UPLOAD_ALTERATION_INTERFACE, encryptAndSign.getCont(), encryptAndSign.getSign(), firstClassMerchantNo,
                MERCHANT_ENTRY_URL, MerchantEntryAlterationParam.class, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON,tempFile);
        logger.info(merchantEntryAlterationParam.toString());
        mav.addObject("res", merchantEntryAlterationParam);
        mav.setViewName("entry/toUploadAlterationAptitudeResult");
        return mav;
    }


    /**
     * 网银产品开通 调用
     */
    @RequestMapping(value = "/doOpenPos")
    public ModelAndView doOpenPos(@ModelAttribute OpenPosProductParam productParam, String firstClassMerchantNo) {
        ModelAndView mav = new ModelAndView();
        /** 请求参数加密、签名 **/
        mav.setViewName("entry/product/doOpenPosResult");
        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(productParam),
                firstClassMerchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

        OpenPosProductParam res = entryService.postForm(PRODUCT_OPENING_INTERFACE, encryptAndSign.getCont(), encryptAndSign.getSign(), firstClassMerchantNo,
                MERCHANT_ENTRY_URL, OpenPosProductParam.class, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);
        mav.addObject("openPosProductParam", res);
        return mav;
    }

    /**
     * POS 产品查询 调用
     */
    @RequestMapping(value = "/doPosQuery")
    public ModelAndView doPosQuery(@ModelAttribute  PosProductQueryParam posProductQueryParam, String firstClassMerchantNo) {
        ModelAndView mav = new ModelAndView();
        /** 请求参数加密、签名 **/
        mav.setViewName("entry/product/doOpenPosResult");
        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(posProductQueryParam),
                firstClassMerchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

        OpenPosProductParam res = entryService.postForm(PRODUCT_QUERY_INTERFACE, encryptAndSign.getCont(), encryptAndSign.getSign(), firstClassMerchantNo,
                MERCHANT_ENTRY_URL, OpenPosProductParam.class, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);
        mav.addObject("openPosProductParam", res);
        return mav;
    }

    /**
     * 产品配置修改接口 调用
     */
    @RequestMapping(value = "/doModifyProductConfig")
    public ModelAndView doModifyProductConfig(@ModelAttribute ModifyProductConfigParam modifyProductConfigParam, String firstClassMerchantNo) {
        ModelAndView mav = new ModelAndView();
        /** 请求参数加密、签名 **/
        mav.setViewName("entry/toOpenProductResult");
        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(modifyProductConfigParam),
                firstClassMerchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

        Map res = entryService.postForm(MODIFY_PRODUCT_CONFIG, encryptAndSign.getCont(), encryptAndSign.getSign(), firstClassMerchantNo,
                MERCHANT_ENTRY_URL, Map.class, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);
        mav.addObject("json", JSON.toJSONString(res));
        return mav;
    }


    /**
     * 产品配置修改接口 调用
     */
    @RequestMapping(value = "/doGetProductConfig")
    public ModelAndView doGetProductConfig(@ModelAttribute ModifyProductConfigParam modifyProductConfigParam, String firstClassMerchantNo) {
        ModelAndView mav = new ModelAndView();
        /** 请求参数加密、签名 **/
        mav.setViewName("entry/toOpenProductResult");
        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(modifyProductConfigParam),
                firstClassMerchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

        Map res = entryService.postForm(GET_PRODUCT_CONFIG, encryptAndSign.getCont(), encryptAndSign.getSign(), firstClassMerchantNo,
                MERCHANT_ENTRY_URL, Map.class, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);
        mav.addObject("json", JSON.toJSONString(res));
        return mav;
    }

    /**
     * 扫码产品开通 调用 延迟生效
     */
    @RequestMapping(value = "/doModifyAppPay")
    public ModelAndView doModifyAppPay(@ModelAttribute OpenAppPayProductParam productParam, String firstClassMerchantNo) {
        ModelAndView mav = new ModelAndView();
        /** 请求参数加密、签名 **/
        mav.setViewName("entry/product/doModifyAppPayyResult");
        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(productParam),
                firstClassMerchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

        OpenAppPayProductParam product = entryService.postForm(PRODUCT_MODIFY_INTERFACE, encryptAndSign.getCont(), encryptAndSign.getSign(), firstClassMerchantNo,
                MERCHANT_ENTRY_URL, OpenAppPayProductParam.class, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);
        mav.addObject("openAppPayProductParam", product);
        return mav;
    }

    @RequestMapping(value = "/doUploadImageUrl")
    public ModelAndView doUploadImageUrl(@ModelAttribute MerchantCredentialUrlParam param, String firstClassMerchantNo) {
        ModelAndView mav = new ModelAndView();
        /** 请求参数加密、签名 **/
        mav.setViewName("entry/doUploadResult");
        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(param),
                firstClassMerchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

        MerchantCredentialUrlParam merchantCredentialUrlParam = entryService.postForm(UPLOAD_IMAGE_URL, encryptAndSign.getCont(), encryptAndSign.getSign(), firstClassMerchantNo,
                MERCHANT_ENTRY_URL, MerchantCredentialUrlParam.class, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);
        logger.info(merchantCredentialUrlParam.toString());
        mav.addObject("json", JSON.toJSONString(merchantCredentialUrlParam));
        return mav;
    }


    @RequestMapping(value = "/doImageUrlAlteration")
    public ModelAndView doImageUrlAlteration(@ModelAttribute MerchantCredentialUrlParam param, String firstClassMerchantNo) {
        ModelAndView mav = new ModelAndView();
        /** 请求参数加密、签名 **/
        mav.setViewName("entry/doUploadResult");
        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(param),
                firstClassMerchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

        MerchantCredentialUrlParam merchantCredentialUrlParam = entryService.postForm(IMAGE_URL_ALTERATION, encryptAndSign.getCont(), encryptAndSign.getSign(), firstClassMerchantNo,
                MERCHANT_ENTRY_URL, MerchantCredentialUrlParam.class, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);
        logger.info(merchantCredentialUrlParam.toString());
        mav.addObject("json", JSON.toJSONString(merchantCredentialUrlParam));
        return mav;
    }

    @RequestMapping(value = "/doImageUrlQuery")
    public ModelAndView doImageUrlQuery(@ModelAttribute MerchantCredentialUrlParam param, String firstClassMerchantNo) {
        ModelAndView mav = new ModelAndView();
        /** 请求参数加密、签名 **/
        mav.setViewName("entry/toImageUrlQueryResult");
        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(param),
                firstClassMerchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

        MerchantCredentialUrlParam merchantCredentialUrlParam = entryService.postForm(IMAGE_URL_QUERY, encryptAndSign.getCont(), encryptAndSign.getSign(), firstClassMerchantNo,
                MERCHANT_ENTRY_URL, MerchantCredentialUrlParam.class, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);
        logger.info(merchantCredentialUrlParam.toString());
        mav.addObject("res", merchantCredentialUrlParam);
        return mav;
    }

    @RequestMapping(value = "/doModifyMerchant")
    public ModelAndView doModifyMerchant(@ModelAttribute ModifyMerchantInfoParam param, String firstClassMerchantNo) {
        ModelAndView mav = new ModelAndView();
        /** 请求参数加密、签名 **/
        mav.setViewName("entry/toOpenProductResult");
        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(param),
                firstClassMerchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

        JSONObject object = entryService.postForm(MODIFY_MERCHANT_INFO, encryptAndSign.getCont(), encryptAndSign.getSign(), firstClassMerchantNo,
                MERCHANT_ENTRY_URL, JSONObject.class, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);
        logger.info(object.toJSONString());
        mav.addObject("json", object.toJSONString());
        return mav;
    }


    @RequestMapping(value = "/aliSubMerchantQuery")
    public ModelAndView aliSubMerchantQuery(@ModelAttribute AliSubMerchantQuery param, String firstClassMerchantNo) {
        ModelAndView mav = new ModelAndView();
        /** 请求参数加密、签名 **/
        mav.setViewName("entry/toOpenProductResult");
        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(param),
                firstClassMerchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

        JSONObject object = entryService.postForm(ALI_SUBMERCHANT_QUERY, encryptAndSign.getCont(), encryptAndSign.getSign(), firstClassMerchantNo,
                MERCHANT_ENTRY_URL, JSONObject.class, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);
        logger.info("aliSubMerchantQuery json:"+object.toJSONString());
        mav.addObject("json", object.toJSONString());
        return mav;
    }


    @RequestMapping(value = "/contractQuery")
    public ModelAndView contractQuery(@ModelAttribute ContractQuery param, String firstClassMerchantNo) {
        ModelAndView mav = new ModelAndView();
        /** 请求参数加密、签名 **/
        mav.setViewName("entry/toOpenProductResult");
        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(param),
                firstClassMerchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

        JSONObject object = entryService.postForm(CONTRACT_QUERY, encryptAndSign.getCont(), encryptAndSign.getSign(), firstClassMerchantNo,
                MERCHANT_ENTRY_URL, JSONObject.class, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);
        logger.info("toOpenProductResult json:"+object.toJSONString());
        mav.addObject("json", object.toJSONString());
        return mav;
    }



    @RequestMapping(value = "/doAddAuthPayDirsDevConfig")
    public ModelAndView doAddAuthPayDirsDevConfig(@ModelAttribute AddAuthPayDirsDevConfigParam param, String firstClassMerchantNo) {
        ModelAndView mav = new ModelAndView();
        /** 请求参数加密、签名 **/
        mav.setViewName("entry/toOpenProductResult");
        EntryService.SignAndEncryptedContent encryptAndSign = entryService.encryptAndSign(JSON.toJSONString(param),
                firstClassMerchantNo, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

        JSONObject object = entryService.postForm(MERCHANT_ADD_AUTHPAYDIRS_DEVCONFIG, encryptAndSign.getCont(), encryptAndSign.getSign(), firstClassMerchantNo,
                MERCHANT_ENTRY_URL, JSONObject.class, ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);
        logger.info("doAddAuthPayDirsDevConfig json:"+object.toJSONString());
        mav.addObject("json", object.toJSONString());
        return mav;
    }

    @RequestMapping(value = "/toPosCallback", method = {RequestMethod.POST})
    public void supplement(HttpServletRequest request, HttpServletResponse response) throws IOException {
        logger.info("-------进入接收pos开通审核结果通知接口---------");
        JSONObject jsonObject;
        try {
            BufferedReader streamReader = new BufferedReader(new InputStreamReader(request.getInputStream(), "UTF-8"));
            StringBuilder responseStrBuilder = new StringBuilder();
            String inputStr;
            while ((inputStr = streamReader.readLine()) != null) {
                responseStrBuilder.append(inputStr);
            }
            logger.info("接收参数json字符串：" + responseStrBuilder);
            GenericResponse genericResponse = JSON.parseObject(responseStrBuilder.toString(), GenericResponse.class);
            /** 业务处理是否成功 **/
            if (!genericResponse.isSuccess()) {
                throw new RuntimeException(genericResponse.getMessage());
            }
            if (!genericResponse.getCode().equals(SUCCESS.getCode())) {
                throw new RuntimeException(genericResponse.getMessage());
            }

            /** 响应码为 0000 需进行验签操作 **/
            String decrypted = entryService.verificationAndDecrypt(genericResponse.getData(), genericResponse.getSign(), ENCRYPT_KEY_COMMON, SIGNKEY_COMMON);

            logger.info("通知接受成功：" + decrypted);
            System.out.println("通知接受成功：" + decrypted);
            /*
              接受成功后回写success
             */
            response.setContentType("text/plain");
            response.setCharacterEncoding("UTF-8");
            response.getWriter().write("success");
            response.getWriter().flush();
        } catch (Exception e) {
            logger.error("接收POS通知时出现异常" + e);
        }
    }
}
