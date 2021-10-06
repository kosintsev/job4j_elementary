package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class LogicNotTest {

    @Test
    public void isEvenTrue() {
        int num = 2;
        boolean result = LogicNot.isEven(num);
        boolean expected = true;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void isEvenFalse() {
        int num = 3;
        boolean result = LogicNot.isEven(num);
        boolean expected = false;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void isPositiveTrue() {
        int num = 3;
        boolean result = LogicNot.isPositive(num);
        boolean expected = true;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void isPositiveFalse() {
        int num = -3;
        boolean result = LogicNot.isPositive(num);
        boolean expected = false;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void notEvenTrue() {
        int num = -3;
        boolean result = LogicNot.notEven(num);
        boolean expected = true;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void notEvenFalse() {
        int num = 2;
        boolean result = LogicNot.notEven(num);
        boolean expected = false;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void notPositiveTrue() {
        int num = -2;
        boolean result = LogicNot.notPositive(num);
        boolean expected = true;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void notPositiveFalse() {
        int num = 2;
        boolean result = LogicNot.notPositive(num);
        boolean expected = false;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenNotEvenAndPositiveThenTrue() {
        int num = 3;
        boolean result = LogicNot.notEvenAndPositive(num);
        boolean expected = true;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenEvenAndPositiveThenFalse() {
        int num = 2;
        boolean result = LogicNot.notEvenAndPositive(num);
        boolean expected = false;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenEvenAndNotPositiveThenFalse() {
        int num = -2;
        boolean result = LogicNot.notEvenAndPositive(num);
        boolean expected = false;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenNotEvenAndNotPositiveThenFalse() {
        int num = -3;
        boolean result = LogicNot.notEvenAndPositive(num);
        boolean expected = false;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenEvenButNotPositiveThenTrue() {
        int num = -2;
        boolean result = LogicNot.evenOrNotPositive(num);
        boolean expected = true;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenNotEvenButNotPositiveThenTrue() {
        int num = -3;
        boolean result = LogicNot.evenOrNotPositive(num);
        boolean expected = true;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenNotEvenButPositiveThenFalse() {
        int num = 3;
        boolean result = LogicNot.evenOrNotPositive(num);
        boolean expected = false;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenEvenButPositiveThenTrue() {
        int num = 2;
        boolean result = LogicNot.evenOrNotPositive(num);
        boolean expected = true;
        Assert.assertEquals(result, expected);
    }
}