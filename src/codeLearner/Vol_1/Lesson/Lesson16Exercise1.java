package codeLearner.Vol_1.Lesson;

public class Lesson16Exercise1 {
    /*
    *Write ajava program that uses a for loop to output the following countdown.
    Notice that there is a blank line between number

    end say "BlastOff"
 */



    public static void main(String[] args) {
        int countdown;
        for(countdown=10; countdown>=1; countdown=countdown-1){
           // System.out.println(); // for line between number or
            System.out.println(countdown + "\n");
        }
        System.out.println("BlastOff");
    }
}
