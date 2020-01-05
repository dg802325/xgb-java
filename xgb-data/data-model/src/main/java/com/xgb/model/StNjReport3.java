package com.xgb.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

public class StNjReport3 {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private String mingcheng;

    private String dengjizhenghao;

    private String jigoudaima;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date chenglishijian;

    private BigDecimal zhucezijin;

    private String youbian;

    private String lianxidianhua;

    private String chuanzhen;

    private String wangzhi;

    private String dianziyouxiang;

    private Integer danweihuiyuanshu;

    private Integer gerenhuiyuanshu;

    private String farenxingming;

    private String lishichangxingming;

    private Integer lishirenshu;

    private Integer fuzerenshu;

    private String mishuchangxingming;

    private Integer changwulishirenshu;

    private Integer gongshengrenshu;

    private Integer gongdirenshu;

    private Integer gongxianrenshu;

    private Integer lizongshu;

    private Integer lishengshu;

    private Integer lilaoling;

    private Integer gongzuorenyuanzongshu;

    private Integer zhuanzhigongzuorenshu;

    private Integer jianzhirenyuanshu;

    private Integer lifanpinrenshu;

    private BigDecimal zhiyuanzherenshu;

    private BigDecimal zhiyuanlaodongshijian;

    private Integer dangyuanrenshu;

    private Integer fenzhijigoushu;

    private Integer daibiaojigoushu;

    private Integer neishejigoushu;

    private Integer zhuanxiangjigoushu;

    private Integer jingyingxingshitishu;

    private Integer gongkaikanwushu;

    private Integer neibukanwushu;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date zhihuibiaozhunshijian;

    private String tonghuibiaozhunhuiyimingcheng;

    private String zhuguandanwei;

    private String xingyefenlei;

    private String zhusuo;

    private String farenzhiwu;

    private String mishuchangwei;

    private String dangjianqingkuang;

    private String yewufanwei;

    private String huifeibiaozhun;

    private String minzhengbumen;

    private String caizhengbumen;

    private String zhusuoxiangxi;

    private String shouji;

    private String xingbie;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date chushengnianyue;

    private String zhengzhimianmao;

    private String xueli;

    private String xingbie2;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date chushengnianyue2;

    private String zhengzhimianmao2;

    private String xueli2;

    private String lianxidianhua2;

    private String xingbie3;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date chushengnianyue3;

    private String zhengzhimianmao3;

    private String xueli3;

    private String chanshengfangshi;

    private String quantinianling;

    private String quantinvxing;

    private String quantibenke;

    private String quantidangyuan;

    private String zhuanzhinianling;

    private String zhuanzhinvxing;

    private String zhuanzhibenke;

    private String zhuanzhidangyuan;

    private String huodongcishu;

    private String juanzengshouru;

    private String huodongzhichu;

    private String fuwuxinnongcun;

    private String qitagongyixiangmu;

    private String guojihezuo;

    private String guojihuiyi;

    private String guojizuzhi;

    private String chuguofangwen;

    private String jieshoukuanwu;

    private String zuzhijuanzeng;

    private String kaizhanfuwu;

    private String zuzhifuwu;

    private String shouhuifei;

    private String fuwushoufei;

    private String dabiaohuodong;

    private String heshubangong;

    private String lishidanweizhiwu;

    private String zhiwujibie;

    private Integer luntanhuodong;

    private Integer gongyihuodong;

    private String tjnjjieguo1;

    private String tjnjjieguo2;

    private String tjnjyijian1;

    private String tjnjyijian2;

    private String tjnjxingming1;

    private String tjnjxingming2;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date tjnjshijian1;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date tjnjshijian2;

    private Integer huiyihuodong;

    private Integer zipingfenshu;

    private String zipingdengji;

    private String paiqianzhidao;

    private String gongzuoqingkuang;

    private Integer qishiyishang;

    private Integer xianchuyixia;

    private Integer lishengzeren;

    private Integer liditingzeren;

    private Integer lixianchuzeren;

    private Integer lishenglishi;

    private Integer liditinglishi;

    private Integer lixianchulishi;

    private String libeian;

    private String qitazuzhi;

    private String hangyebumen;

    private String dangjianbumen;

    private String farendianhua;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date renzhiriqi1;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date renzhiriqi2;

    private String fayanrenxingming;

    private String fayanrendianhua;

    private String fayanrenshouji;

    private String fayanrenyouxiang;

    private String quntuanxinxi;

    private Integer weituoshouquan;

    private Integer zizhipingshen;

    private String mishudanweizhiwu;

