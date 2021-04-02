package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        System.out.print("Which month that you want to count days? ");
        int month = sc.nextInt();
        switch (month){
            case 2:
                System.out.println(" 28days");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
        }
    }
}
