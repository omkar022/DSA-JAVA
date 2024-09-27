package ll;

class LL {
    private Node head;

    public static void main(String[] args) {
        LL list = new LL();

        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        list.addLast(40);

        System.out.println("Linked list after additions:");
        list.printList();

        list.deleteFirst();
        System.out.println("Linked list after deleting first element:");
        list.printList();

        list.deleteLast();
        System.out.println("Linked list after deleting last element:");
        list.printList();
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }


    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }


    public void deleteFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    public void deleteLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }


    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
