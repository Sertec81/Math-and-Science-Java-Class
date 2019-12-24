package video5withCaleb;

import java.math.BigDecimal;
import java.util.Scanner;

public class V10PrimitiveDataVariablesInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String x = scanner.nextLine(); // nextLine is String    // funtion and method is samething, just only differences method attach to object.
//        System.out.println(x);

        int b = scanner.nextInt();
        int a = b + 90;
        System.out.println(a);

        BigDecimal money = scanner.nextBigDecimal();

    }
}
