package com.blz.day_5_assignment;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year You want to check : ");
            int year;
            year = sc.nextInt();

            if(( year % 4 == 0) && ( year % 100 != 0 )||( year % 400 == 0) ){
                System.out.println(year+ "Is an Leap Year");
            }
            else {
                System.out.println(year+ " : Is not an Leap Year");
            }
        }
    }