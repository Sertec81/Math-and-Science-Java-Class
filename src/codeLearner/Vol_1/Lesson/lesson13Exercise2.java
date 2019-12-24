package codeLearner.Vol_1.Lesson;

public class lesson13Exercise2 {
      /*
       A rectangular wall has dimensions 23 ft x 12 ft. Write a program to calculate the area of the wall and display the reuslt as:

       the area of the wall is <calculated answer> square feet.
        *
        *

       */
      public static void main(String[] args) {
          int length, height, area;


          length = 23;
          height = 12;
          area = length*height;

          System.out.println("the area of the wall is " + area + " square feet.");      // outpu is = " the area of the wall is 276 square feet."
      }

}
