package dsa.linkedlist.theory;

class DoublyLL {
    private class Node {
        private int data;
        private Node next;
        private Node prev;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public DoublyLL() {
        this.size = 0;
    }

    // Insert in beginning
    public void insertBeg(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            node.prev = null; // you can skip it, by default it is null
            head.prev = node;
            head = node;
        }
        size++;
    }

    // Insert at end
    public void insertEnd(int value) {
        if (head == null) {
            insertBeg(value);
            return;
        }
        Node node = new Node(value);
        node.prev = tail;
        node.next = null; // you can skip it, by default it is null
        tail.next = node;
        tail = node;
        size++;

        // Node node = new Node(value, null, tail);
        // tail.next = node;
        // tail = node;
        // size++;
    }

    // Insert by position
    public void insertByPosition(int value, int pos) {
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
        node.prev = temp;
        temp.next.prev = node; // order matters : if it is after "temp.next = node" then it will point to itself
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
        while (temp != null && temp.data != target) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Value not found..");
            return;
        }

        if (temp == tail) {
            insertEnd(value);
            return;
        }

        Node node = new Node(value);
        node.next = temp.next;
        node.prev = temp;
        temp.next.prev = node; // order matters : if it is after "temp.next = node" then it will point to itself
        temp.next = node;
        size++;
    }

    // displayForward list
    public void displayForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("Size : " + size);
    }

    // DisplayBackward list
    public void displayBackward() {
        if (tail == null) {
            System.out.println("List is empty.\n");
            return;
        }

        Node temp = tail;
        while(temp != null) {
            System.out.print(temp.data +" <-> ");
            temp = temp.prev;
        }
        System.out.println("START");
        System.out.println("Size : " + size);
    }
}

public class _03_DoublyLinkedListInsertion {
    public static void main(String[] args) {
        DoublyLL list = new DoublyLL();
        list.insertBeg(80);
        list.insertBeg(70);
        list.insertBeg(60);
        list.insertBeg(50);
        list.insertBeg(40);
        list.insertBeg(30);
        list.insertBeg(20);
        list.insertBeg(10);
        list.displayForward();
        System.out.println("\n");

        list.insertEnd(90);
        list.displayForward();
        System.out.println("\n");


        list.insertByPosition(4, 4);
        list.displayForward();
        list.insertByPosition(1, 1);
        list.displayForward();
        list.insertByPosition(11, 12);
        list.displayForward();
        System.out.println("\n");

        list.insertAfterValue(100,1);
        list.displayForward();
        list.insertAfterValue(200,4);
        list.displayForward();
        list.insertAfterValue(300,11);
        list.displayForward();
        list.insertAfterValue(300,1838);
        System.out.println("\n");

        list.displayForward();
        list.displayBackward();
    }
}
