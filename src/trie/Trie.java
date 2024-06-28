package trie;

//O(L)=word length
public class Trie {
    static Node root = new Node();

    public static void main(String[] args) {
        String[] words = {"the", "a", "there", "their", "any"};
        for (int i = 0; i < words.length; i++) {
            insertion(words[i]);
        }

        System.out.println(search("the"));
        System.out.println(search("an"));


    }

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

    static class Node {
        Node[] children;
        boolean eow;

        public Node() {
            children = new Node[26];
            eow = false;
        }
    }


}
