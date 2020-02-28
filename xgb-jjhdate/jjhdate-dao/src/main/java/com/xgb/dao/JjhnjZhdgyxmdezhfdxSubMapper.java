package com.xgb.dao;

import com.xgb.model.JjhnjZhdgyxmdezhfdxSub;
import com.xgb.model.JjhnjZhdgyxmdezhfdxSubExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JjhnjZhdgyxmdezhfdxSubMapper {
    int countByExample(JjhnjZhdgyxmdezhfdxSubExample example);

    int deleteByExample(JjhnjZhdgyxmdezhfdxSubExample example);

    int insert(JjhnjZhdgyxmdezhfdxSub record);

    int insertSelective(JjhnjZhdgyxmdezhfdxSub record);

    List<JjhnjZhdgyxmdezhfdxSub> selectByExample(JjhnjZhdgyxmdezhfdxSubExample example);

    int updateByExampleSelective(@Param("record") JjhnjZhdgyxmdezhfdxSub record, @Param("example") JjhnjZhdgyxmdezhfdxSubExample example);

    int updateByExample(@Param("record") JjhnjZhdgyxmdezhfdxSub record, @Param("example") JjhnjZhdgyxmdezhfdxSubExample example);
}