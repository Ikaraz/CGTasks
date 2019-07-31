package com.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Playing Javarella

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> mainList = new ArrayList<>();
        ArrayList<Integer> div3 = new ArrayList<>();
        ArrayList<Integer> div2 = new ArrayList<>();
        ArrayList<Integer> rest = new ArrayList<>();

        for(int i=0;i<20;i++){
            int s = Integer.parseInt(r.readLine());
            mainList.add(s);
            if(mainList.get(i) % 3 == 0){
                div3.add(mainList.get(i));
            }
            if(mainList.get(i) % 2 == 0){
                div2.add(mainList.get(i));
            }
            if(mainList.get(i) % 3 != 0 && mainList.get(i) % 2 != 0){
                rest.add(mainList.get(i));
            }
        }
        printList(div3);
        printList(div2);
        printList(rest);
    }

    public static void printList(List<Integer> list) {

        for (Integer x: list) {
            System.out.println(x);
        }
    }
}
