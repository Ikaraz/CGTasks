package com.codegym.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Reinforce the singleton pattern

*/

public class Solution {

    static {
        readKeyFromConsoleAndInitPlanet();
    }
    public static void main(String[] args) throws Exception{

    }

    public static Planet thePlanet;

    // Add static block here

    public static void readKeyFromConsoleAndInitPlanet() {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        try {
            String input = r.readLine();
            if(input.equals(Planet.EARTH)){
                Solution.thePlanet = Earth.getInstance();
            }
            else if(input.equals(Planet.MOON)){
                Solution.thePlanet = Moon.getInstance();
            }
            else if(input.equals(Planet.SUN)){
                Solution.thePlanet = Sun.getInstance();
            }
            else Solution.thePlanet = null;
        }
        catch (IOException e){
            System.out.println(e);
        }

    }
}
