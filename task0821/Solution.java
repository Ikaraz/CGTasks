package com.codegym.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Shared last names and first names

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        HashMap<String,String> map = new HashMap<>();
        map.put("Lname","Fname1");
        map.put("Lname1","Fname");
        map.put("Lname","Fname4");
        map.put("Lname2","Fname");
        map.put("Lname","Fname2");
        map.put("Lname","Fname");
        map.put("Lname2","Fname2");
        map.put("Lname5","Fname3");
        map.put("Lname","Fname");
        map.put("Lname4","Fname");

        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
