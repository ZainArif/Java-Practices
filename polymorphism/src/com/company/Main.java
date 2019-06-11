package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        A ob1 = new B();
        ob1.add(2,3);
        ob1.add(2.5f,3.5f);
        ob1.message(ob1);
        B ob2 = new B();
        ob2.message(ob1);
        ob2.message(ob2);

    }
}
