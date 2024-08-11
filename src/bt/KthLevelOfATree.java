package bt;

public class KthLevelOfATree {
    public static void kthLevel(Node root, int k, int level) {
        if (root == null) {
            return;
        }
        if (level == k) {
            System.out.print(root.data + " ");
        }
        kthLevel(root.left, k, level + 1);
        kthLevel(root.right, k, level + 1);

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        kthLevel(root, 2, 1);
    }

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}
