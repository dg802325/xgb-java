package ${modelPackage};

<#if isDatetime||isDate >
import java.util.Date;
</#if>
<#if isDatetime>
import java.math.BigDecimal;
</#if>
import com.fasterxml.jackson.annotation.JsonInclude;

/**
* @Auther: ${author}
* @Date: ${date}
* @Description:
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ${modelName} {

    ${codeEntity!}
}
