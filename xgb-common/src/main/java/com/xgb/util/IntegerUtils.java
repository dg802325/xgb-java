package com.xgb.util;

/**
 * @Auther: 邓根
 * @Date: 2019/8/26 14:09
 * @Description:
 */
public class IntegerUtils {

    private static final int DEFAULT_BEGIN = 0;
    private static final int DEFAULT_END = 10;

    //计算当前页数从第几条数据开始
    public static int getBegin(int begin, int end){
        if(MyTools.isEmpty(begin)||begin==1){
            begin = DEFAULT_BEGIN;
        }else {
            begin = (begin-1)*end;
        }
        return begin;
    }

}
