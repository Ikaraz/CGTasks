package com.codegym.task.task15.task1525;



import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/* 
File in a static block

*/

public class Solution {

    public static List<String> lines = new ArrayList<>();

    static {

        try {
            BufferedReader r = new BufferedReader(new FileReader(Statics.FILE_NAME));

            while (true) {
                String fileLine = r.readLine();
                if(fileLine == null) break;
                lines.add(fileLine);
            }
            r.close();

        }
        catch (Exception e){
            e.printStackTrace();
        }

    }



    public static void main(String[] args) {

        System.out.println(lines);
    }
}
