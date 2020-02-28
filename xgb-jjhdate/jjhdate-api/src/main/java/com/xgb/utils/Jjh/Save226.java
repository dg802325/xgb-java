package com.xgb.utils.Jjh;

;

import com.xgb.model.JcContentAttr1;
import com.xgb.model.StNjInner4;
import com.xgb.util.MyTools;

import java.util.ArrayList;
import java.util.List;
/**
* @Auther: 
* @Date: 
* @Description:
*/
public class Save226 {

    public static List<JcContentAttr1> getEntity(Integer contentId, StNjInner4 oldTable) {
        List<JcContentAttr1> lists = new ArrayList<>();
        JcContentAttr1 jc = null;

        if(MyTools.isNotEmpty(oldTable.getJigouzhidu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ghTccGFQ");
            jc.setAttrValue(oldTable.getJigouzhidu());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getZhuanxiangzhidu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sUuiRYTl");
            jc.setAttrValue(oldTable.getZhuanxiangzhidu());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getDaibiaozhidu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("RiaTBNxe");
            jc.setAttrValue(oldTable.getDaibiaozhidu());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getGuquanzhidu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("uKUFMkwY");
            jc.setAttrValue(oldTable.getGuquanzhidu());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getNeishezhidu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("OdSqcyBt");
            jc.setAttrValue(oldTable.getNeishezhidu());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getZhengshuzhidu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("MAOvvAqI");
            jc.setAttrValue(oldTable.getZhengshuzhidu());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getYinzhangzhidu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("RhgpBoME");
            jc.setAttrValue(oldTable.getYinzhangzhidu());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getRenshizhidu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("TjWPGZOm");
            jc.setAttrValue(oldTable.getRenshizhidu());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getHetongrenshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pCVyaeAe");
            jc.setAttrValue(oldTable.getHetongrenshu().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getShiyebaoxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("GSmRsCGe");
            jc.setAttrValue(oldTable.getShiyebaoxian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getYanglaobaoxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("GfAHzQSD");
            jc.setAttrValue(oldTable.getYanglaobaoxian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getYiliaobaoxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("zuXydEvU");
            jc.setAttrValue(oldTable.getYiliaobaoxian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getGongshangbaoxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sDfAFywQ");
            jc.setAttrValue(oldTable.getGongshangbaoxian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getShengyubaoxian())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("DudwWwaZ");
            jc.setAttrValue(oldTable.getShengyubaoxian().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getJiangchengzhidu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ugJFJNDv");
            jc.setAttrValue(oldTable.getJiangchengzhidu());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getYewupeixunzhidu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("EXORAtYb");
            jc.setAttrValue(oldTable.getYewupeixunzhidu());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getZhiyuanzhezhidu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ctqlJtKx");
            jc.setAttrValue(oldTable.getZhiyuanzhezhidu());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getZhiyuanzheshu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("JIEmtMaY");
            jc.setAttrValue(oldTable.getZhiyuanzheshu().toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getCaiwuguanlizhidu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("APITJDew");
            jc.setAttrValue(oldTable.getCaiwuguanlizhidu());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getZichanguanlizhidu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("NTKZFLxJ");
            jc.setAttrValue(oldTable.getZichanguanlizhidu());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getKaihuyinxing())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("HDcrTlxH");
            jc.setAttrValue(oldTable.getKaihuyinxing());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getYinxingzhanghao())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("rmbkhzh");
            jc.setAttrValue(oldTable.getYinxingzhanghao());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getWaibikaihuyinxing())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("rSYJfGaq");
            jc.setAttrValue(oldTable.getWaibikaihuyinxing());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getWaibiyinxingzhanghao())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ybkhzh");
            jc.setAttrValue(oldTable.getWaibiyinxingzhanghao());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getCaizhengdengji())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("VBjvariH");
            jc.setAttrValue(oldTable.getCaizhengdengji());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getXingmingyi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("QqJyNsuw");
            jc.setAttrValue(oldTable.getXingmingyi());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getGangweiyi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("TDJjeyFg");
            jc.setAttrValue(oldTable.getGangweiyi());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getKuaijizhengyi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("exKrAFLI");
            jc.setAttrValue(oldTable.getKuaijizhengyi());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getJishuzigeyi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("JJEqpllR");
            jc.setAttrValue(oldTable.getJishuzigeyi());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getXingminger())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("sjcNUDPw");
            jc.setAttrValue(oldTable.getXingminger());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getGangweier())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("DVqeJsNk");
            jc.setAttrValue(oldTable.getGangweier());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getKuaijizhenger())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("ObYlITut");
            jc.setAttrValue(oldTable.getKuaijizhenger());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getJishuzigeer())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("MxTjulvu");
            jc.setAttrValue(oldTable.getJishuzigeer());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getXingmingsan())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("XiLAEtio");
            jc.setAttrValue(oldTable.getXingmingsan());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getGangweisan())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("pTjJXPtp");
            jc.setAttrValue(oldTable.getGangweisan());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getKuaijizhengsan())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("FOdnOwkl");
            jc.setAttrValue(oldTable.getKuaijizhengsan());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getJishuzigesan())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("kyXLkOLh");
            jc.setAttrValue(oldTable.getJishuzigesan());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getXinxigongkaizhidu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("etABFTfh");
            jc.setAttrValue(oldTable.getXinxigongkaizhidu());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getQitazhidu())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("jUuCajii");
            jc.setAttrValue(oldTable.getQitazhidu());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getZhengshubaoguandi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("baoguanzai1");
            jc.setAttrValue(oldTable.getZhengshubaoguandi());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getYinzhangbaoguandi())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("baoguanzai2");
            jc.setAttrValue(oldTable.getYinzhangbaoguandi());lists.add(jc);}

        StringBuffer swdj = new StringBuffer();

        if(MyTools.isNotEmpty(oldTable.getGuoshui())){
            swdj.append("国税,");
        }
        if(MyTools.isNotEmpty(oldTable.getDishui())){
            swdj.append("地税,");
        }
        if(MyTools.isNotEmpty(oldTable.getWeidengji())){
            swdj.append("未登记,");
        }
        if(MyTools.isNotEmpty(swdj)){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("xPjjPhgg");
            jc.setAttrValue(swdj.toString());lists.add(jc);}

        StringBuffer pjzl = new StringBuffer();
        if(MyTools.isNotEmpty(oldTable.getYinqianshouju())){
            pjzl.append("行政事业性收费票据,");
        }
        if(MyTools.isNotEmpty(oldTable.getJuanzengshouju())){
            pjzl.append("捐赠收据,");
        }
        if(MyTools.isNotEmpty(oldTable.getQitapiaoju())){
            pjzl.append("其他票据,");
        }

        if(MyTools.isNotEmpty(pjzl)){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("qYWTFbkb");
            jc.setAttrValue(pjzl.toString());lists.add(jc);}

        if(MyTools.isNotEmpty(oldTable.getPiaojuzhongleiqita())){
            jc = new JcContentAttr1();jc.setContentId(contentId);
            jc.setAttrName("piaojuzhongleiqita");
            jc.setAttrValue(oldTable.getYinzhangbaoguandi());lists.add(jc);}

        jc = null;

        return lists;
    }
}

