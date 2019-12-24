package codeLearner.Vol_1.Lesson;

public class Lesson15 {
    /*
    * Relation Operators for conditional Expressions
    * < Less than
    * < = less than or Equal To
    * > Greater Than
    * >= Greater Than or Equal To
    * Equal
    * != not Equal
    *
    * if(condition is true) statement;
    *

     */
    public static void main(String[] args) {
        int x,y;
        double a,b,c;

        x = 3;
        y =4;
        if( x<y) System.out.println("x is less than y"); // true
        if(x == y) System.out.println("x is equal to y"); // false

        a = 3.45;
        b = 4.25;
        c = 3.45;
        if(a==c)
            System.out.println("a is equal to c" ); // a is equal to c

        if(b>=a)
            System.out.println("b is greater than or equal to a"); //  b is greater than or equal to a

        if(a!= b)
            System.out.println("a is not equal to b"); //     a is not equal to b

        if(a!=c)
            System.out.println("a is not equal to c");  // it s not evaluate because it s false


    }

}
