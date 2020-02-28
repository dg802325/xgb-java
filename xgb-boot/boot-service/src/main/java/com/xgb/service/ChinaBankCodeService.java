package com.xgb.service;

import com.xgb.model.ChinaBankCode;
import com.xgb.model.ChinaBankCodeExample;
import com.xgb.dao1.ChinaBankCodeMapper;

import java.util.List;

import com.xgb.util.MyTools;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
* @Auther: xgb
* @Date: 2019-10-10 09:21:01
* @Description:
*/
@Transactional(readOnly=true)
@Service
public class ChinaBankCodeService {

	@Autowired
    private ChinaBankCodeMapper chinaBankCodeMapper;

    public List<ChinaBankCode> selectAllChinaBankCode(ChinaBankCode chinaBankCode,Integer begin,Integer end){
        ChinaBankCodeExample chinaBankCodeExample = new ChinaBankCodeExample();
        ChinaBankCodeExample.Criteria criteria = chinaBankCodeExample.createCriteria();
        if (MyTools.isNotEmpty(chinaBankCode.getBankName())){
            criteria.andBankNameLike("%"+chinaBankCode.getBankName()+"%");
        }
        if(MyTools.isNotEmpty(chinaBankCode.getBankCode())){
            criteria.andBankCodeLike("%"+chinaBankCode.getBankCode()+"%");
        }
        chinaBankCodeExample.setOrderByClause("CREATE_TIME DESC LIMIT "+begin+", "+end);
        List<ChinaBankCode> chinaBankCodes = chinaBankCodeMapper.selectByExample(chinaBankCodeExample);
        return chinaBankCodes;
    }

    public ChinaBankCode selectByPrimaryKey(String id) {
        return chinaBankCodeMapper.selectByPrimaryKey(id);
    }

    public List<ChinaBankCode> selectByExample(ChinaBankCodeExample example) {
        return chinaBankCodeMapper.selectByExample(example);
    }

    @Transactional
    public int insert(ChinaBankCode chinaBankCode) {
        return chinaBankCodeMapper.insert(chinaBankCode);
    }

    @Transactional
    public int update(ChinaBankCode chinaBankCode) {
        return chinaBankCodeMapper.updateByPrimaryKeySelective((chinaBankCode));
    }

    @Transactional
    public int deleteByPrimaryKey(String id) {
        return chinaBankCodeMapper.deleteByPrimaryKey(id);
    }

    public String getBankNameByBankCode(String bank) {
        ChinaBankCodeExample example = new ChinaBankCodeExample();
        example.createCriteria().andBankCodeEqualTo(bank);
        List<ChinaBankCode> chinaBankCodes = chinaBankCodeMapper.selectByExample(example);
        return chinaBankCodes.isEmpty()?null:chinaBankCodes.get(0).getBankName();
    }

    public int getAllChinaBankCodeCount(ChinaBankCode chinaBankCode) {
        ChinaBankCodeExample chinaBankCodeExample = new ChinaBankCodeExample();
        ChinaBankCodeExample.Criteria criteria = chinaBankCodeExample.createCriteria();
        if (MyTools.isNotEmpty(chinaBankCode.getBankName())){
            criteria.andBankNameLike("%"+chinaBankCode.getBankName()+"%");
        }
        if(MyTools.isNotEmpty(chinaBankCode.getBankCode())){
            criteria.andBankCodeLike("%"+chinaBankCode.getBankCode()+"%");
        }
        return chinaBankCodeMapper.countByExample(chinaBankCodeExample);
    }
}
