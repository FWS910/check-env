package com.twschool.practice;

public class GuessNumberGame {
    private Answer answer;
    public GuessNumberGame(Answer answer) {
        this.answer = answer;
    }

    public String guess(String userAnswer) {
        return this.answer.compare(userAnswer);
    }
}
