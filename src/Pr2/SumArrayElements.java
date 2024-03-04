package Pr2;

public class SumArrayElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;

        // Используем цикл for
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма (for): " + sum);

        // Используем цикл while
        sum = 0;
        int i = 0;
        while (i < arr.length) {
            sum += arr[i];
            i++;
        }
        System.out.println("Сумма (while): " + sum);

        // Используем цикл do-while
        sum = 0;
        i = 0;
        do {
            sum += arr[i];
            i++;
        } while (i < arr.length);
        System.out.println("Сумма (do-while): " + sum);
    }
}

