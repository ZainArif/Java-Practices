package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a=5,b=-2;
        System.out.println("a = " +a +" b = "+b);
        a+=b;
        b=a-b;
        a-=b;
        System.out.println("a = " +a +" b = "+b);
    }
}
