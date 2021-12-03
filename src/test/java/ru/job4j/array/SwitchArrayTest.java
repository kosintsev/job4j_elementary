package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap0to4DoNothing() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwapMinus1to3DoNothing() {
        int[] input = {1, 2, 3, 4};
        int source = -1;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap3to0() {
        int[] input = {1, 2, 3, 4};
        int source = 3;
        int dest = 0;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap3toMinus1DoNothing() {
        int[] input = {1, 2, 3, 4};
        int source = 3;
        int dest = -1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 3, 4};
        Assert.assertArrayEquals(expected, result);
    }
}