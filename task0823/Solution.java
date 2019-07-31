package com.codegym.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.sql.Array;
import java.util.ArrayList;

/* 
Going national

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        char[] chars = s.toCharArray();
        chars[0] = Character.toUpperCase(chars[0]);
        for(int i=0;i<chars.length;i++){

            if(Character.isWhitespace(chars[i])){
                chars[i+1] = Character.toUpperCase(chars[i+1]);
            }
        }

        System.out.println(chars);
    }

}
