// Вывести все простые числа от 1 до 1000
package HW1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Task2 {
    public static void main(String[] args) {
        Integer[] simpleNums = {};
        for (int i = 2; i < 1000; i++) {
            boolean flag = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.print(" " + i);
            }
        }

    }
}
