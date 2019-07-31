package com.codegym.task.task08.task0824;

/* 
Make a family

*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        Human ch1 = new Human("ch1",true,17);
        Human ch2 = new Human("ch2",false,21);
        Human ch3 = new Human("ch3",true,13);

        Human father = new Human("father",true,45);
        father.children.add(ch1);
        father.children.add(ch2);
        father.children.add(ch3);
        Human mother = new Human("mother",false,44);
        mother.children.add(ch1);
        mother.children.add(ch2);
        mother.children.add(ch3);

        Human grandpaF = new Human("grandpaF",true,75);
        grandpaF.children.add(father);
        Human grandmaF = new Human("grandmaF",false,74);
        grandmaF.children.add(father);

        Human grandpaM = new Human("grandpaM",true,73);
        grandpaM.children.add(mother);
        Human grandmaM = new Human("grandpaF",false,72);
        grandmaM.children.add(mother);

        System.out.println(grandpaF.toString());
        System.out.println(grandpaM.toString());
        System.out.println(grandmaF.toString());
        System.out.println(grandmaM.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(ch1.toString());
        System.out.println(ch2.toString());
        System.out.println(ch3.toString());

    }

    public static class Human {

        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;

        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", children: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
