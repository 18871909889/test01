package com.deppon.stringdemo.fileDemo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 描述：
 *
 * @author : lizhao
 * @Title: TestFileDemo
 * @Package: com.deppon.stringdemo.fileDemo
 * @ProjectName string-demo
 * @Description: TODO
 * @date 2018-12-17  20:37
 */
public class TestFileDemo {

    public static void main(String[] args) {
        File file = new File("D:\\lizhao\\MyWork\\HomeWork\\qingyuan-parent");
        filr1(file);


    }

    private static void filr1( File file) {
        int count = 0;
        if(null != file){
            if(file.isFile() || file.listFiles().length ==0){
                return;
            }else {
                File[] files = file.listFiles();
                List<File> list = new ArrayList<File>();
                for (File f : files){
                    if(f.isDirectory()){
                        list.add(f);
                    }
                }
                for (File f : files){
                    if(f.isFile()){
                        list.add(f);
                    }
                }
                files = list.toArray(new File[list.size()]);

                for (File ff : files) {
                    StringBuffer buffer = new StringBuffer();
                    if(ff.isFile()){
                        buffer.append(ff.getName());

                    }else {
                        buffer.append(ff.getName());
                        buffer.append("\\");
                    }
                    System.out.println(buffer.toString());
                    if(ff.isDirectory()){
                        count++;
                        filr1(ff);
                    }

                }
            }
        }
    }
}
