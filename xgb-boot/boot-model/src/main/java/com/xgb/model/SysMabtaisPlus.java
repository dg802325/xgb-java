package com.xgb.model;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import lombok.Data;

/**
 * @Auther: 邓根
 * @Date: 2019/8/28 10:56
 * @Description:
 */
@Data
public class SysMabtaisPlus {
    private String tableName;//表名
    private String tableType;//表类型
    private String tableCat;//表所属数据库
    private String tableRemark;//表备注
}
