package testdata;

import org.testng.annotations.DataProvider;

public class DefaultDataValues {

    @DataProvider(name = "SentencesWithParenthesis")
    public Object[][] getSentencesWithParenthesis() {
        return new Object[][]
                {
                        {"(Demo)", "omed"},
                        {"foo(bar)baz", "foorabbaz"},
                        {"foo(bar)baz(blim)", "foorabbazmilb"},
                        {"foo(bar(baz))blim", "foobazrabblim"},
                };
    }

    @DataProvider(name = "SentencesWithMoreThan50Characters")
    public Object[][] getMoreThan50Characters() {
        return new Object[][]
                {
                        {"mmmmmmmmmm(mjkkk)mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm"},
                        {"abcdefghijklmnopqrstuvwxyz(abcdefghijklmnopqrstuvwxyz)abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"},
                        {"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"},
                };
    }

    @DataProvider(name = "WordsToInvert")
    public Object[][] getWords() {
        return new Object[][]
                {
                        {"demo", "omed"},
                        {"watermelon", "nolemretaw"},
                        {"hello", "olleh"},
                        {"unittest", "tsettinu"},
                };
    }

    @DataProvider(name = "DataToValidateFormat")
    public Object[][] getWordsWithDifferentFormat() {
        return new Object[][]
                {
                        {"(HE)LLO", "ehllo"},
                        {"(WATERMELON)", "nolemretaw"},
                        {"(Demo)", "omed"},
                        {"FOO(BAR)baz(blim)", "foorabbazmilb"},

                };
    }


}
