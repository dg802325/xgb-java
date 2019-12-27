package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.SjzdNode;

import java.io.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class SaveSjzdNodeService {

    public static StringBuffer saveEntity(StringBuffer buffer , List<SjzdNode> contents){
        for(SjzdNode content:contents){

        Integer id = content.getId ();//null
        Integer parentid = content.getParentid ();//父节点ID
        String nodeName = content.getNodeName ();//节点名称
        String nodeTypename = content.getNodeTypename ();//节点所属名称
        Integer nodeLevel = content.getNodeLevel ();//节点所在层数
        String nodeValue = content.getNodeValue ();//节点特定值
        Integer nodeIndex = content.getNodeIndex ();//节点序列号
        Integer institutionid = content.getInstitutionid ();//所属机构
        Integer state = content.getState ();//null

        buffer.append(id+"|");
        buffer.append(parentid+"|");
        buffer.append(nodeName+"|");
        buffer.append(nodeTypename+"|");
        buffer.append(nodeLevel+"|");
        buffer.append(nodeValue+"|");
        buffer.append(nodeIndex+"|");
        buffer.append(institutionid+"|");
        buffer.append(state+"|");

        buffer.append("\n");
        }
        return buffer;
    }

    public static void writeToRestource(StringBuffer buffer){
        String path= Utils.getResourceBasePath()+"/xgb-data/data-api/config";
        System.out.println("输出文件目录：-----------"+path);
        String studentResourcePath = new File(path, "/SjzdNode.txt").getAbsolutePath();
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
