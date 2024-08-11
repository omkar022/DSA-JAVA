package bt;

public class KthAncestorOfNode {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(kAncestor(root, 1, 5));

    }

    public static int kAncestor(Node root, int k, int node) {
        int[] arr = {-1};
        findKthAncestor(root, k, node, arr);
        return arr[0];
    }

    private static int findKthAncestor(Node root, int k, int node, int[] arr) {
        if (root == null) {
            return -1;
        }
        if (root.data == node) {
            return 0;
        }
        int left = findKthAncestor(root.left, k, node, arr);
        int right = findKthAncestor(root.right, k, node, arr);

        if (left == -1 && right == -1) {
            return -1;
        }
        int max = Math.max(left, right);
        if (max + 1 == k) {
            arr[0] = root.data;
        }
        return max + 1;

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
