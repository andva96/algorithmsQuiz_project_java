package com;

public class InvertParenthesesWordsFunction {

    public String mainInvert(String sentence) {

        sentence = sentence.toLowerCase();
        boolean validString = isAValidString(sentence);
        String invertedSentence = reverseWordInParenthesis(sentence, validString);
        System.out.println("The output of " + sentence + " is: " + invertedSentence);
        return invertedSentence;
    }

    public boolean isAValidString(String sentence) {

        int lettersQuantity = 0;


        for (int count = 0; count < sentence.length(); count++) {

            if (sentence.charAt(0) != ' ') {
                lettersQuantity++;
            }
        }
        if (lettersQuantity > 50) {
            System.out.println("NULL");
            System.out.println("Quantity of characters is more than 50");
            return false;


        }
        System.out.println("Quantity of characters: " + lettersQuantity);
        return true;
    }

    public String reverseSubstring(String substring) {

        int end;
        String invertedWord = "";

        for (end = substring.length() - 1; end >= 0; end--) {

            invertedWord = invertedWord + substring.charAt(end);

        }

        return invertedWord;
    }

    public String reverseWordInParenthesis(String sentence, boolean isAValidSentence) {

        String invalidSentence = "Invalid sentence";
        int characterNotFound = -1;

        if (isAValidSentence) {

            int start = sentence.lastIndexOf("(");
            int end = sentence.indexOf(")", start);

            while (start != characterNotFound && end != characterNotFound) {

                String firstPartSentence = sentence.substring(0, start);
                String wordToInvert = sentence.substring(start + 1, end);
                String lastPartSentence = sentence.substring(end + 1);
                String invertedWord = reverseSubstring(wordToInvert);


                sentence = firstPartSentence + invertedWord + lastPartSentence;

                start = sentence.lastIndexOf("(");
                end = sentence.indexOf(")", start);

            }
            return sentence;

        } else {
            return invalidSentence;
        }


    }


}
