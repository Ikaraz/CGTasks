package com.codegym.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Method in a try-catch

*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        try{
            while(true){
                list.add(Integer.parseInt(r.readLine()));
            }

        }
        catch (IOException e){
            System.out.println(e);
        }
        catch (NumberFormatException e){
            for(Integer i: list) {
                System.out.println(i);
            }
        }
    }
}
