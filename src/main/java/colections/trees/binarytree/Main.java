package colections.trees.binarytree;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(5, "5");
        tree.insert(3, "3");
        tree.insert(7, "7");
        tree.insert(1, "1");
        tree.insert(4, "4");
        tree.insert(6, "6");
        tree.insert(8, "8");


       // Node node = tree.find(3);
       // System.out.println("Key: " + node.key + " Value: " + node.value);

        tree.print();
        System.out.println("-----------------------------------------------");
        tree.deleteNode(3);
        tree.print();
    }
}