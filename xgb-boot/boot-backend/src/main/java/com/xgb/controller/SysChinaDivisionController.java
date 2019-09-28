package com.xgb.controller;

import com.xgb.lang.R;
import com.xgb.model.SysChinaDivision;
import com.xgb.model.SysChinaDivisionExample;
import com.xgb.service.SysChinaDivistionService;
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

}
