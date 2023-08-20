package com.company;

import java.util.Scanner;

public class SubjectPercentage {
    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        System.out.println("Enter the Marks of Maths : ");
        float a = m.nextFloat();
        System.out.println("Enter the Marks of English : ");
        float b = m.nextFloat();
        System.out.println("Enter the Marks of Science : ");
        float c = m.nextFloat();
        System.out.println("Enter the Marks of Hindi : ");
        float d = m.nextFloat();
        System.out.println("Enter the Marks of SocialStudy : ");
        float e = m.nextFloat();
        float avg = ((a+b+c+d+e)/500)*100;
        System.out.println("The Percentage is : "+avg+"%");
    }

}
