package Pr19;


import java.io.File;
import java.util.*;

public class Solution<T, K, V> {
    private T[] dataArray;

    public Solution(T[] dataArray) {
        this.dataArray = dataArray;
    }

    public T getElementAtIndex(int index) {
        if (index >= 0 && index < dataArray.length) {
            return dataArray[index];
        } else {
            throw new IllegalArgumentException("Invalid index");
        }
    }

    public static <T> List<T> arrayToList(T[] array) {
        return Arrays.asList(array);
    }

    public static List<File> listFilesInDirectory(String directoryPath) {
        File directory = new File(directoryPath);
        File[] files = directory.listFiles();
        List<File> fileList = new ArrayList<>();
        if (files != null) {
            for (int i = 0; i < Math.min(files.length, 5); i++) {
                fileList.add(files[i]);
            }
        }
        return fileList;
    }

    public static <T> ArrayList<T> newArrayList(T... elements) {
        return new ArrayList<>(Arrays.asList(elements));
    }

    public static <T> HashSet<T> newHashSet(T... elements) {
        return new HashSet<>(Arrays.asList(elements));
    }

    public static <K, V> HashMap<K, V> newHashMap(Map.Entry<? extends K, ? extends V>... entries) {
        HashMap<K, V> map = new HashMap<>();
        for (Map.Entry<? extends K, ? extends V> entry : entries) {
            map.put(entry.getKey(), entry.getValue());
        }
        return map;
    }

    public static void main(String[] args) {
        // Пример использования
        String[] stringArray = {"one", "two", "three", "four", "five"};
        Solution<String, Integer, Double> solution = new Solution<>(stringArray);

        List<String> stringList = Solution.arrayToList(stringArray);
        System.out.println("String List: " + stringList);

        String elementAtIndex = solution.getElementAtIndex(2);
        System.out.println("Element at index 2: " + elementAtIndex);

        String directoryPath = "C:\\Users\\Gin\\IdeaProjects\\Java\\src\\Pr19"; // Замените на путь к каталогу
        List<File> filesInDirectory = Solution.listFilesInDirectory(directoryPath);
        System.out.println("First 5 files in the directory: " + filesInDirectory);

        // Дополнительные тесты для создания коллекций
        List<String> additionalList = Solution.newArrayList("apple", "banana", "orange");
        Set<Integer> additionalSet = Solution.newHashSet(1, 2, 3, 4, 5);
        Map<String, Integer> additionalMap = Solution.newHashMap(Map.entry("one", 1), Map.entry("two", 2));

        // Вывод результатов
        System.out.println("Additional List: " + additionalList);
        System.out.println("Additional Set: " + additionalSet);
        System.out.println("Additional Map: " + additionalMap);
    }
}

