package com.codegym.task.task06.task0601;

/* 
Cat's finalize method

*/

public class Cat {

    String name;

    public Cat(String name){
        this.name = name;
    }

    protected void finalize() throws Throwable{

        System.out.println(name +" has been deleted");
    }


    public static void main(String[] args) {

    }
}
