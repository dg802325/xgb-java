package com.xgb.service;

import com.xgb.dao1.SysChinaDivisionMapper;
import com.xgb.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SysChinaDivistionService {

    @Autowired
    private SysChinaDivisionMapper sysChinaDivisionMapper;

    @Transactional
    public int insert(SysChinaDivision sysChinaDivision){
        return sysChinaDivisionMapper.insert(sysChinaDivision);
    }

    @Transactional
    public int update(SysChinaDivision sysDivistion){
        return sysChinaDivisionMapper.updateByPrimaryKeySelective(sysDivistion);
    }

    public SysChinaDivision selectByPrimaryKey(String id){
        return sysChinaDivisionMapper.selectByPrimaryKey(id);
    }



    public List<SysChinaDivision> selectSysByExample(SysChinaDivisionExample example){
        return sysChinaDivisionMapper.selectByExample(example);
    }

    @Transactional
    public int updateSysChinaDivision(SysChinaDivision sysChinaDivision,SysChinaDivisionExample sysChinaDivisionExample){
       return sysChinaDivisionMapper.updateByExampleSelective(sysChinaDivision,sysChinaDivisionExample);
    }
}
