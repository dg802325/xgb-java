package ${mapperPackage};

import ${modelPackage}.${modelName};
import java.util.List;
import java.util.Map;


/**
* @Auther: ${author}
* @Date: ${date}
* @Description:
*/
public interface ${modelName}SqlMapper {

	public Integer get${modelName}Count();

    public List<${modelName}> get${modelName}List(Map<String,Object> paramMap);

    public ${modelName} selectOne(Map<String,Object> paramMap);
}
