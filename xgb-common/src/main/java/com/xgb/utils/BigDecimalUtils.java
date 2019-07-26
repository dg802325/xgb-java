package com.xgb.utils;

import java.math.BigDecimal;

public class BigDecimalUtils {

    /**
     * 除法
     */
    public static BigDecimal divide(String arg1, String arg2) {
        if (MyUtils.isEmpty(arg1)) {
            arg1 = "0.0";
        }
        if (MyUtils.isEmpty(arg2)) {
            arg2 = "0.0";
        }
        BigDecimal big3 = new BigDecimal("0.00");
        if (Double.parseDouble(arg2) != 0) {
            BigDecimal big1 = new BigDecimal(arg1);
            BigDecimal big2 = new BigDecimal(arg2);
            big3 = big1.divide(big2, 2, BigDecimal.ROUND_HALF_EVEN);
        }
        return big3;
    }

    /**
     * 乘法
     */
    public static BigDecimal mul(String arg1, String arg2) {
        if (MyUtils.isEmpty(arg1)) {
            arg1 = "0.0";
        }
        if (MyUtils.isEmpty(arg2)) {
            arg2 = "0.0";
        }
        BigDecimal big1 = new BigDecimal(arg1);
        BigDecimal big2 = new BigDecimal(arg2);
        BigDecimal big3 = big1.multiply(big2);
        return big3;
    }

    /**
     * 减法
     */
    public static BigDecimal sub(String arg1, String arg2) {
        if (MyUtils.isEmpty(arg1)) {
            arg1 = "0.0";
        }
        if (MyUtils.isEmpty(arg2)) {
            arg2 = "0.0";
        }
        BigDecimal big1 = new BigDecimal(arg1);
        BigDecimal big2 = new BigDecimal(arg2);
        BigDecimal big3 = big1.subtract(big2);
        return big3;
    }

    /**
     * 加法
     */
    public static BigDecimal add(String arg1, String arg2) {
        if (MyUtils.isEmpty(arg1)) {
            arg1 = "0.0";
        }
        if (MyUtils.isEmpty(arg2)) {
            arg2 = "0.0";
        }
        BigDecimal big1 = new BigDecimal(arg1);
        BigDecimal big2 = new BigDecimal(arg2);
        BigDecimal big3 = big1.add(big2);
        return big3;
    }

    /**
     * 四舍五入保留N位小数 先四舍五入在使用double值自动去零
     *
     * @param arg
     * @param scare 保留位数
     * @return
     */
    public static String setScare(BigDecimal arg, int scare) {
        BigDecimal bl = arg.setScale(scare, BigDecimal.ROUND_HALF_UP);
        return String.valueOf(bl.doubleValue());
    }
}
