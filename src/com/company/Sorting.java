package com.company;

/**
 * Created by Joe on 14/09/2016.
 */

public class Sorting {
    public static Integer[] BubbleSort (Integer[] array) {
        Integer[] result = new Integer[2];
        int switches = 0;
        int comparisons = 0;
        int totalSwitches = 0;
        int temp;
        do {
            switches = 0;
            for (int i=1;i<array.length;i++) {
                comparisons++;
                if (array[i] < array[i-1]) {
                    array[i-1] = array[i-1] + array[i];
                    array[i] = array[i-1] - array[i];
                    array[i-1] = array[i-1] - array[i];
                    switches++;
                }
            }
            totalSwitches += switches;
        } while (switches > 0);
        result[0] = comparisons;
        result[1] = totalSwitches;
        return result;
    }

    public static Integer[] InsertionSort (Integer[] array) {
        Integer[] result = new Integer[2];
        int comparisons = 0;
        int switches = 0;
        int targetIndex=0;
        int temp1;
        int temp2;
        for (int i=0;i<array.length;i++) {
            targetIndex = i;
            for(int j=i;j>=0;j--) {
                comparisons++;
                if (array[i] < array[j]) {
                    targetIndex = j;
                }
            }
            temp1 = array[i];
            for(int j=targetIndex;j<=i;j++) {
                switches++;
                temp2 = array[j];
                array[j] = temp1;
                temp1 = temp2;
            }
            switches--;
        }
        result[0] = comparisons;
        result[1] = switches;
        return result;
    }

    public static Integer[] MergeSort (Integer[] array) {
        if (array.length > 1) {
            Integer[] part1 = new Integer[array.length/2];
            Integer[] part2 = new Integer[array.length/2];
            System.arraycopy(array, 0, part1, 0, part1.length);
            System.arraycopy(array, part1.length, part2, 0, part2.length);
            part1 = MergeSort(part1);
            part2 = MergeSort(part2);
            System.arraycopy(part1, 0, array, 0, part1.length);
            System.arraycopy(part2, 0, array, part1.length, part2.length);
        }
        int switches = 0;
        do {
            switches = 0;
            for (int i=1;i<array.length;i++) {
                if (array[i] < array[i-1]) {
                    array[i-1] = array[i-1] + array[i];
                    array[i] = array[i-1] - array[i];
                    array[i-1] = array[i-1] - array[i];
                    switches++;
                }
            }
        }while (switches>0);
        return array;
    }

    public static Integer[] QuickSort (Integer[] array) {
        if (array.length > 1) {
            Integer[] sUnsort = new Integer[array.length];
            Integer[] lUnsort = new Integer[array.length];
            int smallNo = 0;
            int largeNo = 0;
            int pivot = array[0];
            for (int i=0;i<array.length;i++) {
                if (array[i] < pivot) {
                    sUnsort[smallNo] = array[i];
                    smallNo++;
                } else if (array[i] > pivot){
                    lUnsort[largeNo] = array[i];
                    largeNo++;
                }
            }
            Integer[] sSort = new Integer[smallNo];
            System.arraycopy(sUnsort,0,sSort,0,smallNo);
            Integer[] lSort = new Integer[largeNo];
            System.arraycopy(lUnsort,0,lSort,0,largeNo);
            sSort = QuickSort(sSort);
            lSort = QuickSort(lSort);
            System.arraycopy(sSort,0,array,0,smallNo);
            array[smallNo] = pivot;
            System.arraycopy(lSort,0,array,smallNo+1,largeNo);
        }
        return array;
    }
}
