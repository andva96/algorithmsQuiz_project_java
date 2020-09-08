package com;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteAnOutputFile {

    String outputFileLocation = "C:\\Users\\avallejo\\OneDrive - ENDAVA\\Documents\\Repositories\\algorithmsQuiz_project_java\\src\\main\\resources\\outputFile.txt";


    public void storeOnOutputFile(List<String> palindromes) {

        try {
            BufferedWriter bufWriter = new BufferedWriter(new FileWriter(outputFileLocation));

            for (int i = 0; i < palindromes.size(); i++) {
                bufWriter.write(palindromes.get(i));
                bufWriter.newLine();
            }
            bufWriter.flush();
            bufWriter.close();


        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Input/Output issue presented");
        }

    }


}
