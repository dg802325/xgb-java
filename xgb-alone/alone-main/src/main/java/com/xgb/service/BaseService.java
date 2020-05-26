package com.xgb.service;

import com.xgb.common.GbaseUtils;

import java.sql.Connection;

public class BaseService {

    public static Connection conn = GbaseUtils.getConnection();


}
