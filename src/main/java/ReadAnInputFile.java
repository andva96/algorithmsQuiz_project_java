import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadAnInputFile {


    public List<String> readFile (){

        List<String> textLines = new ArrayList<>();

        try {
            BufferedReader bufReader = new BufferedReader(new FileReader("C:\\Users\\avallejo\\OneDrive - ENDAVA\\Documents\\Repositories\\algorithmsQuiz_project_java\\src\\main\\resources\\inputFile.txt"));
            String line = bufReader.readLine();
            while (line !=null){

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
