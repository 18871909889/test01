package com.deppon.stringdemo.test;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import jdk.nashorn.internal.codegen.types.Type;
import org.springframework.util.StringUtils;

import java.io.ByteArrayOutputStream;
import java.net.SocketTimeoutException;
import java.security.MessageDigest;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.UUID;

/**
 * @author : lizhao
 * @Title: StringDemo
 * @Package: com.deppon.stringdemo.test
 * @ProjectName string-demo
 * @Description: TODO
 * @date 2018-11-02  9:51
 */
public class StringDemo {

    public static void main(String[] args) {
       /* String s = "hello 123 !# T world!!!";
        char c = s.charAt(4);
        System.out.println(c);
        int i = s.indexOf("o");
        System.out.println(i);
        boolean empty = !s.isEmpty();
        System.out.println(empty);
        int length = s.length();
        System.out.println(length);
        String[] s1 = s.split(" ");
        for (int i1 = 0; i1 < s1.length; i1++) {
            System.out.println(s1[i1]);
        }
        System.out.println("-------------------------------------------");
        char[] chars = s.toCharArray();
        for (int i1 = 0; i1 < chars.length; i1++) {
            System.out.println(chars[i1]);
        }
        System.out.println("-------------------------------------------");
        boolean d = s.contains("d");
        System.out.println(d);
        String s1 = s.toLowerCase();
        System.out.println(s1);
        String s2 = s.toUpperCase();
        System.out.println(s2);
        boolean h = s.startsWith("h");
        System.out.println(h);
        int d1 = s.indexOf("d");
        System.out.println(d1);
        String substring = s.substring(2);
        System.out.println(substring);
        String substring1 = s.substring(6, 11);
        System.out.println(substring1);
        System.out.println(s);
        int i = s.indexOf(3);
        System.out.println(i);
        int o = s.indexOf("m");
        System.out.println(o);
        String m = "";
        String n = null;
        System.out.println(m+"   ++  "+ n);
        String s1 = s.toUpperCase();
        System.out.println(s1);
        ArrayList<String> strings = new ArrayList<>();
        HashMap<Object, Object> map = new HashMap<>();
        */

//        Date date = new Date();
//        long time = 10000000L;//得到毫秒数
//        Date date1 = new Date(time);//直接将毫秒数当参数传进去。
//        System.out.println(date1);
        String s = StringUtils.replace(UUID.randomUUID().toString(), "-", "");
//        String replace = s.replace("-", "");
//        String s = UUID.randomUUID().toString();
//        String replace = s.replace('-', ' ').replace(" ","");
//        String substring = replace.substring(1);
//        split.
//        String s1 = String.copyValueOf(split);
//        System.out.println(s.length());

//        boolean numeric = StringUtil.isNumeric("-1");
//        System.out.println(numeric);

//        long l = System.currentTimeMillis();
//        System.out.println(l);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        String s1 = out.toString();
//        System.out.println(out);
//        String encode = encode("123");
//        String encode2 = encode("123");
//        System.out.println(encode+"\n"+ encode2);
        Random random = new Random();
        int num = random.nextInt(1) % (1 - 1 + 1) + 1;
        System.out.println(num);

    }

    public static final String CHARSET = "UTF-8";

    public static String encode(String src) {
        try {
            MessageDigest digest = MessageDigest.getInstance("md5");
            byte[] bs = digest.digest(src.getBytes(CHARSET));
            String hexString = "";
            for (byte b : bs) {
                int temp = b & 255;
                if (temp < 16 && temp >= 0) {
                    hexString = hexString + "0" + Integer.toHexString(temp);
                } else {
                    hexString = hexString + Integer.toHexString(temp);
                }
            }
            return hexString;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
