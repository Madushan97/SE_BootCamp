package com.madushan;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MathStudent extends Student {

    public void MathMarksAverage(File fileName) {
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            while ((line = reader.readLine()) != null) {
                String[] Math = new String[30];
                Math = line.split(" ", 30);
                if(Math[0].equals("Math")) {
//                    counting the Average marks
                    int quiz1 = ((Integer.parseInt(Math[1])*3)/100);
                    int quiz2 = ((Integer.parseInt(Math[2])*3)/100);
                    int quiz3 = ((Integer.parseInt(Math[3])*3)/100);
                    int quiz4 = ((Integer.parseInt(Math[4])*3)/100);
                    int quiz5 = ((Integer.parseInt(Math[5])*3)/100);
                    int test1 = ((Integer.parseInt(Math[6])*30)/100);
                    int test2 = ((Integer.parseInt(Math[7])*20)/100);
                    int finalExam = ((Integer.parseInt(Math[8])*35)/100);

                    int avgMath = (quiz1 + quiz2 + quiz3 + quiz4 + quiz5 + test1 + test2 +finalExam);

//                    Grade ("You" should replace with his/her name and it located in above line)
                    if(avgMath > 90) {
                        FileWriter("Grade A for Math and you have got " + avgMath);
                    } else if (avgMath > 80 && avgMath <=90 ) {
                        FileWriter("Grade B for Math and you have got " + avgMath);
                    } else if (avgMath >70 && avgMath <=80 ) {
                        FileWriter("Grade C for Math and you have got " + avgMath);
                    } else if (avgMath > 60 && avgMath <= 70 ) {
                        FileWriter("Grade S for Math and you have got " + avgMath);
                    } else if (avgMath > 50 && avgMath <= 60 ) {
                        FileWriter("Grade D for Math and you have got " + avgMath);
                    } else if (avgMath > 40 && avgMath <= 50 ) {
                        FileWriter("Grade E for Math and you have got " + avgMath);
                    }
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
