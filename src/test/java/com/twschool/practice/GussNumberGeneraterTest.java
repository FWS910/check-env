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
}
