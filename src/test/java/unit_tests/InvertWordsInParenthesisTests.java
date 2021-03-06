package unit_tests;


import com.InvertParenthesesWordsFunction;
import org.testng.Assert;
import org.testng.annotations.Test;
import testdata.DefaultDataValues;


public class InvertWordsInParenthesisTests {


    @Test(testName = "Send sentences with parenthesis", dataProvider = "SentencesWithParenthesis", dataProviderClass = DefaultDataValues.class)
    public void validateSentenceWithParenthesis(String sentence, String expectedSentence) {

        InvertParenthesesWordsFunction invert = new InvertParenthesesWordsFunction();
        Assert.assertEquals(invert.mainInvert(sentence), expectedSentence, "The output sentence was not as expected");

    }

    @Test(testName = "Validate a sentence should be 50 characters or less, without counting spaces", dataProvider = "SentencesWithMoreThan50Characters", dataProviderClass = DefaultDataValues.class)
    public void validateLimitOfCharacters(String sentence) {

        InvertParenthesesWordsFunction invert = new InvertParenthesesWordsFunction();
        Assert.assertFalse(invert.isAValidString(sentence), "The function is allowing more than 50 characters");

    }

    @Test(testName = "Send a word and invert it", dataProvider = "WordsToInvert", dataProviderClass = DefaultDataValues.class)
    public void validateInvertAWord(String word, String invertedWord) {

        InvertParenthesesWordsFunction invert = new InvertParenthesesWordsFunction();
        Assert.assertEquals(invert.reverseSubstring(word), invertedWord, "The word is not correctly inverted");
        System.out.println(invert.reverseSubstring(word));
    }

    @Test(testName = "Validate the output sentence is presented without parenthesis and all lowercase", dataProvider = "DataToValidateFormat", dataProviderClass = DefaultDataValues.class)
    public void validateOutputSentenceFormat(String sentence, String expectedSentence) {

        InvertParenthesesWordsFunction invert = new InvertParenthesesWordsFunction();
        Assert.assertEquals(invert.mainInvert(sentence), expectedSentence, "The input sentence is not matching the format");


    }

    @Test(testName = "Send numbers instead of letters", dataProvider = "NumberSentences", dataProviderClass = DefaultDataValues.class)
    public void validateNumberSentences(String sentence, String expectedSentence) {

        InvertParenthesesWordsFunction invert = new InvertParenthesesWordsFunction();
        Assert.assertEquals(invert.mainInvert(sentence), expectedSentence, "");


    }


}
