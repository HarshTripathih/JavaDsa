package OOPS;
//Create a Class Game ,which allow a user to play "Guess the number once"
//Game should have the following methods:
//1.constructor to generate the random numbers;
//2.takeUserInput() to take the no. from user
//3.isCorrectnumber()to detect whether the number enterd by the user is true
//4.getter and setter for the number of guess
//use properties such as noOfGuess(int)

import java.util.Random;
import java.util.Scanner;

class Guesser{
    private int computerInput;
    private int userInput;
    private int count =0;
    public  Guesser(){
        Random random = new Random();
        computerInput = random.nextInt(10);
    }
    public void takeUserInput(){
        System.out.println("Guess The number and enter ");
        Scanner sc = new Scanner(System.in);
        userInput = sc.nextInt();
//        if(userInput == computerInput){
//            System.out.println("You have Guess the right Value");
//            count++;
//        } else if (userInput > computerInput) {
//            System.out.println("You have Guess the bigger value");
//            count++;
//            return takeUserInput();
//        } else if (userInput < computerInput) {
//            System.out.println("You have guess the Smaller Value");
//            count++;
//            return takeUserInput();
//        }
//        return count;
    }
    public void isCorrectnumber(){

        if(userInput == computerInput){
            System.out.println("You have Guess the right Value");
            count++;

        } else if (userInput > computerInput) {
            System.out.println("You have Guess the bigger value");
            count++;
            takeUserInput();
            isCorrectnumber();

        } else if (userInput < computerInput) {
            System.out.println("You have guess the Smaller Value");
            count++;
            takeUserInput();
            isCorrectnumber();
        }
    }
    public void setguessCount(){
        this.count = count;
    }
    public int getGuessCount(){
        return count;
    }
}
public class GuessTheNumber {
    public static void main(String[] args) {
        Guesser chk = new Guesser();
        chk.takeUserInput();
        chk.isCorrectnumber();
        System.out.println("Yor number of guess are"+" : "+chk.getGuessCount());
    }
}

