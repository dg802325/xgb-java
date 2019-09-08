package com.xgb.model;

import java.util.Date;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
* @Auther: Mr Deng
* @Date: 2019-09-08 00:22:23
* @Description:
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ReptileCar {

    private String id;
    private String title;
    private String carSpeed;
    private String carBrake;
    private String carOil;
    private String editorName1;
    private String editorRemark1;
    private String editorName2;
    private String editorRemark2;
    private String editName3;
    private String editorRemark3;
    private String image;
    private Date createTime;
    private Date updateTime;
    private String createId;
    private String status;
    private String updateId;


    public String getId (){
        return id;
    }
    public String setId (String id){
        return this.id = id;
    }
    public String getTitle (){
        return title;
    }
    public String setTitle (String title){
        return this.title = title;
    }
    public String getCarSpeed (){
        return carSpeed;
    }
    public String setCarSpeed (String carSpeed){
        return this.carSpeed = carSpeed;
    }
    public String getCarBrake (){
        return carBrake;
    }
    public String setCarBrake (String carBrake){
        return this.carBrake = carBrake;
    }
    public String getCarOil (){
        return carOil;
    }
    public String setCarOil (String carOil){
        return this.carOil = carOil;
    }
    public String getEditorName1 (){
        return editorName1;
    }
    public String setEditorName1 (String editorName1){
        return this.editorName1 = editorName1;
    }
    public String getEditorRemark1 (){
        return editorRemark1;
    }
    public String setEditorRemark1 (String editorRemark1){
        return this.editorRemark1 = editorRemark1;
    }
    public String getEditorName2 (){
        return editorName2;
    }
    public String setEditorName2 (String editorName2){
        return this.editorName2 = editorName2;
    }
    public String getEditorRemark2 (){
        return editorRemark2;
    }
    public String setEditorRemark2 (String editorRemark2){
        return this.editorRemark2 = editorRemark2;
    }
    public String getEditName3 (){
        return editName3;
    }
    public String setEditName3 (String editName3){
        return this.editName3 = editName3;
    }
    public String getEditorRemark3 (){
        return editorRemark3;
    }
    public String setEditorRemark3 (String editorRemark3){
        return this.editorRemark3 = editorRemark3;
    }
    public String getImage (){
        return image;
    }
    public String setImage (String image){
        return this.image = image;
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
    public String getCreateId (){
        return createId;
    }
    public String setCreateId (String createId){
        return this.createId = createId;
    }
    public String getStatus (){
        return status;
    }
    public String setStatus (String status){
        return this.status = status;
    }
    public String getUpdateId (){
        return updateId;
    }
    public String setUpdateId (String updateId){
        return this.updateId = updateId;
    }

}
