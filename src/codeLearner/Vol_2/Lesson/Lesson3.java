package codeLearner.Vol_2.Lesson;
   /*
   *  nextInt();
   *  nextdouble();
   *
   * hasNextInt();
   * hasNextDouble();
   *
    */

import java.util.Scanner;
public class Lesson3 {
    public static void main(String[] args) {
       Scanner keyboardInput = new Scanner(System.in);
        // int test,number;

//      b System.out.println("Enter any integer: ");
//       b  test = keyboardInput.nextInt();  // we store it  "test"
//          //a  number = test*10; // store a " number"
//        b System.out.println("You entered the number: " + test); // output is= "You entered the number: -98"
//       //a  System.out.println("You entered the number: " + number); // output is= "You entered the number: -980"
//
//
//        System.out.println("\nEnter another integer: ");
//        test = keyboardInput.nextInt();
//
//        System.out.println("You entered the number: " + test);

       // int integerNumber;

        // int integerNumber=0; // another solution
            double doubleNumber= 0;
       // System.out.println("Enter any integer: "); for integer
       System.out.println("Enter any  decimal number: ");  // for double
       // if(keyboardInput.hasNextInt()==true) integerNumber = keyboardInput.nextInt(); for integer
        if(keyboardInput.hasNextDouble()==true) doubleNumber = keyboardInput.nextDouble();

       // System.out.println(" You entered the number: " + integerNumber);  // output is 5.5 You entered the number: 0 for integer
        System.out.println(" You entered the decimal number: " + doubleNumber);  // for double output is:   You entered the decimal number: 5.5


//        integerNumber = keyboardInput.nextInt();
//        System.out.println("You entered the number " + integerNumber);


        //  double doubleNumber;
//        System.out.println("\n\nEnter any decimal number(double): ");
//        doubleNumber = keyboardInput.nextDouble();
//        System.out.println(" You Entered the decimal number: " + doubleNumber);


    }
}
