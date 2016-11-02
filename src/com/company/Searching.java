package com.company;

import java.util.ArrayList;

/**
 * Created by Joe on 14/09/2016.
 */
public class Searching {
    public static Integer[] LinearSearch(Integer[] array, Integer target) {
        Integer[] result = new Integer[2];
        int comparisons = 0;
        for (int i=0;i<array.length;i++) {
            comparisons++;
            if (array[i] == target) {
                result[0] = comparisons;
                result[1] = array[i];
                break;
            }
        }
        return result;
    }

    public static Integer[] BinarySearch(Integer[] array, Integer target) {
        Integer[] result = new Integer[2];
        int comparisons = 0;
        int length = array.length;
        int startIndex = 0;
        while (length > 0) {
            comparisons++;
            int midpoint = startIndex + length / 2;
            if (array[midpoint] == target) {
                result[0] = comparisons;
                result[1] = array[midpoint];
                break;
            } else if (array[midpoint] < target) {
                length = midpoint - startIndex;
                startIndex = midpoint+1;
            } else if (array[midpoint] > target) {
                length = midpoint - startIndex;
            }
        }
        return array;
    }
}
