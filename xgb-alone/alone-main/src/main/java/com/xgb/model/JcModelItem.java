package com.xgb.model;

;

import java.util.Date;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
* @Auther: 
* @Date: 2019年12月23日 13:39:26
* @Description:
*/
public class JcModelItem {

    private Integer modelitemId;
    private Integer modelId;
    private String field;
    private String itemLabel;
    private Integer priority;
    private String defValue;
    private String optValue;
    private String textSize;
    private String areaRows;
    private String areaCols;
    private String help;
    private String helpPosition;
    private Integer dataType;
    private BigDecimal isSingle;
    private BigDecimal isChannel;
    private BigDecimal isCustom;
    private BigDecimal isDisplay;
    private BigDecimal isRequired;
    private Integer imageWidth;
    private Integer imageHeight;


    public Integer getModelitemId (){
        return modelitemId;
    }
    public Integer setModelitemId (Integer modelitemId){
        return this.modelitemId = modelitemId;
    }
    public Integer getModelId (){
        return modelId;
    }
    public Integer setModelId (Integer modelId){
        return this.modelId = modelId;
    }
    public String getField (){
        return field;
    }
    public String setField (String field){
        return this.field = field;
    }
    public String getItemLabel (){
        return itemLabel;
    }
    public String setItemLabel (String itemLabel){
        return this.itemLabel = itemLabel;
    }
    public Integer getPriority (){
        return priority;
    }
    public Integer setPriority (Integer priority){
        return this.priority = priority;
    }
    public String getDefValue (){
        return defValue;
    }
    public String setDefValue (String defValue){
        return this.defValue = defValue;
    }
    public String getOptValue (){
        return optValue;
    }
    public String setOptValue (String optValue){
        return this.optValue = optValue;
    }
    public String getTextSize (){
        return textSize;
    }
    public String setTextSize (String textSize){
        return this.textSize = textSize;
    }
    public String getAreaRows (){
        return areaRows;
    }
    public String setAreaRows (String areaRows){
        return this.areaRows = areaRows;
    }
    public String getAreaCols (){
        return areaCols;
    }
    public String setAreaCols (String areaCols){
        return this.areaCols = areaCols;
    }
    public String getHelp (){
        return help;
    }
    public String setHelp (String help){
        return this.help = help;
    }
    public String getHelpPosition (){
        return helpPosition;
    }
    public String setHelpPosition (String helpPosition){
        return this.helpPosition = helpPosition;
    }
    public Integer getDataType (){
        return dataType;
    }
    public Integer setDataType (Integer dataType){
        return this.dataType = dataType;
    }
    public BigDecimal getIsSingle (){
        return isSingle;
    }
    public BigDecimal setIsSingle (BigDecimal isSingle){
        return this.isSingle = isSingle;
    }
    public BigDecimal getIsChannel (){
        return isChannel;
    }
    public BigDecimal setIsChannel (BigDecimal isChannel){
        return this.isChannel = isChannel;
    }
    public BigDecimal getIsCustom (){
        return isCustom;
    }
    public BigDecimal setIsCustom (BigDecimal isCustom){
        return this.isCustom = isCustom;
    }
    public BigDecimal getIsDisplay (){
        return isDisplay;
    }
    public BigDecimal setIsDisplay (BigDecimal isDisplay){
        return this.isDisplay = isDisplay;
    }
    public BigDecimal getIsRequired (){
        return isRequired;
    }
    public BigDecimal setIsRequired (BigDecimal isRequired){
        return this.isRequired = isRequired;
    }
    public Integer getImageWidth (){
        return imageWidth;
    }
    public Integer setImageWidth (Integer imageWidth){
        return this.imageWidth = imageWidth;
    }
    public Integer getImageHeight (){
        return imageHeight;
    }
    public Integer setImageHeight (Integer imageHeight){
        return this.imageHeight = imageHeight;
    }

}
