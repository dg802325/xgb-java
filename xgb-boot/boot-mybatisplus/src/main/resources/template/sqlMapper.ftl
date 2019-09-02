package ${mapperPackage};

import ${modelPackage}.${modelNameUpperCamel};
import java.util.List;
import java.util.Map;


/**
 *
 * Created by ${author} on ${date}.
 */
public interface ${modelNameUpperCamel}SqlMapper {

	public Integer get${modelNameUpperCamel}Count();

    public List<${modelNameUpperCamel}> get${modelNameUpperCamel}List(Map<String,Object> paramMap);

    public ${modelNameUpperCamel} selectOne(Map<String,Object> paramMap);
}
