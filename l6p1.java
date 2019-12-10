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


      import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.io.IOException;

class l6p2 {//1
    public static void main(String args[]) throws IOException {//2
        Scanner in = new Scanner(System.in);
        int inp = 0;
        int counter = 1;
        int counterset = 2;

        System.out.println("Please enter your number");
        inp = System.in.read();
        inp = inp - 48;

        while(inp > 0){
            while (counter > 0){
                System.out.print(inp+"       ");
                counter--;
            }
            inp--;
            System.out.print(System.lineSeparator());
            counter = counterset;
            counterset++;
        }


    }//2
}//1

import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.io.IOException;

class l6p3 {//1
    public static void main(String args[]) throws IOException {//2
        Scanner in = new Scanner(System.in);
        int h = 0;
        int w = 0;
        int ch = 0;
        int cw = 0;
        int f = 0;

        System.out.println("Please enter the height of your rectangle");
        h = in.nextInt() - 1;
        ch = h - 1;
        System.out.println("Please enter the width of your rectangle");
        w = in.nextInt();
        cw = w;
        f = w - 2;

        while (cw > 0){
            System.out.print("*");
            cw--;
        }
        cw = w;
       
        
        while (ch > 0){   
        System.out.print(System.lineSeparator());
        System.out.print("*");
            while(f > 0){
                System.out.print(" ");
                f--;
            }
            if (w > 1){
            System.out.print("*");
            }
        f = w - 2;
        ch--;
        }
        if(h > 1){
            System.out.print(System.lineSeparator());
            while (cw > 0){
                System.out.print("*");
                cw--;
            }
        }
    }
}

import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.io.IOException;

class l6p4 {//1
    public static void main(String args[]) throws IOException {//2
        Scanner in = new Scanner(System.in);
        int inp = 0;
        int c = 1;
        int f = 0;
        int i = 1;

        System.out.println("Please enter your number");
        inp = in.nextInt();

        System.out.print(i + "! = " + i + " = " + i);
        c++;
        i = c;
        System.out.print(System.lineSeparator());
      
        while(c < (inp + 1)){
            System.out.print(i + "! = "); 
            while (i > 1){
                System.out.print(i + " x " + (i - 1));
                i--;
            }
            System.out.print(" = " + (c * (c - 1) * (c - 1)));
            System.out.print(System.lineSeparator());
            c++;
            i = c;
        }


    }
}

import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.io.IOException;

class l6p6 {//1
    public static void main(String args[]) throws IOException {//2
        Scanner in = new Scanner(System.in);
        int inp = 0;
        int test = 3;
        int counter = 1;
        int inp2 = 2;

        System.out.println("Please enter the number prime you want to have outputed");
        inp = in.nextInt();

       while (counter != inp){
           if ((test % inp2) > 0){
               inp2--;
          }else{
                if(inp2 == 1){
                    counter++;
                    if(counter = inp){
                        System.out.println("Your prime number is: " + test);
                    }else{
                         test++;
                         inp2 = test - 1;
                    }
                 }else{ 
                      test++;
                      inp2 = test - 1;
                 }
            }
       }         
   }
}


class l6p6 {//1
    public static void main(String args[]) throws IOException {//2
        Scanner in = new Scanner(System.in);
        int inp = 0;
        int test = 3;
        int counter = 1;
        int inp2 = 2;

        System.out.println("Please enter the number prime you want to have outputed");
        inp = in.nextInt();

       while (counter != inp){
           if ((test % inp2) > 0){
               inp2--;
          }else{
                if(inp2 == 1){
                    counter++;
                    if(counter = inp){
                        if(counter = 2){
                            System.out.println("The 2nd prime number is " + test);
                        }
                        if(counter = 3){
                            System.out.println("The 3rd prime number is " + test);
                        }
                        if (counter > 3){
                            System.out.println("The " + counter + "th prime number is " +test);
                        }
                    }else{
                         test++;
                         inp2 = test - 1;
                    }
                 }else{ 
                      test++;
                      inp2 = test - 1;
                 }
            }
       }         
   }
}


class l6p6 {//1
    public static void main(String args[]) throws IOException {//2
        Scanner in = new Scanner(System.in);
        int inp = 0;
        int p = 0;
        int test = 0;
        int consent = 1;
        int counter = 0;
        int inp2 = 0;

        System.out.println("Please enter the number prime you want to have outputed");
        inp = in.nextInt();
        test = inp - 1;
        inp2 = inp; 

       while (counter < inp){
            while(consent == 1){
                while (test > 1){
                    if ((inp2 % test) > 0){
                        test--;
                    }else{
                        System.out.println(inp2 + " is a prime number and consent is" + consent);
                        counter++;
                        consent = 0;
                    }
                }
                consent =  0;
            }
            System.out.println(inp + " is NOT a prime number");
        }
        
        System.out.println("Your number is " + inp2 );

    




    }
}


import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.io.IOException;

class l7p2 {//1
    public static void main(String args[]) throws IOException {//2
        Scanner in = new Scanner(System.in);
        int inp = 0;
        int inpp = 0;
        int test = 0;
        int counter = 0;
        int inp2 = 2;
        int min = 0;
        int max = 0;

        System.out.println("Please enter the first number prime you want to have outputed");
        inp = in.nextInt();
        System.out.println("Please enter the second number prime you want to have outputed");
        inpp = in.nextInt();

        if(inp > inpp){
            max = inp;
            min = inpp;
        }else{
            max = inpp;
            min = inp;
        }
        inp2 = min - 1;
    

       while (min != (max + 1)){
           if ((min % inp2) > 0){
               inp2--;
          }else{
                if(inp2 == 1){
                    System.out.print(min );
                    min++;
                    inp2 = min - 1;
                 }else{ 
                      min++;
                      inp2 = min - 1;
                 }
            }
       }         
   }
}


import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.io.IOException;

class l7p2 {//1
    public static void main(String args[]) throws IOException {//2
        Scanner in = new Scanner(System.in);
        int inp = 0;
        int inpp = 0;
        int test = 0;
        int counter = 0;
        int inp2 = 2;
        int min = 0;
        int max = 0;

        System.out.println("Please enter your number");
        inp = in.nextInt();

        import java.io.*;
import java.util.Random;
import java.util.Scanner;
import java.io.IOException;

class l6p6 {//1
    public static void main(String args[]) throws IOException {//2
        Scanner in = new Scanner(System.in);
        int inp = 0;
        int test = 3;
        int counter = 1;
        int inp2 = 2;
        int total = 1;

        System.out.println("Please enter the number prime you want to have outputed");
        inp = in.nextInt();

       while (total != inp){
           if ((test % inp2) > 0){
               inp2--;
          }else{
                if(inp2 == 1){
                    if (inp % test = 0){
                        total = total * test;
                        System.out.print(test);
                    }

                 }else{ 
                      test++;
                      inp2 = test - 1;
                 }
            }
       }         
   }
}
    }

        
class l6p6 {//1
    public static void main(String args[]) throws IOException {//2
        Scanner in = new Scanner(System.in);
        int inp = 0;
        int test = 2;
        int inp2 = 1;
        int total = 1;

        System.out.println("Please enter the number prime you want to have outputed");
        inp = in.nextInt();

       while (total < inp){
           if ((test % inp2) > 0){
               inp2--;
          }else{
                if(inp2 == 1){
                    while (input % test = 0){
                        System.out.print(test);
                     total = total * (input % test);
                    }
                    test++;
                    inp2 = test - 1;
                }else{
                    test++;
                    inp2 = test - 1;
                 }
            }
       }         
   }
}
    
