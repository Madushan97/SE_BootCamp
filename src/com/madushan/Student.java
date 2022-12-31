package com.madushan;

import java.io.*;
import java.util.Scanner;

public class Student {
    private String first_Name;
    private String last_Name;
    private String course;

    //    to export result file
    public void FileWriter(String write) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            Scanner scan = new Scanner(System.in);
            writer.write(write);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String StudentName(File fileName) {

        try {
            String line;
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            while ((line = reader.readLine()) != null) {
                String[] studentNames = new String[4];

                for (int i=1; i <= line.length(); i+=2) {
                    studentNames = line.split(",",2);
                    System.out.println("Line"+line.length());
                }
                BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
                Scanner scan = new Scanner(System.in);
                writer.write(studentNames[1]+ ", " + studentNames[0]);
                writer.close();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

        //    show content of the file
    public void ShowFileContent(File inputfilename) {

        try {
            String line;
            BufferedReader reader = new BufferedReader(new FileReader(inputfilename));
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    number of student
    public int NumberOfStudent(File inputfilename) {
        try {
            String line;
            BufferedReader reader = new BufferedReader(new FileReader(inputfilename));
//            first line is the number of student
            int number_of_student = Integer.parseInt(reader.readLine());
            System.out.println(number_of_student);
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }

    //    show the content of the file
    public void ShowList(File inputfilename) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputfilename));
            String line;
            while((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //    getters
    public String getFirst_Name() {
        return first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public String getCourse() {
        return course;
    }

    //    setters
    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
