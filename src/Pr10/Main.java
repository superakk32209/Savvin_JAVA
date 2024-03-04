package Pr10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите задачу:");
            System.out.println("1. Треугольная последовательность");
            System.out.println("2. От 1 до n");
            System.out.println("3. От A до B");
            System.out.println("4. Заданная сумма цифр");
            System.out.println("5. Сумма цифр числа");
            System.out.println("6. Проверка числа на простоту");
            System.out.println("7. Разложение на множители");
            System.out.println("8. Палиндром");
            System.out.println("9. Без двух нулей");
            System.out.println("10. Разворот числа");
            System.out.println("11. Количество единиц");
            System.out.println("12. Вывести нечетные числа последовательности");
            System.out.println("13. Вывести члены последовательности с нечетными номерами");
            System.out.println("14. Цифры числа слева направо");
            System.out.println("15. Цифры числа справа налево");
            System.out.println("16. Количество элементов, равных максимуму");
            System.out.println("17. Максимум последовательности");
            System.out.println("0. Выход");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    task1();
                    break;
                case 2:
                    task2();
                    break;
                case 3:
                    task3();
                    break;
                case 4:
                    task4();
                    break;
                case 5:
                    task5();
                    break;
                case 6:
                    task6();
                    break;
                case 7:
                    task7();
                    break;
                case 8:
                    task8();
                    break;
                case 9:
                    task9();
                    break;
                case 10:
                    task10();
                    break;
                case 11:
                    task11();
                    break;
                case 12:
                    task12();
                    break;
                case 13:
                    task13();
                    break;
                case 14:
                    task14();
                    break;
                case 15:
                    task15();
                    break;
                case 16:
                    task16();
                    break;
                case 17:
                    task17();
                    break;
                case 0:
                    System.out.println("Выход из программы.");
                    System.exit(0);
                default:
                    System.out.println("Некорректный выбор. Попробуйте снова.");
            }
        }
    }

    // Решение задачи 1: Треугольная последовательность
    private static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();

        int current = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (current > n) {
                    break;
                }
                System.out.print(current + " ");
                current++;
            }
        }
        System.out.println();
    }

    // Решение задачи 2: От 1 до n
    private static void task2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Решение задачи 3: От A до B
    private static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число A: ");
        int A = scanner.nextInt();
        System.out.print("Введите число B: ");
        int B = scanner.nextInt();

        if (A < B) {
            for (int i = A; i <= B; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = A; i >= B; i--) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Решение задачи 4: Заданная сумма цифр
    private static void task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите k: ");
        int k = scanner.nextInt();
        System.out.print("Введите s: ");
        int s = scanner.nextInt();

        int count = countNumbersWithSum(k, s);
        System.out.println("Количество чисел: " + count);
    }

    private static int countNumbersWithSum(int k, int s) {
        if (s < 1 || s > 9 * k) {
            return 0;
        }
        if (k == 1) {
            return 1;
        }

        int count = 0;
        for (int i = 1; i <= 9; i++) {
            count += countNumbersWithSum(k - 1, s - i);
        }
        return count;
    }

    // Решение задачи 5: Сумма цифр числа
    private static void task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();

        int sum = digitSum(N);
        System.out.println("Сумма цифр: " + sum);
    }

    private static int digitSum(int number) {
        if (number == 0) {
            return 0;
        }
        return number % 10 + digitSum(number / 10);
    }

    // Решение задачи 6: Проверка числа на простоту
    private static void task6() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число n: ");
        int n = scanner.nextInt();

        if (isPrime(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        int i = 5;
        while (i * i <= n) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
            i += 6;
        }
        return true;
    }

    // Решение задачи 7: Разложение на множители
    private static void task7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число n: ");
        int n = scanner.nextInt();

        primeFactors(n);
    }

    private static void primeFactors(int n) {
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        System.out.println();
    }

    // Решение задачи 8: Палиндром
    private static void task8() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = scanner.next();

        if (isPalindrome(word)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // Решение задачи 9: Без двух нулей
    private static void task9() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a: ");
        int a = scanner.nextInt();
        System.out.print("Введите число b: ");
        int b = scanner.nextInt();

        long count = countSequences(a, b);
        System.out.println("Количество последовательностей: " + count);
    }

    private static long countSequences(int a, int b) {
        if (a == 0 && b == 0) {
            return 1;
        }
        if (a == 0 || b == 0) {
            return 0;
        }
        return countSequences(a - 1, b) + countSequences(a, b - 1);
    }

    // Решение задачи 10: Разворот числа
    private static void task10() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();

        int reversed = reverseNumber(n);
        System.out.println("Число в обратном порядке: " + reversed);
    }

    private static int reverseNumber(int n) {
        return reverseNumberHelper(n, 0);
    }

    private static int reverseNumberHelper(int n, int reversed) {
        if (n == 0) {
            return reversed;
        }
        return reverseNumberHelper(n / 10, reversed * 10 + n % 10);
    }

    // Решение задачи 11: Количество единиц
    private static void task11() {
        Scanner scanner = new Scanner(System.in);
        int countOnes = countOnesInSequence(scanner);
        System.out.println("Количество единиц: " + countOnes);
    }

    private static int countOnesInSequence(Scanner scanner) {
        int number = scanner.nextInt();
        if (number == 0) {
            return 0;
        }
        return (number == 1 ? 1 : 0) + countOnesInSequence(scanner);
    }

    // Решение задачи 12: Вывести нечетные числа последовательности
    private static void task12() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите последовательность чисел (0 для завершения):");
        printOddNumbers(scanner);
    }

    private static void printOddNumbers(Scanner scanner) {
        int number = scanner.nextInt();
        if (number == 0) {
            return;
        }
        if (number % 2 != 0) {
            System.out.print(number + " ");
        }
        printOddNumbers(scanner);
    }

    // Решение задачи 13: Вывести члены последовательности с нечетными номерами
    private static void task13() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите последовательность чисел (0 для завершения):");
        printNumbersWithOddIndices(scanner, 1);
    }

    private static void printNumbersWithOddIndices(Scanner scanner, int index) {
        int number = scanner.nextInt();
        if (number == 0) {
            return;
        }
        if (index % 2 != 0) {
            System.out.print(number + " ");
        }
        printNumbersWithOddIndices(scanner, index + 1);
    }

    // Решение задачи 14: Цифры числа слева направо
    private static void task14() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();
        printDigitsLeftToRight(N);
    }

    private static void printDigitsLeftToRight(int N) {
        if (N == 0) {
            return;
        }
        int digit = N % 10;
        printDigitsLeftToRight(N / 10);
        System.out.print(digit + " ");
    }

    // Решение задачи 15: Цифры числа справа налево
    private static void task15() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int N = scanner.nextInt();
        printDigitsRightToLeft(N);
    }

    private static void printDigitsRightToLeft(int N) {
        if (N == 0) {
            return;
        }
        int digit = N % 10;
        System.out.print(digit + " ");
        printDigitsRightToLeft(N / 10);
    }

    // Решение задачи 16: Количество элементов, равных максимуму
    private static void task16() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите последовательность чисел (0 для завершения):");
        int max = findMaxInSequence(scanner, Integer.MIN_VALUE);
        scanner = new Scanner(System.in);  // Reset the scanner.
        int count = countMaxOccurrences(scanner, max);
        System.out.println("Количество элементов, равных максимуму: " + count);
    }

    private static int findMaxInSequence(Scanner scanner, int max) {
        int number = scanner.nextInt();
        if (number == 0) {
            return max;
        }
        if (number > max) {
            max = number;
        }
        return findMaxInSequence(scanner, max);
    }

    private static int countMaxOccurrences(Scanner scanner, int max) {
        int number = scanner.nextInt();
        if (number == 0) {
            return 0;
        }
        int count = countMaxOccurrences(scanner, max);
        if (number == max) {
            count++;
        }
        return count;
    }

    // Решение задачи 17: Максимум последовательности
    private static void task17() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите последовательность чисел (0 для завершения):");
        int max = findMaxInSequence(scanner, Integer.MIN_VALUE);
        System.out.println("Максимум последовательности: " + max);
    }
}

