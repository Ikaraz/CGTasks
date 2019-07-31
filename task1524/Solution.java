package com.codegym.task.task15.task1524;

/* 
Order of loading variables

*/

public class Solution {
    static {
        System.out.println("static void init()");// 1
    }

    {
        System.out.println("Non-static block"); //4
        printAllFields(this);
    }

    public int i = 6; // 6

    public String name = "First name"; // 7
    static {
        init(); // 2
    }

    public Solution() {
        System.out.println("Solution constructor"); // 8
        printAllFields(this);
    }

    public static void init() {
        System.out.println("Static block"); // 2
    }

    public static void main(String[] args) {
        System.out.println("public static void main"); // 3
        Solution s = new Solution();
    }

    public static void printAllFields(Solution obj) {
        System.out.println("static void printAllFields"); //4
        System.out.println(obj.i);
        System.out.println(obj.name);

    }
}
