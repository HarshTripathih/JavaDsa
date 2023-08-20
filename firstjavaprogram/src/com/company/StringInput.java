package com.company;

import java.util.Scanner;

public class StringInput {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String str = s.nextLine();
        System.out.println(str);
    }
}
