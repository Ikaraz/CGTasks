package com.codegym.task.task07.task0724;

/* 
Family census

*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> family = new ArrayList<>();

        Human grandpaF = new Human("GrandpaF",true,75);
        Human grandmaF = new Human("GrandmaF",false,74);
        Human grandpaM = new Human("GrandpaM",true,73);
        Human grandmaM = new Human("GrandmaM",false,72);
        Human father = new Human("Father",true,45,grandpaF,grandmaF);
        Human mother = new Human("Mother",false,44,grandpaM,grandmaM);
        Human child1 = new Human("Child1",false,21,father,mother);
        Human child2 = new Human("Child2",true,15,father,mother);
        Human child3 = new Human("Child3",true,11,father,mother);
        family.add(grandpaF);
        family.add(grandmaF);
        family.add(grandpaM);
        family.add(grandmaM);
        family.add(father);
        family.add(mother);
        family.add(child1);
        family.add(child2);
        family.add(child3);
        for (Human x : family){
            System.out.println(x.toString());
        }

    }

    public static class Human {

        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        public Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null)
                text += ", father: " + this.father.name;

            if (this.mother != null)
                text += ", mother: " + this.mother.name;

            return text;
        }
    }
}