package DSA;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        char ch = inp.next().trim().charAt(0);
        if(ch >='a' && ch<='z'){
            System.out.println("lowerCase");
        }
        else{
            System.out.println("Uppercase");
        }
    }
}
