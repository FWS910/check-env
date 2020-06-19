package com.twschool.practice;
import java.util.Random;

public class test_main {

        public static void main(String[] args) {
            Random r=new Random();
            int tag[]={0,0,0,0,0,0,0,0,0,0};
            String four="";
            int temp=0;
            while(four.length()!=4){
                temp=r.nextInt(10);//随机获取0~9的数字
                if(tag[temp]==0){
                    four+=temp;
                    tag[temp]=1;
                }
            }
            System.out.println(four);
        }

}
