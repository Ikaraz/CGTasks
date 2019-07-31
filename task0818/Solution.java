package com.codegym.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Only for the rich

*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A",245);
        map.put("B",268);
        map.put("C",547);
        map.put("D",587);
        map.put("E",965);
        map.put("F",832);
        map.put("G",844);
        map.put("H",759);
        map.put("I",486);
        map.put("J",623);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {

        Iterator<Integer> iterator = map.values().iterator();
        while(iterator.hasNext()){
            int next = iterator.next();
            if (next<500){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

        //HashMap<String,Integer> map = createMap();
        //removeItemFromMap(map);

    }
}