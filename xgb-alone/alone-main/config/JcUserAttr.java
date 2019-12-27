package ;

import java.util.Date;
import java.math.BigDecimal;

/**
* @Auther: 
* @Date: 2019年12月27日 15:09:11
* @Description:
*/
public class JcUserAttr {

    private Integer userId;
    private String attrName;
    private String attrValue;


    public Integer getUserId (){
        return userId;
    }
    public Integer setUserId (Integer userId){
        return this.userId = userId;
    }
    public String getAttrName (){
        return attrName;
    }
    public String setAttrName (String attrName){
        return this.attrName = attrName;
    }
    public String getAttrValue (){
        return attrValue;
    }
    public String setAttrValue (String attrValue){
        return this.attrValue = attrValue;
    }

}

insert into jc_user_attr(attr_name,attr_value,) value(?,?,);
