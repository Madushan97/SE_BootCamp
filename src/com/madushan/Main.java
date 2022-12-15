package com.madushan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        getting a string from user
        var scanner = new Scanner(System.in);
        System.out.print("Enter your desired String :");
        String s = scanner.next();

//        printing the split array
        String[] newS = s.split("", s.length());
        for(int i = 0; i < newS.length; i++) {
            System.out.print(newS[i]);
        }
    }
}
