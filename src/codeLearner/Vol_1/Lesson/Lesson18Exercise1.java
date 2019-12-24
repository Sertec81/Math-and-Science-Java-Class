package codeLearner.Vol_1.Lesson;
/*
   Exercise 1
       Lightedspeed is 186,282 miles per second.Write a java program to calculate
       how far a lightbeam will travel after 300 minutes and output the result
       to the screen. Note:  that the answer will need to be held in a "long" variable.

    */
public class Lesson18Exercise1 {
    public static void main(String[] args) {
        long distance;
      //  int distance;  // if we do int variable then result will be negative because number s gonna be longer than int :  the distance traveled is: -941891296 miles.
        int minutes = 300;

      //  distance = 186282* minutes * 60;  // Also we can do another way that
       //  distance= (long)186282*minutes*60;  // output is the same :
         distance= 186282*minutes*60L;  //  same result : the distance traveled is: 3353076000 miles.
        System.out.println("the distance traveled is: " + distance + " miles. ");  // output is : the distance traveled is: 3353076000 miles.


    }


}
