package com.xgb.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratorMap {

    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<String, String>();
        hm.put("111","222");
        Set<Map.Entry<String, String>> entrySet = hm.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> entry = iterator.next();
            System.out.println(entry.getKey()+","+entry.getValue());
        }
    }
}
