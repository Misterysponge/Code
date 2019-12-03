import java.io.*;
import java.util.Random;
import java.util.Scanner;


class num {
    public static void main(String args[]) throws IOException {
        Scanner in = new Scanner(System.in);
    int counter = 1; 
    int guess = -1;
    int status = 1;
    int randomInt = 0;

    for(int i =0; i<3; i++){
        randomInt = (int)(1000.0 * Math.random());
  }

    System.out.println("Welcome to my number guessing game!");
    System.out.println("I have already thought of a number between 1 & 1000, can you guess it?");

   while (status == 1){
    System.out.println("Guess #"+counter+":");
    guess = in.nextInt();
    counter++;

    if (guess != randomInt){

        if(guess > randomInt){
            System.out.println("Too high! Try again.");
        }
        if(guess < randomInt){
            System.out.println("Too low! Try again.");
        }
    }else{
        counter--;
        System.out.println("Congrats! You guess it right!");
        System.out.println("Total tries: "+counter);
        status = 0;
    }

}

    



   
  

}}
