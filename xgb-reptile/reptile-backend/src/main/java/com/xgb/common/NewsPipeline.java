package com.xgb.common;

import org.springframework.stereotype.Repository;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * info:新闻
 * Created by shang on 16/8/22.
 */
@Repository
public class NewsPipeline implements Pipeline {

//    @Autowired
//    protected NewsRepository newsRepository;

    @Override
    public void process(ResultItems resultItems, Task task) {
        for (Map.Entry<String, Object> entry : resultItems.getAll().entrySet()) {
            if (entry.getKey().contains("news")) {
//                News news=(News) entry.getValue();
//                Specification<News> specification=new Specification<News>() {
//                    @Override
//                    public Predicate toPredicate(Root<News> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
//                        return criteriaBuilder.and(criteriaBuilder.equal(root.get("link"),news.getLink()));
//                    }
//                };
//                if (newsRepository.findOne(specification) == null) {//检查链接是否已存在
//                    news.setAuthor("水花");
//                    news.setTypeId(1);
//                    news.setSort(1);
//                    news.setStatus(1);
//                    news.setExplicitLink(true);
//                    news.setCreateDate(new Date());
//                    news.setModifyDate(new Date());
//                    newsRepository.save(news);
//                }
            }

        }
    }
}