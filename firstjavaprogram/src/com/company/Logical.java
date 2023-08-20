package com.company;

public class Logical {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = false;
        if(a && b && c ){    //logical and Operators : all condition should be true
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
        boolean d = true;
        boolean e = true;
        boolean f = false;
        if(d || e || f ){    //logical Or Operators : any one condition should be true
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }

    }
}
