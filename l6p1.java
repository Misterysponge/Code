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


        //goal: 
        // 4
        // 3   3   
        // 2   2   2      
        // 1   1   1   1   

        //description
        //for columns, should start at 1 until counter is equal to input (this should be one while or for or if statement)
        //for the data in each row of like columns, should be another counter that starts as the input, then outputs tab (char of ascii number)...
        //... and repeats itself by the same number of times as the first counter (but should still be a different counter probably)
        //then, everything previously stated should be ended by the equivalent of enter and reaped by another counter that...
        //... also starts as the same number as the input and then ends when equal to zero

        int height = 0;
        int width = 0;
        int volume = 0;
        int inp = 0;
        (char) tab = 9;
        int enter1 = 10;
        int enter2 = 13;
        int row = 0;
        int counter = 1;
        int countset = 0;

import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.io.IOException;

class l6p2 {//1
    public static void main(String args[]) throws IOException {//2
        Scanner in = new Scanner(System.in);

              //goal: 
        // 4
        // 3   3   
        // 2   2   2      
        // 1   1   1   1   

        //description
        //for columns, should start at 1 until counter is equal to input (this should be one while or for or if statement)
        //for the data in each row of like columns, should be another counter that starts as the input, then outputs tab (char of ascii number)...
        //... and repeats itself by the same number of times as the first counter (but should still be a different counter probably)
        //then, everything previously stated should be ended by the equivalent of enter and reaped by another counter that...
        //... also starts as the same number as the input and then ends when equal to zero

        int height = 0;
        int width = 0;
        int volume = 0;
        int inp = 0;
        char tab = 9;
        int enter1 = 10;
        int enter2 = 13;
        int row = 1;
        int counter = 1;
        int counterset = 2;

        System.out.println("Please enter your number");
        inp = System.in.read();
        inp = inp - 48;
        counterset = inp;
        height = inp + 1;

        while(inp > 0){
            while (counter > 0){
                System.out.println(inp+"       ");
                counter--;
            }
            System.out.print(System.lineSeparator());
            inp--;
            counter = counterset;
            counterset++;
        }


    }//2
}//1
