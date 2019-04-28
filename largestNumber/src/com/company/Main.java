package com.company;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] numbers = new int[9];
        System.out.print("Enter nine numbers: ");
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<numbers.length;i++)
            numbers[i] = scanner.nextInt();

        int temp = numbers[0];
        for (int j=0;j<(numbers.length-1);j++){
            if (temp<numbers[j]){
                temp = numbers[j];
            }
        }

        if (temp>numbers[numbers.length-1]){
            System.out.println("Largest number: " + temp);
            System.out.println("Second Largest number: " + numbers[numbers.length-1]);
        }
        else {
            System.out.println("Largest number: " + numbers[numbers.length-1]);
            System.out.println("Second Largest number: " + temp);
        }
    }
}
