package com.company;

import java.util.Scanner;

public class UrlChecker {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String website = a.next();
        if(website.endsWith(".org")){
            System.out.println("This is an Organizational Website");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is an Commercial Website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an Indaian Website");
        }

    }
}
