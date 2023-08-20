package com.company;

import java.util.Scanner;
import java.lang.Math;

public class Armstrong {
    public static void main(String[] args) {
        Scanner nput = new Scanner(System.in);
        System.out.println("Enter the value :");
        int n = nput.nextInt();
        int z = (int)(Math.log10(n)+1);
        int r,s=0,p;
        p=n;
        while(n>0){
            r = n% 10;
            s = s + (int)Math.pow(r,z);
            n = n/10;
        }
        if(p==s){
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("Number is not armstrong");
        }
    }
}
