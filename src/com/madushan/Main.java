package com.madushan;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        File fileName = new File(scan.nextLine());

        Student student1 = new Student();
        student1.FileReader(fileName);
    }
}
