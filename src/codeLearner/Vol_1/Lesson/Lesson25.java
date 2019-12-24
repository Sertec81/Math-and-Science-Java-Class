package codeLearner.Vol_1.Lesson;
/*
*   &&  Logical AND   " A and B"
*   ||  Logical OR      " A or B"
*   !   Logical NOT     " Invert State"
*   ^   Logical XOR     "A or B but not both"
*
*
 */
public class Lesson25 {
    public static void main(String[] args) {
        int a;
        char jason;
        boolean b;

        a = 10;
        jason = 'r';
        b= true;

     //  if((a==10)&&(b== true)) System.out.println("Success!");   // output is Success!
     //  if((a>=7)&&(b== true)) System.out.println("Success!");   // output is Success!
        //if(a==10) System.out.println("Success!");
     //   if(a!=10) System.out.println("Success!");  // output is nothing

     //   if((a==10)||(b== false)) System.out.println("Success!");        // either way one of them is true then output always be success(true)
       // if((a==10) != (b== false)) System.out.println("Success!");        //  output is success
       // if((a==10) ^ (b== true)) System.out.println("Success!");        //  one of them can be true it will be true, even both were true, it cant be success, only one of them
        if((a==10)&&(b== true) &&(jason == 'r')) System.out.println("Success!"); // output success!


    }

}
