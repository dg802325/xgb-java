package com.xgb.service;
/**
 * 主要逻辑接口
 * Created by xgb on 2019/07/26.
 */
public interface CodeGenerator {
	
	/**
	 * 代码生成主要逻辑
	 * @param tableName 表名
	 */
	void genCode(String tableName);
}
