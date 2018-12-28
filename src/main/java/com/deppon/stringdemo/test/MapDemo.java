package com.deppon.stringdemo.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author : lizhao
 * @Title: MapDemo
 * @Package: com.deppon.stringdemo.test
 * @ProjectName string-demo
 * @Description: TODO
 * @date 2018-11-26  16:48
 */
public class MapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < 20; i++) {
            if(i == 10){
                continue;
            }
            map.put(i , "lz" + i);
        }
        System.out.println("------------方法一----------------");
        Set<Integer> integers = map.keySet();
        for (Integer ii : integers){
            System.out.println("键：" + ii + "   值：" +map.get(ii));
        }
        System.out.println("------------方法二----------------");
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> next = iterator.next();
            System.out.println("键：" + next.getKey() + "   值：" +next.getValue());
        }
        System.out.println("------------方法三----------------");
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        for (Map.Entry<Integer, String> s : set){
            System.out.println("键：" + s.getKey() + "   值：" +s.getValue());
        }

        System.out.println("------------方法四----------------");
        for (String s : map.values()){
            System.out.println("值："+s);
        }

    }
}
