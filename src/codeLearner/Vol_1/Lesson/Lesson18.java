package codeLearner.Vol_1.Lesson;
/*
*  byte         8 - bits  -128 to 127
*   short       16 - bits   -32768 to 32767
*   int         32 - bits   -2,147,483,648 to 2,147,483,647
*   long        64 - bits   - 9,223,372,036,854,775,808 to 9,223,.....

*
 */
public class Lesson18 {

    public static void main(String[] args) {
    byte byteVariable = -100; //connot be store because it s more then 127 >> 128 or-128
    short shortVariable = 32000; //or -32000
    int intVariable = 100000000;
    long longVariable = 5000000000000L; // number threats as int but if you threat long then use "L" or "l" lowercase l r Uppercase L
//        System.out.println(byteVariable);
//        System.out.println(shortVariable);
//        System.out.println(intVariable);
        System.out.println(longVariable);
        longVariable = longVariable + 1;
        System.out.println(longVariable);   // output is 5000000000001
    }
}
