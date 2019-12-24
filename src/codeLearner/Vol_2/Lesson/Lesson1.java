package codeLearner.Vol_2.Lesson;

public class Lesson1 {
    public static void main(String[] args)
            throws java.io.IOException{

        char input;   // defined the variable
        System.out.println("Enter a single character from keyboard, then press Enter: ");

        input = (char)System.in.read(); // (System.in.read) is intended for single character to be read,
        // its reading it in as an integer, thats why we converted that integer to character in order to store it in the character variable.

        //System.out.println("The character you typed was: " + input);

        if(input == '1') System.out.println("You typed the number 1!");
        if(input != '1') System.out.println("You did not typed in the number 1!");


    }
}
