package com.twschool.practice;

public class GuessNumberGame {
    public static final int MAX_TRY_TIMES = 6;
    private Answer answer;
    private int lefttryTimes = MAX_TRY_TIMES;
    private GameStatus gameStatus = GameStatus.CONTITNUE;
    public GuessNumberGame(Answer answer) {
        this.answer = answer;
    }

    public String   guess(String userAnswer) {
        lefttryTimes--;
        String result = answer.compare(userAnswer);
        if ("4A0B".equals(result)){
            gameStatus = GameStatus.SUCCEED;
        }else if (lefttryTimes == 0){
            gameStatus = GameStatus.FAILED;
        }
        return result;
    }

    public GameStatus getStatus() {
       return gameStatus;
    }
}
