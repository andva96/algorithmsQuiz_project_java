package com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        runSelectedClass();

    }

    public static void runSelectedClass() {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of the function you want to execute: ");
        System.out.println("1: Is Palindrome");
        System.out.println("2: Invert words in Parenthesis");
        String optionSelected = input.nextLine();

        if (optionSelected.equals("1")) {
            System.out.println("Using input file data");
            IsPalindromeFunction palindrome = new IsPalindromeFunction();
            palindrome.mainPalindrome();
            System.out.println("Process done, please check your outputFile");
        } else if (optionSelected.equals("2")) {
            System.out.println("Enter sentence to invert");
            String sentenceToInvert = input.nextLine();

            InvertParenthesesWordsFunction invert = new InvertParenthesesWordsFunction();
            invert.mainInvert(sentenceToInvert);
        } else {
            System.out.println("Invalid input");
        }


    }


}
