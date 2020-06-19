package com.twschool.practice;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessNumberMain {
    public static void main(String[] args) {
        // 生成随机数
        GussNumberGenerater gussNumberGenerater = new GussNumberGenerater();
        String gameAnswer = gussNumberGenerater.random();
        //将随机数设置为游戏答案
        Answer answer = new Answer(gameAnswer);
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);
        //when
        GameStatus gameStatus;

        boolean isdigit;
        boolean isdistinct;


        while(true){

            String str = readDataFromConsole("请连续输入不重复的4个数字：");

            isdigit = gussNumberGenerater.isInteger(str);
            isdistinct = gussNumberGenerater.checkDifferent(str);

            if (isdigit && isdistinct && str.length() == 4){
                String result = guessNumberGame.guess(str);
                gameStatus = guessNumberGame.getStatus();
                if (gameStatus.equals(GameStatus.SUCCEED) || gameStatus.equals(GameStatus.FAILED)){
                    System.out.println(result);
                    System.out.println(gameStatus);
                    break;
                }else {
                    System.out.println(result);
                }

            }else{
                System.out.println("输入有误");
            }


        }

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
