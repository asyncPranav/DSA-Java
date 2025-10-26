package dsa.stack.theory.usingArray;

class Stack {
    private int[] arr;
    private int top;
    private int size;

    public Stack(int size) {
        arr = new int[size];
        this.size = size;
        top = -1;
    }

    // Utility methods
    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    // Push element
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack overflow, cant push");
            return;
        }
        arr[++top] = value;
    }

    // Pop elements
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow, nothing to pop");
            return -1;
        }
        return arr[top--];
    }

    // Peek element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    // Empty the stack
    public void clear() {
        top = -1;
        System.out.println("Stack cleared");
    }

    // Display stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("top -> bottom : ");
        for (int i = top; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class _01_stack {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.display();
        System.out.println("\n");

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.display();

        stack.pop();
        stack.display();
        System.out.println("\n");

        int element = stack.peek();
        System.out.println(element);
        System.out.println("\n");

        System.out.println("Size : " + stack.size());
        stack.display();
        stack.clear();
        System.out.println("Size : " + stack.size());
        stack.display();
    }
}
