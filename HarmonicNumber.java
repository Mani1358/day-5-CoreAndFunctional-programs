package com.blz.day_5_assignment;
import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        // compute 1/1 + 1/2 + 1/3 + ... + 1/n
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
            System.out.println("Step by step process: "+sum);
        }
        // print the nth harmonic number
        System.out.println(sum);
    }
}


