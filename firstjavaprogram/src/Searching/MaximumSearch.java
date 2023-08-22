package Searching;

public class MaximumSearch {
    public static void main(String[] args) {
    int[] arr = {1,4,9,5,7,8};
    int ans = maximum(arr);
          System.out.println(ans);
    }
    static int maximum(int[] arr){
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
