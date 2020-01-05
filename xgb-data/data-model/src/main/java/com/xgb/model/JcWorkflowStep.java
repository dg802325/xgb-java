package com.xgb.model;

import java.util.Date;

/**
 * @Auther:
 * @Date: 2019年12月31日 18:09:37
 * @Description:
 */
public class JcWorkflowStep {

    private Integer id;
    private Integer workflowId;
    private Integer contentId;
    private Integer nodeId;
    private Integer ownerId;
    private String value;
    private Integer userId;
    private Integer history;
    private Date startDate;
    private Date finishDate;
    private Integer prevNodeId;
    private String status;


    public Integer getId (){
        return id;
    }
    public Integer setId (Integer id){
        return this.id = id;
    }
    public Integer getWorkflowId (){
        return workflowId;
    }
    public Integer setWorkflowId (Integer workflowId){
        return this.workflowId = workflowId;
    }
    public Integer getContentId (){
        return contentId;
    }
    public Integer setContentId (Integer contentId){
        return this.contentId = contentId;
    }
    public Integer getNodeId (){
        return nodeId;
    }
    public Integer setNodeId (Integer nodeId){
        return this.nodeId = nodeId;
    }
    public Integer getOwnerId (){
        return ownerId;
    }
    public Integer setOwnerId (Integer ownerId){
        return this.ownerId = ownerId;
    }
    public String getValue (){
        return value;
    }
    public String setValue (String value){
        return this.value = value;
    }
    public Integer getUserId (){
        return userId;
    }
    public Integer setUserId (Integer userId){
        return this.userId = userId;
    }
    public Integer getHistory (){
        return history;
    }
    public Integer setHistory (Integer history){
        return this.history = history;
    }
    public Date getStartDate (){
        return startDate;
    }
    public Date setStartDate (Date startDate){
        return this.startDate = startDate;
    }
    public Date getFinishDate (){
        return finishDate;
    }
    public Date setFinishDate (Date finishDate){
        return this.finishDate = finishDate;
    }
    public Integer getPrevNodeId (){
        return prevNodeId;
    }
    public Integer setPrevNodeId (Integer prevNodeId){
        return this.prevNodeId = prevNodeId;
    }
    public String getStatus (){
        return status;
    }
    public String setStatus (String status){
        return this.status = status;
    }

}
