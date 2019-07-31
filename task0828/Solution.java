package com.codegym.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Month number

*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String input = r.readLine();
        HashMap<String, Integer> list = new HashMap<>();
        list.put("January",1);
        list.put("February",2);
        list.put("March",3);
        list.put("April",4);
        list.put("May",5);
        list.put("June",6);
        list.put("July",7);
        list.put("August",8);
        list.put("September",9);
        list.put("October",10);
        list.put("November",11);
        list.put("December",12);
        for(String x: list.keySet()){
            if(input.equals(x)){
                System.out.println(x+" is month "+list.get(x));
            }

        }





    }
}
