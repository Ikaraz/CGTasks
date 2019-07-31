package com.codegym.task.task10.task1011;

/* 
Big salary

*/

public class Solution {
    public static void main(String[] args) {
        String s = "I do not want to learn Java. I want a big salary";

        char[] array = new char[s.length()];
        array = s.toCharArray();

        for(int i=0;i<43;i++){
            for(int j=i;j<array.length;j++){
                System.out.print(array[j]);
            }
            System.out.println();
        }
    }

}

