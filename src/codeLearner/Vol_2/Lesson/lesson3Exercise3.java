package codeLearner.Vol_2.Lesson;
/*
    Write a program to read in two length of the sides of rectangle as follows:

    Enter the length of the rectangle:
    Enter the width of the rectangle:

    Using these inputs, calculate the perimeter of the rectangle and its area.

    output as follows:

    The perimeter of this rectangle is: [answer]
    The area of this rectangle is: [answer]

 */
import java.util.Scanner;
public class lesson3Exercise3 {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);  // create new scanner object

        double length=0,width=0;   // declare and initialize variables
        double perimeter=0, area =0;  //question? why area initialize seems redundant



        System.out.println("Enter the length of the rectangle: ");
        if(keyboardInput.hasNextDouble()==true) length= keyboardInput.nextDouble();
        System.out.println(" Enter the width of the rectangle: ");
        if(keyboardInput.hasNextDouble()== true) width = keyboardInput.nextDouble();

        perimeter = length + length + width + width;
        area = length * width;

        System.out.println("\nThe perimeter of this rectangle is: " + perimeter);
        System.out.println("\nThe area of this rectangle is: " + area);

    }
}
