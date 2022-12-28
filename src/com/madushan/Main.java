package com.madushan;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {
        Student std = new Student();
        std.setCourse("English");
        System.out.println(std.getCourse());
    }
}
