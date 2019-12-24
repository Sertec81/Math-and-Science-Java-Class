package codeLearner.Vol_1.Lesson;

public class Lesson23 {
    public static void main(String[] args) {
//        int i = 12;   // i is out of scope
//        if(i>5) {                       //   note : it s gonna run only inside scopes between curly brake
//            int k = -5;  //  k is inner scope
//            System.out.println("the Value of i is " + i);
//         //   System.out.println("the Value of k is " + k);
//        }

        int count = 0;
        for(count = 0; count<=8; count++){
            int jason = 5;  // creating a jason with another integer
            System.out.println("Beginning of loop jason = " + jason);
            jason = -25;  // re sign the negative value
            System.out.println("End of loop jason = " + jason + " \n");
        }

    }
}
