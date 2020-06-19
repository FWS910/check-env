package com.twschool.practice;

import org.junit.Assert;
import org.junit.Test;

public class GussNumberGeneraterTest {
    @Test
    public void should_return_length_4_when_generate_random(){
        GussNumberGenerater gussNumberGenerater = new GussNumberGenerater();
        int len = gussNumberGenerater.random().length();
        Assert.assertEquals(4,len);
    }

    @Test
    public void should_return_digit_when_generate_random(){
        GussNumberGenerater gussNumberGenerater = new GussNumberGenerater();
        String result = gussNumberGenerater.random();
        boolean isdigit = gussNumberGenerater.isInteger(result);
        Assert.assertEquals(true,isdigit);
    }

}
