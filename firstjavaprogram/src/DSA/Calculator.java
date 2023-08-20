package DSA;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int ans = 0;
        while(true){
            int op = inp.next().trim().charAt(0);
            System.out.println("Enter the Operator for operation :");
            if(op == '+' || op == '-' || op == '*' ||op =='/' ||op == '%'){
                System.out.println("");
                System.out.println("Enter the operands :");
                int num1 = inp.nextInt();
                int num2 = inp.nextInt();
                if(op == '+'){
                    ans = num1 + num2;
                }
                if(op == '-'){
                    ans = num1 - num2;
                }
                if(op == '*'){
                    ans = num1 * num2;
                }
                if(op == '/'){
                    if(num2 != 0){
                        ans = num1 / num2;
                    }
                }
                if(op == '%'){
                    ans = num1 % num2;
                }
            } else if (op == 'x' || op == 'X'){
                break;
            }else {
                System.out.println("Invalid operator");
            }
            System.out.println(ans);
        }
    }
}
