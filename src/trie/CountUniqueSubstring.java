package trie;

//All prefix(2nd) of all suffix(first)
public class CountUniqueSubstring {
    static Node root = new Node();

    private static boolean search(String key) {
        Node curr = root;
        for (int i = 0; i < key.length(); i++) {
            int idx = key.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            if (i == key.length() - 1 && !curr.children[idx].eow) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    private static void insertion(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            if (i == word.length() - 1) {
                curr.children[idx].eow = true;
            }
            curr = curr.children[idx];
        }

    }

    public static void main(String[] args) {
        String str = "ababa";
        for (int i = 0; i < str.length(); i++) {
            String suffix = str.substring(i);
//            System.out.println(suffix);
            insertion(suffix);
        }

        System.out.println(countNodes(root));

    }

    private static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                count += countNodes(root.children[i]);
            }
        }
        return count + 1;
    }

    static class Node {
        Node[] children;
        boolean eow;

        public Node() {
            children = new Node[26];
            eow = false;
        }
    }
}
