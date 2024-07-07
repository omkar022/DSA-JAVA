package heap;

import java.util.ArrayList;

public class MaxHeap {

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }

    }

    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);

            int x = arr.size() - 1;
            int par = (x - 1) / 2;

            while (arr.get(x) > arr.get(par)) {
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
                x = par;
                par = (x - 1) / 2;
            }

        }

        public int peek() {
            return arr.get(0);
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }

        public int remove() {
            int data = arr.get(0);
            int x = arr.size() - 1;

            int temp = arr.get(0);
            arr.set(0, arr.get(x));
            arr.set(x, temp);

            arr.remove(x);
            heapify(0);
            return data;
        }

        public void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int maxIdx = i;

            if (left < arr.size() && arr.get(left) > arr.get(maxIdx)) {
                maxIdx = left;
            }
            if (right < arr.size() && arr.get(right) > arr.get(maxIdx)) {
                maxIdx = right;
            }

            if (maxIdx != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(maxIdx));
                arr.set(maxIdx, temp);
                heapify(maxIdx);
            }

        }

    }
}
