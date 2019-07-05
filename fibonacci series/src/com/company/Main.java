package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter a length of fibonacci series: ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int n1=0,n2=1,n3;
        System.out.print(n1 + " " + n2);
        for (int i=2;i<count;i++){
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
