package Searching;

public class BinarySearchingExp {
    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,12,14,20,36,48};
        int target = 36;
        System.out.println(BinarySearch(arr,target));
    }
    static int BinarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int mid = start + (end-start)/2;;

        while(start <= end){
            if(arr[mid] == target){
                return mid;
            }
            if(target > arr[mid]){
                start = mid+1;
            }
            else{
                end = mid - 1;
            }
            mid = start + (end-start)/2;
        }
        return -1;
    }

}
