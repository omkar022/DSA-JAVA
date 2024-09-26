package ll;

public class MergeSortLL {
    public static void main(String[] args) {
        MergeSortLL ll = new MergeSortLL();

        Node head = null;
        head = ll.insertAtHead(head, 1);
        head = ll.insertAtHead(head, 4);
        head = ll.insertAtHead(head, 5);
        head = ll.insertAtHead(head, 2);
        head = ll.insertAtHead(head, 3);

        System.out.println("Original List:");
        ll.printList(head);


        head = ll.mergeSort(head);

        System.out.println("Sorted List:");
        ll.printList(head);
    }

    public Node insertAtHead(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        return newNode;
    }

    public void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft, newRight);
    }

    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;

    }

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
