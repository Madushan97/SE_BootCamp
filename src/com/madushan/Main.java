package com.madushan;

public class Main {

    public static void main(String[] args) {

        int numberArray[] = {47, 84, 75, 21, 14, 14, 79};

//  create an instance of SortAndMath class and Math
        var sort = new SortAndMath();
        Math highestVal = new Math();

//  sort the array
        sort.bubbleSort(numberArray);

//  print the sorted array
        for(int i: numberArray) {
            System.out.print(i + ", ");
        }
        System.out.println();
//  print the median
        Median(numberArray);

//  Highest Values
    int high = highestVal.Highest_Value(numberArray);
        System.out.println("Highest Value is : " + high);


    }

//  for median
    public static void Median(int array[]) {
        int arraySize = array.length;
        int a[] = array;
        float median = a[((arraySize+1)/2)-1];
        System.out.println("Median is : " + median);
    }
}
