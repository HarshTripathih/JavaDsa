package com.company;

public class Functionjava {
    static int logic(int x,int y){         // if the function is static we can directly call the function
        int z;
        if(x>y){
            z = x+y;
        }
        else{
            z = (x+y) * 2;
        }
        return z;
    }
    int sum(int r,int p){      // if we are not using static then we have to create object in main method to call this function
        int q = r+p;

        return q;
    }

    public static void main(String[] args) {
        int a ,b ,c;
        a = 7;
        b = 5;
        c = logic(a,b);   //calling static function

        Functionjava obj = new Functionjava();   // creating an object
        int s = obj.sum(a,b); //calling the function using object

        int a1,b1,c1;
        a1 = 1;
        b1 = 2;
        c1 = logic(a1,b1);

        System.out.println(c);
        System.out.println(c1);
        System.out.println(s);
    }
}
