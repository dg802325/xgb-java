package com.xgb.model;

import java.math.BigDecimal;
import java.util.Date;

public class StNjReport15 {
    private Long id;

    private String instanceid;

    private String organizationid;

    private Short status;

    private BigDecimal xianjin1;

    private BigDecimal feixianjinzhehe1;

    private BigDecimal heji1;

    private BigDecimal xianjin2;

    private BigDecimal feixianjinzhehe2;

    private BigDecimal heji2;

    private BigDecimal xianjin3;

    private BigDecimal feixianjinzhehe3;

    private BigDecimal heji3;

    private BigDecimal xianjin4;

    private BigDecimal feixianjinzhehe4;

    private BigDecimal heji4;

    private BigDecimal xianjin5;

    private BigDecimal feixianjinzhehe5;

    private BigDecimal heji5;

    private BigDecimal xianjin6;

    private BigDecimal feixianjinzhehe6;

    private BigDecimal heji6;

    private BigDecimal xianjin7;

    private BigDecimal feixianjinzhehe7;

    private BigDecimal heji7;

    private String zhuyaoyongtuheshiyongqingkuang;

    private BigDecimal shouru06;

    private BigDecimal shouru07;

    private BigDecimal shouru08;

    private BigDecimal zhichu06;

    private BigDecimal zhichu07;

    private BigDecimal zhichu08;

    private BigDecimal gongyizhichu06;

    private BigDecimal gongyizhichu07;

    private BigDecimal gongyizhichu08;

    private String shangnianbili06;

    private String shangnianbili07;

    private String shangnianbili08;

    private String bennianbili06;

    private String bennianbili07;

    private String bennianbili08;

    private String tjnjjieguo1;

    private String tjnjjieguo2;

    private String tjnjyijian1;

    private String tjnjyijian2;

    private String tjnjxingming1;

    private String tjnjxingming2;

    private Date tjnjshijian1;

    private Date tjnjshijian2;

    private String juanzenghetong;

    private Long juanzengshu;

    private String wuciqingkuang;

    public StNjReport15(Long id, String instanceid, String organizationid, Short status, BigDecimal xianjin1, BigDecimal feixianjinzhehe1, BigDecimal heji1, BigDecimal xianjin2, BigDecimal feixianjinzhehe2, BigDecimal heji2, BigDecimal xianjin3, BigDecimal feixianjinzhehe3, BigDecimal heji3, BigDecimal xianjin4, BigDecimal feixianjinzhehe4, BigDecimal heji4, BigDecimal xianjin5, BigDecimal feixianjinzhehe5, BigDecimal heji5, BigDecimal xianjin6, BigDecimal feixianjinzhehe6, BigDecimal heji6, BigDecimal xianjin7, BigDecimal feixianjinzhehe7, BigDecimal heji7, String zhuyaoyongtuheshiyongqingkuang, BigDecimal shouru06, BigDecimal shouru07, BigDecimal shouru08, BigDecimal zhichu06, BigDecimal zhichu07, BigDecimal zhichu08, BigDecimal gongyizhichu06, BigDecimal gongyizhichu07, BigDecimal gongyizhichu08, String shangnianbili06, String shangnianbili07, String shangnianbili08, String bennianbili06, String bennianbili07, String bennianbili08, String tjnjjieguo1, String tjnjjieguo2, String tjnjyijian1, String tjnjyijian2, String tjnjxingming1, String tjnjxingming2, Date tjnjshijian1, Date tjnjshijian2, String juanzenghetong, Long juanzengshu, String wuciqingkuang) {
        this.id = id;
        this.instanceid = instanceid;
        this.organizationid = organizationid;
        this.status = status;
        this.xianjin1 = xianjin1;
        this.feixianjinzhehe1 = feixianjinzhehe1;
        this.heji1 = heji1;
        this.xianjin2 = xianjin2;
        this.feixianjinzhehe2 = feixianjinzhehe2;
        this.heji2 = heji2;
        this.xianjin3 = xianjin3;
        this.feixianjinzhehe3 = feixianjinzhehe3;
        this.heji3 = heji3;
        this.xianjin4 = xianjin4;
        this.feixianjinzhehe4 = feixianjinzhehe4;
        this.heji4 = heji4;
        this.xianjin5 = xianjin5;
        this.feixianjinzhehe5 = feixianjinzhehe5;
        this.heji5 = heji5;
        this.xianjin6 = xianjin6;
        this.feixianjinzhehe6 = feixianjinzhehe6;
        this.heji6 = heji6;
        this.xianjin7 = xianjin7;
        this.feixianjinzhehe7 = feixianjinzhehe7;
        this.heji7 = heji7;
        this.zhuyaoyongtuheshiyongqingkuang = zhuyaoyongtuheshiyongqingkuang;
        this.shouru06 = shouru06;
        this.shouru07 = shouru07;
        this.shouru08 = shouru08;
        this.zhichu06 = zhichu06;
        this.zhichu07 = zhichu07;
        this.zhichu08 = zhichu08;
        this.gongyizhichu06 = gongyizhichu06;
        this.gongyizhichu07 = gongyizhichu07;
        this.gongyizhichu08 = gongyizhichu08;
        this.shangnianbili06 = shangnianbili06;
        this.shangnianbili07 = shangnianbili07;
        this.shangnianbili08 = shangnianbili08;
        this.bennianbili06 = bennianbili06;
        this.bennianbili07 = bennianbili07;
        this.bennianbili08 = bennianbili08;
        this.tjnjjieguo1 = tjnjjieguo1;
        this.tjnjjieguo2 = tjnjjieguo2;
        this.tjnjyijian1 = tjnjyijian1;
        this.tjnjyijian2 = tjnjyijian2;
        this.tjnjxingming1 = tjnjxingming1;
        this.tjnjxingming2 = tjnjxingming2;
        this.tjnjshijian1 = tjnjshijian1;
        this.tjnjshijian2 = tjnjshijian2;
        this.juanzenghetong = juanzenghetong;
        this.juanzengshu = juanzengshu;
        this.wuciqingkuang = wuciqingkuang;
    }

