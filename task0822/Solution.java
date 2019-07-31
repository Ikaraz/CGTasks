package com.codegym.task.task08.task0822;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* 
Minimum of N numbers

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {

        Collections.sort(array);
        return array.get(0);
    }

    public static List<Integer> getIntegerList() throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(r.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0;i<input;i++){
            list.add(Integer.parseInt(r.readLine()));
        }
        return list;
    }
}
