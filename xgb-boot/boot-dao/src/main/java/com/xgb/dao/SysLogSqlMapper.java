package com.xgb.dao;

import com.xgb.model.SysLog;

import java.util.List;
import java.util.Map;


/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
public interface SysLogSqlMapper {

	public Integer getSysLogCount();

    public List<SysLog> getSysLogList(Map<String, Object> paramMap);

    public SysLog selectOne(Map<String, Object> paramMap);
}
