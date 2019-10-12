package com.xgb.controller;

import com.xgb.model.ShopAdver;
import com.xgb.service.ShopAdverService;
import com.xgb.utils.DateUtils;
import com.xgb.utils.IntegerUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.xgb.lang.R;
import com.xgb.utils.UUIDUtils;
import com.xgb.utils.MyUtils;

import java.sql.DatabaseMetaData;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
* @Auther: xgb
* @Date: 2019-10-12 15:29:39
* @Description:
*/
@Controller
@RequestMapping("/admin/")
public class ShopAdverController {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private ShopAdverService shopAdverService;

    /**
    * 列表分页查询
    * @return
    */
//    @RequiresPermissions("SHOP:ADVER:MENU")
    @ResponseBody
    @GetMapping("getShopAdverForPage")
    public R getShopAdverForPage(@RequestParam Map mapParam,ShopAdver shopAdver) {
        logger.info("------request-address----------------：/admin/getShopAdverForPage");
        Map<String,Object> map = new HashMap<String,Object>();
        int begin = Integer.valueOf(mapParam.get("begin").toString());
        int end = Integer.valueOf(mapParam.get("end").toString());
        //查询代码
        begin = IntegerUtils.getBegin(begin,end);//根据第几页查询数据
        List<ShopAdver> lists = shopAdverService.selectAllShopAdver(shopAdver,begin,end);
        if(lists.size()>0){
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
//    @RequiresPermissions("SHOP:ADVER:MENU")
    @ResponseBody
    @GetMapping("getShopAdverOne")
    public R getShopAdverForPage(String id) {
        logger.info("------request-address----------------：/admin/getShopAdverOne");
        //查询代码
        Map<String,Object> map = new HashMap<String,Object>();
        ShopAdver shopAdver = shopAdverService.selectByPrimaryKey(id);
        if(MyUtils.isNotEmpty(shopAdver)){
            map.put("shopAdver",shopAdver);
            return R.ok();
        }
        //默认返回查询结果
        return R.error(996,"未找到内容");
    }

    /**
    * 新增
    * @return
    */
    @ResponseBody
//    @RequiresPermissions("SHOP:ADVER:SAVE")
    @PostMapping("addShopAdver")
    public R addShopAdver(ShopAdver shopAdver,String astartTime,String aendTime){
        logger.info("------request-address----------------：/admin/addShopAdver");
        shopAdver.setId(UUIDUtils.getUUID());
        try {
            shopAdver.setStartTime(DateUtils.tzStringToDate(astartTime));
            shopAdver.setEndTime(DateUtils.tzStringToDate(aendTime));
        } catch (ParseException e) {
            e.printStackTrace();

        }
        if(shopAdverService.insert(shopAdver) > 0){
            return R.ok("添加成功");
        }else{
            return R.error(996,"添加失败");
        }
    }

    /**
     * 编辑
     * @return
     */
    @ResponseBody
//    @RequiresPermissions("SHOP:ADVER:SAVE")
    @PostMapping("editShopAdver")
    public R editShopAdver(ShopAdver shopAdver,String astartTime,String aendTime){
        logger.info("------request-address----------------：/admin/editShopAdver");
        if(shopAdverService.update(shopAdver) > 0){
            return R.ok("编辑成功");
        }else{
            return R.error(996,"编辑失败");
        }
    }

    /**
    * 删除
    * @return
    */
//    @RequiresPermissions("SHOP:ADVER:DELETE")
    @ResponseBody
    @PostMapping("deleteShopAdver")
    public R deleteShopAdver(ShopAdver shopAdver) {
        logger.info("------request-address-----------------：/admin/deleteShopAdver");
        Map<String,Object> map = new HashMap<String,Object>();
        int delete = shopAdverService.deleteByPrimaryKey(shopAdver.getId());
        if(delete>0){
            return R.ok("删除成功");
        }else{
            return R.error(996,"删除失败");
        }
    }

}
