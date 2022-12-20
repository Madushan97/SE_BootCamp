package com.madushan;

public class Main {

    public static void main(String[] args) {

        int numberArray[] = {47, 84, 75, 21, 14, 14, 79};

//        create an instance of SortAndMath class
        var sort = new SortAndMath();
        sort.bubbleSort(numberArray);

//        print the sorted array
        for(int i: numberArray) {
            System.out.print(i + ", ");
        }
    }


}
