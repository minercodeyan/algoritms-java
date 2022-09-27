package com.company;

import java.util.Arrays;

public class Main {

    /*УПРАЖНЕНИЕ 2.5.4 СТР 326  + УПРАЖНЕНИЕ 5.1.9 СТР 654*/

    public static String[] dedup(String[] arr) {
        arr = LSD.sort(arr);
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || !arr[i].equals(arr[i - 1])) {
                arr[k++] = arr[i];
            }
        }
        return Arrays.copyOf(arr, k);
    }

    public static void main(String[] args) {
        String[] arr = {"aaa", "bb0b", "aaa", "a09", "ala", "aaa","sdlf","dkfikgigi"};
        String[] ans = dedup(arr);
        System.out.println(Arrays.toString(ans));
    }

}
