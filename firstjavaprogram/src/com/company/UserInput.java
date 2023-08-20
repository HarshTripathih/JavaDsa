package com.company;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        System.out.println("Enter the age");
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        if(age>=18){
            System.out.println(" elegible for vote");
        }
        else{
            System.out.println(" Not Elegible for Vote");
        }
    }
}
