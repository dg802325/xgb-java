package com.xgb.service;

import com.xgb.dao.SysOssMapper;
import com.xgb.model.SysOss;
import com.xgb.model.SysOssExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * Created by Mr Xgb on 2019/07/28.
 */
@Service
public class SysOssService {

	@Autowired
    private SysOssMapper sysOssMapper;
    
            public long countByExample(SysOssExample example){
                return sysOssMapper.countByExample(example);
            }

            public int deleteByExample(SysOssExample example){
                return sysOssMapper.deleteByExample(example);
            }

            public int deleteByPrimaryKey(String id){
                return sysOssMapper.deleteByPrimaryKey(id);
            }

            public int insert(SysOss record){
                return sysOssMapper.insert(record);
            }

            public int insertSelective(SysOss record){
                return sysOssMapper.insertSelective(record);
            }

            public List<SysOss> selectByExample(SysOssExample example){
                return sysOssMapper.selectByExample(example);
            }

            public SysOss selectByPrimaryKey(String id){
                return sysOssMapper.selectByPrimaryKey(id);
            }

            public int updateByExampleSelective(@Param("record") SysOss record, @Param("example") SysOssExample example){
                return sysOssMapper.updateByExampleSelective(record,example);
            }

            public int updateByExample(@Param("record") SysOss record, @Param("example") SysOssExample example){
                return sysOssMapper.updateByExample(record,example);
            }

            public int updateByPrimaryKeySelective(SysOss record){
                return sysOssMapper.updateByPrimaryKeySelective(record);
            }

            public int updateByPrimaryKey(SysOss record){
                return sysOssMapper.updateByPrimaryKey(record);
            }

}
