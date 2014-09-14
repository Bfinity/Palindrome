package com.sample.palindrome;

/**
 * Created by BFineRocks on 9/14/14.
 */

/**
 * This program will determine if the word the user enters is a palindrome or not. It will print out a message with the
 * answer. It will take user input, check if the input is valid, run the test for palindrome determination and print
 * results.
 */

import java.util.Scanner;
import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args){
        String wordIn, wordOut, welcome, wordToCheck;
        boolean goodInput;
        Scanner newWord;

        welcome = "Welcome! Please enter a word and I will tell if you it's a palindrome or not.";
        newWord = new Scanner(System.in);
        goodInput = true;

        while(goodInput) {
            System.out.println(welcome);
            wordIn = newWord.nextLine();
            wordOut = Palindrome.allLetters(wordIn);
            if(wordOut.equals("-1"))
            {
                goodInput = false;
            }
            else
            {
                wordToCheck = Palindrome.wordReversed(wordIn);
                Palindrome.palindromeChecker(wordIn, wordToCheck);
            }
        }


    }

    public static String allLetters(String wordEntered){
        String[] lettersOfAlphabet;
        boolean allLetters;
        Scanner userInput;
        String inputToCheck, eachLetterChecked, wordToCheck;
        int j;


        lettersOfAlphabet = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
        "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        allLetters = true;
        wordToCheck = "";
        userInput = new Scanner(System.in);


        while(allLetters)
        {
            inputToCheck = wordEntered;
            for (int i = 0; i < inputToCheck.length(); i++)
            {
                eachLetterChecked = inputToCheck.substring(i, i+1);
                for(String let : lettersOfAlphabet)
                {
                    if(eachLetterChecked.equalsIgnoreCase(let))
                    {
                        wordToCheck = wordToCheck + eachLetterChecked;
                        break;
                    }

                }

            }
            if (wordToCheck.length()!=inputToCheck.length())
            {
                System.out.println("You entered something that was not a letter.");
                wordToCheck = "-1";
                allLetters = false;
            }
            else
            {
                allLetters = false;
            }
        }

        return wordToCheck;

    }

    /**
     * This method will reverse the user entered word
     * @param wordToCheck
     */

    public static String wordReversed (String wordToCheck)
    {
        String wordEntered, letToReverse, wordReversed;
        wordReversed = "";

        wordEntered = wordToCheck;

        for(int i = 0; i < wordEntered.length(); i++)
        {
            letToReverse = wordEntered.substring(i, i+1);
            wordReversed = letToReverse + wordReversed;
        }

        return wordReversed;
    }

    public static void palindromeChecker (String wordOriginal, String wordReversed )
    {
        String originalWord, reversedWord, resultsYes, resultsNo;
        originalWord = wordOriginal;
        reversedWord = wordReversed;
        resultsYes = "Awesome! You entered a Palindrome!";
        resultsNo = "Well, that was a word, but not a palindrome.";

        if(originalWord.equalsIgnoreCase(reversedWord))
        {
            System.out.println(resultsYes);
        }
        else
        {
            System.out.println(resultsNo);
        }

    }
}
