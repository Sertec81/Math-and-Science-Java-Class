package codeLearner.Vol_1.Lesson;

public class lesson14Exercise1 {
    /*
    *Exercise 1
    Write a program to convert 34.0 degrees Celcius to Farenheit, then print the result on the screen.

    the equation for the conversation is:
    farenheit = (9/5)* celcuis + 32
    *
     */
    public static void main(String[] args) {
        double celcius, farenheit;
        celcius = 34;
        farenheit = (9.0/5.0)*celcius+32;
        // DO NOT DO LIKE THAT = farenheit = (9/5)*celcius+32 = output will be 66.0 because java will understand as integer value instead of double decimal

        System.out.println(celcius + " Celcius is equal to " + farenheit + " farenheit.");
    }
}
