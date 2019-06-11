package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter starting & ending number between which you want to find prime numbers:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean flag = true;
        System.out.println("Prime numbers between " + a + " & " + b);
        for (int i=a;i<=b;i++){
            if (i>=2){
                for (int j=2;j<i;j++)
                    if (i%j==0){
                        flag = false;
                        break;
                    }
                if (flag)
                    System.out.println(i);
            }
            flag = true;
        }
    }
}
