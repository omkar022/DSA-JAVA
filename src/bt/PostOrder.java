package bt;

public class PostOrder {
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

    public static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = buildTree(nodes);
        postorder(root);
    }

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
}
