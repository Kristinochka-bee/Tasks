package lists;
import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayLists {
    public static void main(String[] args) {
// Создаем новый ArrayList
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("Bob");
        arrayList.add("Jorg");
        arrayList.add("Виктория");
        System.out.println(arrayList);
        System.out.println(arrayList.indexOf("Jorg"));
        System.out.println(arrayList.lastIndexOf("Bob"));
        int arrayListSize = arrayList.size();
        System.out.println(arrayListSize); //3


        ArrayList<Integer> arrayListLarge = new ArrayList<>(1000);
        arrayListLarge.add(0, 19);
        arrayListLarge.add(8);
        arrayListLarge.add(10);
        arrayListLarge.add(34);
        arrayListLarge.add(50);
        arrayListLarge.add(66);
        arrayListLarge.add(81);
        System.out.println(arrayListLarge);

        System.out.println();


        // Создаем новый LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Martin");
        linkedList.add("Sam");
        linkedList.add("Bobbi");
        linkedList.addFirst("Anna");
        linkedList.addLast("Bony");
        linkedList.addFirst("Anna");
        linkedList.addFirst("Anna");

        System.out.println(linkedList);
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList);
        System.out.println(linkedList.removeFirstOccurrence("Anna"));
        System.out.println(linkedList);
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList);


        //Доступ к элементу и поиск в списке
        String arrayElem = linkedList.get(2);
        System.out.println(arrayElem);
        System.out.println(linkedList.indexOf("Bobbi"));




    }
}
