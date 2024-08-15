package queue;

public class CircularQueueImplementation {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.remove());
        q.add(6);
        System.out.println(q.remove());
        q.add(7);
        System.out.println();
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }

    static class Queue {
        static int[] arr;
        static int size;
        static int rear = -1;
        static int front = -1;

        Queue(int size) {
            arr = new int[size];
            Queue.size = size;
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        public void add(int data) {
            if (isFull()) {
                System.out.println("Full");
            }
            if (isEmpty()) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Empty");
            }
            int data = arr[front];
            if (rear == front) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }

            return data;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Empty");
            }
            return arr[front];
        }
    }
}
