package com.Day5_problems;

import java.util.Scanner;

public class TwoD_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int a = sc.nextInt();
        System.out.println("Enter the number of columns :");
        int b = sc.nextInt();

        //Declaring 2D array
        int array[][] = new int[a][b];
        System.out.println("Enter the elements of the array ::: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("array elements are");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
