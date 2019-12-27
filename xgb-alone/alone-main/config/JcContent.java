package ;

import java.util.Date;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
* @Auther: 
* @Date: 2019年12月22日 10:49:59
* @Description:
*/
public class  {

    private Integer contentId;
    private Integer channelId;
    private Integer userId;
    private Integer typeId;
    private Integer modelId;
    private Integer siteId;
    private Date sortDate;
    private Integer topLevel;
    private BigDecimal hasTitleImg;
    private BigDecimal isRecommend;
    private Integer status;
    private Integer viewsDay;
    private Integer commentsDay;
    private Integer downloadsDay;
    private Integer upsDay;
    private Integer score;
    private Integer recommendLevel;
    private Integer parentId;


    public Integer getContentId (){
        return contentId;
    }
    public Integer setContentId (Integer contentId){
        return this.contentId = contentId;
    }
    public Integer getChannelId (){
        return channelId;
    }
    public Integer setChannelId (Integer channelId){
        return this.channelId = channelId;
    }
    public Integer getUserId (){
        return userId;
    }
    public Integer setUserId (Integer userId){
        return this.userId = userId;
    }
    public Integer getTypeId (){
        return typeId;
    }
    public Integer setTypeId (Integer typeId){
        return this.typeId = typeId;
    }
    public Integer getModelId (){
        return modelId;
    }
    public Integer setModelId (Integer modelId){
        return this.modelId = modelId;
    }
    public Integer getSiteId (){
        return siteId;
    }
    public Integer setSiteId (Integer siteId){
        return this.siteId = siteId;
    }
    public Date getSortDate (){
        return sortDate;
    }
    public Date setSortDate (Date sortDate){
        return this.sortDate = sortDate;
    }
    public Integer getTopLevel (){
        return topLevel;
    }
    public Integer setTopLevel (Integer topLevel){
        return this.topLevel = topLevel;
    }
    public BigDecimal getHasTitleImg (){
        return hasTitleImg;
    }
    public BigDecimal setHasTitleImg (BigDecimal hasTitleImg){
        return this.hasTitleImg = hasTitleImg;
    }
    public BigDecimal getIsRecommend (){
        return isRecommend;
    }
    public BigDecimal setIsRecommend (BigDecimal isRecommend){
        return this.isRecommend = isRecommend;
    }
    public Integer getStatus (){
        return status;
    }
    public Integer setStatus (Integer status){
        return this.status = status;
    }
    public Integer getViewsDay (){
        return viewsDay;
    }
    public Integer setViewsDay (Integer viewsDay){
        return this.viewsDay = viewsDay;
    }
    public Integer getCommentsDay (){
        return commentsDay;
    }
    public Integer setCommentsDay (Integer commentsDay){
        return this.commentsDay = commentsDay;
    }
    public Integer getDownloadsDay (){
        return downloadsDay;
    }
    public Integer setDownloadsDay (Integer downloadsDay){
        return this.downloadsDay = downloadsDay;
    }
    public Integer getUpsDay (){
        return upsDay;
    }
    public Integer setUpsDay (Integer upsDay){
        return this.upsDay = upsDay;
    }
    public Integer getScore (){
        return score;
    }
    public Integer setScore (Integer score){
        return this.score = score;
    }
    public Integer getRecommendLevel (){
        return recommendLevel;
    }
    public Integer setRecommendLevel (Integer recommendLevel){
        return this.recommendLevel = recommendLevel;
    }
    public Integer getParentId (){
        return parentId;
    }
    public Integer setParentId (Integer parentId){
        return this.parentId = parentId;
    }

}

insert into jc_content(channel_id,user_id,type_id,model_id,site_id,sort_date,top_level,has_title_img,is_recommend,status,views_day,comments_day,downloads_day,ups_day,score,recommend_level,parent_id,) value(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,);
