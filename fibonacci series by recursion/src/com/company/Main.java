package com.company;

import java.util.Scanner;

public class Main {

    static int n1,n2,n3;
    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter a length of fibonacci series: ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        n1=0;
        n2=1;
        System.out.print(n1 + " " + n2);
        printFibonacci(count-2);
    }

    private static void printFibonacci(int count){
        if (count>0){
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            printFibonacci(count-1);
        }
    }
}
