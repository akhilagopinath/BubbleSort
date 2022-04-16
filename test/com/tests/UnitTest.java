package com.tests;

import com.smartfrog.BubbleSort;
import org.junit.Assert;
import org.junit.Test;
public class UnitTest {

    @Test
    public void Test_Case_AlreadySorted() {
        int[] inputArray = new int[]{1,2,3};
        int[] output = new BubbleSort().bubbleSort(inputArray);
        int[] expected = new int[]{1,2,3};
        Assert.assertArrayEquals(expected,  output);
    }

    @Test
    public void Test_Case_UnSorted() {
        int[] inputArray = new int[]{9,56,89,0,1};
        int[] output = new BubbleSort().bubbleSort(inputArray);
        int[] expected = new int[]{0,1,9,56,89};
        Assert.assertArrayEquals(expected,  output);
    }

    @Test
    public void Test_Case_UnSorted_WithNegative() {
        int[] inputArray = new int[]{9,-56,89,0,1};
        int[] output = new BubbleSort().bubbleSort(inputArray);
        int[] expected = new int[]{-56,0,1,9,89};
        Assert.assertArrayEquals(expected,  output);
    }
    @Test
    public void Test_Case_WithOneNumber() {
        int[] inputArray = new int[]{1};
        int[] output = new BubbleSort().bubbleSort(inputArray);
        int[] expected = new int[]{1};
        Assert.assertArrayEquals(expected,  output);
    }

    @Test
    public void Test_Case_WithSomeSameNumbers() {
        int[] inputArray = new int[]{1,9,1,9,67,3};
        int[] output = new BubbleSort().bubbleSort(inputArray);
        int[] expected = new int[]{1,1,3,9,9,67};
        Assert.assertArrayEquals(expected,  output);
    }
}