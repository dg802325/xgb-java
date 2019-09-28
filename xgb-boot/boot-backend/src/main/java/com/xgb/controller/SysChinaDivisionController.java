package com.xgb.controller;

import com.xgb.lang.R;
import com.xgb.model.SysChinaDivision;
import com.xgb.model.SysChinaDivisionExample;
import com.xgb.service.SysChinaDivistionService;
import com.xgb.utils.MyUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: 邓根
 * @Date: 2019/9/28 13:39
 * @Description:
 */
@RestController
@RequestMapping("/admin/")
public class SysChinaDivisionController {

    protected static final Logger logger = LoggerFactory.getLogger(SysChinaDivisionController.class);

    @Autowired
    private SysChinaDivistionService sysChinaDivistionService;

    /**
     * 获得省
     * @return
     */
    @GetMapping("getProvinceList")
    public R getProvinceList(){
        logger.info("------request-address----------------：/admin/getProvinceList");
        SysChinaDivisionExample sysChinaDivisionExample = new SysChinaDivisionExample();
        sysChinaDivisionExample.createCriteria().andDivisionTypeEqualTo("0");
        List<SysChinaDivision> sysChinaDivisions = sysChinaDivistionService.selectSysByExample(sysChinaDivisionExample);
        Map<String,Object> parentMap = new HashMap<String,Object>();
        parentMap.put("lists",sysChinaDivisions);
        return R.ok(parentMap,"查询成功");
    }

    /**
     * 根据省获得市
     * @return
     */
    @GetMapping("getCityList")
    public R getCityList(String parentId){
        logger.info("------request-address----------------：/admin/getCityList");
        SysChinaDivisionExample sysChinaDivisionExample = new SysChinaDivisionExample();
        sysChinaDivisionExample.createCriteria().andDivisionTypeEqualTo("1").andParentIdEqualTo(parentId);
        List<SysChinaDivision> sysChinaDivisions = sysChinaDivistionService.selectSysByExample(sysChinaDivisionExample);
        Map<String,Object> parentMap = new HashMap<String,Object>();
        parentMap.put("lists",sysChinaDivisions);
        return R.ok(parentMap,"查询成功");
    }

    /**
     * 根据市获得区
     * @return
     */
    @GetMapping("getAreaList")
    public R getAreaList(String parentId){
        logger.info("------request-address----------------：/admin/getAreaList");
        SysChinaDivisionExample sysChinaDivisionExample = new SysChinaDivisionExample();
        sysChinaDivisionExample.createCriteria().andDivisionTypeEqualTo("2").andParentIdEqualTo(parentId);
        List<SysChinaDivision> sysChinaDivisions = sysChinaDivistionService.selectSysByExample(sysChinaDivisionExample);
        Map<String,Object> parentMap = new HashMap<String,Object>();
        parentMap.put("lists",sysChinaDivisions);
        return R.ok(parentMap,"查询成功");
    }

    /**
     * 根据区获得村
     * @return
     */
    @GetMapping("getVillageList")
    public R getVillageList(String parentId){
        logger.info("------request-address----------------：/admin/getVillageList");
        SysChinaDivisionExample sysChinaDivisionExample = new SysChinaDivisionExample();
        sysChinaDivisionExample.createCriteria().andDivisionTypeEqualTo("3").andParentIdEqualTo(parentId);
        List<SysChinaDivision> sysChinaDivisions = sysChinaDivistionService.selectSysByExample(sysChinaDivisionExample);
        Map<String,Object> parentMap = new HashMap<String,Object>();
        parentMap.put("lists",sysChinaDivisions);
        return R.ok(parentMap,"查询成功");
    }

    /**
     * 根据区获得合利宝区编码
     * @param id
     * @return
     */
    @GetMapping("getRegionCode")
    public R getRegionCode(String id){
        logger.info("------request-address----------------：/admin/getRegionCode");
        if(MyUtils.isEmpty(id)){
            return R.error(996,"id为空");
        }
        SysChinaDivision sysChinaDivision = sysChinaDivistionService.selectByPrimaryKey(id);
        Map<String,Object> parentMap = new HashMap<String,Object>();
        parentMap.put("code",sysChinaDivision.getHlbDivisionCode());
        return R.ok(parentMap,"查询成功");
    }

}
