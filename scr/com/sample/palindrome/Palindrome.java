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

    }

    public String allLetters(){
        String[] lettersOfAlphabet;
        boolean allLetters;
        Scanner userInput;
        String inputToCheck, eachLetterChecked, eachCharacter, wordToCheck;

        lettersOfAlphabet = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o",
        "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        allLetters = false;
        wordToCheck = "";
        userInput = new Scanner(System.in);

        while(!allLetters)
        {
            inputToCheck = userInput.nextLine();
            for (int i = 0; i < inputToCheck.length(); i++)
            {
                eachLetterChecked = inputToCheck.substring(i, i+1);
                for(int j = 0; j < lettersOfAlphabet.length; j++)
                {
                    eachCharacter = lettersOfAlphabet[i];
                    if(eachLetterChecked.equalsIgnoreCase(eachCharacter))
                    {
                        wordToCheck = wordToCheck + eachLetterChecked;
                        break;
                    }
                }
            }

        }

        return wordToCheck;

    }
}
