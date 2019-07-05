package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter 6 numbers : ");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i=0;i<arr.length;i++)
            arr[i] = scanner.nextInt();

        System.out.println("Before sort : ");
        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");

        int temp = 0;
        for (int i=0;i<arr.length;i++)
            for (int j=1;j<(arr.length-i);j++){
                if (arr[j-1]>arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }

        System.out.println("After sort : ");
        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");
    }
}
