package com.xgb.dao;

import com.xgb.model.StNjReprot140Sub;
import com.xgb.model.StNjReprot140SubExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StNjReprot140SubMapper {
    int countByExample(StNjReprot140SubExample example);

    int deleteByExample(StNjReprot140SubExample example);

    int deleteByPrimaryKey(Long id);

    int insert(StNjReprot140Sub record);

    int insertSelective(StNjReprot140Sub record);

    List<StNjReprot140Sub> selectByExample(StNjReprot140SubExample example);

    StNjReprot140Sub selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") StNjReprot140Sub record, @Param("example") StNjReprot140SubExample example);

    int updateByExample(@Param("record") StNjReprot140Sub record, @Param("example") StNjReprot140SubExample example);

    int updateByPrimaryKeySelective(StNjReprot140Sub record);

    int updateByPrimaryKey(StNjReprot140Sub record);
}