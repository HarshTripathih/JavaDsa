package com.company;

public class FindMaxArr {

    public static void main(String[] args) {
//        int[] arr = {1,2,30,4,5};
//        int max = arr[0];
//        for(int i=0;i<5;i++){
//            if(max < arr[i]){
//                max = arr[i];
//            }
//        }
        int a=10,b=20,c=45;
        int max=a;
        if(b>a && b>c){
            max = b;
        } else if (c>a && c>b){
            max = c;
        }
        System.out.println(max);
    }
}
