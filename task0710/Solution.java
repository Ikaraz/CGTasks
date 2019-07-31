package com.codegym.task.task07.task0710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
To the top of the list

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i=0;i<10;i++){
            String s = r.readLine();
            list.add(0, s);
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
