package math.func;

public class MatFunc {
    public int triangularCycleNum(int number) {
        int summ = 0;
        for (int i = 0; i <= number; i++) {
            summ += i;
        }
        return summ;
    }

    public int factorialCycleNum(int number) {
        int multiply = 1;
        for (int i = 1; i <= number; i++) {
            multiply *= i;
        }
        return multiply;
    }

    public int triangularRecurNum(int number) {
        while (number > 0) {
            return (number + triangularRecurNum(number - 1));
        }
        return number;
    }

    public int factorialRecurNum(int number) {
        while (number != 1){
            return number * factorialRecurNum(number - 1);
        }
        return 1;

    }
}
