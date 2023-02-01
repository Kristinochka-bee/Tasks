package max.min.elements;

import java.util.Arrays;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] arr = {7,2,3,5,6,1,10,8,0};
/*
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];

            }
        }

 */

        System.out.println(Arrays.stream(arr).max());
        System.out.println(Arrays.stream(arr).min());

    }
}
