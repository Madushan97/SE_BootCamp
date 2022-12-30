package com.madushan;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

//        take file from user
        System.out.print("Enter Your File Name : ");
        File fileName = new File(scan.nextLine());

//        file read
        Student student1 = new Student();
//        student1.ShowFileContent(fileName);

//        number fo student
//        student1.NumberOfStudent(fileName);

        EnglishStudent eng = new EnglishStudent();
        eng.EnglishMarksAverage(fileName);
    }
}
