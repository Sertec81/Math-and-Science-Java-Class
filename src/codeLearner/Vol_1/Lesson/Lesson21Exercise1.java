package codeLearner.Vol_1.Lesson;
/*
*   Execise 1
Create a boolean variable called "bool".
Asisgn a value of true of this variable. if bool is equal to true then output the following to the screen 4 times using a loop.
*make sure to pass the bool variable to the println() statement
                The value of the variable is true
                The value of the variable is true
                The value of the variable is true
                The value of the variable is true
                *
      if the value of bool is false, output the following line 4 times:
             The value of the variable is false
             The value of the variable is false
             The value of the variable is false
             The value of the variable is false

             Change the value of bool from  true to false and re - run the program.








 */

public class Lesson21Exercise1 {
    public static void main(String[] args) {
        boolean bool;
        int i;
        bool = true; // can replace with (false) and run again // Value of the boolean variable


        if (bool == true) {
            for (i = 1; i <= 4; i++) {    // Will print statement 4 times
                System.out.println("The value of the variable is " + bool);
            }
            }
            if (bool == false) {
                for (i = 1; i <= 4; i++) {  // Will print statement 4 times
                    System.out.println("The value of the variable is " + bool);
                }

            }
        }
   }
