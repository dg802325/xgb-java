package com.xgb.dao;

import com.xgb.model.FormConsultationCase;
import com.xgb.model.FormConsultationCaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FormConsultationCaseMapper {
    int countByExample(FormConsultationCaseExample example);

    int deleteByExample(FormConsultationCaseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FormConsultationCase record);

    int insertSelective(FormConsultationCase record);

    List<FormConsultationCase> selectByExample(FormConsultationCaseExample example);

    FormConsultationCase selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FormConsultationCase record, @Param("example") FormConsultationCaseExample example);

    int updateByExample(@Param("record") FormConsultationCase record, @Param("example") FormConsultationCaseExample example);

    int updateByPrimaryKeySelective(FormConsultationCase record);

    int updateByPrimaryKey(FormConsultationCase record);
}