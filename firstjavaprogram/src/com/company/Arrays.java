package com.company;

import java.util.Scanner;

public class Arrays {
// Arrays : Array is A collection of smaller type of data:
   //type 1:
    // int [] marks;       ----> Decelaration
    //marks = new int[5]   ----> Memory Allocation
    // type 2:
     //int [] marks = new  int[5];   -----> Declare + Memory Allocation
    //type 3:
    //int [] marks = {1,2,3,4,5,6}   -------> Decelare + Initialization

    public static void main(String[] args) {
        int sum=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of ARRAY");
        int n = s.nextInt();
        int [] marks = new int[n];
        for(int i=0; i<n ;i++){
            marks[i] = s.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(i+1+" ");
            sum = sum + marks[i];
        }
        System.out.println(sum);

    }
}
