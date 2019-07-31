package com.codegym.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {

        String tempVal;
        int tempInt;

        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++) {
                if(!isNumber(array[i]) && !isNumber(array[j])){
                    if (isGreaterThan(array[i],array[j])){

                        tempVal = array[j];
                        array[j] = array[i];
                        array[i] = tempVal;

                    }

                }
                else if (isNumber(array[i]) && isNumber(array[j])){
                    int a = Integer.parseInt(array[i]);
                    int b = Integer.parseInt(array[j]);
                    if(a<b){
                        tempInt = a;
                        a=b;
                        b=tempInt;
                        array[i] = String.valueOf(a);
                        array[j] = String.valueOf(b);
                    }
                }
            }
        }

    }

    // String comparison method: 'a' is greater than 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Is the passed string a number?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // The string contains a hyphen
                    || (!Character.isDigit(c) && c != '-') // or is not a number and doesn't start with a hyphen
                    || (i == 0 && c == '-' && chars.length == 1)) // or is a single hyphen
            {
                return false;
            }
        }
        return true;
    }
}
