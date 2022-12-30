package com.madushan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {
    private String first_Name;
    private String last_Name;
    private String course;

    //    to export result file
    public void FileWriter() {
        try {
            List<String> student = new ArrayList<String>();

            BufferedWriter writer = new BufferedWriter(new FileWriter("n.txt"));
            Scanner scan = new Scanner(System.in);
            writer.write("Hi");
            writer.close();

            System.out.println(student);

        } catch (IOException e) {
            e.printStackTrace();
        }
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

    public void NumberOfStudent(File inputfilename) {
        try {
            String line;
            BufferedReader reader = new BufferedReader(new FileReader(inputfilename));
            int number_of_student = Integer.parseInt(reader.readLine());
            System.out.println(number_of_student);
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
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
