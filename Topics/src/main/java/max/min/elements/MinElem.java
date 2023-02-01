package max.min.elements;

import java.util.Arrays;

public class MinElem {
    public static void main(String[] args) {
        int[] arr = {7,2,3,5,6,1,10,8,0};
        System.out.println(Arrays.stream(arr).min());
    }
}
