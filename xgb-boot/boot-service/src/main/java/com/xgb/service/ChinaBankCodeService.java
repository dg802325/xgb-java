package com.xgb.service;

import com.xgb.dao.BlogClassMapper;
import com.xgb.dao.ChinaBankCodeMapper;
import com.xgb.model.BlogClass;
import com.xgb.model.BlogClassExample;
import com.xgb.model.ChinaBankCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
* @Auther: Mr Deng
* @Date: 2019-09-21 10:21:37
* @Description:
*/
@Transactional(readOnly=true)
@Service
public class ChinaBankCodeService {

	@Autowired
    private ChinaBankCodeMapper chinaBankCodeMapper;

	@Transactional
    public int insert(ChinaBankCode chinaBankCode){
	    return chinaBankCodeMapper.insert(chinaBankCode);
    }

}