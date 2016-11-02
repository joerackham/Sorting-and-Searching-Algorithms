package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.print("Got you now!");
        Sorting sorter = new Sorting();
        Searching searcher = new Searching();
        Integer[] testArray = {14,33,27,10,35,19,42,44};
        testArray = sorter.QuickSort(testArray);
        for (int i=0;i<testArray.length;i++) {
            System.out.print(testArray[i] + " ");
        }
    }
}
