package bt;

import java.util.ArrayList;

public class InvertTree {
    public static void main(String[] args) {
        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(7);
        root.left.left = new Node(1);
        root.left.right = new Node(3);
        root.right.left = new Node(6);
        root.right.right = new Node(9);

        invertTree(root);

        ArrayList<Integer> result = new ArrayList<>();
        preorder(root, result);
        System.out.println(result);
    }

    public static Node invertTree(Node root) {
        if (root == null) {
            return null;
        }
        Node left = invertTree(root.left);
        Node right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    public static void preorder(Node root, ArrayList<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.data);
        preorder(root.left, res);
        preorder(root.right, res);

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