    public StNjReport3(Long id, String instanceid, String organizationid, Short status, String mingcheng, String dengjizhenghao, String jigoudaima, Date chenglishijian, BigDecimal zhucezijin, String youbian, String lianxidianhua, String chuanzhen, String wangzhi, String dianziyouxiang, Integer danweihuiyuanshu, Integer gerenhuiyuanshu, String farenxingming, String lishichangxingming, Integer lishirenshu, Integer fuzerenshu, String mishuchangxingming, Integer changwulishirenshu, Integer gongshengrenshu, Integer gongdirenshu, Integer gongxianrenshu, Integer lizongshu, Integer lishengshu, Integer lilaoling, Integer gongzuorenyuanzongshu, Integer zhuanzhigongzuorenshu, Integer jianzhirenyuanshu, Integer lifanpinrenshu, BigDecimal zhiyuanzherenshu, BigDecimal zhiyuanlaodongshijian, Integer dangyuanrenshu, Integer fenzhijigoushu, Integer daibiaojigoushu, Integer neishejigoushu, Integer zhuanxiangjigoushu, Integer jingyingxingshitishu, Integer gongkaikanwushu, Integer neibukanwushu, Date zhihuibiaozhunshijian, String tonghuibiaozhunhuiyimingcheng, String zhuguandanwei, String xingyefenlei, String zhusuo, String farenzhiwu, String mishuchangwei, String dangjianqingkuang, String yewufanwei, String huifeibiaozhun, String minzhengbumen, String caizhengbumen, String zhusuoxiangxi, String shouji, String xingbie, Date chushengnianyue, String zhengzhimianmao, String xueli, String xingbie2, Date chushengnianyue2, String zhengzhimianmao2, String xueli2, String lianxidianhua2, String xingbie3, Date chushengnianyue3, String zhengzhimianmao3, String xueli3, String chanshengfangshi, String quantinianling, String quantinvxing, String quantibenke, String quantidangyuan, String zhuanzhinianling, String zhuanzhinvxing, String zhuanzhibenke, String zhuanzhidangyuan, String huodongcishu, String juanzengshouru, String huodongzhichu, String fuwuxinnongcun, String qitagongyixiangmu, String guojihezuo, String guojihuiyi, String guojizuzhi, String chuguofangwen, String jieshoukuanwu, String zuzhijuanzeng, String kaizhanfuwu, String zuzhifuwu, String shouhuifei, String fuwushoufei, String dabiaohuodong, String heshubangong, String lishidanweizhiwu, String zhiwujibie, Integer luntanhuodong, Integer gongyihuodong, String tjnjjieguo1, String tjnjjieguo2, String tjnjyijian1, String tjnjyijian2, String tjnjxingming1, String tjnjxingming2, Date tjnjshijian1, Date tjnjshijian2, Integer huiyihuodong, Integer zipingfenshu, String zipingdengji, String paiqianzhidao, String gongzuoqingkuang, Integer qishiyishang, Integer xianchuyixia, Integer lishengzeren, Integer liditingzeren, Integer lixianchuzeren, Integer lishenglishi, Integer liditinglishi, Integer lixianchulishi, String libeian, String qitazuzhi, String hangyebumen, String dangjianbumen, String farendianhua, Date renzhiriqi1, Date renzhiriqi2, String fayanrenxingming, String fayanrendianhua, String fayanrenshouji, String fayanrenyouxiang, String quntuanxinxi, Integer weituoshouquan, Integer zizhipingshen, String mishudanweizhiwu) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.mingcheng = mingcheng;
        this.dengjizhenghao = dengjizhenghao;
        this.jigoudaima = jigoudaima;
        this.chenglishijian = chenglishijian;
        this.zhucezijin = zhucezijin;
        this.youbian = youbian;
        this.lianxidianhua = lianxidianhua;
        this.chuanzhen = chuanzhen;
        this.wangzhi = wangzhi;
        this.dianziyouxiang = dianziyouxiang;
        this.danweihuiyuanshu = danweihuiyuanshu;
        this.gerenhuiyuanshu = gerenhuiyuanshu;
        this.farenxingming = farenxingming;
        this.lishichangxingming = lishichangxingming;
        this.lishirenshu = lishirenshu;
        this.fuzerenshu = fuzerenshu;
        this.mishuchangxingming = mishuchangxingming;
        this.changwulishirenshu = changwulishirenshu;
        this.gongshengrenshu = gongshengrenshu;
        this.gongdirenshu = gongdirenshu;
        this.gongxianrenshu = gongxianrenshu;
        this.lizongshu = lizongshu;
        this.lishengshu = lishengshu;
        this.lilaoling = lilaoling;
        this.gongzuorenyuanzongshu = gongzuorenyuanzongshu;
        this.zhuanzhigongzuorenshu = zhuanzhigongzuorenshu;
        this.jianzhirenyuanshu = jianzhirenyuanshu;
        this.lifanpinrenshu = lifanpinrenshu;
        this.zhiyuanzherenshu = zhiyuanzherenshu;
        this.zhiyuanlaodongshijian = zhiyuanlaodongshijian;
        this.dangyuanrenshu = dangyuanrenshu;
        this.fenzhijigoushu = fenzhijigoushu;
        this.daibiaojigoushu = daibiaojigoushu;
        this.neishejigoushu = neishejigoushu;
        this.zhuanxiangjigoushu = zhuanxiangjigoushu;
        this.jingyingxingshitishu = jingyingxingshitishu;
        this.gongkaikanwushu = gongkaikanwushu;
        this.neibukanwushu = neibukanwushu;
        this.zhihuibiaozhunshijian = zhihuibiaozhunshijian;
        this.tonghuibiaozhunhuiyimingcheng = tonghuibiaozhunhuiyimingcheng;
        this.zhuguandanwei = zhuguandanwei;
        this.xingyefenlei = xingyefenlei;
        this.zhusuo = zhusuo;
        this.farenzhiwu = farenzhiwu;
        this.mishuchangwei = mishuchangwei;
        this.dangjianqingkuang = dangjianqingkuang;
        this.yewufanwei = yewufanwei;
        this.huifeibiaozhun = huifeibiaozhun;
        this.minzhengbumen = minzhengbumen;
        this.caizhengbumen = caizhengbumen;
        this.zhusuoxiangxi = zhusuoxiangxi;
        this.shouji = shouji;
        this.xingbie = xingbie;
        this.chushengnianyue = chushengnianyue;
        this.zhengzhimianmao = zhengzhimianmao;
        this.xueli = xueli;
        this.xingbie2 = xingbie2;
        this.chushengnianyue2 = chushengnianyue2;
        this.zhengzhimianmao2 = zhengzhimianmao2;
        this.xueli2 = xueli2;
        this.lianxidianhua2 = lianxidianhua2;
        this.xingbie3 = xingbie3;
        this.chushengnianyue3 = chushengnianyue3;
        this.zhengzhimianmao3 = zhengzhimianmao3;
        this.xueli3 = xueli3;
        this.chanshengfangshi = chanshengfangshi;
        this.quantinianling = quantinianling;
        this.quantinvxing = quantinvxing;
        this.quantibenke = quantibenke;
        this.quantidangyuan = quantidangyuan;
        this.zhuanzhinianling = zhuanzhinianling;
        this.zhuanzhinvxing = zhuanzhinvxing;
        this.zhuanzhibenke = zhuanzhibenke;
        this.zhuanzhidangyuan = zhuanzhidangyuan;
        this.huodongcishu = huodongcishu;
        this.juanzengshouru = juanzengshouru;
        this.huodongzhichu = huodongzhichu;
        this.fuwuxinnongcun = fuwuxinnongcun;
        this.qitagongyixiangmu = qitagongyixiangmu;
        this.guojihezuo = guojihezuo;
        this.guojihuiyi = guojihuiyi;
        this.guojizuzhi = guojizuzhi;
        this.chuguofangwen = chuguofangwen;
        this.jieshoukuanwu = jieshoukuanwu;
        this.zuzhijuanzeng = zuzhijuanzeng;
        this.kaizhanfuwu = kaizhanfuwu;
        this.zuzhifuwu = zuzhifuwu;
        this.shouhuifei = shouhuifei;
        this.fuwushoufei = fuwushoufei;
        this.dabiaohuodong = dabiaohuodong;
        this.heshubangong = heshubangong;
        this.lishidanweizhiwu = lishidanweizhiwu;
        this.zhiwujibie = zhiwujibie;
        this.luntanhuodong = luntanhuodong;
        this.gongyihuodong = gongyihuodong;
        this.tjnjjieguo1 = tjnjjieguo1;
        this.tjnjjieguo2 = tjnjjieguo2;
        this.tjnjyijian1 = tjnjyijian1;
        this.tjnjyijian2 = tjnjyijian2;
        this.tjnjxingming1 = tjnjxingming1;
        this.tjnjxingming2 = tjnjxingming2;
        this.tjnjshijian1 = tjnjshijian1;
        this.tjnjshijian2 = tjnjshijian2;
        this.huiyihuodong = huiyihuodong;
        this.zipingfenshu = zipingfenshu;
        this.zipingdengji = zipingdengji;
        this.paiqianzhidao = paiqianzhidao;
        this.gongzuoqingkuang = gongzuoqingkuang;
        this.qishiyishang = qishiyishang;
        this.xianchuyixia = xianchuyixia;
        this.lishengzeren = lishengzeren;
        this.liditingzeren = liditingzeren;
        this.lixianchuzeren = lixianchuzeren;
        this.lishenglishi = lishenglishi;
        this.liditinglishi = liditinglishi;
        this.lixianchulishi = lixianchulishi;
        this.libeian = libeian;
        this.qitazuzhi = qitazuzhi;
        this.hangyebumen = hangyebumen;
        this.dangjianbumen = dangjianbumen;
        this.farendianhua = farendianhua;
        this.renzhiriqi1 = renzhiriqi1;
        this.renzhiriqi2 = renzhiriqi2;
        this.fayanrenxingming = fayanrenxingming;
        this.fayanrendianhua = fayanrendianhua;
        this.fayanrenshouji = fayanrenshouji;
        this.fayanrenyouxiang = fayanrenyouxiang;
        this.quntuanxinxi = quntuanxinxi;
        this.weituoshouquan = weituoshouquan;
        this.zizhipingshen = zizhipingshen;
        this.mishudanweizhiwu = mishudanweizhiwu;
    }

    public StNjReport3() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInstanceid() {
        return instanceid;
    }

    public void setInstanceid(String instanceid) {
        this.instanceid = instanceid == null ? null : instanceid.trim();
    }

    public String getOrganizationid() {
        return organizationid;
    }

    public void setOrganizationid(String organizationid) {
        this.organizationid = organizationid == null ? null : organizationid.trim();
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public String getMingcheng() {
        return mingcheng;
    }

    public void setMingcheng(String mingcheng) {
        this.mingcheng = mingcheng == null ? null : mingcheng.trim();
    }

    public String getDengjizhenghao() {
        return dengjizhenghao;
    }

    public void setDengjizhenghao(String dengjizhenghao) {
        this.dengjizhenghao = dengjizhenghao == null ? null : dengjizhenghao.trim();
    }

    public String getJigoudaima() {
        return jigoudaima;
    }

    public void setJigoudaima(String jigoudaima) {
        this.jigoudaima = jigoudaima == null ? null : jigoudaima.trim();
    }

    public Date getChenglishijian() {
        return chenglishijian;
    }

    public void setChenglishijian(Date chenglishijian) {
        this.chenglishijian = chenglishijian;
    }

    public BigDecimal getZhucezijin() {
        return zhucezijin;
    }

    public void setZhucezijin(BigDecimal zhucezijin) {
        this.zhucezijin = zhucezijin;
    }

    public String getYoubian() {
        return youbian;
    }

    public void setYoubian(String youbian) {
        this.youbian = youbian == null ? null : youbian.trim();
    }

    public String getLianxidianhua() {
        return lianxidianhua;
    }

    public void setLianxidianhua(String lianxidianhua) {
        this.lianxidianhua = lianxidianhua == null ? null : lianxidianhua.trim();
    }

    public String getChuanzhen() {
        return chuanzhen;
    }

    public void setChuanzhen(String chuanzhen) {
        this.chuanzhen = chuanzhen == null ? null : chuanzhen.trim();
    }

    public String getWangzhi() {
        return wangzhi;
    }

    public void setWangzhi(String wangzhi) {
        this.wangzhi = wangzhi == null ? null : wangzhi.trim();
    }

    public String getDianziyouxiang() {
        return dianziyouxiang;
    }

    public void setDianziyouxiang(String dianziyouxiang) {
        this.dianziyouxiang = dianziyouxiang == null ? null : dianziyouxiang.trim();
    }

    public Integer getDanweihuiyuanshu() {
        return danweihuiyuanshu;
    }

    public void setDanweihuiyuanshu(Integer danweihuiyuanshu) {
        this.danweihuiyuanshu = danweihuiyuanshu;
    }

    public Integer getGerenhuiyuanshu() {
        return gerenhuiyuanshu;
    }

    public void setGerenhuiyuanshu(Integer gerenhuiyuanshu) {
        this.gerenhuiyuanshu = gerenhuiyuanshu;
    }

    public String getFarenxingming() {
        return farenxingming;
    }

    public void setFarenxingming(String farenxingming) {
        this.farenxingming = farenxingming == null ? null : farenxingming.trim();
    }

    public String getLishichangxingming() {
        return lishichangxingming;
    }

    public void setLishichangxingming(String lishichangxingming) {
        this.lishichangxingming = lishichangxingming == null ? null : lishichangxingming.trim();
    }

    public Integer getLishirenshu() {
        return lishirenshu;
    }

    public void setLishirenshu(Integer lishirenshu) {
        this.lishirenshu = lishirenshu;
    }

    public Integer getFuzerenshu() {
        return fuzerenshu;
    }

    public void setFuzerenshu(Integer fuzerenshu) {
        this.fuzerenshu = fuzerenshu;
    }

    public String getMishuchangxingming() {
        return mishuchangxingming;
    }

    public void setMishuchangxingming(String mishuchangxingming) {
        this.mishuchangxingming = mishuchangxingming == null ? null : mishuchangxingming.trim();
    }

    public Integer getChangwulishirenshu() {
        return changwulishirenshu;
    }

    public void setChangwulishirenshu(Integer changwulishirenshu) {
        this.changwulishirenshu = changwulishirenshu;
    }

    public Integer getGongshengrenshu() {
        return gongshengrenshu;
    }

    public void setGongshengrenshu(Integer gongshengrenshu) {
        this.gongshengrenshu = gongshengrenshu;
    }

    public Integer getGongdirenshu() {
        return gongdirenshu;
    }

    public void setGongdirenshu(Integer gongdirenshu) {
        this.gongdirenshu = gongdirenshu;
    }

    public Integer getGongxianrenshu() {
        return gongxianrenshu;
    }

    public void setGongxianrenshu(Integer gongxianrenshu) {
        this.gongxianrenshu = gongxianrenshu;
    }

    public Integer getLizongshu() {
        return lizongshu;
    }

    public void setLizongshu(Integer lizongshu) {
        this.lizongshu = lizongshu;
    }

    public Integer getLishengshu() {
        return lishengshu;
    }

    public void setLishengshu(Integer lishengshu) {
        this.lishengshu = lishengshu;
    }

    public Integer getLilaoling() {
        return lilaoling;
    }

    public void setLilaoling(Integer lilaoling) {
        this.lilaoling = lilaoling;
    }

    public Integer getGongzuorenyuanzongshu() {
        return gongzuorenyuanzongshu;
    }

    public void setGongzuorenyuanzongshu(Integer gongzuorenyuanzongshu) {
        this.gongzuorenyuanzongshu = gongzuorenyuanzongshu;
    }

    public Integer getZhuanzhigongzuorenshu() {
        return zhuanzhigongzuorenshu;
    }

    public void setZhuanzhigongzuorenshu(Integer zhuanzhigongzuorenshu) {
        this.zhuanzhigongzuorenshu = zhuanzhigongzuorenshu;
    }

    public Integer getJianzhirenyuanshu() {
        return jianzhirenyuanshu;
    }

    public void setJianzhirenyuanshu(Integer jianzhirenyuanshu) {
        this.jianzhirenyuanshu = jianzhirenyuanshu;
    }

    public Integer getLifanpinrenshu() {
        return lifanpinrenshu;
    }

    public void setLifanpinrenshu(Integer lifanpinrenshu) {
        this.lifanpinrenshu = lifanpinrenshu;
    }

    public BigDecimal getZhiyuanzherenshu() {
        return zhiyuanzherenshu;
    }

    public void setZhiyuanzherenshu(BigDecimal zhiyuanzherenshu) {
        this.zhiyuanzherenshu = zhiyuanzherenshu;
    }

    public BigDecimal getZhiyuanlaodongshijian() {
        return zhiyuanlaodongshijian;
    }

    public void setZhiyuanlaodongshijian(BigDecimal zhiyuanlaodongshijian) {
        this.zhiyuanlaodongshijian = zhiyuanlaodongshijian;
    }

    public Integer getDangyuanrenshu() {
        return dangyuanrenshu;
    }

    public void setDangyuanrenshu(Integer dangyuanrenshu) {
        this.dangyuanrenshu = dangyuanrenshu;
    }

    public Integer getFenzhijigoushu() {
        return fenzhijigoushu;
    }

    public void setFenzhijigoushu(Integer fenzhijigoushu) {
        this.fenzhijigoushu = fenzhijigoushu;
    }

    public Integer getDaibiaojigoushu() {
        return daibiaojigoushu;
    }

    public void setDaibiaojigoushu(Integer daibiaojigoushu) {
        this.daibiaojigoushu = daibiaojigoushu;
    }

    public Integer getNeishejigoushu() {
        return neishejigoushu;
    }

    public void setNeishejigoushu(Integer neishejigoushu) {
        this.neishejigoushu = neishejigoushu;
    }

    public Integer getZhuanxiangjigoushu() {
        return zhuanxiangjigoushu;
    }

    public void setZhuanxiangjigoushu(Integer zhuanxiangjigoushu) {
        this.zhuanxiangjigoushu = zhuanxiangjigoushu;
    }

    public Integer getJingyingxingshitishu() {
        return jingyingxingshitishu;
    }

    public void setJingyingxingshitishu(Integer jingyingxingshitishu) {
        this.jingyingxingshitishu = jingyingxingshitishu;
    }

    public Integer getGongkaikanwushu() {
        return gongkaikanwushu;
    }

    public void setGongkaikanwushu(Integer gongkaikanwushu) {
        this.gongkaikanwushu = gongkaikanwushu;
    }

    public Integer getNeibukanwushu() {
        return neibukanwushu;
    }

    public void setNeibukanwushu(Integer neibukanwushu) {
        this.neibukanwushu = neibukanwushu;
    }

    public Date getZhihuibiaozhunshijian() {
        return zhihuibiaozhunshijian;
    }

    public void setZhihuibiaozhunshijian(Date zhihuibiaozhunshijian) {
        this.zhihuibiaozhunshijian = zhihuibiaozhunshijian;
    }

    public String getTonghuibiaozhunhuiyimingcheng() {
        return tonghuibiaozhunhuiyimingcheng;
    }

    public void setTonghuibiaozhunhuiyimingcheng(String tonghuibiaozhunhuiyimingcheng) {
        this.tonghuibiaozhunhuiyimingcheng = tonghuibiaozhunhuiyimingcheng == null ? null : tonghuibiaozhunhuiyimingcheng.trim();
    }

    public String getZhuguandanwei() {
        return zhuguandanwei;
    }

    public void setZhuguandanwei(String zhuguandanwei) {
        this.zhuguandanwei = zhuguandanwei == null ? null : zhuguandanwei.trim();
    }

    public String getXingyefenlei() {
        return xingyefenlei;
    }

    public void setXingyefenlei(String xingyefenlei) {
        this.xingyefenlei = xingyefenlei == null ? null : xingyefenlei.trim();
    }

    public String getZhusuo() {
        return zhusuo;
    }

    public void setZhusuo(String zhusuo) {
        this.zhusuo = zhusuo == null ? null : zhusuo.trim();
    }

    public String getFarenzhiwu() {
        return farenzhiwu;
    }

    public void setFarenzhiwu(String farenzhiwu) {
        this.farenzhiwu = farenzhiwu == null ? null : farenzhiwu.trim();
    }

    public String getMishuchangwei() {
        return mishuchangwei;
    }

    public void setMishuchangwei(String mishuchangwei) {
        this.mishuchangwei = mishuchangwei == null ? null : mishuchangwei.trim();
    }

    public String getDangjianqingkuang() {
        return dangjianqingkuang;
    }

    public void setDangjianqingkuang(String dangjianqingkuang) {
        this.dangjianqingkuang = dangjianqingkuang == null ? null : dangjianqingkuang.trim();
    }

    public String getYewufanwei() {
        return yewufanwei;
    }

    public void setYewufanwei(String yewufanwei) {
        this.yewufanwei = yewufanwei == null ? null : yewufanwei.trim();
    }

    public String getHuifeibiaozhun() {
        return huifeibiaozhun;
    }

    public void setHuifeibiaozhun(String huifeibiaozhun) {
        this.huifeibiaozhun = huifeibiaozhun == null ? null : huifeibiaozhun.trim();
    }

    public String getMinzhengbumen() {
        return minzhengbumen;
    }

    public void setMinzhengbumen(String minzhengbumen) {
        this.minzhengbumen = minzhengbumen == null ? null : minzhengbumen.trim();
    }

    public String getCaizhengbumen() {
        return caizhengbumen;
    }

    public void setCaizhengbumen(String caizhengbumen) {
        this.caizhengbumen = caizhengbumen == null ? null : caizhengbumen.trim();
    }

    public String getZhusuoxiangxi() {
        return zhusuoxiangxi;
    }

    public void setZhusuoxiangxi(String zhusuoxiangxi) {
        this.zhusuoxiangxi = zhusuoxiangxi == null ? null : zhusuoxiangxi.trim();
    }

    public String getShouji() {
        return shouji;
    }

    public void setShouji(String shouji) {
        this.shouji = shouji == null ? null : shouji.trim();
    }

    public String getXingbie() {
        return xingbie;
    }

    public void setXingbie(String xingbie) {
        this.xingbie = xingbie == null ? null : xingbie.trim();
    }

    public Date getChushengnianyue() {
        return chushengnianyue;
    }

    public void setChushengnianyue(Date chushengnianyue) {
        this.chushengnianyue = chushengnianyue;
    }

    public String getZhengzhimianmao() {
        return zhengzhimianmao;
    }

    public void setZhengzhimianmao(String zhengzhimianmao) {
        this.zhengzhimianmao = zhengzhimianmao == null ? null : zhengzhimianmao.trim();
    }

    public String getXueli() {
        return xueli;
    }

    public void setXueli(String xueli) {
        this.xueli = xueli == null ? null : xueli.trim();
    }

    public String getXingbie2() {
        return xingbie2;
    }

    public void setXingbie2(String xingbie2) {
        this.xingbie2 = xingbie2 == null ? null : xingbie2.trim();
    }

    public Date getChushengnianyue2() {
        return chushengnianyue2;
    }

    public void setChushengnianyue2(Date chushengnianyue2) {
        this.chushengnianyue2 = chushengnianyue2;
    }

    public String getZhengzhimianmao2() {
        return zhengzhimianmao2;
    }

    public void setZhengzhimianmao2(String zhengzhimianmao2) {
        this.zhengzhimianmao2 = zhengzhimianmao2 == null ? null : zhengzhimianmao2.trim();
    }

    public String getXueli2() {
        return xueli2;
    }

    public void setXueli2(String xueli2) {
        this.xueli2 = xueli2 == null ? null : xueli2.trim();
    }

    public String getLianxidianhua2() {
        return lianxidianhua2;
    }

    public void setLianxidianhua2(String lianxidianhua2) {
        this.lianxidianhua2 = lianxidianhua2 == null ? null : lianxidianhua2.trim();
    }

    public String getXingbie3() {
        return xingbie3;
    }

    public void setXingbie3(String xingbie3) {
        this.xingbie3 = xingbie3 == null ? null : xingbie3.trim();
    }

    public Date getChushengnianyue3() {
        return chushengnianyue3;
    }

    public void setChushengnianyue3(Date chushengnianyue3) {
        this.chushengnianyue3 = chushengnianyue3;
    }

    public String getZhengzhimianmao3() {
        return zhengzhimianmao3;
    }

    public void setZhengzhimianmao3(String zhengzhimianmao3) {
        this.zhengzhimianmao3 = zhengzhimianmao3 == null ? null : zhengzhimianmao3.trim();
    }

    public String getXueli3() {
        return xueli3;
    }

    public void setXueli3(String xueli3) {
        this.xueli3 = xueli3 == null ? null : xueli3.trim();
    }

    public String getChanshengfangshi() {
        return chanshengfangshi;
    }

    public void setChanshengfangshi(String chanshengfangshi) {
        this.chanshengfangshi = chanshengfangshi == null ? null : chanshengfangshi.trim();
    }

    public String getQuantinianling() {
        return quantinianling;
    }

    public void setQuantinianling(String quantinianling) {
        this.quantinianling = quantinianling == null ? null : quantinianling.trim();
    }

    public String getQuantinvxing() {
        return quantinvxing;
    }

    public void setQuantinvxing(String quantinvxing) {
        this.quantinvxing = quantinvxing == null ? null : quantinvxing.trim();
    }

    public String getQuantibenke() {
        return quantibenke;
    }

    public void setQuantibenke(String quantibenke) {
        this.quantibenke = quantibenke == null ? null : quantibenke.trim();
    }

    public String getQuantidangyuan() {
        return quantidangyuan;
    }

    public void setQuantidangyuan(String quantidangyuan) {
        this.quantidangyuan = quantidangyuan == null ? null : quantidangyuan.trim();
    }

    public String getZhuanzhinianling() {
        return zhuanzhinianling;
    }

    public void setZhuanzhinianling(String zhuanzhinianling) {
        this.zhuanzhinianling = zhuanzhinianling == null ? null : zhuanzhinianling.trim();
    }

    public String getZhuanzhinvxing() {
        return zhuanzhinvxing;
    }

    public void setZhuanzhinvxing(String zhuanzhinvxing) {
        this.zhuanzhinvxing = zhuanzhinvxing == null ? null : zhuanzhinvxing.trim();
    }

    public String getZhuanzhibenke() {
        return zhuanzhibenke;
    }

    public void setZhuanzhibenke(String zhuanzhibenke) {
        this.zhuanzhibenke = zhuanzhibenke == null ? null : zhuanzhibenke.trim();
    }

    public String getZhuanzhidangyuan() {
        return zhuanzhidangyuan;
    }

    public void setZhuanzhidangyuan(String zhuanzhidangyuan) {
        this.zhuanzhidangyuan = zhuanzhidangyuan == null ? null : zhuanzhidangyuan.trim();
    }

    public String getHuodongcishu() {
        return huodongcishu;
    }

    public void setHuodongcishu(String huodongcishu) {
        this.huodongcishu = huodongcishu == null ? null : huodongcishu.trim();
    }

    public String getJuanzengshouru() {
        return juanzengshouru;
    }

    public void setJuanzengshouru(String juanzengshouru) {
        this.juanzengshouru = juanzengshouru == null ? null : juanzengshouru.trim();
    }

    public String getHuodongzhichu() {
        return huodongzhichu;
    }

    public void setHuodongzhichu(String huodongzhichu) {
        this.huodongzhichu = huodongzhichu == null ? null : huodongzhichu.trim();
    }

    public String getFuwuxinnongcun() {
        return fuwuxinnongcun;
    }

    public void setFuwuxinnongcun(String fuwuxinnongcun) {
        this.fuwuxinnongcun = fuwuxinnongcun == null ? null : fuwuxinnongcun.trim();
    }

    public String getQitagongyixiangmu() {
        return qitagongyixiangmu;
    }

    public void setQitagongyixiangmu(String qitagongyixiangmu) {
        this.qitagongyixiangmu = qitagongyixiangmu == null ? null : qitagongyixiangmu.trim();
    }

    public String getGuojihezuo() {
        return guojihezuo;
    }

    public void setGuojihezuo(String guojihezuo) {
        this.guojihezuo = guojihezuo == null ? null : guojihezuo.trim();
    }

    public String getGuojihuiyi() {
        return guojihuiyi;
    }

    public void setGuojihuiyi(String guojihuiyi) {
        this.guojihuiyi = guojihuiyi == null ? null : guojihuiyi.trim();
    }

    public String getGuojizuzhi() {
        return guojizuzhi;
    }

    public void setGuojizuzhi(String guojizuzhi) {
        this.guojizuzhi = guojizuzhi == null ? null : guojizuzhi.trim();
    }

    public String getChuguofangwen() {
        return chuguofangwen;
    }

    public void setChuguofangwen(String chuguofangwen) {
        this.chuguofangwen = chuguofangwen == null ? null : chuguofangwen.trim();
    }

    public String getJieshoukuanwu() {
        return jieshoukuanwu;
    }

    public void setJieshoukuanwu(String jieshoukuanwu) {
        this.jieshoukuanwu = jieshoukuanwu == null ? null : jieshoukuanwu.trim();
    }

    public String getZuzhijuanzeng() {
        return zuzhijuanzeng;
    }

    public void setZuzhijuanzeng(String zuzhijuanzeng) {
        this.zuzhijuanzeng = zuzhijuanzeng == null ? null : zuzhijuanzeng.trim();
    }

    public String getKaizhanfuwu() {
        return kaizhanfuwu;
    }

    public void setKaizhanfuwu(String kaizhanfuwu) {
        this.kaizhanfuwu = kaizhanfuwu == null ? null : kaizhanfuwu.trim();
    }

    public String getZuzhifuwu() {
        return zuzhifuwu;
    }

    public void setZuzhifuwu(String zuzhifuwu) {
        this.zuzhifuwu = zuzhifuwu == null ? null : zuzhifuwu.trim();
    }

    public String getShouhuifei() {
        return shouhuifei;
    }

    public void setShouhuifei(String shouhuifei) {
        this.shouhuifei = shouhuifei == null ? null : shouhuifei.trim();
    }

    public String getFuwushoufei() {
        return fuwushoufei;
    }

    public void setFuwushoufei(String fuwushoufei) {
        this.fuwushoufei = fuwushoufei == null ? null : fuwushoufei.trim();
    }

    public String getDabiaohuodong() {
        return dabiaohuodong;
    }

    public void setDabiaohuodong(String dabiaohuodong) {
        this.dabiaohuodong = dabiaohuodong == null ? null : dabiaohuodong.trim();
    }

    public String getHeshubangong() {
        return heshubangong;
    }

    public void setHeshubangong(String heshubangong) {
        this.heshubangong = heshubangong == null ? null : heshubangong.trim();
    }

    public String getLishidanweizhiwu() {
        return lishidanweizhiwu;
    }

    public void setLishidanweizhiwu(String lishidanweizhiwu) {
        this.lishidanweizhiwu = lishidanweizhiwu == null ? null : lishidanweizhiwu.trim();
    }

    public String getZhiwujibie() {
        return zhiwujibie;
    }

    public void setZhiwujibie(String zhiwujibie) {
        this.zhiwujibie = zhiwujibie == null ? null : zhiwujibie.trim();
    }

    public Integer getLuntanhuodong() {
        return luntanhuodong;
    }

    public void setLuntanhuodong(Integer luntanhuodong) {
        this.luntanhuodong = luntanhuodong;
    }

    public Integer getGongyihuodong() {
        return gongyihuodong;
    }

    public void setGongyihuodong(Integer gongyihuodong) {
        this.gongyihuodong = gongyihuodong;
    }

    public String getTjnjjieguo1() {
        return tjnjjieguo1;
    }

    public void setTjnjjieguo1(String tjnjjieguo1) {
        this.tjnjjieguo1 = tjnjjieguo1 == null ? null : tjnjjieguo1.trim();
    }

    public String getTjnjjieguo2() {
        return tjnjjieguo2;
    }

    public void setTjnjjieguo2(String tjnjjieguo2) {
        this.tjnjjieguo2 = tjnjjieguo2 == null ? null : tjnjjieguo2.trim();
    }

    public String getTjnjyijian1() {
        return tjnjyijian1;
    }

    public void setTjnjyijian1(String tjnjyijian1) {
        this.tjnjyijian1 = tjnjyijian1 == null ? null : tjnjyijian1.trim();
    }

    public String getTjnjyijian2() {
        return tjnjyijian2;
    }

    public void setTjnjyijian2(String tjnjyijian2) {
        this.tjnjyijian2 = tjnjyijian2 == null ? null : tjnjyijian2.trim();
    }

    public String getTjnjxingming1() {
        return tjnjxingming1;
    }

    public void setTjnjxingming1(String tjnjxingming1) {
        this.tjnjxingming1 = tjnjxingming1 == null ? null : tjnjxingming1.trim();
    }

    public String getTjnjxingming2() {
        return tjnjxingming2;
    }

    public void setTjnjxingming2(String tjnjxingming2) {
        this.tjnjxingming2 = tjnjxingming2 == null ? null : tjnjxingming2.trim();
    }

    public Date getTjnjshijian1() {
        return tjnjshijian1;
    }

    public void setTjnjshijian1(Date tjnjshijian1) {
        this.tjnjshijian1 = tjnjshijian1;
    }

    public Date getTjnjshijian2() {
        return tjnjshijian2;
    }

    public void setTjnjshijian2(Date tjnjshijian2) {
        this.tjnjshijian2 = tjnjshijian2;
    }

    public Integer getHuiyihuodong() {
        return huiyihuodong;
    }

    public void setHuiyihuodong(Integer huiyihuodong) {
        this.huiyihuodong = huiyihuodong;
    }

    public Integer getZipingfenshu() {
        return zipingfenshu;
    }

    public void setZipingfenshu(Integer zipingfenshu) {
        this.zipingfenshu = zipingfenshu;
    }

    public String getZipingdengji() {
        return zipingdengji;
    }

    public void setZipingdengji(String zipingdengji) {
        this.zipingdengji = zipingdengji == null ? null : zipingdengji.trim();
    }

    public String getPaiqianzhidao() {
        return paiqianzhidao;
    }

    public void setPaiqianzhidao(String paiqianzhidao) {
        this.paiqianzhidao = paiqianzhidao == null ? null : paiqianzhidao.trim();
    }

    public String getGongzuoqingkuang() {
        return gongzuoqingkuang;
    }

    public void setGongzuoqingkuang(String gongzuoqingkuang) {
        this.gongzuoqingkuang = gongzuoqingkuang == null ? null : gongzuoqingkuang.trim();
    }

    public Integer getQishiyishang() {
        return qishiyishang;
    }

    public void setQishiyishang(Integer qishiyishang) {
        this.qishiyishang = qishiyishang;
    }

    public Integer getXianchuyixia() {
        return xianchuyixia;
    }

    public void setXianchuyixia(Integer xianchuyixia) {
        this.xianchuyixia = xianchuyixia;
    }

    public Integer getLishengzeren() {
        return lishengzeren;
    }

    public void setLishengzeren(Integer lishengzeren) {
        this.lishengzeren = lishengzeren;
    }

    public Integer getLiditingzeren() {
        return liditingzeren;
    }

    public void setLiditingzeren(Integer liditingzeren) {
        this.liditingzeren = liditingzeren;
    }

    public Integer getLixianchuzeren() {
        return lixianchuzeren;
    }

    public void setLixianchuzeren(Integer lixianchuzeren) {
        this.lixianchuzeren = lixianchuzeren;
    }

    public Integer getLishenglishi() {
        return lishenglishi;
    }

    public void setLishenglishi(Integer lishenglishi) {
        this.lishenglishi = lishenglishi;
    }

    public Integer getLiditinglishi() {
        return liditinglishi;
    }

    public void setLiditinglishi(Integer liditinglishi) {
        this.liditinglishi = liditinglishi;
    }

    public Integer getLixianchulishi() {
        return lixianchulishi;
    }

    public void setLixianchulishi(Integer lixianchulishi) {
        this.lixianchulishi = lixianchulishi;
    }

    public String getLibeian() {
        return libeian;
    }

    public void setLibeian(String libeian) {
        this.libeian = libeian == null ? null : libeian.trim();
    }

    public String getQitazuzhi() {
        return qitazuzhi;
    }

    public void setQitazuzhi(String qitazuzhi) {
        this.qitazuzhi = qitazuzhi == null ? null : qitazuzhi.trim();
    }

    public String getHangyebumen() {
        return hangyebumen;
    }

    public void setHangyebumen(String hangyebumen) {
        this.hangyebumen = hangyebumen == null ? null : hangyebumen.trim();
    }

    public String getDangjianbumen() {
        return dangjianbumen;
    }

    public void setDangjianbumen(String dangjianbumen) {
        this.dangjianbumen = dangjianbumen == null ? null : dangjianbumen.trim();
    }

    public String getFarendianhua() {
        return farendianhua;
    }

    public void setFarendianhua(String farendianhua) {
        this.farendianhua = farendianhua == null ? null : farendianhua.trim();
    }

    public Date getRenzhiriqi1() {
        return renzhiriqi1;
    }

    public void setRenzhiriqi1(Date renzhiriqi1) {
        this.renzhiriqi1 = renzhiriqi1;
    }

    public Date getRenzhiriqi2() {
        return renzhiriqi2;
    }

    public void setRenzhiriqi2(Date renzhiriqi2) {
        this.renzhiriqi2 = renzhiriqi2;
    }

    public String getFayanrenxingming() {
        return fayanrenxingming;
    }

    public void setFayanrenxingming(String fayanrenxingming) {
        this.fayanrenxingming = fayanrenxingming == null ? null : fayanrenxingming.trim();
    }

    public String getFayanrendianhua() {
        return fayanrendianhua;
    }

    public void setFayanrendianhua(String fayanrendianhua) {
        this.fayanrendianhua = fayanrendianhua == null ? null : fayanrendianhua.trim();
    }

    public String getFayanrenshouji() {
        return fayanrenshouji;
    }

    public void setFayanrenshouji(String fayanrenshouji) {
        this.fayanrenshouji = fayanrenshouji == null ? null : fayanrenshouji.trim();
    }

    public String getFayanrenyouxiang() {
        return fayanrenyouxiang;
    }

    public void setFayanrenyouxiang(String fayanrenyouxiang) {
        this.fayanrenyouxiang = fayanrenyouxiang == null ? null : fayanrenyouxiang.trim();
    }

    public String getQuntuanxinxi() {
        return quntuanxinxi;
    }

    public void setQuntuanxinxi(String quntuanxinxi) {
        this.quntuanxinxi = quntuanxinxi == null ? null : quntuanxinxi.trim();
    }

    public Integer getWeituoshouquan() {
        return weituoshouquan;
    }

    public void setWeituoshouquan(Integer weituoshouquan) {
        this.weituoshouquan = weituoshouquan;
    }

    public Integer getZizhipingshen() {
        return zizhipingshen;
    }

    public void setZizhipingshen(Integer zizhipingshen) {
        this.zizhipingshen = zizhipingshen;
    }

    public String getMishudanweizhiwu() {
        return mishudanweizhiwu;
    }

    public void setMishudanweizhiwu(String mishudanweizhiwu) {
        this.mishudanweizhiwu = mishudanweizhiwu == null ? null : mishudanweizhiwu.trim();
    }


    @Override
    public String toString() {
        return "StNjReport3{" +
                "id=" + id +
                ", instanceid='" + instanceid + '\'' +
                ", organizationid='" + organizationid + '\'' +
                ", status=" + status +
                ", mingcheng='" + mingcheng + '\'' +
                ", dengjizhenghao='" + dengjizhenghao + '\'' +
                ", jigoudaima='" + jigoudaima + '\'' +
                ", chenglishijian=" + chenglishijian +
                ", zhucezijin=" + zhucezijin +
                ", youbian='" + youbian + '\'' +
                ", lianxidianhua='" + lianxidianhua + '\'' +
                ", chuanzhen='" + chuanzhen + '\'' +
                ", wangzhi='" + wangzhi + '\'' +
                ", dianziyouxiang='" + dianziyouxiang + '\'' +
                ", danweihuiyuanshu=" + danweihuiyuanshu +
                ", gerenhuiyuanshu=" + gerenhuiyuanshu +
                ", farenxingming='" + farenxingming + '\'' +
                ", lishichangxingming='" + lishichangxingming + '\'' +
                ", lishirenshu=" + lishirenshu +
                ", fuzerenshu=" + fuzerenshu +
                ", mishuchangxingming='" + mishuchangxingming + '\'' +
                ", changwulishirenshu=" + changwulishirenshu +
                ", gongshengrenshu=" + gongshengrenshu +
                ", gongdirenshu=" + gongdirenshu +
                ", gongxianrenshu=" + gongxianrenshu +
                ", lizongshu=" + lizongshu +
                ", lishengshu=" + lishengshu +
                ", lilaoling=" + lilaoling +
                ", gongzuorenyuanzongshu=" + gongzuorenyuanzongshu +
                ", zhuanzhigongzuorenshu=" + zhuanzhigongzuorenshu +
                ", jianzhirenyuanshu=" + jianzhirenyuanshu +
                ", lifanpinrenshu=" + lifanpinrenshu +
                ", zhiyuanzherenshu=" + zhiyuanzherenshu +
                ", zhiyuanlaodongshijian=" + zhiyuanlaodongshijian +
                ", dangyuanrenshu=" + dangyuanrenshu +
                ", fenzhijigoushu=" + fenzhijigoushu +
                ", daibiaojigoushu=" + daibiaojigoushu +
                ", neishejigoushu=" + neishejigoushu +
                ", zhuanxiangjigoushu=" + zhuanxiangjigoushu +
                ", jingyingxingshitishu=" + jingyingxingshitishu +
                ", gongkaikanwushu=" + gongkaikanwushu +
                ", neibukanwushu=" + neibukanwushu +
                ", zhihuibiaozhunshijian=" + zhihuibiaozhunshijian +
                ", tonghuibiaozhunhuiyimingcheng='" + tonghuibiaozhunhuiyimingcheng + '\'' +
                ", zhuguandanwei='" + zhuguandanwei + '\'' +
                ", xingyefenlei='" + xingyefenlei + '\'' +
                ", zhusuo='" + zhusuo + '\'' +
                ", farenzhiwu='" + farenzhiwu + '\'' +
                ", mishuchangwei='" + mishuchangwei + '\'' +
                ", dangjianqingkuang='" + dangjianqingkuang + '\'' +
                ", yewufanwei='" + yewufanwei + '\'' +
                ", huifeibiaozhun='" + huifeibiaozhun + '\'' +
                ", minzhengbumen='" + minzhengbumen + '\'' +
                ", caizhengbumen='" + caizhengbumen + '\'' +
                ", zhusuoxiangxi='" + zhusuoxiangxi + '\'' +
                ", shouji='" + shouji + '\'' +
                ", xingbie='" + xingbie + '\'' +
                ", chushengnianyue=" + chushengnianyue +
                ", zhengzhimianmao='" + zhengzhimianmao + '\'' +
                ", xueli='" + xueli + '\'' +
                ", xingbie2='" + xingbie2 + '\'' +
                ", chushengnianyue2=" + chushengnianyue2 +
                ", zhengzhimianmao2='" + zhengzhimianmao2 + '\'' +
                ", xueli2='" + xueli2 + '\'' +
                ", lianxidianhua2='" + lianxidianhua2 + '\'' +
                ", xingbie3='" + xingbie3 + '\'' +
                ", chushengnianyue3=" + chushengnianyue3 +
                ", zhengzhimianmao3='" + zhengzhimianmao3 + '\'' +
                ", xueli3='" + xueli3 + '\'' +
                ", chanshengfangshi='" + chanshengfangshi + '\'' +
                ", quantinianling='" + quantinianling + '\'' +
                ", quantinvxing='" + quantinvxing + '\'' +
                ", quantibenke='" + quantibenke + '\'' +
                ", quantidangyuan='" + quantidangyuan + '\'' +
                ", zhuanzhinianling='" + zhuanzhinianling + '\'' +
                ", zhuanzhinvxing='" + zhuanzhinvxing + '\'' +
                ", zhuanzhibenke='" + zhuanzhibenke + '\'' +
                ", zhuanzhidangyuan='" + zhuanzhidangyuan + '\'' +
                ", huodongcishu='" + huodongcishu + '\'' +
                ", juanzengshouru='" + juanzengshouru + '\'' +
                ", huodongzhichu='" + huodongzhichu + '\'' +
                ", fuwuxinnongcun='" + fuwuxinnongcun + '\'' +
                ", qitagongyixiangmu='" + qitagongyixiangmu + '\'' +
                ", guojihezuo='" + guojihezuo + '\'' +
                ", guojihuiyi='" + guojihuiyi + '\'' +
                ", guojizuzhi='" + guojizuzhi + '\'' +
                ", chuguofangwen='" + chuguofangwen + '\'' +
                ", jieshoukuanwu='" + jieshoukuanwu + '\'' +
                ", zuzhijuanzeng='" + zuzhijuanzeng + '\'' +
                ", kaizhanfuwu='" + kaizhanfuwu + '\'' +
                ", zuzhifuwu='" + zuzhifuwu + '\'' +
                ", shouhuifei='" + shouhuifei + '\'' +
                ", fuwushoufei='" + fuwushoufei + '\'' +
                ", dabiaohuodong='" + dabiaohuodong + '\'' +
                ", heshubangong='" + heshubangong + '\'' +
                ", lishidanweizhiwu='" + lishidanweizhiwu + '\'' +
                ", zhiwujibie='" + zhiwujibie + '\'' +
                ", luntanhuodong=" + luntanhuodong +
                ", gongyihuodong=" + gongyihuodong +
                ", tjnjjieguo1='" + tjnjjieguo1 + '\'' +
                ", tjnjjieguo2='" + tjnjjieguo2 + '\'' +
                ", tjnjyijian1='" + tjnjyijian1 + '\'' +
                ", tjnjyijian2='" + tjnjyijian2 + '\'' +
                ", tjnjxingming1='" + tjnjxingming1 + '\'' +
                ", tjnjxingming2='" + tjnjxingming2 + '\'' +
                ", tjnjshijian1=" + tjnjshijian1 +
                ", tjnjshijian2=" + tjnjshijian2 +
                ", huiyihuodong=" + huiyihuodong +
                ", zipingfenshu=" + zipingfenshu +
                ", zipingdengji='" + zipingdengji + '\'' +
                ", paiqianzhidao='" + paiqianzhidao + '\'' +
                ", gongzuoqingkuang='" + gongzuoqingkuang + '\'' +
                ", qishiyishang=" + qishiyishang +
                ", xianchuyixia=" + xianchuyixia +
                ", lishengzeren=" + lishengzeren +
                ", liditingzeren=" + liditingzeren +
                ", lixianchuzeren=" + lixianchuzeren +
                ", lishenglishi=" + lishenglishi +
                ", liditinglishi=" + liditinglishi +
                ", lixianchulishi=" + lixianchulishi +
                ", libeian='" + libeian + '\'' +
                ", qitazuzhi='" + qitazuzhi + '\'' +
                ", hangyebumen='" + hangyebumen + '\'' +
                ", dangjianbumen='" + dangjianbumen + '\'' +
                ", farendianhua='" + farendianhua + '\'' +
                ", renzhiriqi1=" + renzhiriqi1 +
                ", renzhiriqi2=" + renzhiriqi2 +
                ", fayanrenxingming='" + fayanrenxingming + '\'' +
                ", fayanrendianhua='" + fayanrendianhua + '\'' +
                ", fayanrenshouji='" + fayanrenshouji + '\'' +
                ", fayanrenyouxiang='" + fayanrenyouxiang + '\'' +
                ", quntuanxinxi='" + quntuanxinxi + '\'' +
                ", weituoshouquan=" + weituoshouquan +
                ", zizhipingshen=" + zizhipingshen +
                ", mishudanweizhiwu='" + mishudanweizhiwu + '\'' +
                '}';
    }
}