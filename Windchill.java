package com.Day5_problems;

public class Windchill {
    public static void main(String[] args) {
        double Fahrenheit = Integer.parseInt(args[0]);
        double windSpeed = Integer.parseInt(args[1]);
        if (Math.abs(Fahrenheit) > 50 || windSpeed > 120 || windSpeed < 3) {
            System.out.println("enter correct input");
        } else {
            double w = 35.74 + (0.62158 * Fahrenheit) + (((0.4275 * Fahrenheit) - 35.75) * Math.pow(windSpeed, 0.16));
            System.out.println(w);
        }
    }
}