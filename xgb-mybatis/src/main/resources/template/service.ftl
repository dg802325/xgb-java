package ${servicePackage};

import ${modelPackage}.${modelNameUpperCamel};
import ${modelPackage}.${modelNameUpperCamel}Example;
import ${mapperPackage}.${modelNameUpperCamel}Mapper;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import org.apache.ibatis.annotations.Param;

/**
 *
 * Created by ${author} on ${date}.
 */
@Service
public class ${modelNameUpperCamel}Service {

	@Autowired
    private ${modelNameUpperCamel}Mapper ${modelNameLowerCamel}Mapper;
    
<#list serviceMethodsList as serviceMethod>
    ${serviceMethod!''}
</#list>
}
