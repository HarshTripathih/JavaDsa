package DSA;

import java.util.Scanner;

public class OccuranceChecker {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the number :");
        int number = inp.nextInt();
        System.out.println("Enter the digit you want to check :");
        int check = inp.nextInt();
        int count = 0;

        while(number>0){
            int rem = number%10;
            if(rem == check){
                count++;
            }
            number = number/10;
        }
        System.out.println(count +"Times");
    }
}
