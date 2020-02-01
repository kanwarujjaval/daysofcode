package nextGreaterElement;

import java.lang.invoke.DelegatingMethodHandle$Holder;

public class Stack {
    int top = -1;
    int[] items = new int[100];

    public void push(int x) {
        if (top == 99) {
            System.out.print("Stack FUll");
        } else {
            items[++top] = x;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.print("Underflow");
            return -1;
        } else {
            int elem = items[top];
            top--;
            return elem;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
