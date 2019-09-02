package ${controllerPackage};

import ${modelPackage}.${modelNameUpperCamel};
import ${servicePackage}.${modelNameUpperCamel}Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.*;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ${myCommonPath}.util.StringUtils;
import ${myCommonPath}.lang.R;
import ${myCommonPath}.utils.UUIDUtils;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * Created by ${author} on ${date}.
 */
@Controller
@RequestMapping("/admin/")
public class ${modelNameUpperCamel}Controller {

    protected static final Logger logger = LoggerFactory.getLogger(${modelNameUpperCamel}Controller.class);

    @Autowired
    private ${modelNameUpperCamel}Service ${modelNameLowerCamel}Service;


    /**
    * 查看列表显示
    * @return
    */
    @RequiresPermissions("${permissions}:MENU")
    @GetMapping("/view_${modelName}")
	public ModelAndView view${modelNameUpperCamel}(ModelAndView mv){
        logger.info("------request-address----------------：/admin/view_${modelName}");
        mv.setViewName("admin/view_${lowerCaseTableName}");
        return mv;
    }


    /**
    * 列表分页查询
    * @return
    */
    @RequiresPermissions("${permissions}:MENU")
    @ResponseBody
    @GetMapping(value = "get${modelNameUpperCamel}ForPage")
    public R get${modelNameUpperCamel}ForPage(@RequestParam Map mapParam) {
        logger.info("------request-address----------------：/admin/get${modelNameUpperCamel}ForPage");
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
    @RequiresPermissions("${permissions}:INSERT")
    @GetMapping("insert_${modelName}")
    public ModelAndView insert${modelNameUpperCamel}(ModelAndView mv){
        logger.info("------request-address----------------：/admin/insert_${modelName}");
        mv.setViewName("admin/insert_${lowerCaseTableName}");
        return mv;
    }

    /**
    * 编辑页面跳转
    * @return
    */
    @RequiresPermissions("${permissions}:EDIT")
    @GetMapping("edit_${modelName}")
    public ModelAndView edit${modelNameUpperCamel}(ModelAndView mv){
        logger.info("------request-address----------------：/admin/edit_${modelName}");
        mv.setViewName("admin/edit_${lowerCaseTableName}");
        return mv;
    }

    /**
    * 保存
    * @return
    */
    @ResponseBody
    @RequiresPermissions("${permissions}:SAVE")
    @PostMapping("save_${modelName}")
    public R save${modelNameUpperCamel}(${modelNameUpperCamel} ${modelName}){
        logger.info("------request-address----------------：/admin/save_${modelName}");
        Map<String,Object> map = new HashMap<String,Object>();
        if(StringUtils.isEmpty(${modelName}.getId())){
            ${modelName}.setId(UUIDUtils.getUUID());
            if(${modelName}Service.insert(${modelName}) > 0){
                R.ok("添加成功");
            }else{
                R.error(996,"添加失败");
            }
        }else{
            if(${modelName}Service.updateByPrimaryKeySelective(${modelName}) > 0){
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
    @RequiresPermissions("${permissions}:DELETE")
    @ResponseBody
    @PostMapping("delete_${modelName}")
    public R delete${modelNameUpperCamel}(${modelNameUpperCamel} ${modelName}) {
        logger.info("------request-address-----------------：/admin/delete_${modelName}");
        Map<String,Object> map = new HashMap<String,Object>();
        int delete = ${modelName}Service.deleteByPrimaryKey(${modelName}.getId());
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
    @RequiresPermissions("${permissions}:MENU")
    @GetMapping("select_${modelName}")
    public ModelAndView select${modelNameUpperCamel}(ModelAndView mv, String id){
        logger.info("------request-address----------------：/admin/select_${modelName}");
        ${modelNameUpperCamel} ${modelName} = ${modelName}Service.selectByPrimaryKey(id);
        mv.setViewName("admin/select_${modelName}");
        mv.addObject("${lowerCaseTableName}",${modelName});
        return mv;
    }
}
