package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Factorial of " + num + " is = " + factorial(num));
    }

    public static long factorial(int n){
        if (n==0)
            return 1;
        else
            return n*factorial(n-1);
    }
}
