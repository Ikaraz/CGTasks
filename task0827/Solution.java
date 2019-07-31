package com.codegym.task.task08.task0827;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* 
Working with dates

*/

public class Solution {
    public static void main(String[] args) throws Exception{
        System.out.println(isDateOdd("MAY 1 2013"));

    }

    public static boolean isDateOdd(String date) throws Exception{

        GregorianCalendar calendar = new GregorianCalendar();
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy");
        calendar.setTime(df.parse(date));

        int days = calendar.get(Calendar.DAY_OF_YEAR);
        if(days % 2 == 0) return false;
        else return true;
    }
}
