package com.xgb.service;

import com.xgb.dao.ReptileCarMapper;
import com.xgb.model.ReptileCar;
import com.xgb.model.ReptileCarExample;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
* @Auther: Mr Deng
* @Date: 2019-09-08 00:29:04
* @Description:
*/
@Transactional(readOnly=true)
@Service
public class ReptileCarService {

	@Autowired
    private ReptileCarMapper reptileCarMapper;

    public List<ReptileCar> selectAllReptileCar(ReptileCar reptileCar,Integer begin,Integer end){
        ReptileCarExample reptileCarExample = new ReptileCarExample();
        reptileCarExample.createCriteria();
        reptileCarExample.setOrderByClause("CREATE_TIME DESC LIMIT "+begin+", "+end);
        List<ReptileCar> reptileCars = reptileCarMapper.selectByExample(reptileCarExample);
        return reptileCars;
    }

    public ReptileCar selectByPrimaryKey(String id) {
        return reptileCarMapper.selectByPrimaryKey(id);
    }

    public List<ReptileCar> selectByExample(ReptileCarExample example) {
        return reptileCarMapper.selectByExample(example);
    }

    @Transactional
    public int insert(ReptileCar reptileCar) {
        return reptileCarMapper.insert(reptileCar);
    }

    @Transactional
    public int update(ReptileCar reptileCar) {
        return reptileCarMapper.updateByPrimaryKeySelective((reptileCar));
    }

    @Transactional
    public int delete(ReptileCar reptileCar) {
        return reptileCarMapper.deleteByPrimaryKey((reptileCar.getId()));
    }


}
