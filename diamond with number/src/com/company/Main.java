package com.company;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Main {

    public static int rows;

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

    private static void createDiamond(){

        for (int row=1;row<=rows;row++){
            for (int space=1;space<=rows-row;space++)
                System.out.print(" ");

            for (int num=1;num<=row;num++)
                System.out.print(row + " ");

            System.out.println();
        }

        for (int row=1;row<rows;row++){
            for (int space=1;space<=row;space++)
                System.out.print(" ");

            for (int num=1;num<=rows-row;num++)
                System.out.print(rows-row + " ");

            System.out.println();
        }
    }
}
