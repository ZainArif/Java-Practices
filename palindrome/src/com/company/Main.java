package com.company;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.print("Enter a word: ");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        char[] chars = word.toCharArray();
        char[] chs = new char[word.length()];
        int length = chars.length-1;
        for (int i=0;i<chars.length;i++){
            chs[i] = chars[length];
            System.out.print("chars: " + chars[i] + " chs: " + chs[i] );
            length--;
            System.out.println();
        }
        String newWord = String.copyValueOf(chs);
        if (word.equals(newWord))
            System.out.println("Word is palindrome");
        else
            System.out.println("Word is not palindrome");
    }
}
