package Searching;

public class MinimumSearch {
    public static void main(String[] args) {
        int[] arr = {10,8,6,12,5,4,8};
        int ans =  minimum(arr);
        System.out.println(ans);
    }
    static int minimum(int arr[]){
        int min = arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
}
