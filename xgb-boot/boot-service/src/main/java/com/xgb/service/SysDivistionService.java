package com.xgb.service;

import com.xgb.dao.BbiChinaDivisionMapper;
import com.xgb.dao.SysChinaDivisionMapper;
import com.xgb.dao.SysDivistionMapper;
import com.xgb.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SysDivistionService {

    @Autowired
    private SysDivistionMapper sysDivistionMapper;

    @Autowired
    private BbiChinaDivisionMapper bbiChinaDivisionMapper;
    @Autowired
    private SysChinaDivisionMapper sysChinaDivisionMapper;


    public List<SysDivistion> getSysDivistionList(){
        return sysDivistionMapper.selectByExample(new SysDivistionExample());
    }

    @Transactional
    public int insert(BbiChinaDivision bbiChinaDivision){
        return bbiChinaDivisionMapper.insert(bbiChinaDivision);
    }

    @Transactional
    public int update(SysDivistion sysDivistion){
        return sysDivistionMapper.updateByPrimaryKey(sysDivistion);
    }



    public List<SysChinaDivision> selectSysByExample(SysChinaDivisionExample example){
        return sysChinaDivisionMapper.selectByExample(example);
    }

    public List<BbiChinaDivision> selectBbiByExample(BbiChinaDivisionExample example){
        return bbiChinaDivisionMapper.selectByExample(example);
    }

    @Transactional
    public int updateSysChinaDivision(SysChinaDivision sysChinaDivision,SysChinaDivisionExample sysChinaDivisionExample){
       return sysChinaDivisionMapper.updateByExampleSelective(sysChinaDivision,sysChinaDivisionExample);
    }
}
