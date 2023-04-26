import java.util.ArrayList;
import java.util.List;

public class MaxSumOf_K_elements {
    public static void main(String[] args) {

        int arr[] = {0, 20, 30, 40};
        int k = 2;
        System.out.println(maxSum(arr, k));

        int arr1[] = {1, 45, 2, 10, 23, 3, 1, 0, 20};
        int k1 = 4;
        System.out.println(maxSum(arr1, k1));

    }

    public static int maxSum(int arr[], int k) {
        int maxSumm = 0;
        int currentSum = 0;

        if (arr.length < k) return 0; //если массив пустой

        // вычисляем сумму первых "k" элементов в массиве
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }

        // устанавливаем начальное значение максимальной суммы
        maxSumm = currentSum;

        // перебираем оставшиеся элементы массива
        for (int i = k; i < arr.length; i++) {
            // добавляем следующий элемент, вычитая при этом предыдущий элемент из окна
            currentSum += arr[i] - arr[i - k]; // начинаем суммировать с индекса 2 и отнимаем от индекса 2 два предыдущих элемента

            // если текущая сумма больше, чем максимальная, обновляем максимальную сумму
            if (currentSum > maxSumm) {
                maxSumm = currentSum;
            }
        }
        System.out.println("max sum of k elements is:" + maxSumm);
        return maxSumm;
    }

    public static int maxSumSlidingWindow(int[] arr, int k) {
        int length = arr.length;
        if (length < k) {
            System.out.println("wrong size of array");
            return -1;
        }
        int max = 0;
        for (int i = 0; i < k; i++) {
            max += arr[i];
        }
        int windowSum = max;
        for (int i = k; i < length; i++) {
            windowSum += arr[i] - arr[i - k];
            max = Math.max(max, windowSum); //возвращает максимальное из 2-х переданных
        }
        return max;
    }

    public static int maxSum1(int[] array, int k) {
        List<Integer> arrayOfSums = new ArrayList<>(); // массив сумм
        if (array.length < k) { // массив не подходит
            return 0;
        }
        for (int i = 0; i < array.length - k; i++) { // идем по массиву внешним циклом до длины - k
            int sum = 0;// счетчик суммы
            for (int j = i; j < i + k; j++) { // считаем сумму первых k элементов
                sum = sum + array[j];
            }
            arrayOfSums.add(sum);
        }
        return arrayOfSums.stream().max(Integer::compareTo).get(); // получили максимальное значение из листа //:: создание ссылки на функцию
    }
}
