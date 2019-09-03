package com.xgb.mybatis.service;

import com.xgb.model.Generator;
import com.xgb.model.SysDatabases;
import com.xgb.model.TableInformation;

import java.util.List;

/**
 * 主要逻辑接口
 * Created by xgb on 2019/07/26.
 */
public interface CodeGenerator {
	
	/**
	 * 代码生成主要逻辑
	 */
	void genCode(List<TableInformation> tableInformation, Generator generator, SysDatabases sysDatabases);
}
