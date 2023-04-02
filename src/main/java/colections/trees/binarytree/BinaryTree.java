package colections.trees.binarytree;



public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    public void insert(int key, String value) {
        root = insertRec(root, key, value);
    }

    private Node insertRec(Node root, int key, String value) {
        if (root == null) {
            root = new Node(key, value);
            return root;
        }
        if (key < root.key)
            root.left = insertRec(root.left, key, value);
        else if (key > root.key)
            root.right = insertRec(root.right, key, value);
        return root;
    }

    public Node find(int key) {
        return findRec(root, key);
    }

    private Node findRec(Node root, int key) {
        if (root == null || root.key == key)
            return root;
        if (key < root.key)
            return findRec(root.left, key);
        return findRec(root.right, key);
    }


    public void deleteNode(int key) {
        root = deleteNode(root, key);
    }

    private Node deleteNode(Node root, int key) {
        if (root == null) {
            return null;
        }
        if (key < root.key) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.key) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.key = findMin(root.right).key; //перезапись
            root.right = deleteNode(root.right, root.key);
        }
        return root;
    }

    private Node findMin(Node node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }




    public void print() {
        printRec(root);
    }

    private void printRec(Node root) {
        if (root != null) {
            printRec(root.left);
            System.out.println("Key: " + root.key + " Value: " + root.value);
            printRec(root.right);
        }
    }
}
