package codeLearner.Vol_1.Lesson;

public class Lesson14 {
    // double is a 64 bits and can hold numbers with decimal points.

    public static void main(String[] args) {
      double inches, centimeters;

      int number1;              // note: integer can not store decimo points.
      double number2;

//      inches = 12.7;
//      centimeters = inches*2.54;
//        System.out.println(inches + " inches is equal to " +
//                centimeters +  " centimeters. "); // output is 12.7 inches is equal to 32.257999999999996 centimeters.
//
//        inches = 12;
//        centimeters = inches*2.54;
//        System.out.println(inches + " inches is equal to " +
//                centimeters +  " centimeters. "); //  output is 12.0 inches is equal to 30.48 centimeters. exact number

        number1 = 12/5;
        number2 = 12.0/5.0;
        System.out.println(number1); // output 2
        System.out.println(number2); // output 2.4


    }
}
