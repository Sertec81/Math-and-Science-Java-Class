package codeLearner.Vol_2.Lesson;

public class lesson2 {
    public static void main(String[] args)
            throws java.io.IOException {   // throws statement
        char input;



        System.out.println("Enter any key, then press Enter: ");  //Enter the KEY
        input = (char) System.in.read();  //Collected
        System.out.println("You Entered the key: " + input); // Put it at the screen
                // line buffered...

        input = (char) System.in.read();
        input = (char) System.in.read();  //note: System.in.read always read integer, therefore we converted to (char)

        System.out.println("\nPress any Second key; ");
        input = (char) System.in.read();   // collecting another reading character
        System.out.println("Your Second key was: " + input);


    }
}
