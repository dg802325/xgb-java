package com.xgb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("/admin/")
@RestController
public class MysqlController {

    protected Logger logger = LoggerFactory.getLogger(getClass());


}