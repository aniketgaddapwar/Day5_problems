package com.Day5_problems;

public class Largest_num {
    public static void main(String[] args) {
        int num1 = 20, num2 = 70, num3 = 50;
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " is greater");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + " is greater");
        } else {
            System.out.println(num3 + " is greater");
        }
    }
}