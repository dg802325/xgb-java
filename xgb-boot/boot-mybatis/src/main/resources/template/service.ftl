package ${servicePackage!};

import ${modelPackage!}.${modelName!};
import ${modelPackage!}.${modelName!}Example;
import ${mapperPackage!}.${modelName!}Mapper;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.apache.ibatis.annotations.Param;

/**
* @Auther: ${author!}
* @Date: ${date!}
* @Description:
*/
@Transactional(readOnly=true)
@Service
public class ${modelName!}Service {

	@Autowired
    private ${modelName!}Mapper ${someModelName!}Mapper;

    public List<${modelName!}> selectAll${modelName!}(${modelName!} ${someModelName!},String begin,String end){
        ${modelName!}Example ${someModelName!}Example = new ${modelName!}Example();
        ${someModelName!}Example.createCriteria();
        ${someModelName!}Example.setOrderByClause("CREATE_TIME DESC LIMIT "+begin+", "+end);
        List<${modelName!}> ${someModelName!}s = ${someModelName!}Mapper.selectByExample(${someModelName!}Example);
        return ${someModelName!}s;
    }

    public ${modelName!} selectByPrimaryKey(String id) {
        return ${someModelName!}Mapper.selectByPrimaryKey(id);
    }

    public List<${modelName!}> selectByExample(${modelName!}Example example) {
        return ${someModelName!}Mapper.selectByExample(example);
    }

    @Transactional
    public int insert(${modelName!} ${someModelName!}) {
        return ${someModelName!}Mapper.insert(${someModelName!});
    }

    @Transactional
    public int update(${modelName!} ${someModelName!}) {
        return ${someModelName!}Mapper.updateByPrimaryKeySelective((${someModelName!}));
    }

    @Transactional
    public int delete(${modelName!} ${someModelName!}) {
        return ${someModelName!}Mapper.deleteByPrimaryKey((${someModelName!}.getId()));
    }


}
