package com.Day5_problems;

public class Swap_Two_number {
    public static void main(String[] args) {
        int a=20;
        int b=30;
        System.out.println("Before swapping :"+a +" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping :"+a + " "+b);
    }
}
