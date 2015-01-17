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

        Assert.assertEquals("FizzBuzz:15", "FizzBuzz", target.getMessage(15));
        Assert.assertEquals("FizzBuzz:30", "FizzBuzz", target.getMessage(30));
        Assert.assertEquals("FizzBuzz:45", "FizzBuzz", target.getMessage(45));
    }

    @Test
    public void testGetMessage$Fizz() throws Throwable {
        FizzBuzz target = new FizzBuzz();

        Assert.assertEquals("Fizz:3", "Fizz", target.getMessage(3));
        Assert.assertEquals("Fizz:6", "Fizz", target.getMessage(6));
        Assert.assertEquals("Fizz:33", "Fizz", target.getMessage(33));
    }

    @Test
    public void testGetMessage$Buzz() throws Throwable {
        FizzBuzz target = new FizzBuzz();

        Assert.assertEquals("Buzz:5", "Buzz", target.getMessage(5));
        Assert.assertEquals("Buzz:10", "Buzz", target.getMessage(10));
        Assert.assertEquals("Buzz:55", "Buzz", target.getMessage(55));
    }
}
