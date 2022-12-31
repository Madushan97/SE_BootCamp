package com.madushan;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ScienceStudent extends Student {

    public void ScienceMarksAverage(File fileName) {
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            while ((line = reader.readLine()) != null) {
                String[] Science = new String[30];
                Science = line.split(" ", 30);
                if(Science[0].equals("Science")) {
//                    counting the Average marks
                    int attendence = ((Integer.parseInt(Science[1])*10)/100);
                    int project = ((Integer.parseInt(Science[2])*30)/100);
                    int midTerm = ((Integer.parseInt(Science[3])*30)/100);
                    int finalExam = ((Integer.parseInt(Science[4])*30)/100);

                    int avgScience = (attendence + project + midTerm + finalExam);

//                    Grade ("You" should replace with his/her name and it located in above line)
                    if(avgScience > 90) {
                        FileWriter("Grade A for Science and you have got " + avgScience);
                    } else if (avgScience > 80 && avgScience <=90 ) {
                        FileWriter("Grade B for Science and you have got " + avgScience);
                    } else if (avgScience >70 && avgScience <=80 ) {
                        FileWriter("Grade C for Science and you have got " + avgScience);
                    } else if (avgScience > 60 && avgScience <= 70 ) {
                        FileWriter("Grade S for Science and you have got " + avgScience);
                    } else if (avgScience > 50 && avgScience <= 60 ) {
                        FileWriter("Grade D for Science and you have got " + avgScience);
                    } else if (avgScience > 40 && avgScience <= 50 ) {
                        FileWriter("Grade E for Science and you have got " + avgScience);
                    }
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
