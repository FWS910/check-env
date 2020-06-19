package com.twschool.practice;

import java.util.Random;
import java.util.regex.Pattern;

public class GussNumberGenerater {
    private String random;

    public String random(){
        Random r=new Random();
        int tag[]={0,0,0,0,0,0,0,0,0,0};
        String random="";
        int temp=0;
        while(random.length()!=4){
            temp=r.nextInt(10);//随机获取0~9的数字
            if(tag[temp]==0){
                random+=temp;
                tag[temp]=1;
            }
        }
        return random;
    }
    public  boolean isInteger(String str) {
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();
    }

    public static boolean checkDifferent(String iniString) {
        boolean isbool = false;
        char[] chars = iniString.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    isbool = false;
                    return isbool;
                } else {
                    isbool = true;
                }
            }
        }
        return isbool;
    }


}
