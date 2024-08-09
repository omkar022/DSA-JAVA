package bt;

public class CountNodes {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(count(root));
    }

    private static int count(Node root) {
        if (root == null) {
            return 0;
        }
        int left = count(root.left);
        int right = count(root.right);
        return left + right + 1;
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
