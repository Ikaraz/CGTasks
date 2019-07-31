package com.codegym.task.task13.task1327;

import java.util.ArrayList;
import java.util.List;

/* 
Turnip

*/

public class Solution {
    public static void main(String[] args) {
        List<Person> plot = new ArrayList<>();
        plot.add(new Person("Granddaughter",null));
        plot.add(new Person("Grandma",plot.get(0)));
        plot.add(new Person("Grandpa",plot.get(1)));
        plot.add(new Person("Turnip",plot.get(2)));
        for(int i=1;i<plot.size();i++){
            System.out.println(plot.get(i).pull(plot.get(i)));
        }
    }

    public interface TurnipItem{
        String pull(Person person);
    }
    public static class Person implements TurnipItem{

        String name;
        Person behind;

        public Person(String name, Person behind){
            this.name = name;
            this.behind = behind;
        }

        public String pull(Person person){
            if(behind != null) {
                String story = person.behind.name + " behind " + person.name;
                return story;
            }

            return person.name;
        }
    }
}
