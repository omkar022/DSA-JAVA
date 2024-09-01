package trie;

public class ShortestUniquePrefix {
    static Node root = new Node();

    public static void main(String[] args) {
        String[] words = {"zebra", "dog", "duck", "dove"};
        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }
        String[] prefixes = findPrefixes(words);

        for (String prefix : prefixes) {
            System.out.print(prefix + " ");
        }
        System.out.println();
    }

    private static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
            }
            if (i == word.length() - 1) {
                curr.children[idx].eow = true;
            }
            curr = curr.children[idx];
        }

    }

    static String findShortestUniquePrefix(String word) {
        Node curr = root;
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            prefix.append(word.charAt(i));
            curr = curr.children[idx];
            if (curr.freq == 1) {
                break;
            }
        }
        return prefix.toString();
    }

    static String[] findPrefixes(String[] arr) {
        String[] result = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = findShortestUniquePrefix(arr[i]);
        }
        return result;
    }

    static class Node {
        Node[] children;
        boolean eow;
        int freq;

        Node() {
            children = new Node[26];
            eow = false;
            freq = 1;
        }
    }
}
