package com.xgb.comtroller;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* @Auther: Mr Deng
* @Date: 2019-09-08 00:29:04
* @Description:
*/
public class ReptileCarController {

    private static Map<Integer, String> cssMap = new HashMap<Integer, String>();
    static
    {
        cssMap.put(1, "provincetr");// 省
        cssMap.put(2, "citytr");// 市
        cssMap.put(3, "countytr");// 县
        cssMap.put(4, "towntr");// 镇
        cssMap.put(5, "villagetr");// 村
    }
    public static void main(String[] args) throws Exception{
        int level = 1;
        // 获取全国各个省级信息
        Document connect = connect("http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/2018/");
        Elements rowProvince = connect.select("tr." + cssMap.get(level));
        int num=1;//记录省级行政单位个数
        for (Element provinceElement : rowProvince){
            //获取第一级行政单位
            List<Node> child=provinceElement.childNodes();
            for(Node  chi : child){
                List<Node> ch=chi.childNodes();
                List<Node>  ss=ch.get(0).childNodes();
                Node  s=ss.get(0);
                String Cyte=s.toString();
                System.out.println(Cyte+num);
                num++;
                //获取除级行政单位 以外的行政级别
                Elements select =provinceElement.select("a");
                for (Element province : select){
                    List<Node>  pro=province.childNodes();
                    String cy= pro.get(0).toString();
                    //判断是否是同一个一级行政单位，如果是,跳出当次循环
                    if(!Cyte.equals(cy)){
                        continue;
                    }
                    parseNextLevel(province, level + 1);
                }
            }
        }
    }
    private static void parseNextLevel(Element parentElement, int level) throws Exception{
        try {
            Thread.sleep(10);//睡眠一下，否则可能出现各种错误状态码
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        Document doc = connect(parentElement.attr("abs:href"));
        if (doc != null){
            Elements newsHeadlines = doc.select("tr." + cssMap.get(level));//
            // 获取表格的一行数据
            for (Element element : newsHeadlines){
                printInfo(element, level+1);
                Elements select = element.select("a");// 在递归调用的时候，这里是判断是否是村一级的数据，村一级的数据没有a标签
                if (select.size() != 0){
                    if(level<4){
                        parseNextLevel(select.last(), level + 1);
                    }
                }
            }
        }
    }
    static int i=1;
    private static void printInfo(Element element, int level) throws Exception{
        String value1=element.select("td").first().text();
        String value2=element.select("td").last().text();
        //String code=element.select("td").first().text();
        switch(level){
            //获取地级市
            case 3:System.out.println("----"+value2+"------------"+value1);
                break;
            //获取县(区)、县级市
            case 4:System.out.println("--------"+value2+"------------"+value1);
                i++;
                break;
            //获取镇（乡）
            case 5:System.out.println("------------"+value2+"------------"+value1);
                break;
            //获取村委会
            case 6:System.out.println("----------"+value2+"------------"+value1);
                break;
        }
    }
    private static Document connect(String url){
        if (url == null || url.isEmpty()){
            throw new IllegalArgumentException("The input url('" + url + "') is invalid!");
        }else{
            try {
                return Jsoup.connect(url).timeout(100 * 1000).get();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return null;
            }

        }
    }

}
