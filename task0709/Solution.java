package com.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Expressing ourselves more concisely

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList strings = inputs();
        ArrayList min = minString(strings);
        for(int i=0;i<min.size();i++) {
            System.out.println(min.get(i));
        }


    }

    public static ArrayList<String> inputs() throws Exception{

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> input = new ArrayList<>();
        for (int i=0;i<5;i++){
            String s = r.readLine();
            input.add(i, s);
        }
        return input;
    }
    public static ArrayList<String> minString(ArrayList<String> list){

        String s = list.get(0);
        for(int i=0;i<list.size();i++){
            if (s.length() > list.get(i).length()){
                s = list.get(i);
            }
        }
        ArrayList<String> minList = new ArrayList<>();
        minList.add(s);
        for(int i=0;i<list.size();i++){
            if(s.length() == list.get(i).length() && s != list.get(i)){
                minList.add(list.get(i));
            }
        }
        return minList;
    }
}
