package unit_tests;


import com.InvertWordsFunction;
import org.testng.Assert;
import org.testng.annotations.Test;
import testdata.DefaultDataValues;


public class InvertWordsInParenthesisTests {


    @Test(testName="Send sentences with parenthesis", dataProvider = "SentencesWithParenthesis", dataProviderClass = DefaultDataValues.class)
    public void validateSentenceWithParenthesis (String sentence, String expectedSentence){

        InvertWordsFunction invert = new InvertWordsFunction();
        Assert.assertEquals(invert.mainInvert(sentence),expectedSentence, "The output sentence was not as expected");

    }

    @Test(testName="Validate a sentence should be 50 characters or less, without counting spaces",dataProvider = "SentencesWithMoreThan50Characters", dataProviderClass = DefaultDataValues.class)
    public void validateLimitOfCharacters (String sentence){

        InvertWordsFunction invert = new InvertWordsFunction();
        Assert.assertFalse(invert.isAValidString(sentence), "The function is allowing more than 50 characters");

    }

    @Test(testName="Send a word and invert it", dataProvider = "WordsToInvert", dataProviderClass = DefaultDataValues.class)
    public void validateInvertAWord (String word, String invertedWord){

        InvertWordsFunction invert = new InvertWordsFunction();
        Assert.assertEquals(invert.reverseSubstring(word),invertedWord,"The word is not correctly inverted");
        System.out.println(invert.reverseSubstring(word));
    }

    @Test(testName="Validate the output sentence is presented without parenthesis and all lowercase", dataProvider = "DataToValidateFormat", dataProviderClass = DefaultDataValues.class)
    public void validateOutputSentenceFormat (String sentence, String expectedSentence){

        InvertWordsFunction invert = new InvertWordsFunction();
        Assert.assertEquals(invert.mainInvert(sentence),expectedSentence, "Issue related with spaces or Capital letters");


    }


}
