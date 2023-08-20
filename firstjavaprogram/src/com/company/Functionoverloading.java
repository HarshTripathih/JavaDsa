package com.company;

public class Functionoverloading {
      void sum(int a , int b){
        a=a+1;

    }

    public static void main(String[] args) {
        int x=1 , y=2;
        Functionoverloading obj = new Functionoverloading();
        obj.sum(x,y);

        System.out.println(x +" "+y);
    }
}
