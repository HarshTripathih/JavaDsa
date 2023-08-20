package com.company;

import java.util.Scanner;

public class QuesArr {

    public static void main(String[] args) {
        //Qes1 : Addition of Two matrix :
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter the size of row :");
//        int n = s.nextInt();
//        System.out.println("Enter the size of column");
//        int m = s.nextInt();
//        int [][] arr1 = new int[n][m];
//        int [][] arr2 = new int[n][m];
//        int [][] sum = new int[3][3];
//
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                System.out.println("Enter the elements of arr1:");
//                arr1[i][j] = s.nextInt();
//            }
//        }
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                System.out.println("Enter the elements of arr2:");
//                arr2[i][j] = s.nextInt();
//            }
//        }
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                sum[i][j] = arr1[i][j]+arr2[i][j];
//                System.out.print(sum[i][j]+" ");
//            }
//            System.out.println();
//        }
        int[][] arr1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] arr2 = {{16,15,14,13},{12,11,10,9},{8,7,6,5},{4,3,2,1}};
        int[][] sum;
//        int n=5;
        for (int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if( j==0 ||i==0 || j==4-1 ||i==4-1){
                    System.out.print(arr1[i][j]);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        for (int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if( j==0 ||i==0 || j==4-1 ||i==4-1){
                    System.out.print(arr2[i][j]);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if( j==0 ||i==0 || j==4-1 ||i==4-1){

                    System.out.print(arr1[i][j] + arr2[i][j]);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
