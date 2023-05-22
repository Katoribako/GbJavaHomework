package HW1;

//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import verification.NumberFilter;

import java.util.Scanner;

import math.func.MatFunc;

public class Task1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Please input a number ");
        String number = num.next();
        NumberFilter verificator = new NumberFilter();
        verificator.isNumberPositive(NumberFilter.isNumber(number));
        MatFunc mathMethod = new MatFunc();
        System.out.println("Recursive sum is " + mathMethod.triangularRecurNum(NumberFilter.isNumber(number)));
        System.out.println("Recursive factorial is " + mathMethod.factorialRecurNum(NumberFilter.isNumber(number)));
        System.out.println("Cycle sum is " + mathMethod.triangularCycleNum(NumberFilter.isNumber(number)));
        System.out.println("Cycle factorial is " + mathMethod.factorialCycleNum(NumberFilter.isNumber(number)));

    }
}
