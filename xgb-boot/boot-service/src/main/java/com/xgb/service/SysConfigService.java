package com.xgb.service;

import com.xgb.dao1.SysConfigMapper;
import com.xgb.model.SysConfig;
import com.xgb.model.SysConfigExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
@Service
public class SysConfigService {

	@Autowired
    private SysConfigMapper sysConfigMapper;
    
    public long countByExample(SysConfigExample example){
        return sysConfigMapper.countByExample(example);
    }

    public int deleteByExample(SysConfigExample example){
        return sysConfigMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(String id){
        return sysConfigMapper.deleteByPrimaryKey(id);
    }

    public int insert(SysConfig record){
        return sysConfigMapper.insert(record);
    }

    public int insertSelective(SysConfig record){
        return sysConfigMapper.insertSelective(record);
    }

    public List<SysConfig> selectByExample(SysConfigExample example){
        return sysConfigMapper.selectByExample(example);
    }

    public SysConfig selectByPrimaryKey(String id){
        return sysConfigMapper.selectByPrimaryKey(id);
    }

    public int updateByExampleSelective(@Param("record") SysConfig record, @Param("example") SysConfigExample example){
        return sysConfigMapper.updateByExampleSelective(record,example);
    }

    public int updateByExample(@Param("record") SysConfig record, @Param("example") SysConfigExample example){
        return sysConfigMapper.updateByExample(record,example);
    }

    public int updateByPrimaryKeySelective(SysConfig record){
        return sysConfigMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(SysConfig record){
                return sysConfigMapper.updateByPrimaryKey(record);
            }

}
