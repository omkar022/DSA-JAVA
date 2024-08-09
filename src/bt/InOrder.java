package bt;

public class InOrder {
    static int i = -1;

    public static Node buildTree(int[] nodes) {
        i++;
        if (nodes[i] == -1) {
            return null;
        }
        Node root = new Node(nodes[i]);
        root.left = buildTree(nodes);
        root.right = buildTree(nodes);
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = buildTree(nodes);
        inorder(root);
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
