package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class GuessNumberGameTest {
    public static final String SUCCEND = "SUCCEND";

    @Test
    public void should_return_4A0B_when_input_1234_given_game_with_answer_1234(){
        //given
        Answer answer = new Answer("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);

        String result = guessNumberGame.guess("1234");

        Assert.assertEquals("4A0B",result);
    }

    @Test
    public void should_return_SUCCEND_when_input_1234_given_game_with_answer_1234(){
        //given
        Answer answer = new Answer("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);

        String result = guessNumberGame.guess("1234");

        GameStatus gameStatus = guessNumberGame.getStatus();

        Assert.assertEquals(GameStatus.SUCCEED,gameStatus);
    }

}
