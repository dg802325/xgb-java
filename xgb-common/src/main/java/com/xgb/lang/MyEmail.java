package com.xgb.lang;

/**
 * 邮件类
 */
public class MyEmail {
    /**
     * addresser    发件人
     */
    private String addresser;
    /**
     * addresser    收件人
     */
    private String recipients;
    /**
     * addresser    邮件服务器
     */
    private String mailServer;
    /**
     * addresser    发件人用户名
     */
    private String addresserName;
    /**
     * addresser    发件人密码 如果需要验证，本处填写授权码
     */
    private String addresserPassword;
    /**
     * addresser    消息头
     */
    private String messageTitle;
    /**
     * addresser    发送的消息
     */
    private String message;

    public String getAddresser() {
        return addresser;
    }

    public void setAddresser(String addresser) {
        this.addresser = addresser;
    }

    public String getRecipients() {
        return recipients;
    }

    public void setRecipients(String recipients) {
        this.recipients = recipients;
    }

    public String getAddresserName() {
        return addresserName;
    }

    public void setAddresserName(String addresserName) {
        this.addresserName = addresserName;
    }

    public String getAddresserPassword() {
        return addresserPassword;
    }

    public void setAddresserPassword(String addresserPassword) {
        this.addresserPassword = addresserPassword;
    }

    public String getMessageTitle() {
        return messageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMailServer() {
        return mailServer;
    }

    public void setMailServer(String mailServer) {
        this.mailServer = mailServer;
    }

    /**
     *
     * @param addresser 发件人邮箱
     * @param recipients  收件人邮箱
     * @param mailServer  发送服务器
     * @param addresserName  发件人用户名
     * @param addresserPassword  发件人密码
     * @param messageTitle  发送邮件头
     * @param message   发送的邮寄
     */
    public MyEmail(String addresser, String recipients, String mailServer, String addresserName, String addresserPassword, String messageTitle, String message) {
        this.addresser = addresser;
        this.recipients = recipients;
        this.mailServer = mailServer;
        this.addresserName = addresserName;
        this.addresserPassword = addresserPassword;
        this.messageTitle = messageTitle;
        this.message = message;
    }

    public MyEmail(){

    }

}
