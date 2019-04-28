package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter no. of rows:");

        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        for (int row=1;row<=rows;row++){
            for (int col=1;col<=row;col++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
