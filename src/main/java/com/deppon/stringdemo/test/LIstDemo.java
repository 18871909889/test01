package com.deppon.stringdemo.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * @author : lizhao
 * @Title: LIstDemo
 * @Package: com.deppon.stringdemo.test
 * @ProjectName string-demo
 * @Description: TODO
 * @date 2018-11-26  16:36
 */
public class LIstDemo {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            strings.add("helloworld" + (i+1) + "！！！");
        }
        Collections.shuffle(strings);
        System.out.println("-------- 循环方法一--------");
//       循环方法一
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i)+"\n");
        }
        System.out.println("--------循环方法二--------");
//       循环方法二
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
        System.out.println("---------循环方法三-------");
//       循环方法三
        for (String s : strings){
            System.out.println(s);
        }
    }
}
