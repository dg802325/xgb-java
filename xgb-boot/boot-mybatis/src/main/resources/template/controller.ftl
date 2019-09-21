package ${contollerPackage!};

import ${modelPackage!}.${modelName!};
import ${servicePackage!}.${modelName!}Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.*;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ${myCommonPath!}.util.StringUtils;
import ${myCommonPath!}.lang.R;
import ${myCommonPath!}.utils.UUIDUtils;
import ${myCommonPath!}.utils.MyUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
* @Auther: ${author!}
* @Date: ${date!}
* @Description:
*/
@Controller
@RequestMapping("/admin/")
public class ${modelName!}Controller {

    protected Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private ${modelName!}Service ${someModelName!}Service;

    /**
    * 列表分页查询
    * @return
    */
    @RequiresPermissions("${permissions!}:MENU")
    @ResponseBody
    @GetMapping("get${modelName!}ForPage")
    public R get${modelName!}ForPage(@RequestParam Map mapParam,${modelName!} ${someModelName!}) {
        logger.info("------request-address----------------：/admin/get${modelName!}ForPage");
        Map<String,Object> map = new HashMap<String,Object>();
        int begin = Integer.valueOf(mapParam.get("begin").toString());
        int end = Integer.valueOf(mapParam.get("end").toString());
        //查询代码
        List<${modelName!}> lists = ${someModelName!}Service.selectAll${modelName!}(${someModelName!},begin,end);
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
    @RequiresPermissions("${permissions!}:MENU")
    @ResponseBody
    @GetMapping("get${modelName!}One")
    public R get${modelName!}ForPage(String id) {
        logger.info("------request-address----------------：/admin/get${modelName!}One");
        //查询代码
        Map<String,Object> map = new HashMap<String,Object>();
        ${modelName!} ${someModelName!} = ${someModelName!}Service.selectByPrimaryKey(id);
        if(MyUtils.isNotEmpty(${someModelName!})){
            map.put("${someModelName!}",${someModelName!});
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
    @RequiresPermissions("${permissions!}:SAVE")
    @PostMapping("save${modelName!}")
    public R save${modelName!}(${modelName!} ${someModelName!}){
        logger.info("------request-address----------------：/admin/save${modelName!}");
        Map<String,Object> map = new HashMap<String,Object>();
        if(MyUtils.isEmpty(${someModelName!}.getId())){
            ${someModelName!}.setId(UUIDUtils.getUUID());
            if(${someModelName!}Service.insert(${someModelName!}) > 0){
                return R.ok("添加成功");
            }else{
                return R.error(996,"添加失败");
            }
        }else{
            if(${someModelName}Service.update(${someModelName}) > 0){
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
    @RequiresPermissions("${permissions!}:DELETE")
    @ResponseBody
    @PostMapping("delete${modelName!}")
    public R delete${modelName!}(${modelName!} ${someModelName!}) {
        logger.info("------request-address-----------------：/admin/delete${modelName!}");
        Map<String,Object> map = new HashMap<String,Object>();
        int delete = ${someModelName!}Service.deleteByPrimaryKey(${someModelName!}.getId());
        if(delete>0){
            return R.ok("删除成功");
        }else{
            return R.error(996,"删除失败");
        }
    }

}
