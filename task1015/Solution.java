package com.codegym.task.task10.task1015;

import java.util.ArrayList;

/* 
Array of string lists

*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] array = new ArrayList[5];
        array[0] = new ArrayList<>();
        array[0].add("second");
        array[1] = new ArrayList<>();
        array[1].add("second");
        array[2] = new ArrayList<>();
        array[2].add("second");
        array[3] = new ArrayList<>();
        array[3].add("second");
        array[4] = new ArrayList<>();
        array[4].add("second");

        return array;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}