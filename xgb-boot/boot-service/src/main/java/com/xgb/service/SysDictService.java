package com.xgb.service;

import com.xgb.dao.SysDictMapper;
import com.xgb.model.SysDict;
import com.xgb.model.SysDictExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
@Service
public class SysDictService {

	@Autowired
    private SysDictMapper sysDictMapper;
    
            public long countByExample(SysDictExample example){
                return sysDictMapper.countByExample(example);
            }

            public int deleteByExample(SysDictExample example){
                return sysDictMapper.deleteByExample(example);
            }

            public int deleteByPrimaryKey(String id){
                return sysDictMapper.deleteByPrimaryKey(id);
            }

            public int insert(SysDict record){
                return sysDictMapper.insert(record);
            }

            public int insertSelective(SysDict record){
                return sysDictMapper.insertSelective(record);
            }

            public List<SysDict> selectByExample(SysDictExample example){
                return sysDictMapper.selectByExample(example);
            }

            public SysDict selectByPrimaryKey(String id){
                return sysDictMapper.selectByPrimaryKey(id);
            }

            public int updateByExampleSelective(@Param("record") SysDict record, @Param("example") SysDictExample example){
                return sysDictMapper.updateByExampleSelective(record,example);
            }

            public int updateByExample(@Param("record") SysDict record, @Param("example") SysDictExample example){
                return sysDictMapper.updateByExample(record,example);
            }

            public int updateByPrimaryKeySelective(SysDict record){
                return sysDictMapper.updateByPrimaryKeySelective(record);
            }

            public int updateByPrimaryKey(SysDict record){
                return sysDictMapper.updateByPrimaryKey(record);
            }

}
