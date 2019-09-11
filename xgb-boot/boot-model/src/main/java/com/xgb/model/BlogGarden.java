package com.xgb.model;

import java.util.Date;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
* @Auther: Mr Deng
* @Date: 2019-09-11 11:44:18
* @Description:
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BlogGarden {

    private String id;
    private String blogTaitl;
    private String blogAbout;
    private int volume;
    private int support;
    private int opposition;
    private String classificationId;
    private String status;
    private String createId;
    private String updateId;
    private Date createTime;
    private Date updateTime;
    private String keyWord;


    public String getId (){
        return id;
    }
    public String setId (String id){
        return this.id = id;
    }
    public String getBlogTaitl (){
        return blogTaitl;
    }
    public String setBlogTaitl (String blogTaitl){
        return this.blogTaitl = blogTaitl;
    }
    public String getBlogAbout (){
        return blogAbout;
    }
    public String setBlogAbout (String blogAbout){
        return this.blogAbout = blogAbout;
    }
    public int getVolume (){
        return volume;
    }
    public int setVolume (int volume){
        return this.volume = volume;
    }
    public int getSupport (){
        return support;
    }
    public int setSupport (int support){
        return this.support = support;
    }
    public int getOpposition (){
        return opposition;
    }
    public int setOpposition (int opposition){
        return this.opposition = opposition;
    }
    public String getClassificationId (){
        return classificationId;
    }
    public String setClassificationId (String classificationId){
        return this.classificationId = classificationId;
    }
    public String getStatus (){
        return status;
    }
    public String setStatus (String status){
        return this.status = status;
    }
    public String getCreateId (){
        return createId;
    }
    public String setCreateId (String createId){
        return this.createId = createId;
    }
    public String getUpdateId (){
        return updateId;
    }
    public String setUpdateId (String updateId){
        return this.updateId = updateId;
    }
    public Date getCreateTime (){
        return createTime;
    }
    public Date setCreateTime (Date createTime){
        return this.createTime = createTime;
    }
    public Date getUpdateTime (){
        return updateTime;
    }
    public Date setUpdateTime (Date updateTime){
        return this.updateTime = updateTime;
    }
    public String getKeyWord (){
        return keyWord;
    }
    public String setKeyWord (String keyWord){
        return this.keyWord = keyWord;
    }

}
