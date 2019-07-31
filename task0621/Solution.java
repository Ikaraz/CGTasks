package com.codegym.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Cat relations

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFName = reader.readLine();
        Cat catGrandpa = new Cat(grandFName);

        String grandMName = reader.readLine();
        Cat catGrandma = new Cat(grandMName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null ,catGrandpa);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandma, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandpa.print());
        System.out.println(catGrandma.print());
        System.out.println(catFather.print());
        System.out.println(catMother.print());
        System.out.println(catSon.print());
        System.out.println(catDaughter.print());

    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        public String print() {
            if (mother == null && father ==null)
                return "The cat's name is " + name + ", no mother, no father ";
            else if (father == null)
                return "The cat's name is " + name + ", " + mother.name + " is the mother, no father";
            else if (mother == null)
                return  "The cat's name is " + name + ", no mother, " + father.name + " is the father";
            else
                return "The cat's name is " + name + ", "+mother.name+" is the mother, "+ father.name + " is the father";

        }
    }

}
