package ${modelPackage!};

<#if isDatetime??||isDate?? >
import java.util.Date;
</#if>
<#if isDatetime??>
import java.math.BigDecimal;
</#if>

/**
* @Auther: ${author!}
* @Date: ${date!}
* @Description:
*/
public class ${modelName!} {

    ${codeEntity!}
}

<#if insert??>
${insert!}
</#if>