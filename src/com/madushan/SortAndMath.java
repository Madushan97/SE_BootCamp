package com.madushan;

public class SortAndMath {

    public void bubbleSort(int array[]) {
        //        for the laps
        for(int i=0; i < array.length-1; i++) {
//            for the comparison
//            if one lap is completed, then last elements are already sorted so we have to ignore sorted elements (i < array.length-j-1)
            for(int j=0; j < array.length-i-1; j++) {
                if(array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
