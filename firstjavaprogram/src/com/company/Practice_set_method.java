package com.company;

public class Practice_set_method {

    static void table(int n){
        for(int i=1;i<=10;i++){
            System.out.format("%d X %d = %d\n",n,i,n*i);
        }
    }
    static void pattern1(int n){
        for(int c =0;c<n;c++){
            for(int r=0;r<c+1;r++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int recsum(int n){
        if(n==1){
            return 1;
        }
        //recsum(n) = n +recsum(n-1)
        //recsum(3) = 3 +recsum(2)
        //recsum(3) = 3 + 2 + recsum(1)
        //recsum(3) = 3 + 2 + 1    =6
        return n + recsum(n-1);
    }
    static void pattern2(int n){
        for(int c=0;c<n;c++){
            for (int r=c;r<n;r++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static int fibonacci(int n){
        if(n<=0){
            return 1;
        } else if (n==1) {
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    static void pattern3(int n){
        for(int c=1;c<n;c++ ){
            for(int r=c;r>=n;r++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //Ques 1
        table(5);
        //Ques 2
        pattern1(5);
        //Ques 3
        System.out.println(recsum(3));
        //Ques 4
        pattern2(5);
        //ques 5
        int n=5;
        System.out.println(fibonacci(n));
        for(int i=0;i<n;i++){
            System.out.print(" " + fibonacci(i));
        }
        //ques 6
        pattern3(5);

    }
}
