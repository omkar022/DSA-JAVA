package bt;

public class ShortestDistanceBetween2Nodes {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(minDistance(root, 4, 6));

    }

    public static int minDistance(Node root, int p, int q) {
        Node lca2 = lca(root, p, q);
        int dist1 = lcaDist(lca2, p);
        int dist2 = lcaDist(lca2, q);
        return dist1 + dist2;
    }

    private static int lcaDist(Node root, int n) {
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }
        int left = lcaDist(root.left, n);
        int right = lcaDist(root.right, n);

        if (left != -1) {
            return left + 1;
        }
        if (right != -1) {
            return right + 1;
        }

        return -1;
    }

    private static Node lca(Node root, int p, int q) {
        if (root == null || root.data == p || root.data == q) {
            return root;
        }
        Node left = lca(root.left, p, q);
        Node right = lca(root.right, p, q);
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        return root;
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
