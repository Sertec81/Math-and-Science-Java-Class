package codeLearner.Vol_2.Lesson;
/*
 Recall that the ASCII table, 'A' corresponds to an integer of 65 and 'Z' correspond to an integer value of 90

 output the following:
 " Enter any CAPITAL letter from the keyboard:"

 Accept the user input, but store it as the raw integer value rather than the character.
 Then, construct  a table of ASCII letters and the corresponding integers beginning from the letter
  that the user enters and continuing on until capital 'Z'

  for example, if the user enters, 'A' the output is shown below.
  But if the user enters, for example, 'R' then table would begin with 'R' and continue to 'Z'

  Letter                ASCII Value
  A                     65
  B                     66
  C                     67
  .
  .
  .
  Z                     90
 */
public class lesson2Exercise1 {
    public static void main(String[] args)
        throws java.io.IOException{   // accept the keyboard
        int rawInput,count; // rawInput will hold the keyboard input.Count is used for loop
        char letter;            // this will hold the corresponding letter in the ascii table

        System.out.println("Enter any CAPITAL letter from the keyboard: ");
        rawInput = System.in.read(); // accept letter from keyboard but store as an integer

        System.out.println("letter\t\t ASCII " );  // pront heading of the table.

        for(count = rawInput; count<=90; count++){ // FOR loop, goes from the starting

            letter = (char)count; // each time through loop, convert current loop count
            System.out.println(letter + "\t\t " + count);  // print the letter and its c



        }


    }
}
