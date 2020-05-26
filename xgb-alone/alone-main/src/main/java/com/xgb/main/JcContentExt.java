package com.xgb.main;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Auther:
 * @Date: 2019年12月23日 11:15:46
 * @Description:
 */
public class JcContentExt {

    private Integer contentId;
    private String title;
    private String shortTitle;
    private String author;
    private String origin;
    private String originUrl;
    private String description;
    private String mediaPath;
    private String mediaType;
    private String titleColor;
    private BigDecimal isBold;
    private String titleImg;
    private String contentImg;
    private String typeImg;
    private String link;
    private String tplContent;
    private BigDecimal needRegenerate;
    private String tplMobileContent;
    private Date toplevelDate;
    private Date pigeonholeDate;
    private Date releaseDate;


    public Integer getContentId (){
        return contentId;
    }
    public Integer setContentId (Integer contentId){
        return this.contentId = contentId;
    }
    public String getTitle (){
        return title;
    }
    public String setTitle (String title){
        return this.title = title;
    }
    public String getShortTitle (){
        return shortTitle;
    }
    public String setShortTitle (String shortTitle){
        return this.shortTitle = shortTitle;
    }
    public String getAuthor (){
        return author;
    }
    public String setAuthor (String author){
        return this.author = author;
    }
    public String getOrigin (){
        return origin;
    }
    public String setOrigin (String origin){
        return this.origin = origin;
    }
    public String getOriginUrl (){
        return originUrl;
    }
    public String setOriginUrl (String originUrl){
        return this.originUrl = originUrl;
    }
    public String getDescription (){
        return description;
    }
    public String setDescription (String description){
        return this.description = description;
    }
    public String getMediaPath (){
        return mediaPath;
    }
    public String setMediaPath (String mediaPath){
        return this.mediaPath = mediaPath;
    }
    public String getMediaType (){
        return mediaType;
    }
    public String setMediaType (String mediaType){
        return this.mediaType = mediaType;
    }
    public String getTitleColor (){
        return titleColor;
    }
    public String setTitleColor (String titleColor){
        return this.titleColor = titleColor;
    }
    public BigDecimal getIsBold (){
        return isBold;
    }
    public BigDecimal setIsBold (BigDecimal isBold){
        return this.isBold = isBold;
    }
    public String getTitleImg (){
        return titleImg;
    }
    public String setTitleImg (String titleImg){
        return this.titleImg = titleImg;
    }
    public String getContentImg (){
        return contentImg;
    }
    public String setContentImg (String contentImg){
        return this.contentImg = contentImg;
    }
    public String getTypeImg (){
        return typeImg;
    }
    public String setTypeImg (String typeImg){
        return this.typeImg = typeImg;
    }
    public String getLink (){
        return link;
    }
    public String setLink (String link){
        return this.link = link;
    }
    public String getTplContent (){
        return tplContent;
    }
    public String setTplContent (String tplContent){
        return this.tplContent = tplContent;
    }
    public BigDecimal getNeedRegenerate (){
        return needRegenerate;
    }
    public BigDecimal setNeedRegenerate (BigDecimal needRegenerate){
        return this.needRegenerate = needRegenerate;
    }
    public String getTplMobileContent (){
        return tplMobileContent;
    }
    public String setTplMobileContent (String tplMobileContent){
        return this.tplMobileContent = tplMobileContent;
    }
    public Date getToplevelDate (){
        return toplevelDate;
    }
    public Date setToplevelDate (Date toplevelDate){
        return this.toplevelDate = toplevelDate;
    }
    public Date getPigeonholeDate (){
        return pigeonholeDate;
    }
    public Date setPigeonholeDate (Date pigeonholeDate){
        return this.pigeonholeDate = pigeonholeDate;
    }
    public Date getReleaseDate (){
        return releaseDate;
    }
    public Date setReleaseDate (Date releaseDate){
        return this.releaseDate = releaseDate;
    }

}
