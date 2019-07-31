package com.codegym.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
A list and some threads

*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<>(5);

    public static void main(String[] args) {
        SpecialThread sT1 = new SpecialThread();
        SpecialThread sT2 = new SpecialThread();
        SpecialThread sT3 = new SpecialThread();
        SpecialThread sT4 = new SpecialThread();
        SpecialThread sT5 = new SpecialThread();
        list.add(new Thread(sT1));
        list.add(new Thread(sT2));
        list.add(new Thread(sT3));
        list.add(new Thread(sT4));
        list.add(new Thread(sT5));
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("This is the run method inside SpecialThread");
        }
    }
}
