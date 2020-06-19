package com.twschool.practice;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessNumberMain {
    public static void main(String[] args) {
        String str = readDataFromConsole("Please input string：");
        System.out.println(str);
    }


    public static  String readDataFromConsole(String prompt) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        try {
            System.out.print(prompt);
            str = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
