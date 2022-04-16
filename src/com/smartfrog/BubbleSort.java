package com.smartfrog;

public class BubbleSort {

    public static void main(String args[])
    {
        int array[] = { 64, 34, 25, 12, 22, 11, 90 };
        bubbleSort(array);
        System.out.println("Sorted Array is given below :");
        print(array);
    }

    static void print(int array[])
    {
        int size = array.length;
        for (int i = 0; i < size; ++i)
            System.out.print(array[i] + " ");
    }

    public static int[] bubbleSort(int inputArray[])
    {
        int size = inputArray.length;
        for (int i = 0; i < size - 1; i++)
            for (int j = 0; j < size - i - 1; j++)
                if (inputArray[j] > inputArray[j + 1]) {
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = temp;
                }
        return inputArray;
    }

}


