package arrays.sort;

import java.util.Arrays;
import java.util.Collections;
//Как отсортировать массив по убыванию в Java с помощью Collections.reverseOrder()

public class CollectionsReverseOrder {

    public static void main(String[] args) {
        Integer[] arr = { 5, 2, 1, 8, 10 }; //мы использовали Integer[] вместо int[], как в предыдущем примере. Иначе возникнет ошибка.
        Arrays.sort(arr, Collections.reverseOrder()); //Чтобы отсортировать массив в порядке убывания,следует использовать reverseOrder(),
        // к которому можно получить доступ из класса Collections.
        //Первый параметр — это массив arr, который будет отсортирован в порядке возрастания.
        // Второй параметр — Collections.reverseOrder() — затем изменит порядок отсортированного массива, чтобы он располагался в порядке убывания.
        System.out.println(Arrays.toString(arr));
    }
}
