package com.xgb.dao;

import com.xgb.model.SysOss;

import java.util.List;
import java.util.Map;


/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
public interface SysOssSqlMapper {

	public Integer getSysOssCount();

    public List<SysOss> getSysOssList(Map<String, Object> paramMap);

    public SysOss selectOne(Map<String, Object> paramMap);
}
