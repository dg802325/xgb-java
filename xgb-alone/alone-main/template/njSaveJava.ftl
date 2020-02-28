package ${modelPackage!};

import com.xgb.model.JcContentAttr1;
import com.xgb.model.${modelName!};
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;
/**
* @Auther: ${author!}
* @Date: ${date!}
* @Description:
*/
public class Save${saveName!} {

    public static List<JcContentAttr1> getEntity(Integer contentId, ${modelName!} oldTable) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;
${codeEntity!}

        jc = null;

        return lists;
    }
}

${codeEntity2!}