package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.set(1,60);//Update
        list.remove(2);
        System.out.println(list);
        for(int i=0;i<5;i++){
            list.add(inp.nextInt());
        }
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));
        }
//        for(int l : list){
//            System.out.println(l);
//        }
    }
}
