package com.codegym.task.task09.task0926;

import java.util.ArrayList;

/* 
List of number arrays

*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {

        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[5]);
        list.add(new int[2]);
        list.add(new int[4]);
        list.add(new int[7]);
        list.add(new int[0]);

        list.get(0)[0] = 10;
        list.get(0)[1] = 11;
        list.get(0)[2] = 12;
        list.get(0)[3] = 13;
        list.get(0)[4] = 14;
        list.get(1)[0] = 20;
        list.get(1)[1] = 21;
        list.get(2)[0] = 30;
        list.get(2)[1] = 31;
        list.get(2)[2] = 32;
        list.get(2)[3] = 33;
        list.get(3)[0] = 40;
        list.get(3)[1] = 41;
        list.get(3)[2] = 42;
        list.get(3)[3] = 43;
        list.get(3)[4] = 44;
        list.get(3)[5] = 45;
        list.get(3)[6] = 46;
        return list;

    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
