package com.company;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //program to find the index of a value in a sorted array.
        // If the value does not find return the index where it would be if it were inserted in order.

        System.out.println("Enter any 5 numbers : ");
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < 5; i++)
            nums[i] = scanner.nextInt();
        Arrays.sort(nums);
        int start = 0, end = nums.length - 1, mid , index = 0;
        System.out.println("Enter a number whose index you want to find: ");
        int target = scanner.nextInt();
        boolean flag = false;
        while (start <= end) {
            mid = (start+end)/2;
            if (nums[mid]==target) {
                index = mid;
                flag = true;
                break;
            }
            else if (nums[mid]>target)
                end = mid-1;
            else
                start = mid+1;
        }

        if (!flag){
            if (nums[start]>=target)
                index = start;
            else if (nums[start]<target && target<=nums[end])
                index = end;
            else
                index = end + 1;

            System.out.println("number should be added at index = " + index);
        }
        else
            System.out.print(target + " found at index = " + index);

    }
}
