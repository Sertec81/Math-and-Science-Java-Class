package codeLearner.Vol_1.Lesson;

public class lesson13 {
    /*
    * Addition  ==> +
    * Subtraction ==> -
    * Multiplication ==> *
    * Division   ==> /
    *
     */
    public static void main(String[] args) {
        int num1, num2, num3, num4;  //way 1
      int sum, difference;
      int multiply, divide;
      // assigned the values
       num1 =10;
       num2 = 3;
       num3 = 5;
       num4 = 2;

       sum = num1 + 5;  // we store the "sum" and sum = num1+5 and num1 =10 +5 =15
       difference = num3 - num2;

        System.out.println("num1 plus 5 = " + sum);  // output = num1 plus 5 = 15
        System.out.println(" num3 minus num2 = " + difference);  // output = num3 minus num2 = 2
       //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        multiply = num3* num2;

        System.out.println();
        System.out.println(" num3 times num2 = " + multiply);
      //  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>


        divide = num1/num4;
        System.out.println();
        System.out.println("num1 divided by num4 = " + divide + "\n\n"); //num1 divide num4 = 5

        System.out.println("num1 = " + num1);  // output is num1 = 10
        System.out.println("num3 = " + num4 + "\n"); // output is num3 = 2
        System.out.println("num1 = " + num3 + "\n" + "num4 ="+ num2 ); // output is num1 = 5
                                                                                    // num4 =3
        System.out.println("num1 = " + num3 + ", num4 = "+ num2 ); // output is num1 = 5, num4 = 3

        System.out.println("original value of num1 = " + num1); // output is = original value of num1 = 10
        num1 = num1*6;
        System.out.println("new value of num1  = " + num1); // outout is =  new value of num1  = 60

        System.out.println();
        System.out.println();
        System.out.println("original value of num3 =" + num3 );  // output is =original value of num3 =5 // new value of num3 = 22
        num3 = num3+17;
        System.out.println("new value of num3 = " + num3);


        // OR



//    int num1 = 10; // way 2
//    int num2 = 3;
//    int num3 = 5;
//    int num4 = 2;
//        System.out.println(" num1 = " +  num1 + "\n"+  " num2 = " + num2 + "\n" + " num3 = " + num3 + "\n" + " num4 = " + num4 + "\n");
//            output for this assignment = num1 = 10
//                                         num2 = 3
//                                          num3 = 5
//                                          num4 = 2

    }

}
