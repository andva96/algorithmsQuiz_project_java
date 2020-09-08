import java.util.ArrayList;
import java.util.List;

public class IsAPalindromeValidation {

    public static void main(String[] args) {

        ReadAnInputFile myfile = new ReadAnInputFile();
        List<String> textLines = myfile.readFile();
        goThroughText(textLines);

    }

    public static void goThroughText(List<String> text) {

        WriteAnOutputFile outputfile = new WriteAnOutputFile();
        List<String> outputList = new ArrayList<>();
        int palindromesCounter = 0;

        for (String line : text) {

            String cleanedLine = deleteSpecialCharacters(line);


            if (isACharPalindrome(cleanedLine)) {
                String outputString = classifyPalindromes(line, false);
                outputList.add(outputString);
                palindromesCounter ++;

            } else if (isAWordPalindrome(line)) {
                String outputString = classifyPalindromes(line, true);
                outputList.add(outputString);
                palindromesCounter ++;
            }

            if (palindromesCounter >= 10){
                break;
            }

        }

        outputfile.storeOnOutputFile(outputList);


    }

    public static String deleteSpecialCharacters(String line) {

        String cleanedLine = line.toLowerCase().replaceAll("[^a-zA-Z]", "");
        return cleanedLine;
    }

    public static boolean isACharPalindrome(String line) {

        int start = 0, end = line.length() - 1;

        while (start < end) {
            if (line.charAt(start) != line.charAt(end)) {
                return false;
            }

            start++;
            end--;

        }
        return true;
    }

    public static boolean isAWordPalindrome(String line) {

        line = line.toLowerCase().replaceAll("[^a-zA-Z ]", "");

        String[] words = line.split(" ");
        int start = 0;
        int end = words.length - 1;


        while (start < end) {

            if (!words[start].equals(words[end])) {
                return false;
            }

            start++;
            end--;

        }
        return true;
    }

    public static String classifyPalindromes(String line, Boolean isAWordPalin) {

        int spacesQuantity = 0;
        String category;

        if (isAWordPalin) {
            category = "Word by word Palindrome";
        } else {
            for (char letter : line.toCharArray()) {

                if (letter == ' ') {
                    spacesQuantity++;
                }
            }


            switch (spacesQuantity) {

                case 0:
                    category = "Single word Palindrome";
                    break;
                case 1:
                    category = "Two words Palindrome";
                    break;
                case 2:
                case 3:
                case 4:
                    category = "Multiple words Palindrome";
                    break;
                default:
                    category = "Hell of Palindrome";
            }


        }
        return "The line: " + line + " is a " + category;

    }





}