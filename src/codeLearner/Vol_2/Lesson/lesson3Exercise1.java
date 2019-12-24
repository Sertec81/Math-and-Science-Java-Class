package codeLearner.Vol_2.Lesson;
/*
Exercise 1
            Write a program that ask the user to input their age.
            Based on the input, calculate how old they will be in 14 more years.

            output the result as follows:

            You are now [ current age] years old."
            in 14 years, you will be [answer] years old.
 */
    import java.util.Scanner;
public class lesson3Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     // class name is Scanner,and we name it input because it reading keyboard.
        // create a new scanner object called
        int age = 1;  // create variable to hold the age. Initialize it to a value
        System.out.println("Enter your age: ");
        if(input.hasNextInt()== true) age = input.nextInt();  // read age from keyboard
        System.out.println( "\nYou are now " + age + " years old.");
        age = age+14;
        System.out.println("\nin 14 years, you will be " + age  + " years old ");
    }



    }


