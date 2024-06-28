package trie;

public class LongestWordWithAllPrefixes {
    static Node root = new Node();
    private static String ans = "";

    public static void main(String[] args) {
        String[] words = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        for (int i = 0; i < words.length; i++) {
            insertion(words[i]);
        }
        longestWord(root, new StringBuilder());
        System.out.println(ans);

    }

    private static void longestWord(Node root, StringBuilder temp) {

        if (root == null) {
            return;
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].eow) {
                temp.append((char) (i + 'a'));
                if (temp.length() > ans.length()) {
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length() - 1);
            }
        }

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



    static class Node {
        Node[] children;
        boolean eow;

        public Node() {
            children = new Node[26];
            eow = false;
        }
    }
}
