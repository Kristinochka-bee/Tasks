package search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {3,5,6,9,12,17,18};


    }
    public static int binarySearch(int [] array , int number, int low , int high ) {
        int index = -1;  // в том случае если элемент не найден
        high = array.length - 1; //чтоб не выйти за пределы нашего массива в процессе поиска

        while (low <= high){
            int mid = ( high + low)/2; // делим массив паполам
            if (array[mid] < number){
                low = mid +1;
            }else if (array[mid] > number){
                high = mid-1;
            }else if (array[mid] == number){
                index = mid;
                break; //значит нашли наше число
            }
        }
        return index;
    }

}
