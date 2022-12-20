package com.madushan;

public class Math {

    public int Highest_Value(int[] array) {
        return array[array.length-1];

    }

    public void Mode(int[] array) {
        for (int i=0; i < array.length-1; i++) {
            if (array[i] == array[i+1]) {
                int mode = array[i];
                System.out.println("Mode is : " + mode);
            }
        }
    }

    public void PrimeNumber(int array[]){
//        TODO
    }
}
