package ${mapperPackage};

import ${modelPackage}.${modelName};
import java.util.List;


/**
* @Auther: ${author}
* @Date: ${date}
* @Description:
*/
public interface ${modelName}Mapper {

    int countByExample(${modelName}Example example);

    int deleteByExample(${modelName}Example example);

    int deleteByPrimaryKey(String id);

    int insert(${modelName} record);

    int insertSelective( ${modelName} record);

    List<${modelName}> selectByExample( ${modelName}Example example);

    ${modelName} selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record")  ${modelName} record, @Param("example")  ${modelName}Example example);

    int updateByExample(@Param("record")  ${modelName} record, @Param("example")  ${modelName}Example example);

    int updateByPrimaryKeySelective( ${modelName} record);

    int updateByPrimaryKey( ${modelName} record);
}
