package com.xgb.service;

import com.xgb.dao.SysDivistionMapper;
import com.xgb.model.SysDivistion;
import com.xgb.model.SysDivistionExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SysDivistionService {

    @Autowired
    private SysDivistionMapper sysDivistionMapper;

    public List<SysDivistion> getSysDivistionList(){
        return sysDivistionMapper.selectByExample(new SysDivistionExample());
    }

    @Transactional
    public int update(SysDivistion sysDivistion){
        return sysDivistionMapper.updateByPrimaryKey(sysDivistion);
    }
}
