public class Practic {
    public static void main(String[] args) {
        int arr[] = {0, 20, 30, 40};
        int k = 2;
        System.out.println(maxSum(arr, k));

        int arr1[] = {1, 45, 2, 10, 23, 3, 1, 0, 20};
        int k1 = 4;
        System.out.println(maxSum(arr1, k1));
    }

    public static int  maxSum(int arr[], int k){

        int currentSum = 0;

        if (arr.length < k ) return 0;


        for (int i = 0; i < k; i++) {
            currentSum += arr[i];   //сумма первых k элементов
        }
        int maxSum = currentSum;


        for (int i = k; i < arr.length; i++) {
            currentSum += arr[i] - arr[i - k];  //сумму следующих к элементов без предыдущих


            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return maxSum;
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
}
