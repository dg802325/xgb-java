package ;

import java.util.Date;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
* @Auther: 
* @Date: 2019年12月23日 10:18:54
* @Description:
*/
public class JcUser {

    private Integer userId;
    private Integer groupId;
    private String username;
    private String email;
    private Date registerTime;
    private String registerIp;
    private Date lastLoginTime;
    private String lastLoginIp;
    private Integer loginCount;
    private Integer rank;
    private BigDecimal uploadTotal;
    private Integer uploadSize;
    private Date uploadDate;
    private BigDecimal isAdmin;
    private BigDecimal isSelfAdmin;
    private BigDecimal isDisabled;
    private String sessionId;
    private Integer departId;


    public Integer getUserId (){
        return userId;
    }
    public Integer setUserId (Integer userId){
        return this.userId = userId;
    }
    public Integer getGroupId (){
        return groupId;
    }
    public Integer setGroupId (Integer groupId){
        return this.groupId = groupId;
    }
    public String getUsername (){
        return username;
    }
    public String setUsername (String username){
        return this.username = username;
    }
    public String getEmail (){
        return email;
    }
    public String setEmail (String email){
        return this.email = email;
    }
    public Date getRegisterTime (){
        return registerTime;
    }
    public Date setRegisterTime (Date registerTime){
        return this.registerTime = registerTime;
    }
    public String getRegisterIp (){
        return registerIp;
    }
    public String setRegisterIp (String registerIp){
        return this.registerIp = registerIp;
    }
    public Date getLastLoginTime (){
        return lastLoginTime;
    }
    public Date setLastLoginTime (Date lastLoginTime){
        return this.lastLoginTime = lastLoginTime;
    }
    public String getLastLoginIp (){
        return lastLoginIp;
    }
    public String setLastLoginIp (String lastLoginIp){
        return this.lastLoginIp = lastLoginIp;
    }
    public Integer getLoginCount (){
        return loginCount;
    }
    public Integer setLoginCount (Integer loginCount){
        return this.loginCount = loginCount;
    }
    public Integer getRank (){
        return rank;
    }
    public Integer setRank (Integer rank){
        return this.rank = rank;
    }
    public BigDecimal getUploadTotal (){
        return uploadTotal;
    }
    public BigDecimal setUploadTotal (BigDecimal uploadTotal){
        return this.uploadTotal = uploadTotal;
    }
    public Integer getUploadSize (){
        return uploadSize;
    }
    public Integer setUploadSize (Integer uploadSize){
        return this.uploadSize = uploadSize;
    }
    public Date getUploadDate (){
        return uploadDate;
    }
    public Date setUploadDate (Date uploadDate){
        return this.uploadDate = uploadDate;
    }
    public BigDecimal getIsAdmin (){
        return isAdmin;
    }
    public BigDecimal setIsAdmin (BigDecimal isAdmin){
        return this.isAdmin = isAdmin;
    }
    public BigDecimal getIsSelfAdmin (){
        return isSelfAdmin;
    }
    public BigDecimal setIsSelfAdmin (BigDecimal isSelfAdmin){
        return this.isSelfAdmin = isSelfAdmin;
    }
    public BigDecimal getIsDisabled (){
        return isDisabled;
    }
    public BigDecimal setIsDisabled (BigDecimal isDisabled){
        return this.isDisabled = isDisabled;
    }
    public String getSessionId (){
        return sessionId;
    }
    public String setSessionId (String sessionId){
        return this.sessionId = sessionId;
    }
    public Integer getDepartId (){
        return departId;
    }
    public Integer setDepartId (Integer departId){
        return this.departId = departId;
    }

}

insert into jc_user(group_id,username,email,register_time,register_ip,last_login_time,last_login_ip,login_count,rank,upload_total,upload_size,upload_date,is_admin,is_self_admin,is_disabled,session_id,depart_id,) value(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,);
