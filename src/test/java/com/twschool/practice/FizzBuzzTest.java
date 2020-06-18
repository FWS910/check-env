package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class FizzBuzzTest {
    @Test
    public void should_return_1_give_1(){
        int number = 5;
        FizzBuzz fizzBuzz = new FizzBuzz();

        String result = fizzBuzz.say(number);

        assertThat(result,is("Buzz"));
        return;
    }
}
