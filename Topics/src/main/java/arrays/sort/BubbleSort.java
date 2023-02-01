package arrays.sort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7,2,3,5,6,1,10,8,0};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0 ; j < arr.length - i - 1 ; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];    // 7 <- 2  двойку пересадили на место семерки
                    arr[j+1] = temp;       // 2 - 2 вторую двойку заменяем 7

                }
            }

        }
        System.out.println(Arrays.toString(arr));
    }

}
