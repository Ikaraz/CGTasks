package com.codegym.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
What's today's date?

*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String dateString = r.readLine();
        SimpleDateFormat startDf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = startDf.parse(dateString);
        SimpleDateFormat newDf = new SimpleDateFormat("MMM dd, yyyy");
        System.out.println(newDf.format(date.getTime()).toUpperCase());
    }
}