    public StNjReport15() {
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

    public BigDecimal getXianjin1() {
        return xianjin1;
    }

    public void setXianjin1(BigDecimal xianjin1) {
        this.xianjin1 = xianjin1;
    }

    public BigDecimal getFeixianjinzhehe1() {
        return feixianjinzhehe1;
    }

    public void setFeixianjinzhehe1(BigDecimal feixianjinzhehe1) {
        this.feixianjinzhehe1 = feixianjinzhehe1;
    }

    public BigDecimal getHeji1() {
        return heji1;
    }

    public void setHeji1(BigDecimal heji1) {
        this.heji1 = heji1;
    }

    public BigDecimal getXianjin2() {
        return xianjin2;
    }

    public void setXianjin2(BigDecimal xianjin2) {
        this.xianjin2 = xianjin2;
    }

    public BigDecimal getFeixianjinzhehe2() {
        return feixianjinzhehe2;
    }

    public void setFeixianjinzhehe2(BigDecimal feixianjinzhehe2) {
        this.feixianjinzhehe2 = feixianjinzhehe2;
    }

    public BigDecimal getHeji2() {
        return heji2;
    }

    public void setHeji2(BigDecimal heji2) {
        this.heji2 = heji2;
    }

    public BigDecimal getXianjin3() {
        return xianjin3;
    }

    public void setXianjin3(BigDecimal xianjin3) {
        this.xianjin3 = xianjin3;
    }

    public BigDecimal getFeixianjinzhehe3() {
        return feixianjinzhehe3;
    }

    public void setFeixianjinzhehe3(BigDecimal feixianjinzhehe3) {
        this.feixianjinzhehe3 = feixianjinzhehe3;
    }

    public BigDecimal getHeji3() {
        return heji3;
    }

    public void setHeji3(BigDecimal heji3) {
        this.heji3 = heji3;
    }

    public BigDecimal getXianjin4() {
        return xianjin4;
    }

    public void setXianjin4(BigDecimal xianjin4) {
        this.xianjin4 = xianjin4;
    }

    public BigDecimal getFeixianjinzhehe4() {
        return feixianjinzhehe4;
    }

    public void setFeixianjinzhehe4(BigDecimal feixianjinzhehe4) {
        this.feixianjinzhehe4 = feixianjinzhehe4;
    }

    public BigDecimal getHeji4() {
        return heji4;
    }

    public void setHeji4(BigDecimal heji4) {
        this.heji4 = heji4;
    }

    public BigDecimal getXianjin5() {
        return xianjin5;
    }

    public void setXianjin5(BigDecimal xianjin5) {
        this.xianjin5 = xianjin5;
    }

    public BigDecimal getFeixianjinzhehe5() {
        return feixianjinzhehe5;
    }

    public void setFeixianjinzhehe5(BigDecimal feixianjinzhehe5) {
        this.feixianjinzhehe5 = feixianjinzhehe5;
    }

    public BigDecimal getHeji5() {
        return heji5;
    }

    public void setHeji5(BigDecimal heji5) {
        this.heji5 = heji5;
    }

    public BigDecimal getXianjin6() {
        return xianjin6;
    }

    public void setXianjin6(BigDecimal xianjin6) {
        this.xianjin6 = xianjin6;
    }

    public BigDecimal getFeixianjinzhehe6() {
        return feixianjinzhehe6;
    }

    public void setFeixianjinzhehe6(BigDecimal feixianjinzhehe6) {
        this.feixianjinzhehe6 = feixianjinzhehe6;
    }

    public BigDecimal getHeji6() {
        return heji6;
    }

    public void setHeji6(BigDecimal heji6) {
        this.heji6 = heji6;
    }

    public BigDecimal getXianjin7() {
        return xianjin7;
    }

    public void setXianjin7(BigDecimal xianjin7) {
        this.xianjin7 = xianjin7;
    }

    public BigDecimal getFeixianjinzhehe7() {
        return feixianjinzhehe7;
    }

    public void setFeixianjinzhehe7(BigDecimal feixianjinzhehe7) {
        this.feixianjinzhehe7 = feixianjinzhehe7;
    }

    public BigDecimal getHeji7() {
        return heji7;
    }

    public void setHeji7(BigDecimal heji7) {
        this.heji7 = heji7;
    }

    public String getZhuyaoyongtuheshiyongqingkuang() {
        return zhuyaoyongtuheshiyongqingkuang;
    }

    public void setZhuyaoyongtuheshiyongqingkuang(String zhuyaoyongtuheshiyongqingkuang) {
        this.zhuyaoyongtuheshiyongqingkuang = zhuyaoyongtuheshiyongqingkuang == null ? null : zhuyaoyongtuheshiyongqingkuang.trim();
    }

    public BigDecimal getShouru06() {
        return shouru06;
    }

    public void setShouru06(BigDecimal shouru06) {
        this.shouru06 = shouru06;
    }

    public BigDecimal getShouru07() {
        return shouru07;
    }

    public void setShouru07(BigDecimal shouru07) {
        this.shouru07 = shouru07;
    }

    public BigDecimal getShouru08() {
        return shouru08;
    }

    public void setShouru08(BigDecimal shouru08) {
        this.shouru08 = shouru08;
    }

    public BigDecimal getZhichu06() {
        return zhichu06;
    }

    public void setZhichu06(BigDecimal zhichu06) {
        this.zhichu06 = zhichu06;
    }

    public BigDecimal getZhichu07() {
        return zhichu07;
    }

    public void setZhichu07(BigDecimal zhichu07) {
        this.zhichu07 = zhichu07;
    }

    public BigDecimal getZhichu08() {
        return zhichu08;
    }

    public void setZhichu08(BigDecimal zhichu08) {
        this.zhichu08 = zhichu08;
    }

    public BigDecimal getGongyizhichu06() {
        return gongyizhichu06;
    }

    public void setGongyizhichu06(BigDecimal gongyizhichu06) {
        this.gongyizhichu06 = gongyizhichu06;
    }

    public BigDecimal getGongyizhichu07() {
        return gongyizhichu07;
    }

    public void setGongyizhichu07(BigDecimal gongyizhichu07) {
        this.gongyizhichu07 = gongyizhichu07;
    }

    public BigDecimal getGongyizhichu08() {
        return gongyizhichu08;
    }

    public void setGongyizhichu08(BigDecimal gongyizhichu08) {
        this.gongyizhichu08 = gongyizhichu08;
    }

    public String getShangnianbili06() {
        return shangnianbili06;
    }

    public void setShangnianbili06(String shangnianbili06) {
        this.shangnianbili06 = shangnianbili06 == null ? null : shangnianbili06.trim();
    }

    public String getShangnianbili07() {
        return shangnianbili07;
    }

    public void setShangnianbili07(String shangnianbili07) {
        this.shangnianbili07 = shangnianbili07 == null ? null : shangnianbili07.trim();
    }

    public String getShangnianbili08() {
        return shangnianbili08;
    }

    public void setShangnianbili08(String shangnianbili08) {
        this.shangnianbili08 = shangnianbili08 == null ? null : shangnianbili08.trim();
    }

    public String getBennianbili06() {
        return bennianbili06;
    }

    public void setBennianbili06(String bennianbili06) {
        this.bennianbili06 = bennianbili06 == null ? null : bennianbili06.trim();
    }

    public String getBennianbili07() {
        return bennianbili07;
    }

    public void setBennianbili07(String bennianbili07) {
        this.bennianbili07 = bennianbili07 == null ? null : bennianbili07.trim();
    }

    public String getBennianbili08() {
        return bennianbili08;
    }

    public void setBennianbili08(String bennianbili08) {
        this.bennianbili08 = bennianbili08 == null ? null : bennianbili08.trim();
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

    public String getJuanzenghetong() {
        return juanzenghetong;
    }

    public void setJuanzenghetong(String juanzenghetong) {
        this.juanzenghetong = juanzenghetong == null ? null : juanzenghetong.trim();
    }

    public Long getJuanzengshu() {
        return juanzengshu;
    }

    public void setJuanzengshu(Long juanzengshu) {
        this.juanzengshu = juanzengshu;
    }

    public String getWuciqingkuang() {
        return wuciqingkuang;
    }

    public void setWuciqingkuang(String wuciqingkuang) {
        this.wuciqingkuang = wuciqingkuang == null ? null : wuciqingkuang.trim();
    }
}