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

/**
 * This is the main method that runs the program.
 */

public class Palindrome {
    public static void main(String[] args){
        String wordIn, wordOut, welcome, wordToCheck;
        boolean goodInput;
        Scanner newWord;

        welcome = "Welcome! Please enter a word and I will tell if you it's a palindrome or not.";
        newWord = new Scanner(System.in);
        goodInput = true;

            while (goodInput) { //A while loop controls the program, allowing a user to continue input until bad input is received.
                System.out.println(welcome);
                wordIn = newWord.nextLine();
                wordOut = Palindrome.allLetters(wordIn); //This calls the method to check for bad user input.
                if (wordOut.equals("-1")) {
                    goodInput = false; //Once bad input is received the loop stops.
                } else {
                    wordToCheck = Palindrome.wordReversed(wordIn); //This calls the method to reverse the word.
                    Palindrome.palindromeChecker(wordIn, wordToCheck); //This calls the method to check if the word entered is a palindrome.

                }
            }


    }


    /**
     * This method will check if the user has entered only letters.
     * @param wordEntered
     * @return string of word entered or a number that stops the main method from running.
     */

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
                System.out.println("You entered something that was not a letter. I'm not playing anymore.");
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

        for(int i = 0; i < wordEntered.length(); i++) //This loop reorders the word.
        {
            letToReverse = wordEntered.substring(i, i+1);
            wordReversed = letToReverse + wordReversed;
        }

        return wordReversed;
    }

    /**
     * This method checks to see if the word entered is a palindrome.
     * @param wordOriginal
     * @param wordReversed
     */

    public static void palindromeChecker (String wordOriginal, String wordReversed )
    {
        String originalWord, reversedWord, resultsYes, resultsNo;
        originalWord = wordOriginal;
        reversedWord = wordReversed;
        resultsYes = "Awesome! You entered a Palindrome!\n";
        resultsNo = "Well, that was a word, but not a palindrome.\n";

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
