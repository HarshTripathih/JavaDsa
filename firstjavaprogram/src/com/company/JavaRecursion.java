package com.company;

public class JavaRecursion {
    static int recursivefactorial(int n){
        if(n<0 || n==1){
            return 1;
        }
        else{
            return n * recursivefactorial(n-1);         //recursive approach;
        }
    }
    static int itterativerecursive(int n){
        int fact = 1;
        if(n<0 || n==1){
            return 1;
        }
        else{
            for(int i=1 ; i<=n; i++){
                fact = fact*i;
            }
        }
        return fact;
    }
    static  int fabonacciSequence(int n){
        if(n<=0){
            return 1;
        }
        else if (n==1) {
            return 1;
        }
        else{
            return fabonacciSequence(n-1) + fabonacciSequence(n-2);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial of n using Recursion : " +recursivefactorial(n));
        System.out.println("Factorial of n using Itterative : " +itterativerecursive(n));
        System.out.println("Addition of Fabonnaci Sequence is :" + fabonacciSequence(n));
        for(int i=0;i<n; i++){
            System.out.print(" " + fabonacciSequence(i));
        }
    }
}
