package com.company;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
//        int i =100;  while Loop
//        while(i<=200){
//            System.out.println(i);
//            i++;
//        }
//        System.out.println("End of the loop");

//        int b=0;  do while loop
//        do{
//            System.out.println(b);
//            b++;
//        }while(b<=5);
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        for(int i=0;i<=n;i++){
                System.out.println(2*i+1);
        }
    }
}
