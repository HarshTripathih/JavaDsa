package Searching;

import java.util.Arrays;

public class TwoDSearch {
    public static void main(String[] args) {
        int arr[][] = {
                {12,15,23},
                {14,16,20},
                {12,26,42,54},
                {18,19}
        };
        int target = 16;
        int[] ans = Searching(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] Searching(int[][] arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int colm=0;colm<arr[row].length;colm++){
                if(arr[row][colm] == target){
                    return new int[]{row,colm};
                }
            }
        }
        //harsh tripathi
        return new int[]{-1,-1};
    }
}
