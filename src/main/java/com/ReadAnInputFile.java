package com;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadAnInputFile {


    public List<String> readFile() {

        List<String> textLines = new ArrayList<>();
        String inputFileLocation = System.getProperty("user.dir") + "\\src\\main\\resources\\inputFile.txt";

        try {
            BufferedReader bufReader = new BufferedReader(new FileReader(inputFileLocation));
            String line = bufReader.readLine();
            while (line != null) {

                textLines.add(line);
                line = bufReader.readLine();

            }
            bufReader.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Unable to find input File");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Input/Output issue presented");
        }

        return textLines;
    }


}
