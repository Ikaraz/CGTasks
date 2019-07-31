package com.codegym.task.task07.task0716;

import java.util.ArrayList;
import java.util.Collections;

/* 
R or L

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rose"); // 0
        list.add("love"); // 1
        list.add("lyre"); // 2
        list.add("loss");
        list.add("cats");
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {

        ArrayList<String > list1 = new ArrayList<>();

        for (String x : list){
            if (!x.contains("r") || (x.contains("r") && x.contains("l"))){
               list1.add(x);
            }
            if (x.contains("l") && !x.contains("r"))  {
                list1.add(x);
            }
        }
        return list1;
    }
}