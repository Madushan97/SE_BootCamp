package com.madushan;

import java.util.ArrayList;
import java.util.List;

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

        List<Integer> primeNumbers = new ArrayList<>();


//        main for loop for the iterate through the array
        for (int i = 0; i < array.length; i++) {
            for (int numberToCheck = array[i]; numberToCheck <= array.length - 1; numberToCheck++) {
//                if the number is divide by 2
                boolean isPrime = true;
                for (int factor = 2; factor <= numberToCheck / 2; factor++){
                    if ( numberToCheck % factor == 0) {
//                        it is not a prime number and useless to proceed
                        isPrime = false;
                        break;
                    }
                }
//                if it is a prime number then it add to the list
                if (isPrime) {
                    primeNumbers.add(numberToCheck);
                }
            }
        }
//        print the array list
        System.out.println("Prime Numbers are : ");
        for (int number : primeNumbers) {
            System.out.println(number);
        }
    }
}
