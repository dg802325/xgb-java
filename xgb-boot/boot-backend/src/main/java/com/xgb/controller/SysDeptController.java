package com.xgb.controller;

import com.xgb.common.SessionUtil;
import com.xgb.lang.R;
import com.xgb.model.SysDept;
import com.xgb.model.SysDeptExample;
import com.xgb.service.SysDeptService;
import com.xgb.utils.MyUtils;
import com.xgb.utils.UUIDUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
@RestController
@RequestMapping("/admin/")
public class SysDeptController {

    protected static final Logger logger = LoggerFactory.getLogger(SysDeptController.class);

    @Autowired
    private SysDeptService sysDeptService;

    @GetMapping("getAllDept")
    public List<SysDept> getAllDept(){
        logger.info("------request-address----------------：/admin/getAllDept");
        List<SysDept> sysDepts = sysDeptService.selectByExample(new SysDeptExample());
        return sysDepts;
    }

}
