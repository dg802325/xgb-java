package com.xgb.service;

import com.xgb.dao.*;
import com.xgb.model.*;
import com.xgb.utils.MyUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
@Transactional(readOnly=true)
@Service
public class SysDatabasesService {

	@Autowired
    private SysDatabasesMapper sysDatabasesMapper;

	public List<SysDatabases> getSysDatabasesByCreateId(String createId){
	    SysDatabasesExample sysDatabasesExample = new SysDatabasesExample();
	    sysDatabasesExample.createCriteria().andCreateIdEqualTo(createId);
	    return sysDatabasesMapper.selectByExample(sysDatabasesExample);
    }

    @Transactional
    public int insert(SysDatabases sysDatabases){
		return sysDatabasesMapper.insert(sysDatabases);
	}

	public List<SysDatabases> selectByExample(SysDatabasesExample sysDatabasesExample) {
		return sysDatabasesMapper.selectByExample(sysDatabasesExample);
	}

	public int getDatabaseCount() {
		return sysDatabasesMapper.countByExample(new SysDatabasesExample());
	}

	public SysDatabases selectByPrimaryKey(String id){
		return sysDatabasesMapper.selectByPrimaryKey(id);
	}

	@Transactional
	public int update(SysDatabases sysDatabases){
		return sysDatabasesMapper.updateByPrimaryKeySelective(sysDatabases);
	}

	@Transactional
	public int deleteByPrimaryKey(String id){
		return sysDatabasesMapper.deleteByPrimaryKey(id);
	}
}
