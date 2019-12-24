package codeLearner.Vol_1.Lesson;

public class Lesson24Exercise1 {
    /*
    *Exercise 1
    using a loop with decrementing variable, produce the following output:
   140 times 2 equals  <calculated answer>
   139 times 2 equals  <calculated answer>
   138 times 2 equals  <calculated answer>
   137 times 2 equals  <calculated answer>
   136 times 2 equals  <calculated answer>
   135 times 2 equals  <calculated answer>
   134 times 2 equals  <calculated answer>
   133 times 2 equals  <calculated answer>
   132 times 2 equals  <calculated answer>
   131 times 2 equals  <calculated answer>
   130 times 2 equals  <calculated answer>
    *
    */
    public static void main(String[] args) {
        int number;

        for(number =140; number>=130; number--){
            int answer = number*2;

            System.out.println(number + " times 2 equals " + answer);
        }
    }
}
