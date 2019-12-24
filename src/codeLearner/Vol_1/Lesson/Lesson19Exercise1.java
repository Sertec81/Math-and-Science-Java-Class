package codeLearner.Vol_1.Lesson;
/*
*   Exercise 1

* The java Math class contains a method called pow(x,y).
 This method takes the number "x" and raises it to the power "y".
 x and y are double floating point number as the answer

 Write a program that computes the following:
 1.25^1
 1.25^2
 1.25^3  And so on....

 Format the output as:

 1.25 raised to the power of  <power> is equal to <answer>.
 Increment the exponent from 1 to 20.

 */
public class Lesson19Exercise1 {
    public static void main(String[] args) {
        double exponent;   // use exponent when it say increases, conversion power to exponent/ exonent id double argument
        double answer;
      //  float answer;
        for(exponent = 1; exponent<=20; exponent++){
           answer = Math.pow(1.25,exponent);
           // answer = (float) Math.pow(125,exponent);  // converted double to float/
            // you may conversion double to float or float to double then use (float) or (double)
            System.out.println(" 1.25 raise to the power of " + exponent + " is equal to " + answer);
        }
    }


}
