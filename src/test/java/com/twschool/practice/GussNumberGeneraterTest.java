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
    public void should_return_is_digit_true_when_generate_random(){
        GussNumberGenerater gussNumberGenerater = new GussNumberGenerater();
        String result = gussNumberGenerater.random();
        boolean isdigit = gussNumberGenerater.isInteger(result);
        Assert.assertEquals(true,isdigit);
    }

    @Test
    public void should_return_is_distinct_digit_true_when_generate_random(){
        GussNumberGenerater gussNumberGenerater = new GussNumberGenerater();
        String result = gussNumberGenerater.random();
        boolean isdistinct = gussNumberGenerater.checkDifferent(result);
        Assert.assertEquals(true,isdistinct);
    }


}
