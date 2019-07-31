package com.codegym.task.task15.task1529;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Mastering the static block

*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        reset();
    }

    public static CanFly result;

    public static void reset() {
        try {
            BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
            String input = r.readLine();
            if(input.equals("helicopter")){
                result = new Helicopter();
            }
            else if(input.equals("plane")){
                int numOfPass = Integer.parseInt(r.readLine());
                result = new Plane(numOfPass);
            }
            r.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }



    }
}
