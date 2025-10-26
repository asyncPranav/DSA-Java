package dsa.linkedlist.theory;

class CLL {
    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public CLL() {
        this.size = 0;
    }

    // Insert in beginning
    public void insertBeg(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = tail = node;
            node.next = head; // circular link
        } else {
            node.next = head;
            head = node;
            tail.next = node; // circular link
        }
        size++;
    }

    // Insert in end
    public void insertEnd(int value) {
        Node node = new Node(value);

        if (tail == null) {
            head = tail = node;
            node.next = head;
        } else {
            node.next = head;
            tail.next = node;
            tail = node;
        }
        size++;
    }

    // Insert by position
    public void insertByPosition(int value, int pos) {
        if (head == null) {
            System.out.println("List is empty..");
            return;
        }
        if (pos < 1 || pos > size + 1) {
            System.out.println("Invalid position..");
            return;
        }
        if (pos == 1) {
            insertBeg(value);
            return;
        }
        if (pos == size + 1) {
            insertEnd(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }

        Node node = new Node(value);
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    // Insert after target value
    public void insertAfterValue(int value, int target) {
        if (head == null) {
            System.out.println("List is empty..");
            return;
        }

        Node temp = head;
        do {
            if (temp.data == target) {
                Node node = new Node(value);
                node.next = temp.next;
                temp.next = node;
                size++;
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("Target value not found in the list.");
    }

    // Display list
    public void display() {
        if (head == null) {
            System.out.println("List is empty..");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("Back to head");
        System.out.println("Size : " + size);
    }
}

public class _05_CircularLinkedListInsertion {
    public static void main(String[] args) {
        CLL list = new CLL();

        list.display();
        System.out.println("\n");

        list.insertBeg(40);
        list.insertBeg(30);
        list.insertBeg(20);
        list.insertBeg(10);
        list.display();
        System.out.println("\n");

        list.insertEnd(60);
        list.display();
        System.out.println("\n");

        list.insertByPosition(1,1);
        list.display();
        list.insertByPosition(4,4);
        list.display();
        list.insertByPosition(8,8);
        list.display();
        list.insertByPosition(9,10);
        System.out.println("\n");

        list.insertAfterValue(333, 30);
        list.display();
        list.insertAfterValue(777, 8);
        list.display();
        list.insertAfterValue(999, 300);



    }
}
