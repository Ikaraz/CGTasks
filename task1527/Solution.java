package com.codegym.task.task15.task1527;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Request parser

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String input = r.readLine();
        String s = "";
        String s1 = "";
        String obj ="";
        ArrayList<String> list = new ArrayList<>();
        char[] array = input.toCharArray();
        for(int i=0;i<input.length();i++){
            if(array[i]=='?'){
                for(int y=i+1;y<input.length();y++){
                    if(array[y]=='='){
                        for(int z=y+1;z<input.length();z++){
                            if(array[z]=='&'){
                                break;
                            }
                            s1=s1+array[z];
                        }
                        if(s.equals("obj")){
                            obj = s1;
                        }
                        s1 ="";
                        break;
                    }
                    s = s+array[y];
                }
                list.add(s);
                s="";
                break;
            }
        }
        for(int z1=0;z1<input.length();z1++){
            if(array[z1]=='&'){
                for(int y=z1+1;y<input.length();y++){
                    if(array[y]=='&'){
                        break;
                    }
                    if(array[y]=='='){
                        for(int z=y+1;z<input.length();z++){
                            if(array[z]=='&'){
                                break;
                            }
                            s1=s1+array[z];
                        }
                        if(s.equals("obj")){
                            obj = s1;
                        }
                        s1 ="";
                        break;
                    }
                    s = s+array[y];
                }
                list.add(s);
                s="";
            }
        }
        for(String string: list){
            System.out.print(string+" ");
        }
        if(input.contains("obj=")) {
            try {

                System.out.println();
                alert(Double.parseDouble(obj));

            } catch (Exception e) {
                alert(obj);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
