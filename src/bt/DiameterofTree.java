package bt;

public class DiameterofTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(diameter(root));
    }

    private static int diameter(Node root) {
        int[] maxDiameter = new int[1];
        height(root, maxDiameter);
        return maxDiameter[0];
    }

    public static int height(Node root, int[] maxDiameter) {
        if (root == null) {
            return 0;
        }
        int left = height(root.left, maxDiameter);
        int right = height(root.right, maxDiameter);
        int currDiameter = left + right + 1;
        maxDiameter[0] = Math.max(currDiameter, maxDiameter[0]);
        return Math.max(left, right) + 1;
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
