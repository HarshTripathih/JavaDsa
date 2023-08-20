package com.company;

public class Factorial {
    public static void main(String[] args) {
        int n=5,fact=1;
        for (int i=5;i>=1;i--) {
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
