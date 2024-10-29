package com.linkedin.generics;

import java.util.ArrayList;
import java.util.List;

public class Rules {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(10);
        int number = integers.get(0);

        List<String> languages = new ArrayList<>();
        languages.add("English");
       // integers = languages;
    }
}
