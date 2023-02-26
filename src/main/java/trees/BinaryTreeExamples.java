package trees;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeExamples {
    public static void main(String[] args) {
/*
        BinaryTree binaryTree = new BinaryTree(
                10,
                new BinaryTree(
                        2,
                        new BinaryTree(1),
                        new BinaryTree(
                                6,
                                new BinaryTree(5),
                                null)
                ),
                new BinaryTree(
                        13,
                        new BinaryTree(12),
                        new BinaryTree(81)
                )
        );

        System.out.println("Sum using recurse = " + binaryTree.sum());
        System.out.println("Sum using non-recurse = " + binaryTree.sumNonRecurse());
        System.out.println("Sum using non-recurse (wide) = " + binaryTree.sumNonRecurseWide());


 */
        BinaryTree binaryTree = new BinaryTree (10);
        binaryTree.pushToTail(5);
        binaryTree.pushToTail(5);
        binaryTree.pushToTail(3);
        binaryTree.pushToTail(12);
        binaryTree.pushToTail(2);
        System.out.println(binaryTree);

        binaryTree.removeElem(2);
        System.out.println(binaryTree);

    }
}

class BinaryTree {
    private int value;
    private BinaryTree left, right;

    public BinaryTree(int value, BinaryTree left, BinaryTree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public BinaryTree(int value) {
        this.value = value;
    }

    // go to deep
    public int sum() {
        int sum = value;

        // можно добавить порядок вывода
//        System.out.println(value);

        if (right != null)
            sum += right.sum();

        if (left != null)
            sum += left.sum();

        return sum;
    }

    // go to deep
    public int sumNonRecurse() {
        Stack<BinaryTree> stack = new Stack();
        stack.push(this);

        int sum = 0;

        while (!stack.isEmpty()) {
            BinaryTree tmp = stack.pop();

            // можно добавить порядок вывода
//            System.out.println(tmp.value);

            sum += tmp.value;

            if (tmp.left != null)
                stack.push(tmp.left);

            if (tmp.right != null)
                stack.push(tmp.right);
        }

        return sum;
    }

    // go to wide
    public int sumNonRecurseWide() {
        Queue<BinaryTree> queue = new LinkedList<>();
        queue.add(this);

        int sum = 0;

        while (!queue.isEmpty()) {
            BinaryTree tmp = queue.remove();

            // можно добавить порядок вывода
//            System.out.println(tmp.value);

            sum += tmp.value;

            if (tmp.left != null)
                queue.add(tmp.left);

            if (tmp.right != null)
                queue.add(tmp.right);
        }

        return sum;
    }

    public void pushToTail(int elem) {
                if (elem < value){
                    if (left == null) {
                        left = new BinaryTree(elem);
                    }else{
                        left.pushToTail(elem);
                    }

                }else {
                    if (right == null) {
                        right = new BinaryTree(elem);
                    }else{
                        right.pushToTail(elem);
                    }
                }
    }
    public void removeElem(int elem){
        if (elem < value){
            if (left.value == elem){
                left = null;
            } else {
                left.removeElem(elem);  //идем дальше в поиске элемента, если не был найден в предыдущем условии
            }
        }else{
            if (right.value == elem){
                right = null;
            }else {
                right.removeElem(elem);
            }
        }
    }


    @Override
    public String toString() {
        return "BinaryTree{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}