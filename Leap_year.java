package com.Day5_problems;

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        int year;
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter A year: ");
         year=sc.nextInt();
         if(year>999){
             if((year %400==0) || (year %4==0) &&( year%100 !=0)){
                 System.out.println("Its A Leap year: ");
             }else{
                 System.out.println("Its Not A leap year: ");
             }
         }else{
             System.out.println("Enter The Correct value: ");
         }
    }
}
