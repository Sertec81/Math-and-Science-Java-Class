package codeLearner.Vol_1.Lesson;

public class Lesson15Exercise1 {
   /*
   *Exercise 1
   Jenny is 14 years old, Danny is 6 years old, and Claire is 6 years old.
   write a program that uses the IF statements to output the following text.

   if Jenny is older than Danny, then output "Jenny is older than Danny"
   if Danny is older than Jenny  , then output "Danny is older than Jenny "
   if Danny is  the same age as Jenny, then output Danny is the same age as Jenny."
   if Danny is  the same age as Claire, then output " Danny is the same age as Claire."
   *
   *

    */
   public static void main(String[] args) {
       int Jenny, Danny, Claire;
       Jenny = 14;
       Danny = 6;
       Claire = 6;
       if(Jenny>Danny)
           System.out.println("Jenny is older than Danny"); // output is true Jenny is older than Danny
       if(Danny>Jenny)
           System.out.println("Danny is older than Jenny"); // didnt print becuase it s false
       if(Danny== Jenny)
           System.out.println("Danny is the same age as Jenny"); // didnt print becuase it s false
       if(Danny==Claire)
           System.out.println("Danny is the same age as Claire");  // output is true Danny is the same age as Claire
   }

}



