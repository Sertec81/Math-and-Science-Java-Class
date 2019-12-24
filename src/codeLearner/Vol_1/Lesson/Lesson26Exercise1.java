package codeLearner.Vol_1.Lesson;
/*
*Exercise 1

 Create a variable "num" that increment from 1 to 15.
 Using a for loop, output the following.you will need
 to create variables a,b,c,d, to hold the answer in the table below.use shorthand
 arithmetic assignments everywhere that you can.

        num         a=num+2   b= num-2      c= num*2  d =num/2

   */
public class Lesson26Exercise1 {
    public static void main(String[] args) {
        int num;
            System.out.println("num \t a = num+2 \t b = num-2 \t c = num*2 \t d = num/2" );  // this is column headings
       for(num = 1; num<=15; num++){
           int a = num, b = num , c =num;
           double d = num;
           a+=2;
           b-=2;
           c*=2;
           d/=2;

            System.out.println(num + "\t\t "+ a + "\t\t\t "+ b + "\t\t\t "+ c + "\t\t\t "+ d);
       }
    }
}
