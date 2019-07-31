package com.codegym.task.task08.task0819;

import java.util.*;
import java.util.concurrent.CopyOnWriteArraySet;

/* 
Set of cats

*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        Iterator<Cat> iterator = cats.iterator();

        while(iterator.hasNext()){
           Cat next = iterator.next();
           if(!next.toString().isEmpty())
           iterator.remove();
           break;
        }

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> cats = new HashSet<>();

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);

        return cats;
    }

    public static void printCats (Set < Cat > cats) {

        for(Cat cat : cats){
            System.out.println(cat);
        }
    }


    public static class Cat{

    }
}
