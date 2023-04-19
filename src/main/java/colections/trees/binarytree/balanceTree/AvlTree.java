package colections.trees.binarytree.balanceTree;

public class AvlTree {
    private Node root;

    public Node insert(int key) {
        this.root = insertRecursion(root, key);
        return root;
    }

    private Node insertRecursion(Node node, int key) {
        if (node == null) {
            Node res = new Node();
            res.setKey(key);
            return res;
        }

        if (key < node.getKey()) {
            node.setLeft(insertRecursion(node.getLeft(), key));
        }
        else {
            node.setRight(insertRecursion(node.getRight(), key));
        }

        return balanceTree(key, node);
    }

    private Node balanceTree(int key, Node newNode) {
        newNode.setHeight(1 + Util.max(Util.getHeightNode(newNode.getLeft()), Util.getHeightNode(newNode.getRight())));

        int balance = Util.getBalanceFactor(newNode);

        if (balance > 1 && key < newNode.getLeft().getKey())
            return Util.leftRotate(newNode);    //return Util.rightRotate(newNode)

        if (balance < -1 && key > newNode.getRight().getKey())
            return Util.leftRotate(newNode);

        if (balance > 1 && key > newNode.getLeft().getKey()) {
            newNode.setLeft(Util.leftRotate(newNode.getLeft()));
            return Util.rightRotate(newNode);
        }

        if (balance < -1 && key < newNode.getRight().getKey()) {
            newNode.setRight(Util.rightRotate(newNode.getRight()));
            return Util.leftRotate(newNode);
        }

        return newNode;
    }
}
