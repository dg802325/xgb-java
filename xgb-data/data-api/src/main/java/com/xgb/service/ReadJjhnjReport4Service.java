package com.xgb.service;

import com.xgb.common.Utils;
import com.xgb.model.JjhnjReport4;
import com.xgb.util.DateUtils;
import com.xgb.util.MyTools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
* @Auther: 
* @Date: 2019年12月24日 16:00:33
* @Description:
*/
public class ReadJjhnjReport4Service {

    public static List<JjhnjReport4> getContent(){
        List<JjhnjReport4> lists = new ArrayList<JjhnjReport4>();
        String path = Utils.getResourceBasePath() + "/xgb-data/data-api/config/JjhnjReport4.txt";
        File file = new File(path);
        JjhnjReport4  entity = null;
        Boolean boo = file.exists() && file.isFile();
        if(boo){
            BufferedReader bufferedReader = null;
            try {
                //构造一个BufferedReader类来读取文件
                bufferedReader = new BufferedReader(new FileReader(file));
                String linetxt = null;
                //result用来存储文件内容
                StringBuilder result = new StringBuilder();
                //按使用readLine方法，一次读一行
                while ((linetxt = bufferedReader.readLine()) != null) {
                    result.append(linetxt);
                }
                //输出读出的所有数据（StringBuilder类型）
                entity = getEntity(result.toString());
                lists.add(entity);
            } catch (Exception e) {
                System.out.println("读取文件内容出错");
                e.printStackTrace();
            } finally {
                try {
                    bufferedReader.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }
        }
        return lists;
    }
    public static JjhnjReport4 getEntity(String result){
        String[] split = result.split("\\|");
        JjhnjReport4 fcc = new JjhnjReport4();
        if(MyTools.isNotEmpty(split[0])){
            fcc.setId(Long.parseLong(split[0]));
        }
        if(MyTools.isNotEmpty(split[1])){
            fcc.setInstanceid(split[1]);
        }
        if(MyTools.isNotEmpty(split[2])){
            fcc.setOrganizationid(split[2]);
        }
        if(MyTools.isNotEmpty(split[3])){
            fcc.setStatus(Short.parseShort(split[3]));
        }
        if(MyTools.isNotEmpty(split[4])){
            fcc.setBianzhidanwei(split[4]);
        }
        if(MyTools.isNotEmpty(split[5])){
            fcc.setNiandu(split[5]);
        }
        if(MyTools.isNotEmpty(split[6])){
            fcc.setMojuanfeixian(new BigDecimal(split[6]));
        }
        if(MyTools.isNotEmpty(split[7])){
            fcc.setMojuanxian(new BigDecimal(split[7]));
        }
        if(MyTools.isNotEmpty(split[8])){
            fcc.setMojuanheji(new BigDecimal(split[8]));
        }
        if(MyTools.isNotEmpty(split[9])){
            fcc.setLeijijuanfeixian(new BigDecimal(split[9]));
        }
        if(MyTools.isNotEmpty(split[10])){
            fcc.setLeijijuanxian(new BigDecimal(split[10]));
        }
        if(MyTools.isNotEmpty(split[11])){
            fcc.setLeijijuanheji(new BigDecimal(split[11]));
        }
        if(MyTools.isNotEmpty(split[12])){
            fcc.setMohuifeixian(new BigDecimal(split[12]));
        }
        if(MyTools.isNotEmpty(split[13])){
            fcc.setMohuixian(new BigDecimal(split[13]));
        }
        if(MyTools.isNotEmpty(split[14])){
            fcc.setMohuiheji(new BigDecimal(split[14]));
        }
        if(MyTools.isNotEmpty(split[15])){
            fcc.setLeijihuifeixian(new BigDecimal(split[15]));
        }
        if(MyTools.isNotEmpty(split[16])){
            fcc.setLeijihuixian(new BigDecimal(split[16]));
        }
        if(MyTools.isNotEmpty(split[17])){
            fcc.setLeijihuiheji(new BigDecimal(split[17]));
        }
        if(MyTools.isNotEmpty(split[18])){
            fcc.setMofuwufeixian(new BigDecimal(split[18]));
        }
        if(MyTools.isNotEmpty(split[19])){
            fcc.setMofuwuxian(new BigDecimal(split[19]));
        }
        if(MyTools.isNotEmpty(split[20])){
            fcc.setMofuwuheji(new BigDecimal(split[20]));
        }
        if(MyTools.isNotEmpty(split[21])){
            fcc.setLeijifuwufeixian(new BigDecimal(split[21]));
        }
        if(MyTools.isNotEmpty(split[22])){
            fcc.setLeijifuwuxian(new BigDecimal(split[22]));
        }
        if(MyTools.isNotEmpty(split[23])){
            fcc.setLeijifuwuheji(new BigDecimal(split[23]));
        }
        if(MyTools.isNotEmpty(split[24])){
            fcc.setMoxiaoshoufeixian(new BigDecimal(split[24]));
        }
        if(MyTools.isNotEmpty(split[25])){
            fcc.setMoxiaoshouxian(new BigDecimal(split[25]));
        }
        if(MyTools.isNotEmpty(split[26])){
            fcc.setMoxiaoshouheji(new BigDecimal(split[26]));
        }
        if(MyTools.isNotEmpty(split[27])){
            fcc.setLeijixiaoshoufeixian(new BigDecimal(split[27]));
        }
        if(MyTools.isNotEmpty(split[28])){
            fcc.setLeijixiaoshouxian(new BigDecimal(split[28]));
        }
        if(MyTools.isNotEmpty(split[29])){
            fcc.setLeijixiaoshouheji(new BigDecimal(split[29]));
        }
        if(MyTools.isNotEmpty(split[30])){
            fcc.setMobuzhufeixian(new BigDecimal(split[30]));
        }
        if(MyTools.isNotEmpty(split[31])){
            fcc.setMobuzhuxian(new BigDecimal(split[31]));
        }
        if(MyTools.isNotEmpty(split[32])){
            fcc.setMobuzhuheji(new BigDecimal(split[32]));
        }
        if(MyTools.isNotEmpty(split[33])){
            fcc.setLeijibuzhufeixian(new BigDecimal(split[33]));
        }
        if(MyTools.isNotEmpty(split[34])){
            fcc.setMotouzifeixian(new BigDecimal(split[34]));
        }
        if(MyTools.isNotEmpty(split[35])){
            fcc.setMotouzixian(new BigDecimal(split[35]));
        }
        if(MyTools.isNotEmpty(split[36])){
            fcc.setMotouziheji(new BigDecimal(split[36]));
        }
        if(MyTools.isNotEmpty(split[37])){
            fcc.setLeijitouzifeixian(new BigDecimal(split[37]));
        }
        if(MyTools.isNotEmpty(split[38])){
            fcc.setLeijitouzixian(new BigDecimal(split[38]));
        }
        if(MyTools.isNotEmpty(split[39])){
            fcc.setLeijitouziheji(new BigDecimal(split[39]));
        }
        if(MyTools.isNotEmpty(split[40])){
            fcc.setMoqitafeixian(new BigDecimal(split[40]));
        }
        if(MyTools.isNotEmpty(split[41])){
            fcc.setMoqitaxian(new BigDecimal(split[41]));
        }
        if(MyTools.isNotEmpty(split[42])){
            fcc.setMoqitaheji(new BigDecimal(split[42]));
        }
        if(MyTools.isNotEmpty(split[43])){
            fcc.setLeijiqitafeixian(new BigDecimal(split[43]));
        }
        if(MyTools.isNotEmpty(split[44])){
            fcc.setLeijiqitaxian(new BigDecimal(split[44]));
        }
        if(MyTools.isNotEmpty(split[45])){
            fcc.setLeijiqitaheji(new BigDecimal(split[45]));
        }
        if(MyTools.isNotEmpty(split[46])){
            fcc.setMohejifeixian(new BigDecimal(split[46]));
        }
        if(MyTools.isNotEmpty(split[47])){
            fcc.setMohejixian(new BigDecimal(split[47]));
        }
        if(MyTools.isNotEmpty(split[48])){
            fcc.setMohejiheji(new BigDecimal(split[48]));
        }
        if(MyTools.isNotEmpty(split[49])){
            fcc.setLeijihejifeixian(new BigDecimal(split[49]));
        }
        if(MyTools.isNotEmpty(split[50])){
            fcc.setLeijihejixian(new BigDecimal(split[50]));
        }
        if(MyTools.isNotEmpty(split[51])){
            fcc.setLeijihejiheji(new BigDecimal(split[51]));
        }
        if(MyTools.isNotEmpty(split[52])){
            fcc.setMochengbenfeixian(new BigDecimal(split[52]));
        }
        if(MyTools.isNotEmpty(split[53])){
            fcc.setMochengbenxian(new BigDecimal(split[53]));
        }
        if(MyTools.isNotEmpty(split[54])){
            fcc.setMochengbenheji(new BigDecimal(split[54]));
        }
        if(MyTools.isNotEmpty(split[55])){
            fcc.setLeijichengbenfeixian(new BigDecimal(split[55]));
        }
        if(MyTools.isNotEmpty(split[56])){
            fcc.setLeijichengbenxian(new BigDecimal(split[56]));
        }
        if(MyTools.isNotEmpty(split[57])){
            fcc.setLeijichengbenheji(new BigDecimal(split[57]));
        }
        if(MyTools.isNotEmpty(split[58])){
            fcc.setMoqizhongfeixian1(new BigDecimal(split[58]));
        }
        if(MyTools.isNotEmpty(split[59])){
            fcc.setMoqizhongxian1(new BigDecimal(split[59]));
        }
        if(MyTools.isNotEmpty(split[60])){
            fcc.setMoqizhongheji1(new BigDecimal(split[60]));
        }
        if(MyTools.isNotEmpty(split[61])){
            fcc.setLeijiqizhongfeixian1(new BigDecimal(split[61]));
        }
        if(MyTools.isNotEmpty(split[62])){
            fcc.setLeijiqizhongxian1(new BigDecimal(split[62]));
        }
        if(MyTools.isNotEmpty(split[63])){
            fcc.setLeijiqizhongheji1(new BigDecimal(split[63]));
        }
        if(MyTools.isNotEmpty(split[64])){
            fcc.setMoqizhongfeixian2(new BigDecimal(split[64]));
        }
        if(MyTools.isNotEmpty(split[65])){
            fcc.setMoqizhongxian2(new BigDecimal(split[65]));
        }
        if(MyTools.isNotEmpty(split[66])){
            fcc.setMoqizhongheji2(new BigDecimal(split[66]));
        }
        if(MyTools.isNotEmpty(split[67])){
            fcc.setLeijiqizhongfeixian2(new BigDecimal(split[67]));
        }
        if(MyTools.isNotEmpty(split[68])){
            fcc.setLeijiqizhongxian2(new BigDecimal(split[68]));
        }
        if(MyTools.isNotEmpty(split[69])){
            fcc.setLeijiqizhongheji2(new BigDecimal(split[69]));
        }
        if(MyTools.isNotEmpty(split[70])){
            fcc.setMoqizhongfeixian3(new BigDecimal(split[70]));
        }
        if(MyTools.isNotEmpty(split[71])){
            fcc.setMoqizhongxian3(new BigDecimal(split[71]));
        }
        if(MyTools.isNotEmpty(split[72])){
            fcc.setMoqizhongheji3(new BigDecimal(split[72]));
        }
        if(MyTools.isNotEmpty(split[73])){
            fcc.setLeijiqizhongfeixian3(new BigDecimal(split[73]));
        }
        if(MyTools.isNotEmpty(split[74])){
            fcc.setLeijiqizhongxian3(new BigDecimal(split[74]));
        }
        if(MyTools.isNotEmpty(split[75])){
            fcc.setLeijiqizhongheji3(new BigDecimal(split[75]));
        }
        if(MyTools.isNotEmpty(split[76])){
            fcc.setMoqizhongfeixian4(new BigDecimal(split[76]));
        }
        if(MyTools.isNotEmpty(split[77])){
            fcc.setMoqizhongxian4(new BigDecimal(split[77]));
        }
        if(MyTools.isNotEmpty(split[78])){
            fcc.setMoqizhongheji4(new BigDecimal(split[78]));
        }
        if(MyTools.isNotEmpty(split[79])){
            fcc.setLeijiqizhongfeixian4(new BigDecimal(split[79]));
        }
        if(MyTools.isNotEmpty(split[80])){
            fcc.setLeijiqizhongxian4(new BigDecimal(split[80]));
        }
        if(MyTools.isNotEmpty(split[81])){
            fcc.setLeijiqizhongheji4(new BigDecimal(split[81]));
        }
        if(MyTools.isNotEmpty(split[82])){
            fcc.setMoguanlifeixian(new BigDecimal(split[82]));
        }
        if(MyTools.isNotEmpty(split[83])){
            fcc.setMoguanlixian(new BigDecimal(split[83]));
        }
        if(MyTools.isNotEmpty(split[84])){
            fcc.setMoguanliheji(new BigDecimal(split[84]));
        }
        if(MyTools.isNotEmpty(split[85])){
            fcc.setLeijiguanlifeixian(new BigDecimal(split[85]));
        }
        if(MyTools.isNotEmpty(split[86])){
            fcc.setLeijiguanlixian(new BigDecimal(split[86]));
        }
        if(MyTools.isNotEmpty(split[87])){
            fcc.setLeijiguanliheji(new BigDecimal(split[87]));
        }
        if(MyTools.isNotEmpty(split[88])){
            fcc.setMochouzifeixian(new BigDecimal(split[88]));
        }
        if(MyTools.isNotEmpty(split[89])){
            fcc.setMochouzixian(new BigDecimal(split[89]));
        }
        if(MyTools.isNotEmpty(split[90])){
            fcc.setMochouziheji(new BigDecimal(split[90]));
        }
        if(MyTools.isNotEmpty(split[91])){
            fcc.setLeijichouzifeixian(new BigDecimal(split[91]));
        }
        if(MyTools.isNotEmpty(split[92])){
            fcc.setLeijichouzixian(new BigDecimal(split[92]));
        }
        if(MyTools.isNotEmpty(split[93])){
            fcc.setLeijichouziheji(new BigDecimal(split[93]));
        }
        if(MyTools.isNotEmpty(split[94])){
            fcc.setMoqitafeiyongfei(new BigDecimal(split[94]));
        }
        if(MyTools.isNotEmpty(split[95])){
            fcc.setMoqitafeiyongxian(new BigDecimal(split[95]));
        }
        if(MyTools.isNotEmpty(split[96])){
            fcc.setMoqitafeiyongheji(new BigDecimal(split[96]));
        }
        if(MyTools.isNotEmpty(split[97])){
            fcc.setLeijiqitafeiyongfeixian(new BigDecimal(split[97]));
        }
        if(MyTools.isNotEmpty(split[98])){
            fcc.setLeijiqitafeiyongxian(new BigDecimal(split[98]));
        }
        if(MyTools.isNotEmpty(split[99])){
            fcc.setLeijiqitafeiyongheji(new BigDecimal(split[99]));
        }
        if(MyTools.isNotEmpty(split[100])){
            fcc.setMofeiyonghejifei(new BigDecimal(split[100]));
        }
        if(MyTools.isNotEmpty(split[101])){
            fcc.setMofeiyonghejixian(new BigDecimal(split[101]));
        }
        if(MyTools.isNotEmpty(split[102])){
            fcc.setMofeiyonghejiheji(new BigDecimal(split[102]));
        }
        if(MyTools.isNotEmpty(split[103])){
            fcc.setLeijifeiyonghejifei(new BigDecimal(split[103]));
        }
        if(MyTools.isNotEmpty(split[104])){
            fcc.setLeijifeiyonghejixian(new BigDecimal(split[104]));
        }
        if(MyTools.isNotEmpty(split[105])){
            fcc.setLeijifeiyonghejiheji(new BigDecimal(split[105]));
        }
        if(MyTools.isNotEmpty(split[106])){
            fcc.setMozhuanfeixian(new BigDecimal(split[106]));
        }
        if(MyTools.isNotEmpty(split[107])){
            fcc.setMozhuanxian(new BigDecimal(split[107]));
        }
        if(MyTools.isNotEmpty(split[108])){
            fcc.setMozhuanheji(new BigDecimal(split[108]));
        }
        if(MyTools.isNotEmpty(split[109])){
            fcc.setLeijizhuanfeixian(new BigDecimal(split[109]));
        }
        if(MyTools.isNotEmpty(split[110])){
            fcc.setLeijizhuanxian(new BigDecimal(split[110]));
        }
        if(MyTools.isNotEmpty(split[111])){
            fcc.setLeijizhuanheji(new BigDecimal(split[111]));
        }
        if(MyTools.isNotEmpty(split[112])){
            fcc.setMobiandongfeixian(new BigDecimal(split[112]));
        }
        if(MyTools.isNotEmpty(split[113])){
            fcc.setMobiandongxian(new BigDecimal(split[113]));
        }
        if(MyTools.isNotEmpty(split[114])){
            fcc.setMobiandongheji(new BigDecimal(split[114]));
        }
        if(MyTools.isNotEmpty(split[115])){
            fcc.setLeijibiandongfeixian(new BigDecimal(split[115]));
        }
        if(MyTools.isNotEmpty(split[116])){
            fcc.setLeijibiandongxian(new BigDecimal(split[116]));
        }
        if(MyTools.isNotEmpty(split[117])){
            fcc.setLeijibiandongheji(new BigDecimal(split[117]));
        }
        if(MyTools.isNotEmpty(split[118])){
            fcc.setLeijibuzhuxian(new BigDecimal(split[118]));
        }
        if(MyTools.isNotEmpty(split[119])){
            fcc.setLeijibuzhuheji(new BigDecimal(split[119]));
        }
        if(MyTools.isNotEmpty(split[120])){
            fcc.setQizhong1(split[120]);
        }
        if(MyTools.isNotEmpty(split[121])){
            fcc.setQizhong2(split[121]);
        }
        if(MyTools.isNotEmpty(split[122])){
            fcc.setQizhong3(split[122]);
        }
        if(MyTools.isNotEmpty(split[123])){
            fcc.setQizhong4(split[123]);
        }
        if(MyTools.isNotEmpty(split[124])){
            fcc.setMoqizhongfeixian5(new BigDecimal(split[124]));
        }
        if(MyTools.isNotEmpty(split[125])){
            fcc.setMoqizhongfeixian6(new BigDecimal(split[125]));
        }
        if(MyTools.isNotEmpty(split[126])){
            fcc.setMoqizhongfeixian7(new BigDecimal(split[126]));
        }
        if(MyTools.isNotEmpty(split[127])){
            fcc.setMoqizhongfeixian8(new BigDecimal(split[127]));
        }
        if(MyTools.isNotEmpty(split[128])){
            fcc.setMoqizhongxian5(new BigDecimal(split[128]));
        }
        if(MyTools.isNotEmpty(split[129])){
            fcc.setMoqizhongxian6(new BigDecimal(split[129]));
        }
        if(MyTools.isNotEmpty(split[130])){
            fcc.setMoqizhongxian7(new BigDecimal(split[130]));
        }
        if(MyTools.isNotEmpty(split[131])){
            fcc.setMoqizhongxian8(new BigDecimal(split[131]));
        }
        if(MyTools.isNotEmpty(split[132])){
            fcc.setMoqizhongheji5(new BigDecimal(split[132]));
        }
        if(MyTools.isNotEmpty(split[133])){
            fcc.setMoqizhongheji6(new BigDecimal(split[133]));
        }
        if(MyTools.isNotEmpty(split[134])){
            fcc.setMoqizhongheji7(new BigDecimal(split[134]));
        }
        if(MyTools.isNotEmpty(split[135])){
            fcc.setMoqizhongheji8(new BigDecimal(split[135]));
        }
        if(MyTools.isNotEmpty(split[136])){
            fcc.setLeijiqizhongfeixian5(new BigDecimal(split[136]));
        }
        if(MyTools.isNotEmpty(split[137])){
            fcc.setLeijiqizhongfeixian6(new BigDecimal(split[137]));
        }
        if(MyTools.isNotEmpty(split[138])){
            fcc.setLeijiqizhongfeixian7(new BigDecimal(split[138]));
        }
        if(MyTools.isNotEmpty(split[139])){
            fcc.setLeijiqizhongfeixian8(new BigDecimal(split[139]));
        }
        if(MyTools.isNotEmpty(split[140])){
            fcc.setLeijiqizhongxian5(new BigDecimal(split[140]));
        }
        if(MyTools.isNotEmpty(split[141])){
            fcc.setLeijiqizhongxian6(new BigDecimal(split[141]));
        }
        if(MyTools.isNotEmpty(split[142])){
            fcc.setLeijiqizhongxian7(new BigDecimal(split[142]));
        }
        if(MyTools.isNotEmpty(split[143])){
            fcc.setLeijiqizhongxian8(new BigDecimal(split[143]));
        }
        if(MyTools.isNotEmpty(split[144])){
            fcc.setLeijiqizhongheji5(new BigDecimal(split[144]));
        }
        if(MyTools.isNotEmpty(split[145])){
            fcc.setLeijiqizhongheji6(new BigDecimal(split[145]));
        }
        if(MyTools.isNotEmpty(split[146])){
            fcc.setLeijiqizhongheji7(new BigDecimal(split[146]));
        }
        if(MyTools.isNotEmpty(split[147])){
            fcc.setLeijiqizhongheji8(new BigDecimal(split[147]));
        }
        if(MyTools.isNotEmpty(split[148])){
            fcc.setRenyuan1(new BigDecimal(split[148]));
        }
        if(MyTools.isNotEmpty(split[149])){
            fcc.setRenyuan2(new BigDecimal(split[149]));
        }
        if(MyTools.isNotEmpty(split[150])){
            fcc.setRenyuan3(new BigDecimal(split[150]));
        }
        if(MyTools.isNotEmpty(split[151])){
            fcc.setRenyuan4(new BigDecimal(split[151]));
        }
        if(MyTools.isNotEmpty(split[152])){
            fcc.setRenyuan5(new BigDecimal(split[152]));
        }
        if(MyTools.isNotEmpty(split[153])){
            fcc.setRenyuan6(new BigDecimal(split[153]));
        }
        if(MyTools.isNotEmpty(split[154])){
            fcc.setRenyuan7(new BigDecimal(split[154]));
        }
        if(MyTools.isNotEmpty(split[155])){
            fcc.setRichang1(new BigDecimal(split[155]));
        }
        if(MyTools.isNotEmpty(split[156])){
            fcc.setRichang2(new BigDecimal(split[156]));
        }
        if(MyTools.isNotEmpty(split[157])){
            fcc.setRichang3(new BigDecimal(split[157]));
        }
        if(MyTools.isNotEmpty(split[158])){
            fcc.setRichang4(new BigDecimal(split[158]));
        }
        if(MyTools.isNotEmpty(split[159])){
            fcc.setRichang5(new BigDecimal(split[159]));
        }
        if(MyTools.isNotEmpty(split[160])){
            fcc.setRichang6(new BigDecimal(split[160]));
        }
        if(MyTools.isNotEmpty(split[161])){
            fcc.setRichang7(new BigDecimal(split[161]));
        }
        if(MyTools.isNotEmpty(split[162])){
            fcc.setGuding1(new BigDecimal(split[162]));
        }
        if(MyTools.isNotEmpty(split[163])){
            fcc.setGuding2(new BigDecimal(split[163]));
        }
        if(MyTools.isNotEmpty(split[164])){
            fcc.setGuding3(new BigDecimal(split[164]));
        }
        if(MyTools.isNotEmpty(split[165])){
            fcc.setGuding4(new BigDecimal(split[165]));
        }
        if(MyTools.isNotEmpty(split[166])){
            fcc.setGuding5(new BigDecimal(split[166]));
        }
        if(MyTools.isNotEmpty(split[167])){
            fcc.setGuding6(new BigDecimal(split[167]));
        }
        if(MyTools.isNotEmpty(split[168])){
            fcc.setGuding7(new BigDecimal(split[168]));
        }
        if(MyTools.isNotEmpty(split[169])){
            fcc.setShuifei1(new BigDecimal(split[169]));
        }
        if(MyTools.isNotEmpty(split[170])){
            fcc.setShuifei2(new BigDecimal(split[170]));
        }
        if(MyTools.isNotEmpty(split[171])){
            fcc.setShuifei3(new BigDecimal(split[171]));
        }
        if(MyTools.isNotEmpty(split[172])){
            fcc.setShuifei4(new BigDecimal(split[172]));
        }
        if(MyTools.isNotEmpty(split[173])){
            fcc.setShuifei5(new BigDecimal(split[173]));
        }
        if(MyTools.isNotEmpty(split[174])){
            fcc.setShuifei6(new BigDecimal(split[174]));
        }
        if(MyTools.isNotEmpty(split[175])){
            fcc.setShuifei7(new BigDecimal(split[175]));
        }
        if(MyTools.isNotEmpty(split[176])){
            fcc.setTjnjjieguo1(split[176]);
        }
        if(MyTools.isNotEmpty(split[177])){
            fcc.setTjnjjieguo2(split[177]);
        }
        if(MyTools.isNotEmpty(split[178])){
            fcc.setTjnjyijian1(split[178]);
        }
        if(MyTools.isNotEmpty(split[179])){
            fcc.setTjnjyijian2(split[179]);
        }
        if(MyTools.isNotEmpty(split[180])){
            fcc.setTjnjxingming1(split[180]);
        }
        if(MyTools.isNotEmpty(split[181])){
            fcc.setTjnjxingming2(split[181]);
        }
        if(MyTools.isNotEmpty(split[182])){
            fcc.setTjnjshijian1(DateUtils.strToDateLong(split[182]));
        }
        if(MyTools.isNotEmpty(split[183])){
            fcc.setTjnjshijian2(DateUtils.strToDateLong(split[183]));
        }
        if(MyTools.isNotEmpty(split[184])){
            fcc.setXianjinjuanzeng(new BigDecimal(split[184]));
        }
        if(MyTools.isNotEmpty(split[185])){
            fcc.setXianjingongyi(new BigDecimal(split[185]));
        }
        if(MyTools.isNotEmpty(split[186])){
            fcc.setXiandingxing(new BigDecimal(split[186]));
        }
        if(MyTools.isNotEmpty(split[187])){
            fcc.setXiandingzichan(new BigDecimal(split[187]));
        }
        if(MyTools.isNotEmpty(split[188])){
            fcc.setQita1(new BigDecimal(split[188]));
        }
        if(MyTools.isNotEmpty(split[189])){
            fcc.setQita2(new BigDecimal(split[189]));
        }
        if(MyTools.isNotEmpty(split[190])){
            fcc.setQita3(new BigDecimal(split[190]));
        }
        if(MyTools.isNotEmpty(split[191])){
            fcc.setQita4(new BigDecimal(split[191]));
        }
        if(MyTools.isNotEmpty(split[192])){
            fcc.setQita5(new BigDecimal(split[192]));
        }
        if(MyTools.isNotEmpty(split[193])){
            fcc.setQita6(new BigDecimal(split[193]));
        }
        if(MyTools.isNotEmpty(split[194])){
            fcc.setFujiafeixian(new BigDecimal(split[194]));
        }
        if(MyTools.isNotEmpty(split[195])){
            fcc.setFujiaxian(new BigDecimal(split[195]));
        }
        if(MyTools.isNotEmpty(split[196])){
            fcc.setFujiaheji(new BigDecimal(split[196]));
        }
        if(MyTools.isNotEmpty(split[197])){
            fcc.setLeijifujiafeixian(new BigDecimal(split[197]));
        }
        if(MyTools.isNotEmpty(split[198])){
            fcc.setLeijifujiaxian(new BigDecimal(split[198]));
        }
        if(MyTools.isNotEmpty(split[199])){
            fcc.setLeijifujiaheji(new BigDecimal(split[199]));
        }

        return fcc;
    }
}

