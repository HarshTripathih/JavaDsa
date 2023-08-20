package com.company;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = scn.nextInt();
        System.out.println("Enter the operand");
        char ch = scn.next().charAt(0);
        System.out.println("Enter the value of b");
        int b = scn.nextInt();

        switch (ch){
            case '+' :
                System.out.println("The sum is :"+ (a+b));
                break;
            case '-':
                System.out.println("The substraction is : "+ (a-b));
                break;
            case '*':
                System.out.println("The Multiplication is :"+ (a*b));
                break;
            case '/':
                System.out.println("The Division is : "+ (a/b));
                break;
            default:
                System.out.println("entering wrong operator");
        }
    }
}
