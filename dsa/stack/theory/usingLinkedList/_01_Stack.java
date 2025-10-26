package dsa.stack.theory.usingLinkedList;

class Stack {
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

    private Node top;
    private int size;

    public Stack() {
        this.size = 0;
    }

    // Utility Method
    public boolean isEmpty() {
        return top == null;
    }

    public void size() {
        System.out.println("Size : " + size);
    }

    // Push element
    public void push(int value) {
        Node node = new Node(value);
        node.next = top; // connect new node to previous top
        top = node;      // update top
        size++;
    }

    // Pop element
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Empty, nothing to pop");
            return -1;
        }
        int value = top.data;
        top = top.next;
        size--;
        return value;
    }

    // Peek element
    public int peek() {
        return top.data;
    }

    // Clear/Empty stack
    public void clear() {
        top = null;
        size = 0;
        System.out.println("Stack cleared");
    }

    // Display stack
    public void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;
        System.out.print("top -> bottom : ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class _01_Stack {
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.display();
        System.out.println("\n");

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.display();
        stack.size();
        System.out.println("\n");


        int elem = stack.pop();
        System.out.println(elem);
        stack.display();
        stack.size();
        System.out.println("\n");

        int elem2 = stack.peek();
        System.out.println(elem2);
        stack.display();
        stack.size();
        System.out.println("\n");

        stack.display();
        stack.size();
        stack.clear();
        stack.display();
        stack.size();

    }
}
