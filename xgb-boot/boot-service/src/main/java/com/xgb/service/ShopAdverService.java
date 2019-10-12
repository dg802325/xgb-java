package com.xgb.service;

import com.xgb.model.ShopAdver;
import com.xgb.model.ShopAdverExample;
import com.xgb.dao.ShopAdverMapper;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.apache.ibatis.annotations.Param;

/**
* @Auther: xgb
* @Date: 2019-10-12 15:29:39
* @Description:
*/
@Transactional(readOnly=true)
@Service
public class ShopAdverService {

	@Autowired
    private ShopAdverMapper shopAdverMapper;

    public List<ShopAdver> selectAllShopAdver(ShopAdver shopAdver,Integer begin,Integer end){
        ShopAdverExample shopAdverExample = new ShopAdverExample();
        shopAdverExample.createCriteria();
        shopAdverExample.setOrderByClause("CREATE_TIME DESC LIMIT "+begin+", "+end);
        List<ShopAdver> shopAdvers = shopAdverMapper.selectByExample(shopAdverExample);
        return shopAdvers;
    }

    public ShopAdver selectByPrimaryKey(String id) {
        return shopAdverMapper.selectByPrimaryKey(id);
    }

    public List<ShopAdver> selectByExample(ShopAdverExample example) {
        return shopAdverMapper.selectByExample(example);
    }

    @Transactional
    public int insert(ShopAdver shopAdver) {
        return shopAdverMapper.insert(shopAdver);
    }

    @Transactional
    public int update(ShopAdver shopAdver) {
        return shopAdverMapper.updateByPrimaryKeySelective((shopAdver));
    }

    @Transactional
    public int deleteByPrimaryKey(String id) {
        return shopAdverMapper.deleteByPrimaryKey(id);
    }

}
