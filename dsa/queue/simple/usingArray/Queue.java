package dsa.queue.simple.usingArray;

/*
    Queue Using Array – Key Points
        . Use front and rear pointers.
        . front → points to the first element.
        . rear → points to the last element inserted.
        . Initially, both front = -1 and rear = -1.
*/

class SimpleQueue {
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public SimpleQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    // Utility methods
    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void size() {
        System.out.println("Size : " + size);
    }

    // Enqueue element
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue overflow, cant enqueue");
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        arr[++rear] = value;
        size++;
    }

    // Dequeue element
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue underflow, cant dequeue");
            return -1;
        }
        int value = arr[front];
        front++;
        size--;
        if (size == 0) { // reset when queue becomes empty again
            front = rear = -1;
        }
        return value;
    }

    // Peek/Front element
    public int peek() {
        return arr[front];
    }

    // Clear queue
    public void clear() {
        front = rear = -1;
        size = 0;
    }


    // Display queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("front -> ");
        for (int i = front; i <= rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" <- rear");
    }
}

public class Queue {
    public static void main(String[] args) {
        SimpleQueue queue = new SimpleQueue(5);

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
