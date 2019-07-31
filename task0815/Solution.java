package com.codegym.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Census

*/

public class Solution {
    public static HashMap<String, String> createMap() {

        HashMap<String,String> hMap = new HashMap<>();
        hMap.put("Lname1","Fname1");
        hMap.put("Lname2","Fname2");
        hMap.put("Lname3","Fname3");
        hMap.put("Lname4","Fname4");
        hMap.put("Lname5","Fname5");
        hMap.put("Lname6","Fname6");
        hMap.put("Lname7","Fname7");
        hMap.put("Lname8","Fname7");
        hMap.put("Lname9","Fname8");
        hMap.put("Lname10","Fname9");

        return hMap;
    }

    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {

        int n = 0;
        for(String x: map.values()){
            if(x.equals(name)){
                n++;
            }
        }
        return n;
    }

    public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {

        int n = 0;
        for(String x: map.keySet()){
            if(x.equals(lastName)){
                n++;
            }
        }
        return n;

    }

    public static void main(String[] args) {

    }
}
