package org.javaacademy.core.homework.homework2;

import org.javaacademy.core.homework.homework2.office.Runner;

import java.util.Arrays;
import java.util.Random;

public class Homework2 {
    public static void main(String[] args) {
        ex1();
        System.out.println("________________________");
        ex2();
        System.out.println("________________________");
        ex3();
        System.out.println("________________________");
        ex4();
        System.out.println("________________________");
        ex5();
    }

    public static void ex1() {
        String[] words = {"Это", "шашлык", "на", "шампуре"};
        String result = "";
        for (String word : words) {
            result += word + "-";
        }
        result = result.substring(0, result.length() - 1);
        System.out.println(result);
    }

    public static void ex2() {
        int[][] arrayOfNumbers = new int[10][10];
        arrayOfNumbers[0] = new int[]{131, 1, 1, 1, 1, 1, 1, 1, 1, 102};
        arrayOfNumbers[1] = new int[]{1, 20, 1, 1, 1, 1, 1, 1, 93, 1};
        arrayOfNumbers[2] = new int[]{1, 1, 31, 1, 1, 1, 1, 81, 1, 1};
        arrayOfNumbers[3] = new int[]{1, 1, 1, 45, 1, 1, 77, 1, 1, 1};
        arrayOfNumbers[4] = new int[]{1, 1, 1, 1, 57, 67, 1, 1, 1, 1};
        arrayOfNumbers[5] = new int[]{1, 1, 1, 1, 533, 68, 1, 1, 1, 1};
        arrayOfNumbers[6] = new int[]{1, 1, 1, 40, 1, 1, 72, 1, 1, 1};
        arrayOfNumbers[7] = new int[]{1, 1, 30, 1, 1, 1, 1, 83, 1, 1};
        arrayOfNumbers[8] = new int[]{1, 20, 1, 1, 1, 1, 1, 1, 901, 1};
        arrayOfNumbers[9] = new int[]{10, 1, 1, 1, 1, 1, 1, 1, 1, 101};

        int leftUpToRightDownSum = 0;
        int leftDownToRightUpSum = 0;

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            leftUpToRightDownSum += arrayOfNumbers[i][i];
            leftDownToRightUpSum += arrayOfNumbers[i][arrayOfNumbers.length - 1 - i];
        }

        System.out.println("С левого верхнего угла к нижнему правому: " + leftUpToRightDownSum);
        System.out.println("С левого нижнего угла к верхнему правому: " + leftDownToRightUpSum);
    }

    public static void ex3() {
        Random random = new Random(1);
        int counter = 0;
        int number;

        while (true) {
            number = random.nextInt(1000);
            counter++;
            if (number == 999) {
                break;
            }
        }

        System.out.println("Нашли число 999. Количество попыток: " + counter);
    }

    public static void ex4() {
        Runner.main(null);
    }

    public static void ex5() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i <= numbers.length / 2; i++) {
            int storage = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = storage;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
