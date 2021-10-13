package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class MultipleSwitchWeekTest {
    @Test
    public void whenMonThen1() {
        int result = MultipleSwitchWeek.numberOfDay("Понедельник");
        int expected = 1;
        Assert.assertEquals(expected, result);
        result = MultipleSwitchWeek.numberOfDay("Monday");
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenTueThen2() {
        int result = MultipleSwitchWeek.numberOfDay("Вториник");
        int expected = 2;
        Assert.assertEquals(expected, result);
        result = MultipleSwitchWeek.numberOfDay("Tuesday");
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenWedThen3Wed() {
        int result = MultipleSwitchWeek.numberOfDay("Среда");
        int expected = 3;
        Assert.assertEquals(expected, result);
        result = MultipleSwitchWeek.numberOfDay("Wednesday");
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenThuThen4() {
        int result = MultipleSwitchWeek.numberOfDay("Четверг");
        int expected = 4;
        Assert.assertEquals(expected, result);
        result = MultipleSwitchWeek.numberOfDay("Thursday");
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFriThen5() {
        int result = MultipleSwitchWeek.numberOfDay("Пятница");
        int expected = 5;
        Assert.assertEquals(expected, result);
        result = MultipleSwitchWeek.numberOfDay("Friday");
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSatThen6() {
        int result = MultipleSwitchWeek.numberOfDay("Суббота");
        int expected = 6;
        Assert.assertEquals(expected, result);
        result = MultipleSwitchWeek.numberOfDay("Saturday");
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSunThen7() {
        int result = MultipleSwitchWeek.numberOfDay("Воскресенье");
        int expected = 7;
        Assert.assertEquals(expected, result);
        result = MultipleSwitchWeek.numberOfDay("Sunday");
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenOsmicaThenError() {
        int result = MultipleSwitchWeek.numberOfDay("Осьмица");
        int expected = -1;
        Assert.assertEquals(expected, result);
        result = MultipleSwitchWeek.numberOfDay("Osmica");
        Assert.assertEquals(expected, result);
    }
}