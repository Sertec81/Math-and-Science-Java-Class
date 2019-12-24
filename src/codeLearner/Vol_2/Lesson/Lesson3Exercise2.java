package codeLearner.Vol_2.Lesson;
/*
        Exercise 2

        Write a program to ask the user to input the radius of a circle as a decimal number.
        calculate the area of the circle using the formula:

        A= Pi*r*r == Area = Pi*radius*radius

        output is following way:
        " the Radius of the circle is[ radius] meters.
        The area of the circle is [answer] square meters."

*/

    import java.util.Scanner;
        public class Lesson3Exercise2 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create new scanner object

        double radius= 0, area= 0;   // define variables for radius and area
        System.out.println("Enter the radius of the circle as a decimal: ");
        if(input.hasNextDouble() == true) radius = input.nextDouble();   // read in radius

          area = 3.14159*radius*radius;  // calculate the area
           System.out.println("\nThe Radius of the circle is " + radius + " meters.");
           System.out.println("\nThe area of the circle is " + area + "square meters. ");

    }
}
