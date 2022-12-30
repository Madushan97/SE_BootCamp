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
                    System.out.println(line);
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
