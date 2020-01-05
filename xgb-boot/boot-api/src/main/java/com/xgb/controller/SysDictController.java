package com.xgb.controller;

import com.xgb.common.SessionUtil;
import com.xgb.entity.R;
import com.xgb.model.SysDict;
import com.xgb.model.SysDictExample;
import com.xgb.service.SysDictService;
import com.xgb.util.UUIDUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
@RestController
@RequestMapping("/admin/")
public class SysDictController {

    protected static final Logger logger = LoggerFactory.getLogger(SysDictController.class);

    @Autowired
    private SysDictService sysDictService;


    /**
    * 查询一级字典表
    * @return
    */
//    @RequiresPermissions("SYS:DICT:MENU")
    @GetMapping(value = "getOneDictList")
    public R getOneDictList() {
        logger.info("------request-address----------------：/admin/getOneDictList");
        SysDictExample sysDictExample = new SysDictExample();
        sysDictExample.createCriteria().andDictTypeEqualTo("0");
        sysDictExample.setOrderByClause("SORT ASC");
        List<SysDict> sysDicts = sysDictService.selectByExample(sysDictExample);
        Map<String,Object> parentMap = new HashMap<String,Object>();
        //默认返回查询结果
        parentMap.put("lists",sysDicts);

        return R.ok(parentMap,"查询成功");
    }

    /**
     * 查询二级字典表
     * @return
     */
//    @RequiresPermissions("SYS:DICT:MENU")
    @GetMapping(value = "getTwoDictList")
    public R getTwoDictList(String parentId) {
        logger.info("------request-address----------------：/admin/getTwoDictList");
        SysDictExample sysDictExample = new SysDictExample();
        sysDictExample.createCriteria().andParentIdEqualTo(parentId);
        sysDictExample.setOrderByClause("SORT ASC");
        List<SysDict> sysDicts = sysDictService.selectByExample(sysDictExample);
        Map<String,Object> parentMap = new HashMap<String,Object>();
        //默认返回查询结果
        parentMap.put("lists",sysDicts);
        return R.ok(parentMap,"查询成功");
    }

    /**
    * 新增一级字典
    * @return
    */
//    @RequiresPermissions("SYS:DICT:SAVE")
    @PostMapping("saveOneSysDict")
    public R saveOneSysDict(SysDict sysDict){
        logger.info("------request-address----------------：/admin/saveOneSysDict");
        Map<String,Object> map = new HashMap<String,Object>();
        String sysUserId = SessionUtil.getSysUserId();
        sysDict.setId(UUIDUtils.getUUID());
        sysDict.setCreateId(sysUserId);
        sysDict.setCreateTime(new Date());
        sysDict.setStatus("0");
        sysDict.setDictType("0");
        if(sysDictService.insert(sysDict) > 0){
            return R.ok("添加成功");
        }else{
            return R.error(996,"添加失败");
        }
    }

    /**
     * 新增二级字典
     * @return
     */
//    @RequiresPermissions("SYS:DICT:SAVE")
    @PostMapping("saveTwoSysDict")
    public R saveTwoSysDict(SysDict sysDict){
        logger.info("------request-address----------------：/admin/saveTwoSysDict");
        Map<String,Object> map = new HashMap<String,Object>();
        String sysUserId = SessionUtil.getSysUserId();
        sysDict.setId(UUIDUtils.getUUID());
        sysDict.setCreateId(sysUserId);
        sysDict.setCreateTime(new Date());
        sysDict.setStatus("0");
        sysDict.setDictType("1");
        if(sysDictService.insert(sysDict) > 0){
            return R.ok("添加成功");
        }else{
            return R.error(996,"添加失败");
        }
    }

    /**
     * 编辑字典
     * @return
     */
//    @RequiresPermissions("SYS:DICT:SAVE")
    @PostMapping("saveEditSysDict")
    public R saveEditSysDict(SysDict sysDict){
        logger.info("------request-address----------------：/admin/saveEditSysDict");
        if(sysDictService.updateByPrimaryKeySelective(sysDict) > 0){
            return R.ok("编辑成功");
        }else{
            return R.error(996,"编辑失败");
        }
    }

    /**
    * 删除
    * @return
    */
//    @RequiresPermissions("SYS:DICT:DELETE")
    @PostMapping("deleteSysDict")
    public R deleteSysDict(SysDict sysDict) {
        logger.info("------request-address-----------------：/admin/deleteSysDict");
        Map<String,Object> map = new HashMap<String,Object>();
        int delete = sysDictService.deleteSysDictById(sysDict.getId());
        if(delete>0){
            return R.ok("删除成功");
        }else{
            return R.error(996,"删除失败");
        }
    }

    @GetMapping("selectByOnlyCode")
    public R selectByOnlyCode(String code){
        logger.info("------request-address-----------------：/admin/selectByOnlyCode");
        //查询一级
        SysDictExample example = new SysDictExample();
        example.createCriteria().andDictCodeEqualTo(code);
        SysDict sysDict = sysDictService.selectByExample(example).get(0);
        SysDictExample sysDictExample = new SysDictExample();
        sysDictExample.createCriteria().andParentIdEqualTo(sysDict.getId());
        List<SysDict> sysDicts = sysDictService.selectByExample(sysDictExample);
        return R.ok("lists",sysDicts,"查询成功");
    }
}
