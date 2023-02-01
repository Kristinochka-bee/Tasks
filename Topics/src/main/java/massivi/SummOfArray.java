package massivi;

public class SummOfArray {
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,2,2};

        System.out.println(sumOfArr(arr));
        System.out.println(sumOfRevArr(arr));
        System.out.println(summEvenInd(arr));
        System.out.println(summOddInd(arr));
        System.out.println(halfSumm(arr));


    }
    /**
     * 1.Arr[22]
     * 2.loop ->
     *  - sum 0-last
     *  - last-0
     *  - чет индекс and нечет индекс
     *  - 0 -> <- last
     */

    public static int sumOfArr(int arr[]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum +=  arr[i];
        }
        return sum;
    }

    public static int sumOfRevArr(int arr[]){
        int sum = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            sum +=  arr[i];
        }
        return sum;
    }

    public static int summEvenInd(int arr[]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                sum += arr[i];
            }
        }
        return sum;
    }

    public static int summOddInd(int arr[]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0){
                sum += arr[i];
            }
        }
        return sum;
    }

    public static int halfSumm(int arr[]){
        int sumLeft= 0;
        int sumRight = 0;
        int res = 0;
        int med = arr.length / 2;

        for (int i = 0; i < med; i++) {
            sumLeft += arr[i];
        }
        for (int j = arr.length - 1; j >= med; j--) {
            sumRight += arr[j];
        }
        res = sumLeft + sumRight;

        return res;
    }
}
