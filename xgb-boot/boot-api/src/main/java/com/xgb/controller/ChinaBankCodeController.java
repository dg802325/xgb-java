package com.xgb.controller;

import com.alibaba.fastjson.JSONObject;
import com.xgb.entity.R;
import com.xgb.model.ChinaBankCode;
import com.xgb.service.ChinaBankCodeService;
import com.xgb.util.HttpClientUtils;
import com.xgb.util.IntegerUtils;
import com.xgb.util.MyTools;
import com.xgb.util.UUIDUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: 邓根
 * @Date: 2019/10/9 18:08
 * @Description:
 */
@RequestMapping("/admin/")
@RestController
public class ChinaBankCodeController {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private ChinaBankCodeService chinaBankCodeService;

    @GetMapping("getBankCardByNo")
    public R getBankCardByNo(String bankCardNo){
        JSONObject jsonObject = null;
        try {
            Map<String,String> codeMap = new HashMap<String,String>();
            codeMap.put("_input_charset","utf-8");
            codeMap.put("cardNo",bankCardNo);
            codeMap.put("cardBinCheck","true");
            String s = HttpClientUtils.sendGet("https://ccdcapi.alipay.com/validateAndCacheCardInfo.json", codeMap);
            jsonObject = JSONObject.parseObject(s);
            String bank = jsonObject.getString("bank");
            String bankName = chinaBankCodeService.getBankNameByBankCode(bank);
            if(MyTools.isNotEmpty(bankName)){
                Map<String,Object> map = new HashMap<>();
                map.put("bankCardNo",bankCardNo);
                map.put("bankName",bankName);
                return R.ok(map,"查询成功");
            }
        }catch (Exception e){
            return R.error(999,"未查询到");
        }
        return R.error(999,"未查询到");
    }

    /**
     * 列表分页查询
     * @return
     */
//    @RequiresPermissions("CHINA:BANK:CODE:MENU")
    @ResponseBody
    @GetMapping("getChinaBankCodeForPage")
    public R getChinaBankCodeForPage(@RequestParam Map mapParam, ChinaBankCode chinaBankCode) {
        logger.info("------request-address----------------：/admin/getChinaBankCodeForPage");
        Map<String,Object> map = new HashMap<String,Object>();
        int begin = Integer.valueOf(mapParam.get("begin").toString());
        int end = Integer.valueOf(mapParam.get("end").toString());
        begin = IntegerUtils.getBegin(begin,end);//根据第几页查询数据
        //查询代码
        List<ChinaBankCode> lists = chinaBankCodeService.selectAllChinaBankCode(chinaBankCode,begin,end);
        int bankCodeCount = chinaBankCodeService.getAllChinaBankCodeCount(chinaBankCode);
        if(lists.size()>0){
            map.put("count",bankCodeCount);
            map.put("lists",lists);
            return R.ok(map,"查询成功");
        }
        //默认返回查询结果
        return R.error(996,"未找到内容");
    }

    /**
     * 根据id查询一条数据
     * @return
     */
//    @RequiresPermissions("CHINA:BANK:CODE:MENU")
    @ResponseBody
    @GetMapping("getChinaBankCodeOne")
    public R getChinaBankCodeForPage(String id) {
        logger.info("------request-address----------------：/admin/getChinaBankCodeOne");
        //查询代码
        Map<String,Object> map = new HashMap<String,Object>();
        ChinaBankCode chinaBankCode = chinaBankCodeService.selectByPrimaryKey(id);
        if(MyTools.isNotEmpty(chinaBankCode)){
            map.put("chinaBankCode",chinaBankCode);
            return R.ok();
        }
        //默认返回查询结果
        return R.error(996,"未找到内容");
    }

    /**
     * 保存
     * @return
     */
    @ResponseBody
//    @RequiresPermissions("CHINA:BANK:CODE:SAVE")
    @PostMapping("saveChinaBankCode")
    public R saveChinaBankCode(ChinaBankCode chinaBankCode){
        logger.info("------request-address----------------：/admin/saveChinaBankCode");
        Map<String,Object> map = new HashMap<String,Object>();
        if(MyTools.isEmpty(chinaBankCode.getId())){
            chinaBankCode.setId(UUIDUtils.getUUID());
            if(chinaBankCodeService.insert(chinaBankCode) > 0){
                return R.ok("添加成功");
            }else{
                return R.error(996,"添加失败");
            }
        }else{
            if(chinaBankCodeService.update(chinaBankCode) > 0){
                return R.ok("编辑成功");
            }else{
                return R.error(996,"编辑失败");
            }
        }
    }

    /**
     * 删除
     * @return
     */
//    @RequiresPermissions("CHINA:BANK:CODE:DELETE")
    @ResponseBody
    @PostMapping("deleteChinaBankCode")
    public R deleteChinaBankCode(ChinaBankCode chinaBankCode) {
        logger.info("------request-address-----------------：/admin/deleteChinaBankCode");
        Map<String,Object> map = new HashMap<String,Object>();
        int delete = chinaBankCodeService.deleteByPrimaryKey(chinaBankCode.getId());
        if(delete>0){
            return R.ok("删除成功");
        }else{
            return R.error(996,"删除失败");
        }
    }



}
