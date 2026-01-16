package org.example;

import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();

        System.out.println(wordCapitalization(word));
    }

    public static String wordCapitalization(String word) {
        return word.substring(0, 1).toUpperCase() + word.substring(1);
    }
}
