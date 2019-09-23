package com.xgb.service;

import com.xgb.dao.BlogGardenResourceMapper;
import com.xgb.model.BlogGarden;
import com.xgb.model.BlogGardenExample;
import com.xgb.dao.BlogGardenMapper;

import java.util.List;

import com.xgb.model.BlogGardenResource;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.apache.ibatis.annotations.Param;

/**
* @Auther: Mr Deng
* @Date: 2019-09-11 11:44:18
* @Description:
*/
@Transactional(readOnly=true)
@Service
public class BlogGardenService {

	@Autowired
    private BlogGardenMapper blogGardenMapper;
	@Autowired
    private BlogGardenResourceMapper blogGardenResourceMapper;

    public List<BlogGarden> selectAllBlogGarden(BlogGarden blogGarden,Integer begin,Integer end){
        BlogGardenExample blogGardenExample = new BlogGardenExample();
        blogGardenExample.createCriteria();
        blogGardenExample.setOrderByClause("CREATE_TIME DESC LIMIT "+begin+", "+end);
        List<BlogGarden> blogGardens = blogGardenMapper.selectByExample(blogGardenExample);
        return blogGardens;
    }

    public BlogGarden selectByPrimaryKey(String id) {
        return blogGardenMapper.selectByPrimaryKey(id);
    }

    public List<BlogGarden> selectByExample(BlogGardenExample example) {
        return blogGardenMapper.selectByExample(example);
    }

    @Transactional
    public int insert(BlogGarden blogGarden) {
        return blogGardenMapper.insert(blogGarden);
    }

    @Transactional
    public int update(BlogGarden blogGarden) {
        return blogGardenMapper.updateByPrimaryKeySelective((blogGarden));
    }

    @Transactional
    public int deleteByPrimaryKey(String id) {
        return blogGardenMapper.deleteByPrimaryKey(id);
    }

    @Transactional
    public int insertBlogAndResouce(BlogGarden blogGarden, BlogGardenResource blogGardenResource) {
        blogGardenMapper.insert(blogGarden);
        return blogGardenResourceMapper.insert(blogGardenResource);
    }
}
