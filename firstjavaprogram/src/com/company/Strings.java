package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
//        String name = new String("Harsh");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int n = name.length();
        String lowerCase = name.toLowerCase();
        String UpperCase = name.toUpperCase();
        String triming = name.trim();
        String substringval = name.substring(2);
        String substringval2 = name.substring(2,4);
        String letter = "Dear <|name|>,Thanks a lot";
        String replacedletter = letter.replace("<|name|>","Harsh");
        String myLetter = "Dear Harsh,\n\tThis Java course is nice.\n\tThanks a lot";
        System.out.println(name);
        System.out.println(n);
        System.out.println(lowerCase);
        System.out.println(UpperCase);
        System.out.println(triming);
        System.out.println(substringval);
        System.out.println(substringval2);
        System.out.println(name.replace('h','p'));
        System.out.println(name.startsWith("har"));
        System.out.println(name.endsWith("sh"));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf('r'));
        System.out.println(name.equals("Harsh"));
        System.out.println(name.replace(" ","_"));
        System.out.println(replacedletter);
        System.out.println(myLetter);
    }
}
