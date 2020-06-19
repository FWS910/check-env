package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;

public class AnswerTest {
    @Test
    public void should_return_0A0B_when_input_5678_given_game_answer_1234(){
        //given
        Answer answer = new Answer("1234");
        //when
        String result = answer.compare("5678");
        //then
        Assert.assertNotNull(result);
        Assert.assertEquals("0A0B",result);
    }

    @Test
    public void should_return_4A0B_when_input_1234_given_game_answer_1234(){
        //given
        Answer answer = new Answer("1234");
        //when
        String result = answer.compare("1234");
        //then
        Assert.assertNotNull(result);
        Assert.assertEquals("4A0B",result);
    }

    @Test
    public void should_return_1A3B_when_input_1423_given_game_answer_1234(){
        //given
        Answer answer = new Answer("1234");
        //when
        String result = answer.compare("1423");
        //then
        Assert.assertNotNull(result);
        Assert.assertEquals("1A3B",result);
    }

    @Test
    public void should_return_1A1B_when_input_1456_given_game_answer_1234(){
        //given
        Answer answer = new Answer("1234");
        //when
        String result = answer.compare("1456");
        //then
        Assert.assertNotNull(result);
        Assert.assertEquals("1A1B",result);
    }

    @Test
    public void should_return_0A4B_when_input_4321_given_game_answer_1234(){
        //given
        Answer answer = new Answer("1234");
        //when
        String result = answer.compare("4321");
        //then
        Assert.assertNotNull(result);
        Assert.assertEquals("0A4B",result);
    }

    @Test
    public void should_return_0A3B_when_input_5321_given_game_answer_1234(){
        //given
        Answer answer = new Answer("1234");
        //when
        String result = answer.compare("5321");
        //then
        Assert.assertNotNull(result);
        Assert.assertEquals("0A3B",result);
    }


}
