package dsa.linkedlist.theory;

class DLL {
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

    public DLL() {
        this.size = 0;
    }

    // delete beginning
    public void deleteBeg() {
        if (head == null) {
            System.out.println("List is empty..");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    // delete end
    public void deleteEnd() {
        if (tail == null) {
            System.out.println("List is empty..");
            return;
        }
        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    // delete node by position
    public void deleteByPosition(int pos) {
        if (head == null) {
            System.out.println("List is empty..");
            return;
        }
        if (pos < 1 || pos > size) {
            System.out.println("Invalid position..");
            return;
        }
        if (pos == 1) {
            deleteBeg();
            return;
        }
        if (pos == size){
            deleteEnd();
            return;
        }

        Node temp = head;
        for (int i = 1; i < pos -1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.prev = temp;
        size--;

       /* --> This is safer acc to chatgpt

            Node temp = head;
            // Traverse to the node at the given position
            for (int i = 1; i < pos; i++) {
                temp = temp.next;
            }

            // If deleting the last node
            if (temp == tail) {
                tail = tail.prev;
                tail.next = null;
            } else {
                // Middle node
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
        */
    }

    // Delete node by value
    public void deleteByValue(int value) {
        if (head == null) {
            System.out.println("List is empty..");
            return;
        }

        Node temp = head;
        while(temp != null && temp.data != value) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Value not found..");
            return;
        }
        if (temp == head) {
            deleteBeg();
            return;
        }
        if (temp == tail) {
            deleteEnd();
            return;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        size--;
    }

    // insert beginning
    public void insertBeg(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            node.prev = null;
            head.prev = node;
            head = node;
        }
        size++;
    }


    // display list
    public void display() {
        if (head == null) {
            System.out.println("List is empty..");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("Size : " + size);
    }
}

public class _04_DoublyLinkedListDeletion {
    public static void main(String[] args) {
        DLL list = new DLL();

        list.insertBeg(80);
        list.insertBeg(70);
        list.insertBeg(60);
        list.insertBeg(50);
        list.insertBeg(40);
        list.insertBeg(30);
        list.insertBeg(20);
        list.insertBeg(10);
        list.display();
        System.out.println("\n");

        list.deleteBeg();
        list.display();
        System.out.println("\n");

        list.deleteEnd();
        list.display();
        System.out.println("\n");

        list.deleteByPosition(3);
        list.display();
        list.deleteByPosition(5);
        list.display();
        System.out.println("\n");

        list.deleteByValue(50);
        list.display();
        list.deleteByValue(20);
        list.display();
        list.deleteByValue(60);
        list.display();

    }
}
