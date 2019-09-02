package ;

import .;
import .Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.*;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import .util.StringUtils;
import .lang.R;
import .utils.UUIDUtils;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * Created by Mr Deng on .
 */
@Controller
@RequestMapping("/admin/")
public class Controller {

    protected static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Autowired
    private Service Service;


    /**
    * 查看列表显示
    * @return
    */
    @RequiresPermissions(":MENU")
    @GetMapping("/view_SysDept")
	public ModelAndView view(ModelAndView mv){
        logger.info("------request-address----------------：/admin/view_SysDept");
        mv.setViewName("admin/view_");
        return mv;
    }


    /**
    * 列表分页查询
    * @return
    */
    @RequiresPermissions(":MENU")
    @ResponseBody
    @GetMapping(value = "getForPage")
    public R getForPage(@RequestParam Map mapParam) {
        logger.info("------request-address----------------：/admin/getForPage");
        Map<String,Object> map = new HashMap<String,Object>();
        int begin = Integer.valueOf(mapParam.get("begin").toString());
        int end = Integer.valueOf(mapParam.get("end").toString());
        //查询代码

        //默认返回查询结果
        return R.error(996,"未找到内容");
    }

    /**
    * 新增页面跳转
    * @return
    */
    @RequiresPermissions(":INSERT")
    @GetMapping("insert_SysDept")
    public ModelAndView insert(ModelAndView mv){
        logger.info("------request-address----------------：/admin/insert_SysDept");
        mv.setViewName("admin/insert_");
        return mv;
    }

    /**
    * 编辑页面跳转
    * @return
    */
    @RequiresPermissions(":EDIT")
    @GetMapping("edit_SysDept")
    public ModelAndView edit(ModelAndView mv){
        logger.info("------request-address----------------：/admin/edit_SysDept");
        mv.setViewName("admin/edit_");
        return mv;
    }

    /**
    * 保存
    * @return
    */
    @ResponseBody
    @RequiresPermissions(":SAVE")
    @PostMapping("save_SysDept")
    public R save( SysDept){
        logger.info("------request-address----------------：/admin/save_SysDept");
        Map<String,Object> map = new HashMap<String,Object>();
        if(StringUtils.isEmpty(SysDept.getId())){
            SysDept.setId(UUIDUtils.getUUID());
            if(SysDeptService.insert(SysDept) > 0){
                R.ok("添加成功");
            }else{
                R.error(996,"添加失败");
            }
        }else{
            if(SysDeptService.updateByPrimaryKeySelective(SysDept) > 0){
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
    @RequiresPermissions(":DELETE")
    @ResponseBody
    @PostMapping("delete_SysDept")
    public R delete( SysDept) {
        logger.info("------request-address-----------------：/admin/delete_SysDept");
        Map<String,Object> map = new HashMap<String,Object>();
        int delete = SysDeptService.deleteByPrimaryKey(SysDept.getId());
        if(delete>0){
            return R.ok("删除成功");
        }else{
            return R.error(996,"删除失败");
        }
    }

    /**
    * freemarker 模板 使用方法
    * 根据id查询一个条数据
    * @return
    */
    @RequiresPermissions(":MENU")
    @GetMapping("select_SysDept")
    public ModelAndView select(ModelAndView mv, String id){
        logger.info("------request-address----------------：/admin/select_SysDept");
         SysDept = SysDeptService.selectByPrimaryKey(id);
        mv.setViewName("admin/select_SysDept");
        mv.addObject("",SysDept);
        return mv;
    }
}
