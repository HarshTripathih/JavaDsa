package Searching;

public class LinearSearchExample {
    public static void main(String[] args) {
        int[] arr = {1,4,6,9,8,7,-1,2};
        int target = 7;
        int ans = linearSearch(arr,target);
        System.out.println(target + " is at Index :"+ ans);
    }
    static int linearSearch(int []arr,int target){
        if(arr.length == 0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
