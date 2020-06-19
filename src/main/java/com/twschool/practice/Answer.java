package com.twschool.practice;

public class Answer {
    private String gameAnswer;
    public Answer(String gameAnswer) {
        this.gameAnswer = gameAnswer;
    }
    public String compare(String userAnswer){
        int count = 0;
        int same_B = 0;
        for (int i = 0;i<this.gameAnswer.length();i++){
            if (String.valueOf(this.gameAnswer.charAt(i)).equals(String.valueOf(userAnswer.charAt(i)))){
                count += 1;
                continue;
            }
            if (this.gameAnswer.contains(String.valueOf(userAnswer.charAt(i)))){
                same_B +=1;
            }
        }
        return count+"A"+same_B+"B";
    }
}
