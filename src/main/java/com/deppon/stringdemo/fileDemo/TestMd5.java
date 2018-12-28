package com.deppon.stringdemo.fileDemo;

import jdk.nashorn.internal.ir.WhileNode;

import javax.xml.transform.Source;
import java.util.Scanner;

/**
 * 描述：
 *
 * @author : lizhao
 * @Title: TestMd5
 * @Package: com.deppon.stringdemo.fileDemo
 * @ProjectName string-demo
 * @Description: TODO
 * @date 2018-12-10  13:27
 */
public class TestMd5 {

   /* public static String generateDigest(Object data, String secret) {
        String dataJson = JSONObject.toJSON(data).toString();
        String plaintext = dataJson + secret;
        return DigestUtils.md5Hex(plaintext);
    }*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str ;
        while (true){
            str = sc.next();
            str = str.replace("吗","");
            str = str.replace("?","!");
            str = str.replace("? ","!");
            System.out.println(str);
        }
    }
}
