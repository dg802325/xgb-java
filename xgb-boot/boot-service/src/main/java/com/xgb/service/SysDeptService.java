package com.xgb.service;

import com.xgb.dao.SysDeptMapper;
import com.xgb.model.SysDept;
import com.xgb.model.SysDeptExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
@Service
public class SysDeptService {

	@Autowired
    private SysDeptMapper sysDeptMapper;
    
            public long countByExample(SysDeptExample example){
                return sysDeptMapper.countByExample(example);
            }

            public int deleteByExample(SysDeptExample example){
                return sysDeptMapper.deleteByExample(example);
            }

            public int deleteByPrimaryKey(String id){
                return sysDeptMapper.deleteByPrimaryKey(id);
            }

            public int insert(SysDept record){
                return sysDeptMapper.insert(record);
            }

            public int insertSelective(SysDept record){
                return sysDeptMapper.insertSelective(record);
            }

            public List<SysDept> selectByExample(SysDeptExample example){
                return sysDeptMapper.selectByExample(example);
            }

            public SysDept selectByPrimaryKey(String id){
                return sysDeptMapper.selectByPrimaryKey(id);
            }

            public int updateByExampleSelective(@Param("record") SysDept record, @Param("example") SysDeptExample example){
                return sysDeptMapper.updateByExampleSelective(record,example);
            }

            public int updateByExample(@Param("record") SysDept record, @Param("example") SysDeptExample example){
                return sysDeptMapper.updateByExample(record,example);
            }

            public int updateByPrimaryKeySelective(SysDept record){
                return sysDeptMapper.updateByPrimaryKeySelective(record);
            }

            public int updateByPrimaryKey(SysDept record){
                return sysDeptMapper.updateByPrimaryKey(record);
            }

}
