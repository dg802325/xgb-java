package com.xgb.service;

import com.xgb.model.BlogClass;
import com.xgb.model.BlogClassExample;
import com.xgb.dao1.BlogClassMapper;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
* @Auther: Mr Deng
* @Date: 2019-09-21 10:21:37
* @Description:
*/
@Transactional(readOnly=true)
@Service
public class BlogClassService {

	@Autowired
    private BlogClassMapper blogClassMapper;


    public BlogClass selectByPrimaryKey(String id) {
        return blogClassMapper.selectByPrimaryKey(id);
    }

    public List<BlogClass> selectByExample(BlogClassExample example) {
        return blogClassMapper.selectByExample(example);
    }

    @Transactional
    public int insert(BlogClass blogClass) {
        return blogClassMapper.insert(blogClass);
    }

    @Transactional
    public int update(BlogClass blogClass) {
        return blogClassMapper.updateByPrimaryKeySelective((blogClass));
    }

    @Transactional
    public int deleteByPrimaryKey(String id) {
        return blogClassMapper.deleteByPrimaryKey(id);
    }

    public int getCount() {
        BlogClassExample blogClassExample = new BlogClassExample();
        blogClassExample.createCriteria().andStatusEqualTo("0");
        return blogClassMapper.countByExample(blogClassExample);
    }
}
