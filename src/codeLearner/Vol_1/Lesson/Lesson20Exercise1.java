package codeLearner.Vol_1.Lesson;
/*
    *Exercise 1
    Write a java program that uses a for loop to print out
    the alphabet from A -> Z as follows:

    A       a
    B       b
    C       c
    D       d
  .... and on until Z.

    Note that there is a tab between the columns.Uppercase letter is on the left and lowercase on the right.
 *
 *
 * */
public class Lesson20Exercise1 {
    public static void main(String[] args) {
        char upperCase, lowerCase;
        int i;
        upperCase = 'A';
        lowerCase = 'a';
        for(i=1; i<=26; i++ ){
            System.out.println(upperCase + " \t " + lowerCase);
            upperCase++;
            lowerCase++;

        }
    }

}
