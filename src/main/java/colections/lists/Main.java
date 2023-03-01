package colections.lists;

public class Main {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        dynamicArray.add(5);


        dynamicArray.removeAt(3);

        System.out.println(dynamicArray);
    }
}
