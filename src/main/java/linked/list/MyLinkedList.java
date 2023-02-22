package linked.list;



public class MyLinkedList {
    private Node head;

    public void pushToHead(Integer newEl) {
        // wrap value as node
        Node newNode = new Node(newEl, head);
        // if list is empty
        if (head != null) {
            //     set current head as next for new el
            newNode.setNext(head);
        }
        //     write newEl as new head
        head = newNode;

        // one line solution
        // head = new Node(newEl, head);
    }

    public void pushToTail(Integer data) {
        // wrap data as node
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        }
        else {
            // find the last element
            // Problem with cycle
//        while (node != null) {
//            System.out.print(node.getData() + " ");
//            node = node.getNext();
//        }
//        after cycle while node == null
            Node last = head;
            while (last != null && last.getNext() != null) {
                last = last.getNext();
            }
            // another way
//        Node lastElement = head;
//        while (node != null) {
//            lastElement = node;
//            node = node.getNext();
//        }
            // set next to newNode
            last.setNext(newNode);
        }
    }

    public Integer removeHead() {
        Node node = head;
        if(head == null) {
            return null;
        }
        head = node.getNext();
        return node.getData();
    }

    public Integer removeTail() {
        // if list is empty
        if (head == null) {
            return null;
        }
        // if list has only one element
        else if (head.getNext() == null) {
            Integer data = head.getData();
            head = null;
            return data;
        }
        // if list has only two elements
        else if (head.getNext().getNext() == null) {
            Integer data = head.getNext().getData();
            head.setNext(null);
            return data;
        }
        Node node = head;
        // we can find one before last
        while (node != null &&
                node.getNext() != null &&
                node.getNext().getNext() != null) {
            node = node.getNext();
        }

        Integer data = node.getNext().getData();
        node.setNext(null);
        return data;
    }

    public Integer get(int index) {
        Node node = head;
        if (head == null) {
            return null;
        }
        int count = 0;

        while (node != null && count < index){
            node = node.getNext();
            count++;
        }
        if(count == index) {
            return node.getData();
        } else return null;
    }

    public Integer getSize(){
        Node node = head;
        if (head == null) {
            return 0;
        }
        int count = 0;
        while (node != null){
            node = node.getNext();
            count++;
        }
        return count;
    }


    public void pushByIndex(Integer data, int index) {
        Node newNode = new Node(data);
        if (head == null) {
            System.out.println("Error");
        } else {
            int count = 0;
            Node node = head;
            while (node != null && count < index - 1) {
                node = node.getNext();
                count++;
            }
            if (count == index - 1) {
                newNode.setNext(node.getNext());
                node.setNext(newNode);
            }
        }
    }
    public void removeByIndex( int index){
        if (head == null){
            System.out.println("Error");
        }else {
            int count = 0;
            Node node = head;
            while (node != null && count < index-1){
                node = node.getNext();
                count++;
            }

            if (count == index-1){
             node.setNext(node.getNext().getNext());
            }

        }
    }

    public void print() {
        Node node = head;
        while (node != null) {
            System.out.print(node.getData() + " ");
            node = node.getNext();
        }
        System.out.println();
    }
}

