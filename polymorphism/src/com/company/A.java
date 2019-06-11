package com.company;

public class A {
    public void message(A ob)
    {
        System.out.println("A");
    }

    public void add(int a,int b){
      System.out.println("from class A");
      System.out.println(a+b);
    }

    public void add(float a,float b){
        System.out.println("from class A");
        System.out.println(a+b);
    }
}

class B extends A
{
    public void message(B ob)
    {
        System.out.println("B");
    }

    public void add(int a,int b){
        System.out.println("from class B");
        System.out.println(a+b);
    }
}
