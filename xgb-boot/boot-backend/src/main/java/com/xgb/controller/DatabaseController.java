package com.xgb.controller;

import com.xgb.common.SessionUtil;
import com.xgb.lang.HttpKit;
import com.xgb.lang.IntegerUtils;
import com.xgb.lang.R;
import com.xgb.model.SysDatabases;
import com.xgb.model.SysDatabasesExample;
import com.xgb.service.SysDatabasesService;
import com.xgb.utils.MyUtils;
import com.xgb.utils.UUIDUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@RequestMapping("/admin/")
@RestController
public class DatabaseController {
    protected static final Logger logger = LoggerFactory.getLogger(DatabaseController.class);

    @Autowired
    private SysDatabasesService sysDatabasesService;

    @GetMapping("getSysDatabaseForPage")
    public R getSysDatabaseForPage(@RequestParam Map mapParam){
        logger.info("------request-address----------------：/admin/getSysDatabaseForPage");
        int begin = Integer.valueOf(mapParam.get("begin").toString());
        int end = Integer.valueOf(mapParam.get("end").toString());
        begin = IntegerUtils.getBegin(begin,end);//根据第几页查询数据
        SysDatabasesExample sysDatabasesExample = new SysDatabasesExample();
        sysDatabasesExample.createCriteria();
        sysDatabasesExample.setOrderByClause("CREATE_TIME DESC LIMIT "+begin+", "+end);
        List<Map<String,Object>> lists = new ArrayList<Map<String,Object>>();
        List<SysDatabases> sysDatabases = sysDatabasesService.selectByExample(sysDatabasesExample);
        sysDatabases.forEach(item->{
            Map<String,Object> map = new HashMap<String,Object>();
            map.put("id",item.getId());
            map.put("databaseUrl",item.getDatabaseUrl());
            map.put("databasePortNumber",item.getDatabasePortNumber());
            map.put("databaseName",item.getDatabaseName());
            map.put("databaseType",item.getDatabaseType());
            map.put("databaseLoginName",item.getDatabaseLoginName());
            map.put("databaseLoginPassword",item.getDatabaseLoginPassword());
            lists.add(map);
        });
        int deptCount = sysDatabasesService.getDatabaseCount();
        //默认返回查询结果
        if(sysDatabases.size()>0){
            Map<String,Object> parentMap = new HashMap<String,Object>();
            parentMap.put("roles",lists);
            parentMap.put("count",deptCount);
            return R.ok(parentMap,"成功");
        }
        return R.error(999,"没有数据");
    }

    @PostMapping("saveSysDatabase")
    public R saveDatabase(SysDatabases sysDatabases, HttpServletRequest request){
        String sysUserId = SessionUtil.getSysUserId();
        if (MyUtils.isEmpty(sysDatabases.getId())) {
            sysDatabases.setId(UUIDUtils.getUUID());
            sysDatabases.setCreateId(sysUserId);
            sysDatabases.setCreateTime(new Date());
            sysDatabases.setOperationIp(HttpKit.getIp(request));
            sysDatabases.setStatus("0");
            sysDatabases.setIsDel("0");
            sysDatabases.setUpdateId(sysUserId);
            sysDatabases.setUpdateTime(new Date());
            int insert = sysDatabasesService.insert(sysDatabases);
            if (insert>0) {
                return R.ok("保存成功");
            }else {
                return R.error(999,"保存失败");
            }
        }else {
            sysDatabases.setCreateId(sysUserId);
            sysDatabases.setCreateTime(new Date());
            sysDatabases.setOperationIp(HttpKit.getIp(request));
            sysDatabases.setUpdateId(sysUserId);
            sysDatabases.setUpdateTime(new Date());
            int insert = sysDatabasesService.insert(sysDatabases);
            if (insert>0) {
                return R.ok("保存成功");
            }else {
                return R.error(999,"保存失败");
            }
        }
    }
}
