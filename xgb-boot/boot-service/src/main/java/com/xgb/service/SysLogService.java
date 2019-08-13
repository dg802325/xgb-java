package com.xgb.service;

import com.xgb.dao.SysLogMapper;
import com.xgb.model.SysLog;
import com.xgb.model.SysLogExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
@Service
public class SysLogService {

	@Autowired
    private SysLogMapper sysLogMapper;
    
            public long countByExample(SysLogExample example){
                return sysLogMapper.countByExample(example);
            }

            public int deleteByExample(SysLogExample example){
                return sysLogMapper.deleteByExample(example);
            }

            public int deleteByPrimaryKey(String id){
                return sysLogMapper.deleteByPrimaryKey(id);
            }

            public int insert(SysLog record){
                return sysLogMapper.insert(record);
            }

            public int insertSelective(SysLog record){
                return sysLogMapper.insertSelective(record);
            }

            public List<SysLog> selectByExample(SysLogExample example){
                return sysLogMapper.selectByExample(example);
            }

            public SysLog selectByPrimaryKey(String id){
                return sysLogMapper.selectByPrimaryKey(id);
            }

            public int updateByExampleSelective(@Param("record") SysLog record, @Param("example") SysLogExample example){
                return sysLogMapper.updateByExampleSelective(record,example);
            }

            public int updateByExample(@Param("record") SysLog record, @Param("example") SysLogExample example){
                return sysLogMapper.updateByExample(record,example);
            }

            public int updateByPrimaryKeySelective(SysLog record){
                return sysLogMapper.updateByPrimaryKeySelective(record);
            }

            public int updateByPrimaryKey(SysLog record){
                return sysLogMapper.updateByPrimaryKey(record);
            }

}
