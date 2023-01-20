package com.blz.day_5_assignment;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        int a;
        int b;
        int swap;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number :  ");
        a = sc.nextInt();
        System.out.print("Enter Second Number : ");
        b = sc.nextInt();

        swap = a;
        a = b;
        b = swap;
        System.out.println("After Swapping : NumberOne = " + a + " NumberTwo = " + b);
    }
}