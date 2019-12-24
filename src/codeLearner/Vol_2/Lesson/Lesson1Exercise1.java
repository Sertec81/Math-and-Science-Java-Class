package codeLearner.Vol_2.Lesson;
/*
*Exercise 1
Create a true/false question.
output the following:

"The capital of the United States is Washington, DC?(Answer T or F):"

if the user enters 'T', then output "Correct!"
if user answer 'F', then output, "incerrect!"
 */
public class Lesson1Exercise1 {
    public static void main(String[] args)
    throws java.io.IOException {
        char input;
        System.out.println("The capital of the United States is Washington, DC?(Answer T or F):");
        input = (char)System.in.read();   // read character from keyboard
        if(input == 'T') System.out.println("Correct!");  // if 'T' entered
        if(input == 'F') System.out.println("Incorrect!"); // if 'F' entered


    }
}
