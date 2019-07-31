package com.codegym.task.task06.task0617;

/* 
Notepad for new ideas

*/

public class Solution {

    public static class Idea {

        private String idea = "dfkjsdfkj";

        public String getDescription() {

            return idea;
        }
    }
        public static void printIdea(Idea idea){

            System.out.println(idea.getDescription());
        }




    public static void main(String[] args) {

        printIdea(new Idea());
    }

    //write your code here
}
