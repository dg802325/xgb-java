package com.xgb.controller;

import com.xgb.common.SessionUtil;
import com.xgb.lang.DateUtils;
import com.xgb.lang.IntegerUtils;
import com.xgb.model.BlogClass;
import com.xgb.model.BlogClassExample;
import com.xgb.service.BlogClassService;
import com.xgb.utils.MyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
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
* @Date: 2019-09-21 10:21:37
* @Description:
*/
@RestController
@RequestMapping("/admin/")
public class BlogClassController {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private BlogClassService blogClassService;

    /**
    * 列表分页查询
    * @return
    */
    @RequiresPermissions("BLOG:CLASS:MENU")
    @GetMapping("getBlogClassForPage")
    public R getBlogClassForPage(@RequestParam Map mapParam,BlogClass blogClass) {
        logger.info("------request-address----------------：/admin/getBlogClassForPage");
        Map<String,Object> map = new HashMap<String,Object>();
        int begin = Integer.valueOf(mapParam.get("begin").toString());
        int end = Integer.valueOf(mapParam.get("end").toString());
        begin = IntegerUtils.getBegin(begin,end);//根据第几页查询数据
        //查询代码
        BlogClassExample blogClassExample = new BlogClassExample();
        blogClassExample.createCriteria();
        blogClassExample.setOrderByClause("CREATE_TIME DESC LIMIT "+begin+", "+end);
        List<BlogClass> lists = blogClassService.selectByExample(blogClassExample);
        int count = blogClassService.getCount();
        if(lists.size()>0){
            map.put("lists",lists);
            map.put("count",count);
            return R.ok(map,"查询成功");
        }
        //默认返回查询结果
        return R.error(996,"未找到内容");
    }

    /**
    * 根据id查询一条数据
    * @return
    */
    @RequiresPermissions("BLOG:CLASS:MENU")
    @GetMapping("getBlogClassOne")
    public R getBlogClassForPage(String id) {
        logger.info("------request-address----------------：/admin/getBlogClassOne");
        //查询代码
        Map<String,Object> map = new HashMap<String,Object>();
        BlogClass blogClass = blogClassService.selectByPrimaryKey(id);
        if(MyUtils.isNotEmpty(blogClass)){
            map.put("blogClass",blogClass);
            return R.ok();
        }
        //默认返回查询结果
        return R.error(996,"未找到内容");
    }

    /**
    * 保存
    * @return
    */
    @RequiresPermissions("BLOG:CLASS:SAVE")
    @PostMapping("saveBlogClass")
    public R saveBlogClass(BlogClass blogClass){
        logger.info("------request-address----------------：/admin/saveBlogClass");
        String sysUserId = SessionUtil.getSysUserId();
        if(MyUtils.isEmpty(blogClass.getId())){
            blogClass.setId(UUIDUtils.getUUID());
            blogClass.setCreateId(sysUserId);
            blogClass.setStatus("0");
            blogClass.setIsDel("0");
            blogClass.setCreateTime(DateUtils.getNowDate());
            if(blogClassService.insert(blogClass) > 0){
                return R.ok("添加成功");
            }else{
                return R.error(996,"添加失败");
            }
        }else{
            if(blogClassService.update(blogClass) > 0){
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
    @RequiresPermissions("BLOG:CLASS:DELETE")
    @PostMapping("deleteBlogClass")
    public R deleteBlogClass(BlogClass blogClass) {
        logger.info("------request-address-----------------：/admin/deleteBlogClass");
        Map<String,Object> map = new HashMap<String,Object>();
        int delete = blogClassService.deleteByPrimaryKey(blogClass.getId());
        if(delete>0){
            return R.ok("删除成功");
        }else{
            return R.error(996,"删除失败");
        }
    }

    @GetMapping("getBlogClassList")
    public R getBlogClassList(){
        logger.info("------request-address-----------------：/admin/getBlogClassList");
        String sysUserId = SessionUtil.getSysUserId();
        BlogClassExample example = new BlogClassExample();
        example.createCriteria().andCreateIdEqualTo(sysUserId);
        List<BlogClass> blogClasses = blogClassService.selectByExample(example);
        if(blogClasses.size()>0){
            return R.ok("lists",blogClasses,"查询成功");
        }else {
            return R.error(999,"暂无数据");
        }
    }

}
