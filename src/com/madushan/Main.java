package com.madushan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        getting a string from user
        var scanner = new Scanner(System.in);
        System.out.print("Enter your desired String :");
        String s = scanner.next();

//        split the array
        String[] newS = s.split("", s.length());

//        print the array
        for(int i = 0; i < newS.length; i++) {
            System.out.print(newS[i]);
        }

        if(1 < newS.length && 10000 > newS.length) {
            for(int j=0; j < newS.length; j++) {
                if (newS[j] != "{" && newS[j] != "}" && newS[j] != "[" && newS[j] != "]" && newS[j] != "(" && newS[j] != ")") {
                    System.out.println("Enter valid elements");
                }
            }
        }

    }
}
