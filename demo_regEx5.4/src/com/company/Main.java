package com.company;

import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        System.out.println("РОВНО 4 А");
        String regex = "[A]{4}";
        System.out.println(Pattern.matches(regex,"AAAA"));
        System.out.println(Pattern.matches(regex,"AAA"));
        System.out.println(Pattern.matches(regex,"AAAAA"));

        System.out.println("НЕ БОЛЕЕ 4 ПОСЛЕДОВАТЕЛЬНЫХ А");
        regex = "[A]{1,4}";
        System.out.println(Pattern.matches(regex,""));
        System.out.println(Pattern.matches(regex,"A"));
        System.out.println(Pattern.matches(regex,"AA"));
        System.out.println(Pattern.matches(regex,"AAA"));
        System.out.println(Pattern.matches(regex,"AAAA"));
        System.out.println(Pattern.matches(regex,"AAAAA"));

        System.out.println("КАК МИНИМУМ 1 ВХОЖДЕНИЕ 4 А");
        regex = ".*AAAA.*";
        System.out.println(Pattern.matches(regex,"AAAAnnnAAAAA"));
        System.out.println(Pattern.matches(regex,"AAAmmmAAAmmmAAA"));
    }
}
