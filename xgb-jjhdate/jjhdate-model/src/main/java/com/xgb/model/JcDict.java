package com.xgb.model;

/**
 * @Auther:
 * @Date: 2019年12月27日 14:26:21
 * @Description:
 */
public class JcDict {

    private Integer id;
    private String name;
    private Integer priority;
    private String value;
    private String description;
    private Integer type;
    private Integer parentId;


    public Integer getId (){
        return id;
    }
    public Integer setId (Integer id){
        return this.id = id;
    }
    public String getName (){
        return name;
    }
    public String setName (String name){
        return this.name = name;
    }
    public Integer getPriority (){
        return priority;
    }
    public Integer setPriority (Integer priority){
        return this.priority = priority;
    }
    public String getValue (){
        return value;
    }
    public String setValue (String value){
        return this.value = value;
    }
    public String getDescription (){
        return description;
    }
    public String setDescription (String description){
        return this.description = description;
    }
    public Integer getType (){
        return type;
    }
    public Integer setType (Integer type){
        return this.type = type;
    }
    public Integer getParentId (){
        return parentId;
    }
    public Integer setParentId (Integer parentId){
        return this.parentId = parentId;
    }

}