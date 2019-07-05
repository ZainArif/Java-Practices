package com.company;

import javax.swing.plaf.nimbus.State;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Main {

    private static long number;
    private static long res;
    private static Scanner scanner;

    public static void main(String[] args) {
	// write your code here
        System.out.print("Enter a number: ");
        scanner = new Scanner(System.in);
        number = scanner.nextLong();
        res = 1;
        findFactorial();
    }

    static void findFactorial(){
        if (number == 0 || number ==1)
            System.out.println("Factorial = 1");
        else {
            for (long i=2;i<=number;i++)
                res*=i;
            System.out.println("Factorial = " + res);
        }
    }
}
