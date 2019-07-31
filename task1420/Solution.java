package com.codegym.task.task14.task1420;

/* 
GCD

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        try {
            Integer a = Integer.parseInt(r.readLine());
            Integer b = Integer.parseInt(r.readLine());

            ArrayList<Integer> list = new ArrayList<>();
            ArrayList<Integer> list1 = new ArrayList<>();

            if (a < b) {
                for (int i = 1; i <= a; i++) {
                    list.add(i);
                }
            } else {
                for (int i = 1; i <= b; i++) {
                    list.add(i);
                }
            }

            for (Integer x : list) {
                if (a % x == 0 && b % x == 0) {
                    list1.add(x);
                }
            }
            Collections.sort(list1);
            System.out.println(list1.get(list1.size() - 1));
        }
        catch (NumberFormatException e){
            throw e;
        }


    }
}
