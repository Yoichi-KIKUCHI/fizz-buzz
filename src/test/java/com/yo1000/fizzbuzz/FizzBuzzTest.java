package com.yo1000.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by yoichi.kikuchi on 15/01/18.
 */
public class FizzBuzzTest {
    @Test
    public void testGetMessage$FizzBuzz() throws Throwable {
        FizzBuzz target = new FizzBuzz();

        Assert.assertEquals("FizzBuzz:15", "ＦｉｚｚＢｕｚｚ", target.getMessage(15));
        Assert.assertEquals("FizzBuzz:30", "ＦｉｚｚＢｕｚｚ", target.getMessage(30));
        Assert.assertEquals("FizzBuzz:45", "ＦｉｚｚＢｕｚｚ", target.getMessage(45));
    }

    @Test
    public void testGetMessage$Fizz() throws Throwable {
        FizzBuzz target = new FizzBuzz();

        Assert.assertEquals("Fizz:3", "Ｆｉｚｚ", target.getMessage(3));
        Assert.assertEquals("Fizz:6", "Ｆｉｚｚ", target.getMessage(6));
        Assert.assertEquals("Fizz:33", "Ｆｉｚｚ", target.getMessage(33));
    }

    @Test
    public void testGetMessage$Buzz() throws Throwable {
        FizzBuzz target = new FizzBuzz();

        Assert.assertEquals("Buzz:5", "Ｂｕｚｚ", target.getMessage(5));
        Assert.assertEquals("Buzz:10", "Ｂｕｚｚ", target.getMessage(10));
        Assert.assertEquals("Buzz:55", "Ｂｕｚｚ", target.getMessage(55));
    }

    @Test
    public void testGetMessage$Number() throws Throwable {
        FizzBuzz target = new FizzBuzz();

        Assert.assertEquals("Buzz:1", "１", target.getMessage(1));
        Assert.assertEquals("Buzz:4", "４", target.getMessage(4));
        Assert.assertEquals("Buzz:44", "４４", target.getMessage(44));
    }

}
