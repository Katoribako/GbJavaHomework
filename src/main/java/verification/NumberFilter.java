package verification;
import java.util.Scanner;

public class NumberFilter {
    public static int isNumber(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("Please input an integer positive number");
        }
        return 0;
    }
    public void isNumberPositive(int n) {
        if (n <= 0) {
            System.out.println("Please input an integer positive number");
            System.exit(0);
        }
    }
}
