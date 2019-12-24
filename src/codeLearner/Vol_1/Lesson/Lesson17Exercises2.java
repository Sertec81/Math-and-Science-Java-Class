package codeLearner.Vol_1.Lesson;
/*
* Exercise 2
 Write a program that converts inches to feet. Start at 1 inch and continue in the pattern 1 inch, 2 inches, 3 inches, 4 inches .... 20 inches.
 * The output should look like:

1 inches is equal to<answer>feet.
2 inches is equal to<answer>feet.
3 inches is equal to<answer>feet.
4 inches is equal to<answer>feet.

5 inches is equal to<answer> feet.
<continue converting and printing up to 20 inches>

Note: There is a blank line inserted after every 4th printed entry.
 */

public class Lesson17Exercises2 {
    public static void main(String[] args) {

        int inches,counter = 0;
        double feet;
        for(inches=1; inches<=20; inches++){
            feet = inches/12.0; // conversion // We use 12.0 here to force floating print division
            System.out.println(inches + " inches is equal to "  + feet + " feet. ");
            counter++;     //This counter will help us print blank lines every 4th entry
            if(counter == 4){
                System.out.println();  // Printing a blank line
                counter = 0;            // reset the counter to zero

            }


        }



    }
}
