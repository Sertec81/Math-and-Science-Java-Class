package codeLearner.Vol_2.Lesson;
  /*

    Write a program to have the user type in a lowercase character and convert it to uppercase.

    output:  "Type in any LOWERCASE letter:"
    Substract(cikarmak) 32 to the lowercase character to change it into upper case.
    Output the following:

    "You typed in the letter: "<lowercase character>"
   " The Uppercase version is:< uppercase character>"

  */

public class Lesson1Exercise3 {
    public static void main(String[] args)
        throws java.io.IOException{
    char lowercase,uppercase;
        System.out.println("Type in any LOWERCASE letter:");
        lowercase = (char) System.in.read();  //read a character
        System.out.println("You typed in the letter:" + lowercase);

        uppercase =(char)(lowercase-32);   //subtract 32 from letter to capital,java is gonna do the substaction as an integer solve,
        // we need to wrap it in parenthesis and convert it back to character, therefore using (char)

        System.out.println("The Uppercase version is: " + uppercase);
    }


    public static class lessonivisiblekey {
        public static void main(String[] args)
                throws java.io.IOException {   // throws statement
            char input;
            int input2;


            System.out.println("Enter any key, then press Enter: ");  //Enter the KEY
            input = (char) System.in.read();  //Collected
            System.out.println("You Entered the key: " + input); // Put it at the screen
            // line buffered...

            input2 = System.in.read();
            System.out.println("Invisible Character " + input2);
            input2 = System.in.read();  //note: System.in.read always read integer.
            System.out.println("Invisible Character " + input2);


            System.out.println("\nPress any Second key: ");
            input = (char) System.in.read();   // collecting another reading character
            System.out.println("Your Second key was: " + input);

        }
    }
}
