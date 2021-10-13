package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SwitchWeekTest {

    @Test
    public void when1ThenMon() {
        String result = SwitchWeek.nameOfDay(1);
        String expected = "Понедельник";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when1ThenTue() {
        String result = SwitchWeek.nameOfDay(2);
        String expected = "Вторник";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when1ThenWed() {
        String result = SwitchWeek.nameOfDay(3);
        String expected = "Среда";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when1ThenThu() {
        String result = SwitchWeek.nameOfDay(4);
        String expected = "Четверг";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when1ThenFri() {
        String result = SwitchWeek.nameOfDay(5);
        String expected = "Пятница";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when1ThenSat() {
        String result = SwitchWeek.nameOfDay(6);
        String expected = "Суббота";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when1ThenSun() {
        String result = SwitchWeek.nameOfDay(7);
        String expected = "Воскресенье";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when0ThenError() {
        String result = SwitchWeek.nameOfDay(0);
        String expected = "Ошибка";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenNegativeNumberThenError() {
        String result = SwitchWeek.nameOfDay(-1);
        String expected = "Ошибка";
        Assert.assertEquals(expected, result);
    }

    @Test
    public void when10ThenError() {
        String result = SwitchWeek.nameOfDay(10);
        String expected = "Ошибка";
        Assert.assertEquals(expected, result);
    }
}