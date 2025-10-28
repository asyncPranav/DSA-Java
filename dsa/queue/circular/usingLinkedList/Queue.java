package dsa.queue.circular.usingLinkedList;

class CircularQueue {
    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node front;
    private Node rear;
    private int size;

    public CircularQueue() {
        this.size = 0;
    }

    // Utility method
    public boolean isEmpty() {
        return front == null;
    }

    public void size() {
        System.out.println("Size : " + size);
    }

    // Enqueue elements (insert at end)
    public void enqueue(int value) {
        Node node = new Node(value);

        if (isEmpty()) {
            front = rear = node;
            rear.next = front; // circular link
        } else {
            rear.next = node;
            rear = node;
            rear.next = front; // maintain circular link
        }
        size++;
    }

    // Dequeue elements
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int value = front.data;

        // if only one element
        if (front == rear) {
            front = rear = null;
        } else {
            front = front.next;
            rear.next = front; // maintain circular link
        }
        size--;
        return value;
    }

    // Peek element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return front.data;
    }

    // Clear queue
    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Queue cleared");
    }

    // Display queue
    public void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node temp = front;
        System.out.print("front -> ");
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != front);
        System.out.println(" <- rear");

    }


}

public class Queue {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();

        queue.display();
        System.out.println("\n");

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.display();
        System.out.println("\n");

        int elem = queue.dequeue();
        System.out.println(elem);
        queue.display();
        System.out.println("\n");

        int elem2 = queue.peek();
        System.out.println(elem2);
        queue.display();
        System.out.println("\n");

        queue.display();
        queue.size();
        queue.clear();
        queue.display();
        queue.size();

    }
}
