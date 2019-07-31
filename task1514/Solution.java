package com.codegym.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Static modifiers: part 1

*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<>();

    static{
        labels.put((double)20,"1");
        labels.put((double)21,"1");
        labels.put((double)22,"1");
        labels.put((double)23,"1");
        labels.put((double)24,"1");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
