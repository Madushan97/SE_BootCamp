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
        System.out.println("\n* * * * File Content * * * *\n");
        student1.ShowFileContent(fileName);

//        number fo student
        System.out.println("\n* * * * Number of Student * * * *\n");
        student1.NumberOfStudent(fileName);

//        for English grade
        System.out.println("\n* * * * Marks for each individuals * * * *\n");
        EnglishStudent eng = new EnglishStudent();
        eng.EnglishMarksAverage(fileName);

//        for Science grade
        ScienceStudent sci = new ScienceStudent();
        sci.ScienceMarksAverage(fileName);

//        for Math grade
        MathStudent math = new MathStudent();
        math.MathMarksAverage(fileName);
    }
}
