package com.xgb.utils;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyUtils {
    /**
     * 对象是否为空
     *
     * @param o String,List,Map,Object[],int[],long[]
     * @return
     */
    @SuppressWarnings("rawtypes")
    public static boolean isEmpty(Object o) {
        if (o == null) {
            return true;
        }
        if (o instanceof String) {
            if (o.toString().trim().equals("")) {
                return true;
            }
        } else if (o instanceof List) {
            if (((List) o).size() == 0) {
                return true;
            }
        } else if (o instanceof Map) {
            if (((Map) o).size() == 0) {
                return true;
            }
        } else if (o instanceof Set) {
            if (((Set) o).size() == 0) {
                return true;
            }
        } else if (o instanceof Object[]) {
            if (((Object[]) o).length == 0) {
                return true;
            }
        } else if (o instanceof int[]) {
            if (((int[]) o).length == 0) {
                return true;
            }
        } else if (o instanceof long[]) {
            if (((long[]) o).length == 0) {
                return true;
            }
        }
        return false;
    }

    /**
     * Check service port. 检查端口是否已经被占用
     *
     * @param port the port
     * @return <li>true 空闲 <li>false 已经被占用
     */
    public static boolean checkServicePort(int port) {
        Socket theSocket;
        InetAddress theAddress = null;
        try {
            theAddress = InetAddress.getLocalHost();
            theSocket = new Socket(theAddress, port);
            // logger.debug("端口[" + theAddress.getHostAddress() + ":" + port
            // +"]已经被占用!");
            theSocket.close();
            return false;
        } catch (IOException e) {
            // logger.debug("端口[" + theAddress.getHostAddress() + ":" + port +

            // "]空闲!");
            return true;
        }
    }

    /**
     * 对象组中是否存在 Empty Object
     *
     * @param os 对象组
     * @return
     */
    public static boolean isNotEmpty(Object o) {
        return !isEmpty(o);
    }

    /**
     * 对象组中是否存在 Empty Object
     *
     * @param os 对象组
     * @return
     */
    public static boolean isOneEmpty(Object... os) {
        for (Object o : os) {
            if (isEmpty(o)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 2018-11-20
     * 获取文件后缀名 不包含点
     */
    public static String getFileSuffix(String fileWholeName) {
        if (isEmpty(fileWholeName)) {
            return "none";
        }
        int lastIndexOf = fileWholeName.lastIndexOf(".");
        return fileWholeName.substring(lastIndexOf + 1);
    }

}
