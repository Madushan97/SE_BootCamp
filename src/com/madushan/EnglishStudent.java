package com.madushan;

import java.io.*;
import java.util.ArrayList;

public class EnglishStudent extends Student {

    @Override
    public String toString() {
        return "EnglishStudent{}";
    }

    public void EnglishMarksAverage(File fileName) {
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            while ((line = reader.readLine()) != null) {
                String[] English = new String[30];
                English = line.split(" ", 30);
                if(English[0].equals("English")) {
//                    counting the Average marks
                    int termPaper = ((Integer.parseInt(English[1])*30)/100);
                    int midTerm = ((Integer.parseInt(English[2])*30)/100);
                    int finalExam = ((Integer.parseInt(English[3])*40)/100);
                    int avgEnglish = (termPaper + midTerm + finalExam);

//                    Grade
                    if(avgEnglish > 90) {
                        System.out.println("Grade A for English and you have got " + avgEnglish);
                    } else if (avgEnglish > 80 && avgEnglish <=90 ) {
                        System.out.println("Grade B for English and you have got " + avgEnglish);
                    } else if (avgEnglish >70 && avgEnglish <=80 ) {
                        System.out.println("Grade C for English and you have got " + avgEnglish);
                    } else if (avgEnglish > 60 && avgEnglish <= 70 ) {
                        System.out.println("Grade S for English and you have got " + avgEnglish);
                    } else if (avgEnglish > 50 && avgEnglish <= 60 ) {
                        System.out.println("Grade D for English and you have got " + avgEnglish);
                    } else if (avgEnglish > 40 && avgEnglish <= 50 ) {
                        System.out.println("Grade E for English and you have got " + avgEnglish);
                    }
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
