package com.Day5_problems;

import java.util.Scanner;

public class Harmonic_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int number = sc.nextInt();
        double value = 0;
        while (number > 0) {
            value = value + (double) 1 / number;
            number--;
            System.out.println(value);
        }
    }
}