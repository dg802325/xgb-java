package com.xgb.util;

import com.google.common.base.CaseFormat;
import com.xgb.entity.TableColumnInfo;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

/**
 * 字符串操作常用方法集 Created by zhh on 2017/08/16.
 */
public class StringUtils {

    // 4个空格串
    public static final String FOUR_SPACES = "    ";

    /**
     * 对象是否为无效值
     * 
     * @param obj 要判断的对象
     * @return 是否为有效值(不为null 和 ""字符串)
     */
    public static boolean isNullOrEmpty(Object obj) {
        return obj == null || "".equals(obj.toString());
    }

    /**
     * 将字符串的第一位转为小写
     * 
     * @param str 需要转换的字符串
     * @return 转换后的字符串
     */
    public static String toLowerCaseFirstOne(String str) {
        if (Character.isLowerCase(str.charAt(0))) {
            return str;
        } else {
            char[] chars = str.toCharArray();
            chars[0] = Character.toLowerCase(chars[0]);
            return new String(chars);
        }
    }

    /**
     * 将字符串的第一位转为大写
     * 
     * @param str 需要转换的字符串
     * @return 转换后的字符串
     */
    public static String toUpperCaseFirstOne(String str) {
        if (Character.isUpperCase(str.charAt(0))) {
            return str;
        } else {
            char[] chars = str.toCharArray();
            chars[0] = Character.toUpperCase(chars[0]);
            return new String(chars);
        }
    }
    /**
     * 下划线转驼峰第一个小写
     * Convert table name with or without underline to camel style object name.The first character is lower case<br>
     * For example:<br>
     * table to table<br>
     * my_table to myTable<br>
     * @param tableName
     * @return camel style object name with first charater lower case
     */
    public static String tableNameConvertLowerCamel(String tableName) {
        return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, tableName.toLowerCase());
    }
    /**
     * 下划线转驼峰  第一字符为大写   SYS_USER -> SysUser
     * Convert table name with or without underline to camel style object name. .The first character is lower case<br>
     * For example:<br>
     * table to Table<br>
     * my_table to MyTable<br>
     * @param tableName
     * @return camel style object name
     */
    public static String tableNameConvertUpperCamel(String tableName) {
        return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, tableName.toLowerCase());
    }

    /**
     * 判断某个字符串值是否在一个字符串数组内
     * @param str
     * @param strings
     * @return
     */
    public static boolean stringIsOnArray(String str,String[] strings){
        return Arrays.asList(strings).contains(str);
    }

    /**
     * 将字符串第一个字符转化为小写，其他不管   SysUser -> sysUser
     * @param modelName
     * @return
     */
    public static String getSomeModelName(String modelName){
        StringBuilder stringBuilder = new StringBuilder();
        String substring = modelName.substring(0, 1).toLowerCase();
        String substring1 = modelName.substring(1);
        stringBuilder.append(substring).append(substring1);
        return stringBuilder.toString();
    }


    /**
     * 判断给入的字符串是否为空,null、""、" "都表示空字符串
     * 
     * @param str 待判定的字符串
     * @return 空符串返回true，否则返回false
     */
    public static boolean isEmpty(String str) {
        if (null == str || "".equals(str.trim())) {
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    /**
     * 根据表名用_分割取第一个字作为表的别名 SYS_USER -> su
     * @param tableName
     * @return
     */
    public static String tableNameTotn(String tableName){
        String[] s = tableName.split("_");
        StringBuilder tn = new StringBuilder();
        for (String s1 : s) {
            tn.append(s1.substring(0,1).toLowerCase());
        }
        return tn.toString();
    }

    /**
     * 根据表名用_分割得到权限名称
     * @param tableName
     * @return
     */
    public static String createPermissions(String tableName){
        String[] s = tableName.split("_");
        StringBuilder permission = new StringBuilder();
        for (String s1 : s) {
            permission.append(s1+":");
        }
        return permission.toString().substring(0,permission.length()-1);
    }

    /**
     * 将表名首字母大写拼接起来
     * @param tableName
     * @return
     */
    public static String InitialsUpSplice(String tableName){
        String[] s = tableName.split("_");
        StringBuilder permission = new StringBuilder();
        for (String s1 : s) {
            permission.append(toUpperCaseFirstOne(s1));
        }
        return permission.toString();
    }

    /**
     * 数据库类型转java类型
     * @param tableColumnInfo
     * @return
     */
    public static String builderString(TableColumnInfo tableColumnInfo){
        if("VARCHAR".equals(tableColumnInfo.getTypeName())){
            return "String";
        }else if("DATETIME".equals(tableColumnInfo.getTypeName())||"DATE".equals(tableColumnInfo.getTypeName())||"TIMESTAMP".equals(tableColumnInfo.getTypeName())){
            return "Date";
        }else if("DECIMAL".equals(tableColumnInfo.getTypeName())){
            return "BigDecimal";
        }else if("INT".equals(tableColumnInfo.getTypeName())||"INTEGER".equals(tableColumnInfo.getTypeName())){
            return "int";
        }
        return null;
    }

    /**
     * 数据库类型转java全类型
     * @param tableColumnInfo
     * @return
     */
    public static String builderToPathString(TableColumnInfo tableColumnInfo){
        if("VARCHAR".equals(tableColumnInfo.getTypeName())){
            return "java.lang.String";
        }else if("DATETIME".equals(tableColumnInfo.getTypeName())||"DATE".equals(tableColumnInfo.getTypeName())||"TIMESTAMP".equals(tableColumnInfo.getTypeName())){
            return "java.util.Date";
        }else if("DECIMAL".equals(tableColumnInfo.getTypeName())){
            return "java.math.BigDecimal";
        }else if("INTEGER".equals(tableColumnInfo.getTypeName())||"INT".equals(tableColumnInfo.getTypeName())){
            return "java.lang.Integer";
        }
        return null;
    }

    /**
     * 数据库类型替换为mybatis许可的类型(INT转INTEGER)
     * @param tableColumnInfo
     * @return
     */
    public static String mysqlToMysql(TableColumnInfo tableColumnInfo){
        if("INTEGER".equals(tableColumnInfo.getTypeName())||"INT".equals(tableColumnInfo.getTypeName())){
            return "INTEGER";
        }
        return tableColumnInfo.getTypeName();
    }




}
