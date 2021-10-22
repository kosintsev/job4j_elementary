package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromThreeToEightThenEighteen() {
        int start = 3;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = 18;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromOneToOneThenZero() {
        int start = 1;
        int finish = 1;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFromMinusTwoToFourThenFour() {
        int start = -2;
        int finish = 4;
        int result = Counter.sumByEven(start, finish);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }
}