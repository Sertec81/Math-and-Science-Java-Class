package codeLearner.Vol_1.Lesson;

public class lesson13Exercise3 {
    /*
    *Exercise 3
    A sailboat sail is triangular(ucgensel) and has height of 14 ft. the length of the base of the flag is 6 ft. the formula for the area of a triangle is:

    Area= base*height/2

    Write a program that calculates the area of this sail and display the result.
     */

    public static void main(String[] args) {
        int height, base, area;
        height = 14;
        base = 6;
      //   note we choice the (area) as a store!!!
        area = base*height/2;
        System.out.println(" The area of the sail  is " + area + " square feet.");
    }
}
