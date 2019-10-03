package com.xgb.service;

import com.xgb.dao.SysDictMapper;
import com.xgb.model.SysDict;
import com.xgb.model.SysDictExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */

@Service
@Transactional(readOnly=true)
public class SysDictService {

	@Autowired
    private SysDictMapper sysDictMapper;
    
    public int countByExample(SysDictExample example){
        return sysDictMapper.countByExample(example);
    }

    public int deleteByExample(SysDictExample example){
        return sysDictMapper.deleteByExample(example);
    }

    public int deleteByPrimaryKey(String id){
        return sysDictMapper.deleteByPrimaryKey(id);
    }
    @Transactional
    public int deleteSysDictById(String id){
        SysDict sysDict = sysDictMapper.selectByPrimaryKey(id);
        if(sysDict.getDictType().equals("0")){
            SysDictExample example = new SysDictExample();
            example.createCriteria().andParentIdEqualTo(sysDict.getId());
            List<SysDict> sysDicts = sysDictMapper.selectByExample(example);
            for (SysDict dict : sysDicts) {
                sysDictMapper.deleteByPrimaryKey(dict.getId());
            }
            return sysDictMapper.deleteByPrimaryKey(id);
        }else if(sysDict.getDictType().equals("1")){
            return sysDictMapper.deleteByPrimaryKey(sysDict.getId());
        }
        return 0;
    }

    @Transactional
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

    @Transactional
    public int updateByPrimaryKeySelective(SysDict record){
        return sysDictMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(SysDict record){
            return sysDictMapper.updateByPrimaryKey(record);
            }

}
