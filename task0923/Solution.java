package com.codegym.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Vowels and consonants

*/

public class Solution {
    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine();
        char[] array = s.toCharArray();
        ArrayList<Character> vowelList = new ArrayList<>();
        ArrayList<Character> consonantList = new ArrayList<>();
        for(Character c : array){
            if(isVowel(c)){
                vowelList.add(c);
            }
            else if(Character.isWhitespace(c)){
                continue;
            }
            else consonantList.add(c);
        }
        for(Character c: vowelList) {
            System.out.print(c+" ");
        }
        System.out.println();
        for(Character c: consonantList) {
            System.out.print(c+" ");
        }

    }

    // The method checks whether a letter is a vowel
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // Convert to lowercase

        for (char d : vowels)   // Look for vowels in the array
        {
            if (c == d)
                return true;
        }
        return false;
    }
}