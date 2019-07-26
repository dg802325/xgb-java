package com.xgb.iterator;

import com.xgb.security.SecurityUtils;
import com.xgb.utils.MyUtils;

import java.util.*;

public class Test02 {

    public static void main(String[] args) {
        String s = SecurityUtils.EncoderByMd5("123456");
        System.out.println(s);

    }
}
