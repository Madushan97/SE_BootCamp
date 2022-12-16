package com.madushan;

import java.util.Scanner;

public class Main {

    public static void main(String[] array) {

        int top = 0;

//        getting user input
        var scanner = new Scanner(System.in);
        System.out.print("Enter the String... :");
        String userInput = scanner.next();

//        split the array and put into stack
        String[] userSplitArray = userInput.split("", userInput.length());

//        print the split array vertically
//        for (String n : userSplitArray) {
//            System.out.println(n);
//        }

//        creat a string stack
        String[] stack = new String[userSplitArray.length];

//        split array in to the stack

//        userSplitArray elements into the stack one by one
        for(int i=0; i < userSplitArray.length; i++) {
             stack[top] = userSplitArray[i];
             top++;
        }

//        print the stack
//        for(String n : stack) {
//            System.out.println(n);
//        }

//        conditions checking
        for (int j=0; j < stack.length; j++) {
            switch (stack[j]) {
//                case (
                case "(" :
//                    if 0 index has (
                    if (stack[j] == "(") {
//                        checking  whether ) is there or not
                        for (int k=0; k < stack.length; k++) {
                            if(stack[k+1] == ")"){
                                System.out.println(") found");
                            }
                        }
                    }
                case "[" :
                    if (stack[j] == "[") {
                        for (int k=0; k < stack.length; k++) {
                            if(stack[k+1] == "]"){
                                System.out.println("] found");
                            }
                        }
                    }
                case "{" :
                    if (stack[j] == "{") {
                        for (int k=0; k < stack.length; k++) {
                            if(stack[k+1] == "}"){
                                System.out.println("} found");
                            }
                        }
                    }
            }
        }
    }

}