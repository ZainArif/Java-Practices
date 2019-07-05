package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean flag = true;
        if (n==0 || n==1)
            System.out.println(n + " is not a prime number.");
        else {
            for (int i=2;i<n;i++)
                if (n%i==0){
                    flag = false;
                    break;
                }
            if (flag)
                System.out.println(n + " is a prime number.");
            else
                System.out.println(n + " is not a prime number.");
        }
    }
}
