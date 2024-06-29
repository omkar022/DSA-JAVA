package hashing;

import java.util.ArrayList;
import java.util.LinkedList;

//insert,remove,search -O(1)
public class HashMapCode {

    public static void main(String[] args) {

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("IND", 100);
        hm.put("SA", 99);

        System.out.println(hm.containsKey("INDj"));
        System.out.println(hm.get("INDs"));

        System.out.println(hm.keySet());

    }

    static class HashMap<K, V> {

        private int n;
        private int N;
        private LinkedList<Node>[] buckets;

        public HashMap() {
            this.N = 4;
            this.buckets = new LinkedList[4];

            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

        }

        public void put(K key, V value) {
            int bi = hashFunction(key);

            int di = searchInLL(key, bi);

            if (di != -1) {
                Node node = buckets[bi].get(di);
                node.value = value;
            } else {
                buckets[bi].add(new Node(key, value));
                n++;
            }

            double lambda = (double) n / N;

            if (lambda > 2.0) {
                rehash();
            }


        }

        private void rehash() {
            LinkedList<Node>[] oldBuck = buckets;

            buckets = new LinkedList[2 * N];
            N = 2 * N;

            for (int i = 0; i < buckets.length; i++) {
                buckets[i] = new LinkedList<>();
            }

            for (int i = 0; i < oldBuck.length; i++) {
                LinkedList<Node> ll = oldBuck[i];

                for (int j = 0; j < ll.size(); j++) {

                    Node node = ll.remove();
                        put(node.key, node.value);


                }
            }

        }

        private int searchInLL(K key, int bi) {

            LinkedList<Node> ll = buckets[bi];

            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                Node node = ll.get(i);

                if (node.key.equals(key)) {
                    return di;
                }
                di++;
            }
            return -1;
        }

        private int hashFunction(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % N;
        }

        public boolean containsKey(K key) {

            int bi = hashFunction(key);
            int di = searchInLL(key, bi);

            return di != -1;
        }

        public V get(K key) {
            int bi = hashFunction(key);

            int di = searchInLL(key, bi);
            if (di != -1) {
                Node node = buckets[bi].get(di);
                return node.value;
            }
            return null;
        }

        public V remove(K key) {
            int bi = hashFunction(key);
            int di = searchInLL(key, bi);
            if (di != -1) {
                Node node = buckets[bi].remove(di);

                n--;
                return node.value;
            }
            return null;
        }

        public ArrayList<K> keySet() {
            ArrayList<K> keys = new ArrayList<>();
            for (int i = 0; i < buckets.length; i++) {
                LinkedList<Node> ll = buckets[i];
                for (Node node : ll) {
                    keys.add(node.key);
                }
            }
            return keys;
        }

        public boolean isEmpty() {
            return n == 0;
        }

        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

    }
}
