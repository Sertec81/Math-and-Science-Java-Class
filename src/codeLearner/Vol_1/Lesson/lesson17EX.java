package codeLearner.Vol_1.Lesson;

public class lesson17EX {
    public static void main(String[] args) {
      // int a = 10;
       int a = 4;
        if(a==4){
            a = a + 5;
            System.out.println(" a was equal to 4, now a is equal to " + a);  // output is "a was equal to 4, now a is equal to 9"
             }
        if (a == 10) {
            a = a + 7;
          //  System.out.println("a was equal to 10, now a is equal to " + a); //output is nothing because it declare int =4
            System.out.println("a was equal to 10, now it is equal to " + a); //output is a was equal to 10, now a is equal to 17 because we declare int a = 10;

        }
    }

}