package com.ak.logic;

import java.util.HashMap;
import java.util.Map;

public class CountRepetedChar {

    public static void main(String[] args) {

        String name = "Akshaya mahanty";

        Map<Character,Integer> map = new HashMap<>();
        for(Character c : name.toLowerCase().toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        System.out.println(map);
    }
}
