package com.company;

public class Breakloop {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            System.out.println(i);
            System.out.println("loop"+i);
            if(i==2){
                System.out.println("loop ends");
                break;

            }
        }
    }
}
