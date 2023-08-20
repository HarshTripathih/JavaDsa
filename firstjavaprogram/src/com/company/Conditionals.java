package com.company;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int age = a.nextInt();

        if(age>=18 && age<=40){
            System.out.println("Yes,you are eligible for drive");
        }
        else{
            System.out.println("No, you are not eligible for drive");
        }
    }
}
