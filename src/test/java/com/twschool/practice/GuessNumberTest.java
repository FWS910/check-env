package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;

public class GuessNumberTest {
    @Test
    public void should_return_0_A_B_when_input_5678_given_game_answer_1234(){
        //given
        Answer answer = new Answer("1234");
        //when
        String result = answer.compare("5678");
        //then
        Assert.assertNotNull(result);
        Assert.assertEquals("0A0B",result);



    }
}
