package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayStringOneD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] array = new String[Integer.parseInt(str)];


        for(int i=0;i< array.length;i++){
            array[i] = sc.next();
        }
        System.out.println(Arrays.toString(array));
                    //or
//        for(int i=0;i< array.length;i++){
//            System.out.println(array[i]);
//        }
    }
}
