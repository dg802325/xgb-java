package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.MjzzUser;

import java.io.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class SaveMjzzUserService {

    public static StringBuffer saveEntity(StringBuffer buffer , List<MjzzUser> contents){
        for(MjzzUser content:contents){

        Long id = content.getId ();//ID
        String name = content.getName ();//姓名
        String username = content.getUsername ();//用户名称
        String password = content.getPassword ();//密码
        String dept = content.getDept ();//工作单位
        String idcard = content.getIdcard ();//证件号码
        String address = content.getAddress ();//办公地址（公募基金会募捐地域）
        String telephone = content.getTelephone ();//电话
        String fax = content.getFax ();//传真
        String workdept = content.getWorkdept ();//通信地址
        String residence = content.getResidence ();//住所
        String email = content.getEmail ();//邮件地址
        String postcode = content.getPostcode ();//邮编
        String othercontact = content.getOthercontact ();//其它联系人
        String registered = content.getRegistered ();//户口所在地（单位简介）
        Long managerdept = content.getManagerdept ();//登记管理机关
        String organization = content.getOrganization ();//拟成立基金会名称
        String serialnumber = content.getSerialnumber ();//登记证号
        Date constitutedate = content.getConstitutedate ();//成立日期
        String corporation = content.getCorporation ();//法人
        String corptelephone = content.getCorptelephone ();//法人联系电话
        Short type = content.getType ();//类型1,社团,2,民非3基金会,4.拟成立境外基金会分支机构名称,5 国际社团6 外国商会7 涉外基金会,8 登记机关用户
        Short status = content.getStatus ();// 用户状态,1,已批准申请人用户，2未批准申请人用户，3，社会组织用户0，已无效用户
        Long typedeptid = content.getTypedeptid ();//用户类型1,自然人3单位,2,公募基金会,4非公募基金会,5境外基金会分支代表机构
        Long manageorg = content.getManageorg ();//主管单位
        String organizationId = content.getOrganizationId ();//拟成立基金会类型1公募，2非公募，拟成立境外基金会分支机构名称
        Short mfType = content.getMfType ();//用户证件类型1,身份证,2,军官证,3,护照
        Long region = content.getRegion ();//null
        Date registedate = content.getRegistedate ();//注册日期
        Short area = content.getArea ();//公募基金会募捐地域1全国，2地方
        Short usertype = content.getUsertype ();//拟成立类型1基金会，2境外基金会分支/代表机构
        String orgIdentity = content.getOrgIdentity ();//基金会的唯一标志
        String unitType = content.getUnitType ();//基金会类型1公募，2非公募，民非类型 1).法人 2).合伙3).个体
        Date lastLogginginTime = content.getLastLogginginTime ();//最后登陆时间
        Long logginginCount = content.getLogginginCount ();//登陆次数
        String temp = content.getTemp ();//临时数据
        String xinyongdaima = content.getXinyongdaima ();//null

        buffer.append(id+"|");
        buffer.append(name+"|");
        buffer.append(username+"|");
        buffer.append(password+"|");
        buffer.append(dept+"|");
        buffer.append(idcard+"|");
        buffer.append(address+"|");
        buffer.append(telephone+"|");
        buffer.append(fax+"|");
        buffer.append(workdept+"|");
        buffer.append(residence+"|");
        buffer.append(email+"|");
        buffer.append(postcode+"|");
        buffer.append(othercontact+"|");
        buffer.append(registered+"|");
        buffer.append(managerdept+"|");
        buffer.append(organization+"|");
        buffer.append(serialnumber+"|");
        buffer.append(constitutedate+"|");
        buffer.append(corporation+"|");
        buffer.append(corptelephone+"|");
        buffer.append(type+"|");
        buffer.append(status+"|");
        buffer.append(typedeptid+"|");
        buffer.append(manageorg+"|");
        buffer.append(organizationId+"|");
        buffer.append(mfType+"|");
        buffer.append(region+"|");
        buffer.append(registedate+"|");
        buffer.append(area+"|");
        buffer.append(usertype+"|");
        buffer.append(orgIdentity+"|");
        buffer.append(unitType+"|");
        buffer.append(lastLogginginTime+"|");
        buffer.append(logginginCount+"|");
        buffer.append(temp+"|");
        buffer.append(xinyongdaima+"|");

        buffer.append("\n");
        }
        return buffer;
    }

    public static void writeToRestource(StringBuffer buffer){
        String path= Utils.getResourceBasePath()+"/xgb-data/data-api/config";
        System.out.println("输出文件目录：-----------"+path);
        String studentResourcePath = new File(path, "/MjzzUser.txt").getAbsolutePath();
        // 保证目录一定存在
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(studentResourcePath)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Utils.writeTxt(writer,buffer.toString());
        Utils.close(writer);
    }

}
