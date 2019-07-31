package com.codegym.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
We don't need repeats

*/

public class Solution {
    public static HashMap<String, String> createMap() {

        HashMap<String,String> map = new HashMap<>();
        map.put("Lname1","Fname1");
        map.put("Lname2","Fname2");
        map.put("Lname3","Fname3");
        map.put("Lname4","Fname1");
        map.put("Lname5","Fname4");
        map.put("Lname6","Fname5");
        map.put("Lname7","Fname6");
        map.put("Lname8","Fname2");
        map.put("Lname9","Fname2");
        map.put("Lname10","Fname9");

        return map;
    }

    public static void removeFirstNameDuplicates(Map<String, String> map) {

        ArrayList<String> list = new ArrayList<>();

        for(Map.Entry<String,String> pair : map.entrySet()){

            if(!list.contains(pair.getValue())) list.add(pair.getValue());

            else{
                removeItemFromMapByValue(map,pair.getValue());
                removeFirstNameDuplicates(map);
                break;
            }

        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

        //HashMap<String,String> map = createMap();
        //removeFirstNameDuplicates(map);



    }
}
