package com.codegym.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Words in reverse

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for(int i=0;i<5;i++){
            String s = r.readLine();
            list.add(s);
        }
        list.remove(2);
        for(int i= list.size()-1;i>=0;i--){
            System.out.println(list.get(i));
        }
    }
}


