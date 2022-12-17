package com.madushan;

import java.util.Scanner;

public class Main {

    public static void main(String[] array) {

        int top = 0;

//        getting user input
        var scanner = new Scanner(System.in);
        System.out.print("Enter the String... :");
        String userInput = scanner.next();

//        split the array
        String[] userSplitArray = userInput.split("", userInput.length());

//        creat a string stack
        String[] stack = new String[userSplitArray.length];

//      iterate userSplitArray (Main iteration)
        for( int l=0; l < userSplitArray.length; l++) {

//        taking the valid inputs
            if (userSplitArray[l] == "(" || userSplitArray[l] == "{" || userSplitArray[l] == "[" ) {

//        if the inputs are correct, userSplitArray into the stack one by one
                for(int i=0; i < userSplitArray.length; i++) {
                    stack[top] = userSplitArray[i];
                    top++;
                }

                    switch (stack[l]) {
//                case (
                        case "(" :
//                    if 0 index has (
                            if (stack[l].equals("(")) {
//                        checking  whether ) is there or not
                                for (int k=0; k < stack.length; k++) {
                                    if(stack[k+1].equals(")")){
                                        System.out.println(") found");
                                    }
                                }
                            } else {
//                        if someone add close bracket first, then it shows false
                                if (stack[l].equals(")")) {
                                    System.out.println("You enter ) first");
                                }
                            }

//                 case [
                        case "[" :
//                     if 0 index has [
                            if (stack[l].equals("[")) {
//                        checking  whether ] is there or not
                                for (int k=0; k < stack.length; k++) {
                                    if(stack[k+1].equals("]")){
                                        System.out.println("] found");
                                    }
                                }
                            } else {
//                        if someone add close bracket first, then it shows false
                                if (stack[l].equals("]")) {
                                    System.out.println("You enter ] first");
                                }
                            }
//                 case {
                        case "{" :
//                     if 0 index has [
                            if (stack[l].equals("{")) {
//                        checking  whether } is there or not
                                for (int k=0; k < stack.length; k++) {
                                    if(stack[k+1].equals("}")){
                                        System.out.println("} found");
                                    }
                                }
                            } else {
//                        if someone add close bracket first, then it shows false
                                if (stack[l].equals("}")) {
                                    System.out.println("You enter } first");
                                }
                            }

                        default:
//                    print the stack
                            for(String n : stack) {
                                System.out.println(n);
                            }
                    }
                } else {
                System.out.println("False");
            }
             }

        }
    }
