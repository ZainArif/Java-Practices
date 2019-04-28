package com.company;

import java.util.Scanner;

public class Main {

    private static int rows;

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter no. of rows:");

        Scanner scanner = new Scanner(System.in);
        rows = scanner.nextInt();

        if (rows<2){
            System.out.println("Rows should be equal to or greater than 2");
            System.out.println("Again enter no. of rows:");
            rows = scanner.nextInt();
            createDiamond();
        }
        else
            createDiamond();
    }

    static void createDiamond(){
        for (int row=1;row<=rows;row++){
            for (int spaces=rows-row;spaces>=1;spaces--)
                System.out.print(" ");

            for (int star=1;star<=row;star++)
                System.out.print("* ");
            System.out.println();
        }

        for (int row=1;row<rows;row++){
            for (int spaces=1;spaces<=row;spaces++)
                System.out.print(" ");

            for (int star=1;star<=rows-row;star++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
