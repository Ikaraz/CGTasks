package com.codegym.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/* 
Longest sequence

*/
public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i=0;i<10;i++){
            list.add(Integer.parseInt(r.readLine()));
            list1.add(Integer.MIN_VALUE);
        }
        int a;
        int n = 0;

        for(int i=0;i<list.size();i+=a){
            a = 0;
            for(int j=i;j<list.size();j++){

                if(list.get(i).equals(list.get(j))){
                    a++;
                    list1.set(n,a);
                }
                else break;
            }
            n++;
        }
        Collections.sort(list1);
        System.out.println(list1.get(list1.size()-1));


    }
}