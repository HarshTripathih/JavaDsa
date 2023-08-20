package com.company;

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i<n; i++){
            System.out.println("Enter the elements of an Array");
            arr[i] = s.nextInt();
        }

        int temp;
        for (int i = 0; i<5; i++) {
            for(int j=i+1;j<5;j++){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;
                }
            }
        }
        for(int i=0; i<5; i++){
            System.out.println(arr[i]);
        }
    }
}