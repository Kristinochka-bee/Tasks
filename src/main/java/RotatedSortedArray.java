import java.util.Arrays;

//Существует целочисленный массив nums, отсортированный в порядке возрастания (с различными значениями).
//Перед тем, как быть переданным вашей функции, nums, возможно, вращается с неизвестным опорным индексом
// k (1 <= k < nums.length), так что результирующий массив будет nums[k], nums[k+1], …, nums[ n-1], nums[0], nums[1], …,
// nums[k-1]. Например, [0,1,2,4,5,6,7] может быть повернут с поворотным индексом 3 и станет [4,5,6,7,0,1,2].
//Учитывая массив nums после возможного поворота и целочисленную цель, вернуть индекс цели, если он находится в nums, или -1, если он не в nums.
//Вы должны написать алгоритм со сложностью выполнения O(log n).

public class RotatedSortedArray {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Check if the left half is sorted
            if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            // The right half is sorted
            else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int index = search(nums, target);
        System.out.println("Input: nums = " + Arrays.toString(nums) + ", target = " + target);
        System.out.println("Output: " + index);
    }
}
