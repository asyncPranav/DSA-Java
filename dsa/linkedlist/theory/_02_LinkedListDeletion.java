package dsa.linkedlist.theory;

class LinkedList {
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

    // Delete beginning node
    public void deleteBeg() {
        if (head == null) {
            System.out.println("Empty list.\n");
            return;
        }
        head = head.next;
        size--;

        if (head == null) {
            tail = null;
        }
    }

    // Delete ending node
    public void deleteEnd() {
        if (head == null) {
            System.out.println("Empty list.\n");
            return;
        }

        // Only one node
        if (head == tail) {
            head = tail = null;
            size--;
            return;
        }

        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
        size--;
    }


    // Delete by position
    public void deleteByPosition(int pos) {
        if (head == null) {
            System.out.println("List is empty\n");
            return;
        }

        if (pos < 1 || pos > size) {
            System.out.println("Invalid position\n");
            return;
        }

        if (pos == 1) {
            deleteBeg();
            return;
        }

        if (pos == size) {
            deleteEnd();
            return;
        }

        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        size--;
    }

    // Delete by value
    public void deleteByValue(int target) {
        if (head == null) {
            System.out.println("List is empty\n");
            return;
        }

        // Case 1: head node contains target
        if (head.data == target) {
            deleteBeg();
            return;
        }

        // Case 2: middle or tail node
        Node temp = head;
        while (temp.next != null && temp.next.data != target) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Value not found\n");
            return;
        }

        // Case 3: if deleting the tail node, update tail
        if (temp.next == tail) {
            tail = temp;
        }

        temp.next = temp.next.next;
        size--;
    }

    // Insert Element
    public void insert(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
        size++;
    }


    // Display linked list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.\n");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("Size : " + size + "\n");
    }
}

public class _02_LinkedListDeletion {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.display();

        list.insert(100);
        list.insert(90);
        list.insert(80);
        list.insert(70);
        list.insert(60);
        list.insert(50);
        list.insert(40);
        list.insert(30);
        list.insert(20);
        list.insert(10);
        list.display();

        list.deleteBeg();
        list.display();

        list.deleteEnd();
        list.display();

        list.deleteByPosition(1);
        list.display();
        list.deleteByPosition(5);
        list.display();
        list.deleteByPosition(3);
        list.display();

        list.deleteByValue(30);
        list.display();
    }
}
