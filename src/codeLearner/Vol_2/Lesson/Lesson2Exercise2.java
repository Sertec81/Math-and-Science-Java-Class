package codeLearner.Vol_2.Lesson;
/*
* Exercise 2
    Output is following:
    "Is it sunny outside? (Enter Y OR N)"

    Accept the user input as a character entry

    Then output the following:
    "Is it warm outside(Enter Y or N)"

    Accept the user input as a character entry.

    If the user answer Y then Y, output : "It is sunny and warm outside."
    If the user answer Y then N, output : "It is sunny and cold outside."
    If the user answer N then Y, output : "It is cloudy and warm outside."
    If the user answer N then N, output : "It is cloudy and cold outside."
 *

  */
public class Lesson2Exercise2 {
    public static void main(String[] args)
        throws java.io.IOException{
        char input;    // This will hold our Y/N ANSWER
        boolean sunny= true, warm = false;   // initialize // Flags to hold the state of sunny and warm
        System.out.println("Is it sunny outside? (Enter Y OR N)");

        input = (char)System.in.read();  // reading on if it is sunny

        if(input == 'Y') sunny = true;          //setting sunny flag according to input
        if(input == 'N') sunny = false;

        input = (char)System.in.read();         //read two more times to czpture the carriage
        input = (char)System.in.read();         // line feed gets thrown away so that i can then accept

        System.out.println( "Is it warm outside(Enter Y or N)");

        input= (char) System.in.read();  // read Y/N input for warm outside

       if(input == 'Y') warm = true;            //  setting flag for warm outside based on
       if(input == 'N') warm = false;

        if((sunny == true) && (warm == true)) System.out.println("It is sunny and warm outside.");
        if((sunny == true) && (warm == false)) System.out.println("It is sunny and cold outside.");
        if((sunny == false) && (warm == true)) System.out.println("It is cloudy and warm outside.");
        if((sunny == false) && (warm == false)) System.out.println("It is cloudy and cold outside.");








    }
}
