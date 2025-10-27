package dsa.queue.simple.usingLinkedList;

/*
🧩 Concept Recap

    A Queue using Linked List works on FIFO principle:
        . Front (head) → element removed (dequeue)
        . Rear (tail) → element added (enqueue)

    Unlike array queues:
        ✅ No fixed size (dynamic memory)
        ✅ No overflow (unless memory full)
        ✅ No wasted space

🧠 Algorithm
    Enqueue (insert at end)
        . Create a new node.
        . If queue is empty → front = rear = node
        . Else → attach node to rear.next, update rear.

    Dequeue (remove from front)
        . If queue is empty → underflow.
        . Else → move front = front.next
        . If queue becomes empty → set rear = null.
*/

class SimpleQueue {
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

    public SimpleQueue() {
        this.size = 0;
    }

    // Utility methods
    public boolean isEmpty() {
        return front == null;
    }

    public void size() {
        System.out.println("Size : " + size);
    }

    // Enqueue element (insert at end)
    public void enqueue(int value) {
        Node node = new Node(value);

        if (front == null) {
            front = rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
        size++;
    }

    // Dequeue element
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue underflow, nothing to dequeue");
            return -1;
        }
        int value = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return value;
    }

    // Peek (front element)
    public int peek(){
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
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(" <- rear");
    }
}

public class Queue {
    public static void main(String[] args) {
        SimpleQueue queue = new SimpleQueue();

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
