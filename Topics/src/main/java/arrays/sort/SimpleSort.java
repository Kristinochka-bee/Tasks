package arrays.sort;
//Сортировка выбором
//После нахождения текущего минимума неотсортированной части массива вы меняете его местами с первым элементом,
// и он уже часть отсортированного массива:

import java.util.Arrays;

public class SimpleSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 8, 10};

        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minId = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < min){
                    min = arr[j];
                    minId = j;
                }

            }
            int temp = arr[i];
            arr[i] = min;
            arr[minId] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
