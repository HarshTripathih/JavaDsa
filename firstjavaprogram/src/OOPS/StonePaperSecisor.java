package OOPS;

import java.util.Random;
import java.util.Scanner;

public class StonePaperSecisor {
    public static void main(String[] args) {
        // 0 for rock
        // 1 for paper
        // 2 for scesior
        System.out.println("0 for Rock"+" "+"1 for paper"+" "+"2 for Scesior");
        Scanner user = new Scanner(System.in);
        int userinput = user.nextInt();

        Random random = new Random();
        int computerinput = random.nextInt(3);

        if(userinput == computerinput){
            System.out.println("Game Draw try again");
        } else if (userinput==0 && computerinput==1 || userinput == 2 && computerinput == 1 || userinput == 1 && computerinput == 0) {
            System.out.println("You Win the match!");
        }else{
            System.out.println("You are losser!");
        }
        System.out.println("Computer Choice"+" : "+computerinput);
    }
}
