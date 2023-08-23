package Searching;

public class OrderAgnozticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {10,9,8,7,6,5,4,3,2,1};
        int target = 9;
        int ans = AgnosticBinarySearch(arr,target);
        System.out.println(ans);
    }
    static int AgnosticBinarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAcs = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }
            if(isAcs){
                if(target > arr[mid]){
                    start = mid + 1;
                }
                else{
                    end = mid -1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
