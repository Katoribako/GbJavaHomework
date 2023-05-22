//Реализовать простой калькулятор
package HW1;

import java.util.Scanner;

import verification.NumberFilter;

public class Task3 {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.println("Please input a first number ");
        String number1 = num1.next();
        NumberFilter verifiNum1 = new NumberFilter();
        int numb1 = NumberFilter.isNumber(number1);
        Scanner num2 = new Scanner(System.in);
        System.out.println("Please input a second number ");
        String number2 = num1.next();
        NumberFilter verifiNum2 = new NumberFilter();
        int numb2 = NumberFilter.isNumber(number2);
        Scanner mark = new Scanner(System.in);
        System.out.println("Please input a character ");
        String typeMark = mark.next();
        if (typeMark.contains("-")) {
            System.out.println(numb1 + " - " + numb2 + " = " + (numb1 - numb2));
        }
        if (typeMark.contains("+")) {
            System.out.println(numb1 + " + " + numb2 + " = " + (numb1 + numb2));
        }
        if (typeMark.contains("/")) {
            System.out.println(numb1 + " / " + numb2 + " = " + (numb1 / numb2));
        }
        if (typeMark.contains("*")) {
            System.out.println(numb1 + " * " + numb2 + " = " + (numb1 * numb2));
        }
        else{
            System.out.println("please input +,-,/,* ");
            System.exit(0);
        }


    }
}
