package Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 87, 12, 98, 2, 4, 66};
        System.out.println("Сортировка массива по убыванию:");
        System.out.println(Arrays.toString(sortArray(array)));
    }
    private static int[] sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
