package Pr2;

import java.util.Arrays;
import java.util.Random;

public class RandomArraySorting {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();

        // Заполнение массива случайными числами
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100); // Генерировать случайные числа до 100
        }

        System.out.println("Исходный массив: " + Arrays.toString(arr));

        // Сортировка массива
        Arrays.sort(arr);

        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
    }
}

