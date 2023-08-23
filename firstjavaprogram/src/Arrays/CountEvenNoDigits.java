package Arrays;

public class CountEvenNoDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int ans = findNumbers(nums);
        System.out.println(ans);
//        System.out.println(digit(0));
//        System.out.println(digit2(0));
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){    //iterating over all nums
            if(even(num)){    //check wether the num inside nums is even or not if it is the count with 1
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberOfDigits = digit(num);
        if(numberOfDigits % 2 == 0) {
            return true;
        }
        return false;
    }
    static int digit(int num){
        if(num < 0){      // number is less than 0;
            num = num * -1;  // convert it into positive number
        }
        if(num == 0){
            return 1;
        }

        int count = 0;
        while(num>0){
            count++;
            num = num / 10;
        }
        return count;
    }
    //More Optimised logic for finding nubers of a digit;
    static int digit2(int num){
        if(num < 0){      // number is less than 0;
            num = num * -1;  // convert it into positive number
        }
        return (int)(Math.log10(num))+1;
    }
}
