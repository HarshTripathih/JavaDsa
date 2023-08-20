package Arrays;

import java.util.Scanner;

public class MaxSearch {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = inp.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= inp.nextInt();
        }
        int max = arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println(max +"is the Maximum number in array");
    }
}
