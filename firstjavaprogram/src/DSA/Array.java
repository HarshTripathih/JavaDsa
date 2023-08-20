package DSA;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = inp.nextInt();
        int [] arr = new int [n];
        for(int i=0;i<n;i++) {
            arr[i] = inp.nextInt();
        }
        System.out.println("Enter the value of k ");
        int k = inp.nextInt();
        boolean bool = false;
        for(int i=n-1;i>=0;i--){
            if(arr[i] == k){
                bool = true;
                break;
            }
            else{
                bool = false;
            }
        }
        System.out.println(bool);
    }
}
