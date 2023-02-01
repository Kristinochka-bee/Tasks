package Exercises;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {7,2,3,5,6,1,10,8,0};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i -1; j++) {
                if (arr[j] > arr[j +1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j +1] = temp;
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
