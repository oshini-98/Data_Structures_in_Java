// In stack data structure, elements are stored in the LIFO principle. That is, the last element stored in a stack will be removed first.

// It works just like a pile of plates where the last plate kept on the pile will be removed first.
// In a stack, operations can be perform only from one end (top here).

public class Stack {

    int arr[];
    int top;
    int capacity;

    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    boolean isFull() {
        return top + 1 == capacity;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(int x) {
        if (isFull()) {
            System.out.println("Overflow !");
        } else {
            top++;
            arr[top] = x;
        }
    }

    void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty !");
        } else {
            top--;
        }
    }

    int peek() {
        int temp;

        if (isEmpty()) {
            System.out.println("Stack is empty !");
            temp = -1;
        } else {
            temp = arr[top];
            top--;
        }
        return temp;
    }

    int size() {
        return top + 1;
    }

    void printStack() {
        System.out.println("Stack : ");

        for (int x = 0; x <= top; x++) {
            System.out.println(arr[x]);
        }
    }

    public static void main(String[] args) {
        Stack myStack = new Stack(5);

        myStack.push(10);
        myStack.push(20);
        myStack.printStack();
        System.out.println(myStack.size());
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);
        myStack.printStack();
        System.out.println(myStack.size());
        myStack.pop();
        myStack.pop();
        myStack.pop();
        myStack.printStack();
        System.out.println(myStack.size());
        System.out.println(myStack.peek());
        myStack.printStack();
        System.out.println(myStack.size());

    }
}
