package colections.trees.binarytree.balanceTree;

public class Util {

    public static int getHeightNode(Node node) {
        if (node == null)
            return 0;

        return node.getHeight();
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static Node rightRotate(Node b) {
        Node c = b.getLeft();
        Node temp = c.getRight();

        c.setRight(b);
        b.setLeft(temp);

        b.setHeight(max(getHeightNode(b.getLeft()), getHeightNode(b.getRight())) + 1);
        c.setHeight(max(getHeightNode(c.getLeft()), getHeightNode(c.getRight())) + 1);

        return c;
    }

    public static Node leftRotate(Node a) {
        Node b = a.getRight();
        Node temp = b.getLeft();

        b.setLeft(a);
        a.setRight(temp);

        a.setHeight(max(getHeightNode(a.getLeft()), getHeightNode(a.getRight())) + 1);
        b.setHeight(max(getHeightNode(b.getLeft()), getHeightNode(b.getRight())) + 1);

        return b;
    }

    public static int getBalanceFactor(Node node) {
        if (node == null)
            return 0;

        return getHeightNode(node.getLeft()) - getHeightNode(node.getRight());
    }
}
