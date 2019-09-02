package com.xgb.main;


import com.xgb.service.CodeGeneratorManager;

/**
 * 代码生成器启动项 <br>
 * Created by xgb at 2019/07/26.
 * Modified by 295841112@qq.com at 2019/07/26.
 */
public class CodeGeneratorMain {

    /**
     * table name support singer string table name with or without underline such "table","my_table" etc.<br>
     * other style not tested
     */
    private static final String TABLE = "SHP_PRICE_TERMS";

    public static void main(String[] args) {
        CodeGeneratorManager cgm = new CodeGeneratorManager();
        cgm.genCode(TABLE);
        // cgm.genCode(TABLE,TABLE);
    }
}
