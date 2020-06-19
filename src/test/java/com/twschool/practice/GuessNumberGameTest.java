package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class GuessNumberGameTest {
    @Test
    public void should_return_4A0B_when_input_1234_given_game_with_answer_1234(){
        //given
        Answer answer = new Answer("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer);

        String result = guessNumberGame.guess("1234");

        Assert.assertEquals("4A0B",result);
    }
    
}
