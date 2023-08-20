package com.company;

public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading obj  = new MethodOverloading();
        int e = sum(10,20);
        int f = sum(10,20,30);
        int g = sum(10,20,30,50);
        int h = multiply(2,2,2);
//        double g = obj.sum(10.4,4.5);

        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }

    //    public int sum(int a ,int b){    // pass by number of argumnets
//        int c= a+b;
//      return c;
//    };
//    public int sum(int a ,int b ,int d){
//        int c= a+b+d;
//        return c;
//    };
//    public double sum(double a,double b){   // pass by different types of argument
//        double c = a+b;
//        return c;
//    };
    // Variable Arguments(varargs) : this helps us not to create more function
    static int sum(int ...arr){
        int result = 0;
        for(int a : arr){      // for each loop
            result += a;
//            result = result + a;
        }
        return result;
    }
    static int multiply(int ...arr){
        int m=1 ;
        for(int a : arr){
            m = m*a;
        }
        return m;
    }
}
