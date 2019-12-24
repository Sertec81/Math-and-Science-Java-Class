package codeLearner.Vol_1.Lesson;

public class Lesson16Exercise2 {
    /*
    *Write a java program to " count by 2's " from 0 to 16 as shown below.
    Format the output as follows

     The current number is : 0
     The current number is : 2
     The current number is : 4
     The current number is : 6
     The current number is : 8
     The current number is : 10
     The current number is : 12
     The current number is : 14
     The current number is : 16

     * */
    public static void main(String[] args) {
        int number;
        for(number =0; number<=16; number= number+2){
            System.out.println("The current number is: " + number);
        }
    }


}

