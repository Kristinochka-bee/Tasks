package colections.lists;

import java.util.Arrays;

public class DynamicArray {
    private Integer[] data;
    private int count; // tracks the index of the first available spot in the array
    private int size; // tracks size of the array

    public DynamicArray() {
        data = new Integer[1];
        count = 0;
        size = 1;
    }

    // add an element to the end
    // operation of adding to dynamic array - amortized O(1)
    public void add(int element) {
        if (count == size) {
            growSize();
        }
        // operation of adding to arr - O(1)
        data[count] = element;
        count++;
    }

    public void addToStart(int element) {
        if (count == size) {
            growSize();
        }

        for (int i = count - 1; i >= 0; i--) {
            data[i + 1] = data[i];
        }
        // problem with
//        for (int i = count - 1; i >= 0; i--) {
//            data[i + 1] = data[i];
//        }
        // data[size-1+1] = data[size-1];
        // data[size] = data[size-1];
        // size - 1 is the index of last element
        data[0] = element;
        count++;
    }

    public void removeFirst() {
        for (int i = 0; i < count; i++) {
            data[i] = data[i + 1];
        }
        data[count - 1] = null;
        count--;
        if (count < size / 2) {
            shrinkSize();
        }
    }

    public void removeLast() {
        data[count - 1] = null;
        if (count < size / 2) {
            shrinkSize();
        }
    }

    public void set(int index, int element) {
        if (index > 0 || index < count) {
            data[index] = element;
        }
    }

    public int size() {
        return count;
    }

    public void addWithIndex(int index, int element) {
        if (count == size) {
            growSize();
        }
        for (int i = count; i > index; i--) {
            data[i] = data[i - 1];
            // when i = index + 1
            // then data[index + 1] = data[index];
        }
        data[index] = element;
        count++;
    }
    //addToByIndexDemo execution
    // index = 1
    // i = 2
    // data[2] = data[1]
    // i = 3
    // data[3] = data[2]

    public void removeAt(int index){
        Integer[] newData = new Integer[size - 1];
        Integer j=0;
        for (int i = 0; i < size; i++) {
            if (i != index) {
                newData[j] = data[i];
                j++;
            }
        }
        data=newData;
        size= newData.length;
    }


    private void shrinkSize() {
        Integer[] newData = new Integer[size / 2];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
        size = data.length;
    }

    private void growSize() {
        // ccreate new array
        Integer[] newData = new Integer[size + 1];
        // copy previous data to new array
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];

        }
        data = newData;
        size = data.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }
}
