package com.xgb.service;

import com.xgb.common.GbaseUtils;
import com.xgb.util.MyTools;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseService {

    public static Connection conn = GbaseUtils.getConnection();


}
