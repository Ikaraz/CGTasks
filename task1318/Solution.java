package com.codegym.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Reading a file

*/

public class Solution {
    public static void main(String[] args) throws Exception{

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String input = r.readLine();
        InputStream inStream = new FileInputStream(input);
        BufferedWriter outStream = new BufferedWriter(new OutputStreamWriter(System.out));

        while(inStream.available() > 0){
            int data = inStream.read();
            outStream.write(data);
        }
        inStream.close();
        outStream.close();
        r.close();
    }
}