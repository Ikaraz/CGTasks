package com.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Longest string

*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();
        ArrayList<String> maxStrings = new ArrayList<>();
        String maxString="";

        for(int i=0;i<5;i++){
            String s = r.readLine();
            strings.add(i, s);
            if (maxString.length() < strings.get(i).length()){
                maxString = strings.get(i);
            }
        }
        maxStrings.add(maxString);
        for (int i=0;i<strings.size();i++){
            if (maxString.length() == strings.get(i).length() && maxString != strings.get(i)){
                maxStrings.add(strings.get(i));
            }
        }
        for(int i=0;i<maxStrings.size();i++){
            System.out.println(maxStrings.get(i));
        }


    }
}
