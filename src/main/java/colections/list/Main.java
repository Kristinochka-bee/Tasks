package colections.list;

public class Main {

    public static void main(String[] args) {
       pushToHeadDemo();
       pushToTailDemo();
       getDemo();
       getSizeDemo();
       pushByIndexDemo();
        removeByIndexDemo();

    }

    private static void pushToHeadDemo() {
        MyLinkedList list = new MyLinkedList();

        list.pushToHead(6);
        list.pushToHead(2);
        list.pushToHead(9);
        list.pushToHead(7);

        list.print();
        // expected 7 9 2 6
    }

    private static void pushToTailDemo() {
        MyLinkedList list = new MyLinkedList();

        list.pushToTail(6);
        list.pushToTail(2);
        list.pushToTail(9);
        list.pushToTail(7);

        list.removeTail();

        list.print();
        // expected 6 2 9 7
    }
    private static void getDemo() {
        MyLinkedList list = new MyLinkedList();

        list.pushToTail(6);
        list.pushToTail(2);
        list.pushToTail(9);
        list.pushToTail(7);
        list.print();
        System.out.println(list.get(0));
        System.out.println(list.get(2));
    }

    private static void getSizeDemo() {
        MyLinkedList list = new MyLinkedList();

        list.pushToTail(6);
        list.pushToTail(2);
        list.pushToTail(9);
        list.pushToTail(7);
        list.print();
        System.out.println(list.getSize());

    }
    private static void pushByIndexDemo() {
        MyLinkedList list = new MyLinkedList();
        list.pushToTail(6);
        list.pushToTail(2);
        list.pushToTail(9);
        list.pushToTail(7);

        list.pushByIndex(22,2);
        list.print();

    }
    private static void removeByIndexDemo() {
        MyLinkedList list = new MyLinkedList();
        list.pushToTail(6);
        list.pushToTail(2);
        list.pushToTail(9);
        list.pushToTail(7);

        list.removeByIndex(2);
        list.print();

    }
}
