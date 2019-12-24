package codeLearner.Vol_1.Lesson;

public class lesson13Exercise1 {
        /*
        A back yard has dimension along its border of 20, 18,17,24 feet.
        Write a program that stores these length in variables and calculates
        the perimeter around the border of the yard. Display the output as:

        the perimeter of the yard is<calculated answer> feet.
         */
        public static void main(String[] args) {
            int side1, side2,side3,side4;
            int perimeter;

          //     Perimeter nedir: cevre uzunlugu            // need to break it down
            //assign the numbers
            side1 = 20;                                              // 1.declare the variable
            side2 = 18;                                            //   2. make assignments
            side3 = 17;                                           //   3. do your aritmetic
            side4 = 24;                                           //    4. print  the answer
            perimeter = side1 + side2 + side3 + side4;
            System.out.println("the perimeter of the yard is  " + perimeter + " feet.");     // output is   the perimeter of the yard is  79 feet.
        }
}




