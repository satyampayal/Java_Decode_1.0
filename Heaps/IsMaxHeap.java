package Heaps;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
    }
}

public class IsMaxHeap {
    static int sizeOfTree(Node root) {
        if (root == null)
            return 0;
        return 1 + sizeOfTree(root.left) + sizeOfTree(root.right);

    }

    static boolean isHeap(Node root) {
        if (root == null)
            return true;

        if (root.left != null && root.left.val > root.val)
            return false;
        if (root.right != null && root.right.val > root.val)
            return false;
        return isHeap(root.left) && isHeap(root.right);

    }

    static boolean isCBT(Node root, int p, Integer size) {
        if (root == null)
            return true;
        if (p >= size)
            return false;
        return isCBT(root.left, 2 * p + 1, size) && isCBT(root.right, 2 * p + 2, size);

    }

    static boolean isMaxHeap(Node root) {
        Integer size = sizeOfTree(root);
        return (isHeap(root) && isCBT(root, 0, size));

    }

    public static void main(String[] args) {

        Node a = new Node(10);// a is the root
        Node b = new Node(8);
        Node c = new Node(7);
        Node d = new Node(6);
        Node e = new Node(4);

        a.left = b;
        a.right = c;
        b.left = d;
        c.right = e;
        System.out.println(isMaxHeap(a));
    }
}
