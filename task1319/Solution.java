package com.codegym.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Writing to a file from the console

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String fileName = r.readLine();
        ArrayList<String> list = new ArrayList<>();

        while(true){
            String fileBody = r.readLine();
            if(fileBody.equals("exit")){
                list.add(fileBody);
                break;
            }
            list.add(fileBody);
        }

        BufferedWriter fw = new BufferedWriter(new FileWriter(fileName));
        for(String x: list){
            fw.write(x);
            fw.write("\n");


        }
        fw.close();
        r.close();

    }

}
