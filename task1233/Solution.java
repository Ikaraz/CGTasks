package com.codegym.task.task12.task1233;

/* 
The isomorphs are coming

*/

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The index of the minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

        int tempVal;
        int y = 0;

        for(int j=0;j<array.length;j++){
            if(array[0]>array[j]){
                y = j;
                tempVal = array[0];
                array[0] = array[j];
                array[j] = tempVal;
            }
        }

//        for(int i=0;i<array.length;i++){
//            for(int j=i;j<array.length;j++){
//                if(array[i]>array[j]){
//                   tempVal = array[i];
//                   array[i] = array[j];
//                   array[j] = tempVal;
//                }
//            }
//        }



        return new Pair<Integer, Integer>(array[0], y);
    }


    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
