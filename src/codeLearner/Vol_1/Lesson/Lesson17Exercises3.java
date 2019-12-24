package codeLearner.Vol_1.Lesson;
/*
*Exercise 3

* Alter the program that you wrote in Exercise 2 so that the output is as follows:

*
* Double = feet
* int = inches

1 inches is equal to<answer>feet.
2 inches is equal to<answer>feet.
3 inches is equal to<answer>feet.
4 inches is equal to<answer>feet.

5 inches is equal to<answer> feet.
<continue converting and printing up to 20 inches
*
Note : Notice that it prints "1 inch" and all other entries use "inches" such as "2 inches", ect.
 */
public class Lesson17Exercises3 {
    public static void main(String[] args) {
        int inches, counter = 0;
        double feet;
        for (inches = 1; inches <= 20; inches++) {
            feet = inches / 12.0;// decimal=12.0 // conversion // We use 12.0 here to force floating print division
            if (inches == 1)
                System.out.println(inches + " inch is equal to " + feet + " feet. ");
            if (inches != 1)
                System.out.println(inches + " inches is equal to " + feet + " feet. ");
            counter++;     //This counter will help us print blank lines every 4th entry
            if (counter == 4) {
                System.out.println();  // Printing a blank line
                counter = 0;            // reset the counter to zero
            }

        }
    }
}