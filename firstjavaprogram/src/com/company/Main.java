//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.printf("Hello and welcome!");
//        Scanner x = new Scanner(System.in);
//        int n = x.nextInt();
//        for (int i = 1; i <=n ; i++) {
//            System.out.println("i = " + i);
//        }
//    }
//}
package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the first number");
        int m = x.nextInt();
        System.out.println("Enter the second number");
        float n = x.nextFloat();
        float sum = m+n;
        System.out.println("Enter the number to check it is int or not");
        boolean b1 = x.hasNextInt();
        System.out.println("Sum is = " +sum);
        System.out.println(b1);
    }
}