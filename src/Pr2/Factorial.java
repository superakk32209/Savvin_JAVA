package Pr2;

public class Factorial {
    public static void main(String[] args) {
        int number = 5; // Замените на желаемое число

        long factorial = calculateFactorial(number);
        System.out.println("Факториал числа " + number + " равен " + factorial);
    }

    public static long calculateFactorial(int n) {
        if (n < 0) {
            return -1; // Обработка некорректного ввода
        }

        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
