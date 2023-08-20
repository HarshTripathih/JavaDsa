package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionArrayList {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();  //multidimensional arraylist
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(inp.nextInt());
            }
        }
        System.out.println(list);

    }
}
