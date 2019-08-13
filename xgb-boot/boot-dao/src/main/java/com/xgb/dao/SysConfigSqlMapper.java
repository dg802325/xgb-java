package com.xgb.dao;

import com.xgb.model.SysConfig;

import java.util.List;
import java.util.Map;


/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
public interface SysConfigSqlMapper {

	public Integer getSysConfigCount();

    public List<SysConfig> getSysConfigList(Map<String, Object> paramMap);

    public SysConfig selectOne(Map<String, Object> paramMap);
}
