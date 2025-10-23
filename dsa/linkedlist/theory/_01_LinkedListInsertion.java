package dsa.linkedlist.theory;

class SingleLinkedList{
    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public SingleLinkedList() {
        this.size = 0;
    }

    // Insert in beginning
    public void insertBegin(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size ++;
    }

    // Insert in end
    public void insertEnd(int val){
        Node node = new Node(val);
        if (tail == null) {
            insertBegin(val);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    // Insert at position
    public void insertAtPosition(int val, int pos){
        if (pos < 1 || pos > size+1) {
            System.out.println("Invalid position..!!");
            return;
        }
        if (pos == 1) {
            insertBegin(val);
            return;
        }
        if (pos == size){
            insertEnd(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }

        /*
         * ⚡ Beginner's Guide: Inserting a Node at a Specific Position
         *
         * Common mistake ❌:
         *     temp.next = node;
         *     node.next = temp.next;
         * → This makes the new node point to itself and breaks the chain.
         *
         * Correct order ✅:
         *     node.next = temp.next;  // save the original next link
         *     temp.next = node;       // now insert the new node in between
         *
         * Always remember:
         * Link new node FIRST, then connect previous node.
         */

        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        size++;
    }

    // Insert after a target value
    public void insertAfterValue(int target, int value){
        if (head == null) {
            System.out.println("List is empty..!!");
            return;
        }

        Node temp = head;
        while(temp != null && temp.val != target){
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Value not found..\n");
            return;
        }

        // Node node = new Node(value);
        // node.next = temp.next;
        // temp.next = node;

        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    // Insert before a target value
    public void insertBeforeValue(int target, int value){
        if (head == null) {
            System.out.println("List is empty..!!");
            return;
        }



        if (head.val == target) {
            insertBegin(value);
            return;
        }

        Node prev = null;
        Node curr = head;

        while(curr != null && curr.val != target){
            prev = curr;
            curr = curr.next;
        }
        if (curr == null) {
            System.out.println("Value not found..\n");
            return;
        }

        //Node node = new Node(value);
        //node.next = curr;
        //prev.next = node;
        //size++;

        Node node = new Node(value, prev.next);
        prev.next = node;
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("Size: " + size + "\n");
    }

}
public class _01_LinkedListInsertion {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.display();

        list.insertBegin(10);
        list.insertBegin(20);
        list.insertBegin(30);
        list.display();

        list.insertEnd(40);
        list.display();

        list.insertAtPosition(60, 3);
        list.display();
        list.insertAtPosition(50,1);
        list.display();
        list.insertAtPosition(70,7);
        list.display();

        list.insertAfterValue(20, 80);
        list.display();
        list.insertAfterValue(40, 90);
        list.display();
        list.insertAfterValue(70, 2);
        list.display();
        list.insertAfterValue(170, 2);

        list.insertBeforeValue(50, 5);
        list.display();
        list.insertBeforeValue(40, 4);
        list.display();
        list.insertBeforeValue(2, 110);
        list.display();
        list.insertBeforeValue(200, 300);






    }
}
