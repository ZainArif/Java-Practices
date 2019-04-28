package com.company;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        StringBuilder value = new StringBuilder("1");
        int num = Integer.parseInt(n),digit=0,revnum=0,sum=0,val=0;

        for (int i=1;i<n.length();i++){
            value.append(0);
        }

        val = Integer.valueOf(String.valueOf(value));
        for (int j=0;j<n.length();j++){
            digit = num%10;
            sum+=digit;
            revnum+=(digit*val);
            val/=10;
            num/=10;
        }

        System.out.println("Reverse number: " + revnum);
        System.out.println("Sum = " + sum);
    }
}
