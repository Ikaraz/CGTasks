package com.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Kind Emma and the summer holidays

*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 19 1980"));
        map.put("Stallone1", df.parse("JULY 24 1987"));
        map.put("Stallone2", df.parse("JANUARY 01 1980"));
        map.put("Stallone3", df.parse("FEBRUARY 06 1990"));
        map.put("Stallone4", df.parse("MARCH 14 1982"));
        map.put("Stallone5", df.parse("APRIL 21 1996"));
        map.put("Stallone6", df.parse("AUGUST 16 1998"));
        map.put("Stallone7", df.parse("DECEMBER 11 1971"));
        map.put("Stallone8", df.parse("OCTOBER 17 1988"));
        map.put("Stallone9", df.parse("JUNE 10 1989"));

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {

        Iterator<Date> iterator = map.values().iterator();
        while(iterator.hasNext()){
            Date next = iterator.next();
            int month = next.getMonth();
            if(month==5||month==6||month==7){
                iterator.remove();
            }
        }

    }

    public static void main(String[] args) throws Exception{




    }
}
