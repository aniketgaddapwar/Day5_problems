package com.Day5_problems;

public class Vowel_or_consonant {
    public static void main(String[] args) {
        char ch = 'A';
        if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'e' ||
                ch == 'A' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'E') {
            System.out.println(ch + " is vowel ");
        } else {
            System.out.println(ch + " is consonant");
        }
    }
}
