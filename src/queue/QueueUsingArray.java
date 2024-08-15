package queue;

public class QueueUsingArray {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }

    }

    static class Queue {
        static int size;
        static int rear = -1;
        static int[] arr;

        Queue(int n) {
            arr = new int[n];
            size = n;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Empty");
                return -1;
            }
            int data = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return data;

        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty");
                return -1;
            }
            return arr[0];
        }
    }
}
