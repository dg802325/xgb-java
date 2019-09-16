package com.xgb.controller;

import com.xgb.model.BlogGarden;
import com.xgb.service.BlogGardenService;
import com.xgb.utils.MyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.xgb.utils.StringUtils;
import com.xgb.lang.R;
import com.xgb.utils.UUIDUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* @Auther: Mr Deng
* @Date: 2019-09-11 11:44:18
* @Description:
*/
@RestController
@RequestMapping("/admin/")
public class BlogGardenController {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private BlogGardenService blogGardenService;

    /**
    * 列表分页查询
    * @return
    */
//    @RequiresPermissions("BLOG:GARDEN:MENU")
    @GetMapping("getBlogGardenForPage")
    public R getBlogGardenForPage(@RequestParam Map mapParam,BlogGarden blogGarden) {
        logger.info("------request-address----------------：/admin/getBlogGardenForPage");
        Map<String,Object> map = new HashMap<String,Object>();
        int begin = Integer.valueOf(mapParam.get("begin").toString());
        int end = Integer.valueOf(mapParam.get("end").toString());
        //查询代码
        List<BlogGarden> lists = blogGardenService.selectAllBlogGarden(blogGarden,begin,end);
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
//    @RequiresPermissions("BLOG:GARDEN:MENU")
    @GetMapping("getBlogGardenOne")
    public R getBlogGardenForPage(String id) {
        logger.info("------request-address----------------：/admin/getBlogGardenOne");
        //查询代码
        Map<String,Object> map = new HashMap<String,Object>();
        BlogGarden blogGarden = blogGardenService.selectByPrimaryKey(id);
        if(MyUtils.isNotEmpty(blogGarden)){
            map.put("blogGarden",blogGarden);
            return R.ok();
        }
        //默认返回查询结果
        return R.error(996,"未找到内容");
    }

    /**
    * 保存
    * @return
    */
//    @RequiresPermissions("BLOG:GARDEN:SAVE")
    @PostMapping("saveBlogGarden")
    public R saveBlogGarden(BlogGarden blogGarden,String content){
        logger.info("------request-address----------------：/admin/saveBlogGarden");
        Map<String,Object> map = new HashMap<String,Object>();
        if(MyUtils.isEmpty(blogGarden.getId())){
            blogGarden.setId(UUIDUtils.getUUID());
            if(blogGardenService.insert(blogGarden) > 0){
                R.ok("添加成功");
            }else{
                R.error(996,"添加失败");
            }
        }else{
            if(blogGardenService.update(blogGarden) > 0){
                R.ok("编辑成功");
            }else{
                R.error(996,"编辑失败");
            }
        }
        return R.error(996,"未做任何操作");
    }

    /**
    * 删除
    * @return
    */
//    @RequiresPermissions("BLOG:GARDEN:DELETE")
    @PostMapping("deleteBlogGarden")
    public R deleteBlogGarden(BlogGarden blogGarden) {
        logger.info("------request-address-----------------：/admin/deleteBlogGarden");
        Map<String,Object> map = new HashMap<String,Object>();
        int delete = blogGardenService.deleteByPrimaryKey(blogGarden.getId());
        if(delete>0){
            return R.ok("删除成功");
        }else{
            return R.error(996,"删除失败");
        }
    }

}
