package codeLearner.Vol_2.Lesson;


    /*
    *Exercise 2
    Create a "Guess the letter" game.have the user input a letter between A and Z.

    Output:I'm thinking of a letter between A and Z.
    "Guess my letter:"

    if they guess 'W' or 'w', then output, "correct"!
    if they guess any other letter, then output "Nope, not Correct!"



     */
    public class Lesson1Exercise2{
    public static void main(String[] args)
            throws java.io.IOException  {

            char input;
        System.out.println("I'm thinking of a letter between A and Z.\n");
        System.out.println("Guess my letter:");

        input = (char) System.in.read();  // read a character

        if((input=='W')||(input =='w')) System.out.println("Correct!");
       if((input != 'W')&&(input!='w')) System.out.println("InCorrect");


        }


    }


