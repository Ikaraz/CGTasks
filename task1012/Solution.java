package com.codegym.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

/* 
Number of letters

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Alphabet
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<>();
        for (char letter : abcArray) {
            alphabet.add(letter);
        }

        // Read in strings
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            String s1 = s.toLowerCase();
            char[] stringArray = s1.toCharArray();
            for (char letter : stringArray) {
                list.add(letter);
            }
        }
        ArrayList<Integer> num = new ArrayList<>();
        for(int i=0;i<alphabet.size();i++){
            num.add(0);
        }

        for(int i=0;i<alphabet.size();i++){
            for(int j=0;j<list.size();j++){
                if(alphabet.get(i).equals(list.get(j))){
                    num.set(i,num.get(i)+1);
                }
            }
        }

        for(int i=0;i<alphabet.size();i++){
            System.out.println(alphabet.get(i)+" "+num.get(i));
        }
    }

}
