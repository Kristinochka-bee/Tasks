package remove.elements;

import java.util.Arrays;

public class DelateElem {
    public static void main(String[] args) {
        int[] arr = {7,2,3,5,6,1,10,8,0};
        System.out.println(Arrays.toString(delateElemDromArray(arr,5)));
    }
    public static int[] delateElemDromArray(int[]arr, int x){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x){
                count++;
            }

        }
        return Arrays.copyOf(arr,arr.length-count);

    }
}
