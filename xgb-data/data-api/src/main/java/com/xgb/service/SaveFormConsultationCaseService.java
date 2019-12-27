package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.FormConsultationCase;

import java.io.*;
import java.util.Date;
import java.util.List;

public class SaveFormConsultationCaseService {

    public static StringBuffer saveEntity(StringBuffer buffer , List<FormConsultationCase> contents){
        for (FormConsultationCase content : contents) {
            Long id = content.getId ();//ID
            String instanceid = content.getInstanceid ();//事务号（实例ID）
            String application = content.getApplication ();//所申请的应用名（同表单的FormApplication name），系统需要使用该字段来标示是哪个应用
            String catalog = content.getCatalog ();//所对应的FormApplication的FormCatalog名称，即所对应的事项名称
            String orgid = content.getOrgid ();//事项关联的机构ID
            String orgidentity = content.getOrgidentity ();//所办事项所关联的机构（如社团或市民非）唯一标示符，一般可以采用登记证号之类的唯一 标示符。
            String orgname = content.getOrgname ();//事项关联的机构名称
            String proposer = content.getProposer ();//申请人名称
            Long proposeid = content.getProposeid ();//申请人ID
            Long userid = content.getUserid ();//事项咨询处理人ID
            Long deptid = content.getDeptid ();//咨询事项所对应的机构ID，一般只用于一个事项需要应用到不同的区县应用中
            Date createtime = content.getCreatetime ();//事项创建时间
            Date lastmodifytime = content.getLastmodifytime ();//事项最后修改时间
            Date starttime = content.getStarttime ();//事项审批开始时间
            Date endtime = content.getEndtime ();//事项审批结束时间
            Short createtype = content.getCreatetype ();//创建类型1：外网2：内网
            Short casetype = content.getCasetype ();//事项类型，保留字段，一般用于一个应用中，有不同的事项分类，例如社团业务中，有社团 、民费和基金会业务
            Long region = content.getRegion ();//区县ID（一般用于一个事项可以应用于多个不同区域的应用中）
            Short finished = content.getFinished ();//是否已经填写完毕
            Short casestate = content.getCasestate ();//事项办理状态 0：未填完 1：已提交内网咨询 2：咨询已经通过 3：咨询未通过 4：受理5：不受理6：补齐补正7：赋码结束8、办结结束-1允许外网修改 15：预审通过
            String propertyA = content.getPropertyA ();//扩展属性A
            String propertyB = content.getPropertyB ();//扩展属性B
            String propertyC = content.getPropertyC ();//扩展属性C
            String propertyD = content.getPropertyD ();//扩展属性D
            String propertyE = content.getPropertyE ();//扩展属性E(分之代表机构名称)
            Short hasnewmsg = content.getHasnewmsg ();//当前事项是否有新消息1：有0：无
            Short unitType = content.getUnitType ();//基金会类型
            Short acceptResult = content.getAcceptResult ();//受理结果 1 准予受理，2 不予受理 3 补正补齐
            Long managerorgid = content.getManagerorgid ();//业务主管单位
            Short auditType = content.getAuditType ();//审查许可结果  1 许可，2 不予许可
            Short isAllowEdit = content.getIsAllowEdit ();//材料接收后是否允许外网修改0不允许，1允许
            Long temp = content.getTemp ();//null
            String tempA = content.getTempA ();//null
            String tempB = content.getTempB ();//null

            buffer.append(id+"|");
            buffer.append(instanceid+"|");
            buffer.append(application+"|");
            buffer.append(catalog+"|");
            buffer.append(orgid+"|");
            buffer.append(orgidentity+"|");
            buffer.append(orgname+"|");
            buffer.append(proposer+"|");
            buffer.append(proposeid+"|");
            buffer.append(userid+"|");
            buffer.append(deptid+"|");
            buffer.append( createtime+"|");
            buffer.append(lastmodifytime+"|");
            buffer.append(starttime+"|");
            buffer.append(endtime+"|");
            buffer.append(createtype+"|");
            buffer.append(casetype+"|");
            buffer.append(region+"|");
            buffer.append(finished+"|");
            buffer.append(casestate+"|");
            buffer.append(propertyA+"|");
            buffer.append(propertyB+"|");
            buffer.append(propertyC+"|");
            buffer.append(propertyD+"|");
            buffer.append(propertyE+"|");
            buffer.append(hasnewmsg+"|");
            buffer.append(unitType+"|");
            buffer.append(acceptResult+"|");
            buffer.append(managerorgid+"|");
            buffer.append(auditType+"|");
            buffer.append(isAllowEdit+"|");
            buffer.append(temp+"|");
            buffer.append(tempA+"|");
            buffer.append(tempB+"|");
            buffer.append("\n");
        }
        return buffer;
    }

    public static void writeToRestource(StringBuffer buffer){
        String path= Utils.getResourceBasePath()+"/xgb-data/data-api/config";
        System.out.println("输出文件目录：-----------"+path);
        String studentResourcePath = new File(path, "/FormConsultationCase.txt").getAbsolutePath();
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
