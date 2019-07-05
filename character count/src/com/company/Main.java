package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Enter a number in 0 & 1 format e.g 101010100 : ");
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println("Input : " + inputString);

        int oneCounts = 0, zeroCounts = 0, index = 0, length = inputString.length();

        char[] inputChars = inputString.toCharArray();
        char[] sortString = new char[length];

        for (int i=0;i<inputString.length();i++){
           if (inputChars[i]=='1'){
               sortString[index] = inputChars[i];
               oneCounts++;
               index++;
           } else if (inputChars[i] == '0') {
               length--;
               sortString[length] = inputChars[i];
               zeroCounts++;
           }
        }

//        for (int i=0;i<inputString.length();i++){
//            if (inputChars[i]=='0'){
//                sortString[index] = inputChars[i];
//                zeroCounts++;
//                index++;
//            }
//        }

        String outputString = String.copyValueOf(sortString);

        System.out.println("Output : " + outputString);

        if (oneCounts>zeroCounts)
            System.out.println("Min count is of zeros = " + zeroCounts);
        else
            System.out.println("Min count is of ones = " + oneCounts);

    }
}
