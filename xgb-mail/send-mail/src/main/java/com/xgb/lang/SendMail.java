//package com.xgb.lang;
//
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//import sun.misc.BASE64Encoder;
//
//import javax.activation.DataHandler;
//import javax.activation.DataSource;
//import javax.activation.FileDataSource;
//import javax.mail.*;
//import javax.mail.internet.*;
//import javax.swing.*;
//import java.util.Properties;
//
//@Data   //set，get，注解
//@NoArgsConstructor  //无参构造函数
//@AllArgsConstructor //全参构造函数
//public class SendMail {
//    private String smtpHost = "";   //SMTP服务器
//    private String fromAddr = "";   //发件人地址
//    private String toAddr = "";    //收件人地址
//    private String file = "";   //附件地址
//    private String fileName = "";   //附件名称
//    private String userName = "";   //用户名
//    private String userPass = "";   //密码
//    private String subject = "";    //邮件标题
//    private String text = "";   //邮件正文
//
//
//    public int Send(){
//        Properties props = new Properties();
//        //设置发送邮件的邮件服务器的属性
//        props.put("mail.smtp.host",smtpHost);
//        //需要经过授权，也就是用户名和密码的校验，这样才能通过验证
//        props.put("mail.smtp.auth","true");
//        //用刚刚设置好的props对象构建一个session
//
//        Session session = Session.getDefaultInstance(props);
//        session.setDebug(true);
//        try {
//            //1.获取某种邮件协议的Transport对象
//            Transport transport = session.getTransport("smtp");
//            //2.用session为参数定义消息对象，封装Message对象
//            MimeMessage message = new MimeMessage(session);
//            //加载发件人地址
//            message.setFrom(new InternetAddress(fromAddr));
//            //加载收件人地址
//            message.addRecipient(Message.RecipientType.TO,new InternetAddress(toAddr));
//            //加载标题
//            message.setSubject(subject);
//            //向multipart对象中添加邮件的各个部分内容，包括文本内容和附件
//            Multipart multipart = new MimeMultipart();
//            //设置邮件的文本内容
//            BodyPart contentPart = new MimeBodyPart();
//            contentPart.setText("text");
//            multipart.addBodyPart(contentPart);
//            //添加附件fileName
//            if(!(file.equalsIgnoreCase("") || file.equalsIgnoreCase(null))){
//                BodyPart messageBodyPart = new MimeBodyPart();
//                DataSource source = new FileDataSource(file);
//                messageBodyPart.setDataHandler(new DataHandler(source));
//                //添加附件的内容
//                //添加附件的标题
//                BASE64Encoder encoder = new BASE64Encoder();
//                messageBodyPart.setFileName("=?GBK?B?"+encoder.encode(fileName.getBytes())+"?=");
//                multipart.addBodyPart(messageBodyPart);
//            }
//            message.setContent(multipart);
//            message.saveChanges();
//            //3.连接指定SMTP邮箱调用发送方法进行邮件发送
//            transport.connect(smtpHost,userName,userPass);  //连接服务器的邮箱
//            //把邮件发送出去
//            transport.sendMessage(message,message.getAllRecipients());
//            transport.close();
//            return 1;
//        } catch (NoSuchProviderException e) {
//            e.printStackTrace();
//        } catch (AddressException e) {
//            e.printStackTrace();
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }
//        return 0;
//    }
//
//
//    private void btnFileActionPerformed(java.awt.event.ActionEvent evt){
//        JFileChooser fileChooser = new JFileChooser();
//        fileChooser.setDialogTitle("选择发送文件");
//        fileChooser.setApproveButtonText("确定");
//        int choice = fileChooser.showOpenDialog(this);//显示对话框
//        //单机选择按钮就
//        if(choice == JFileChooser.APPROVE_OPTION){
//            //获取文件对象
//            java.io.File f = fileChooser.getSelectedFile();
//            fileName = fileChooser.getName(f);
//            this.txtFilename.setText(fileName);
//            file = f.getAbsolutePath();
//        }
//    }
//
//    private void btnSendMailActionPerforned(java.awt.event.ActionEvent evt){
//        SendMail sm = new SendMail(smtpHost,userAddr,this.textToAddr.getText(),file,fileName,userName,userPass,this.txtSubject.getText(),this.textDataArea.getText());
//        int r = sm.Send();
//        if(r == 1){
//            JOptionPane.showMessageDialog(null,"邮件发送成功","提示",JOptionPane.OK_CANCEL_OPTION);
//        }else {
//            JOptionPane.showMessageDialog(null,"邮件发送失败","错误提示",JOptionPane.ERROR_MESSAGE);
//            this.dispose();
//            new MainFrame(userAddr,userPass,smtpHost.pop3Host).setVisible(true);
//        }
//    }
//}
