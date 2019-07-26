package com.xgb.utils;

import com.sun.mail.util.MailSSLSocketFactory;
import com.xgb.lang.MyEmail;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.security.GeneralSecurityException;
import java.util.Properties;

public class EmilUtils {

    /**
     *
     * 不带附件发送邮件
     *
     * @return
     */
    public static boolean sendEmail(final MyEmail myEmail) {
        // 收件人电子邮箱
        String to = myEmail.getRecipients();
        // 发件人电子邮箱
        String from = myEmail.getAddresser();
        // 指定发送邮件的主机为 smtp.qq.com
        String host = myEmail.getMailServer();    // "smtp.qq.com";  //QQ 邮件服务器
        // 获取系统属性
        Properties properties = System.getProperties();
        // 设置邮件服务器
        properties.setProperty("mail.smtp.host", host);
        properties.put("mail.smtp.auth", "true");
        MailSSLSocketFactory sf = null;
        try {
            sf = new MailSSLSocketFactory();
            sf.setTrustAllHosts(true);
            properties.put("mail.smtp.ssl.enable", "true");
            properties.put("mail.smtp.ssl.socketFactory", sf);
        } catch (GeneralSecurityException e) {
            e.printStackTrace();
        }
        // 获取默认session对象
        Session session = Session.getDefaultInstance(properties, new Authenticator() {
            public PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myEmail.getAddresserName(), myEmail.getAddresserPassword()); //发件人邮件用户名、密码
            }
        });
        try {
            // 创建默认的 MimeMessage 对象
            MimeMessage message = new MimeMessage(session);
            // Set From: 头部头字段
            message.setFrom(new InternetAddress(from));
            // Set To: 头部头字段
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            // Set Subject: 头部头字段
            message.setSubject(myEmail.getMessageTitle());
            // 设置消息体
            message.setText(myEmail.getMessage());
            // 发送消息
            Transport.send(message);
            return true;
        } catch (MessagingException mex) {
            mex.printStackTrace();
        }
        return false;
    }
}
