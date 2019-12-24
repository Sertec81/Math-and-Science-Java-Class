package codeLearner.Vol_1.Lesson;

public class Lesson15Exercise2 {
/*
        Exercise 2
        Car 1 has mileage 86000. Car 2 has mileage 101000.
        write a program that use IF statements to evaluate and output the following:

        if Car 1 is less than or equal to car 2, then output, "Car 1 mileage is less than or equal to than car 2."
        if Car 2 has mileage of 101000, then output "Car 2 has mileage of 101000."
        if Car 2 has mileage less than car 1, then output " I will eat my foot if this prints on the screen.

        */

    public static void main(String[] args) {
        int car1, car2;
        car1 = 86000;
        car2 = 101000;

        if(car1<=car2)
            System.out.println("Car 1 mileage is less than or equal to than car 2.");
        if(car2==101000)
            System.out.println("Car 2 has nmileage of 101000.");
        if(car2<car1)
            System.out.println("I will eat my foot if this prints on the screen.");
    }
}
