package com.deppon.stringdemo.fileDemo;

import java.io.*;

/**
 * 描述：
 *
 * @author : lizhao
 * @Title: FileTest
 * @Package: com.deppon.stringdemo.fileDemo
 * @ProjectName string-demo
 * @Description: TODO
 * @date 2018-12-07  9:50
 */
public class FileTest {
    public static void main(String[] args) {
        String str = "D:/360Downloads/lz.txt";
//        boolean file = createFiles("D:/360Downloads/lz");
//        createFile("D:/360Downloads/lzs");
//        System.out.println(file);
//        delFile(str);
//        delFileList(str);
        readFile(str);
    }

    /**
     *创建文件夹
     * @param str
     * @return
     */
    public static boolean createFiles(String str){
        boolean isFok = false;
        File file = new File(str);
        try {
            if(!file.exists()){
                file.mkdir();
                isFok = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isFok;
    }

    /**
     * 创建文件
     * @param str
     * @return
     */
    public static void createFile(String str){
        File file = new File(str);
        try {
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter =new PrintWriter(fileWriter);
            printWriter.print(str);
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * 删除文件或者文件夹
     * @param str
     */
    public static void delFile(String str){
        File file = new File(str);
        try {
            file.delete();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * 删除文件夹以及下面的内容
     * @param str
     */
    public static void delFileList(String str){
        File file = new File(str);
        File[] files = file.listFiles();
        try {
            for (int i = 0; i < files.length; i++) {
                if(files[i].isDirectory()){
                    files[i].delete();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 读取文件
     * @param str
     */
    public static void readFile(String str){
            String s = "";
        try {
            File readFile = new File(str);
            InputStreamReader read = new InputStreamReader(new FileInputStream(readFile), "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(read);
//            String mm = bufferedReader.readLine();
            int line = 1;
            while((s = bufferedReader.readLine()) != null){
                System.out.println("line " + line + ": " + new String(s.getBytes("ISO-8859-1"),"UTF-8"));
                line++;
            }
            read.close();
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
