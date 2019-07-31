package com.codegym.task.task13.task1326;

/* 
Sorting even numbers from a file

*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String fileName = r.readLine();
        ArrayList<Integer> list = new ArrayList<>();

        InputStream inStream = new FileInputStream(fileName);
//        while(inStream.available()>0){
//            int data = inStream.read();
//            list.add(data);
//        }

        BufferedReader rFile = new BufferedReader(new InputStreamReader(inStream));
        while(true) {
            String fileBody = rFile.readLine();
            if(fileBody == null) break;
            Integer fileInt = Integer.parseInt(fileBody);
            list.add(fileInt);
        }
        ArrayList<Integer> evenInts = new ArrayList<>();
        for(Integer x: list){
            if(x % 2 == 0){
                evenInts.add(x);
            }
        }
        inStream.close();
        r.close();
        rFile.close();

        Collections.sort(evenInts);
        for(Integer x: evenInts){
            System.out.println(x);
        }




    }
}
