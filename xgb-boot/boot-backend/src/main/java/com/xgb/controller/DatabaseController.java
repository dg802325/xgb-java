package com.xgb.controller;

import com.xgb.lang.IntegerUtils;
import com.xgb.lang.R;
import com.xgb.model.SysDatabases;
import com.xgb.model.SysDatabasesExample;
import com.xgb.service.SysDatabasesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
}
