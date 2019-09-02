package ${modelPackage};

<#if isDatetime||isDate >
import java.util.Date;
</#if>
<#if isDatetime>
import java.math.BigDecimal;
</#if>
/**
 *
 * Created by ${author} on ${date}.
 */
public class ${modelName} {

    ${codeEntity!}
}
