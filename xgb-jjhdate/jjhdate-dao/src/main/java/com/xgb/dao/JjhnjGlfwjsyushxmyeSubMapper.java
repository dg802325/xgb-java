package com.xgb.dao;

import com.xgb.model.JjhnjGlfwjsyushxmyeSub;
import com.xgb.model.JjhnjGlfwjsyushxmyeSubExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JjhnjGlfwjsyushxmyeSubMapper {
    int countByExample(JjhnjGlfwjsyushxmyeSubExample example);

    int deleteByExample(JjhnjGlfwjsyushxmyeSubExample example);

    int deleteByPrimaryKey(Long id);

    int insert(JjhnjGlfwjsyushxmyeSub record);

    int insertSelective(JjhnjGlfwjsyushxmyeSub record);

    List<JjhnjGlfwjsyushxmyeSub> selectByExample(JjhnjGlfwjsyushxmyeSubExample example);

    JjhnjGlfwjsyushxmyeSub selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") JjhnjGlfwjsyushxmyeSub record, @Param("example") JjhnjGlfwjsyushxmyeSubExample example);

    int updateByExample(@Param("record") JjhnjGlfwjsyushxmyeSub record, @Param("example") JjhnjGlfwjsyushxmyeSubExample example);

    int updateByPrimaryKeySelective(JjhnjGlfwjsyushxmyeSub record);

    int updateByPrimaryKey(JjhnjGlfwjsyushxmyeSub record);
}