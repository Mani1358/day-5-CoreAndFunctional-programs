package com.blz.day_5_assignment;
import java.util.Random;
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
     double Heads;
     double Tails;
     int head = 0;
     int tail = 0;
     int input;
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of times you want coins to flip");
        input = sc.nextInt();
        for (int i = 0; i < input; i++) {
            Random r = new Random();
            int flip = r.nextInt();
            if (flip < 0.5) {
                tail++;
            } else {
                head++;
            }
        }
        Heads = (head / (double) input) * 100;
        Tails = (tail / (double) input) * 100;
        System.out.println("Tails Count : " + tail);
        System.out.println("Heads Count : " + head);
        System.out.println("Percentage of Tails Over Head : "+Heads);
        System.out.println("Percentage Of Heads Over TAils : "+Tails);
    }
}








