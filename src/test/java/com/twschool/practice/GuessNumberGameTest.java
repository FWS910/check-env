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
    @Test
    public void should_return_contitnue_when_get_status_after_input_1256_given_game_with_answer_1234() {
//given
        Answer answer = new Answer("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);
        //when
        String result = guessNumberGame.guess("1256");

        GameStatus gameStatus = guessNumberGame.getStatus();
        //then
        Assert.assertEquals(GameStatus.CONTITNUE,gameStatus);
    }

    @Test
    public void should_return_FAILED_when_status_after_input_1256_6_times_given_answer_1234(){
        //given
        Answer answer = new Answer("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);
        //when
        String result = guessNumberGame.guess("1256");
        String result1 = guessNumberGame.guess("1256");
        String result2 = guessNumberGame.guess("1256");
        String result3 = guessNumberGame.guess("1256");
        String result4 = guessNumberGame.guess("1256");
        String result5 = guessNumberGame.guess("1256");

        GameStatus gameStatus = guessNumberGame.getStatus();
        //then
        Assert.assertEquals(GameStatus.FAILED,gameStatus);
    }

}
