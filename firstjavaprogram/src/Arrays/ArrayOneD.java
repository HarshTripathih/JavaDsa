package Arrays;

import DSA.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOneD {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int n = inp.nextInt();
        int [] arr = new int[n];
        System.out.print("Enter the elements :");
        for(int i=0;i<n;i++){
            arr[i] = inp.nextInt();
        }
        /* // First way to print
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        */
        /* //Second Way :
        for(int num : arr){
            System.out.println(num);
        }
         */
        //Third Way :
        System.out.print(Arrays.toString(arr));


    }
}
