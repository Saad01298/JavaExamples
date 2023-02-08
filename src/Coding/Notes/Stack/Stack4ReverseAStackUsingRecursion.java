package Coding.Notes.Stack;

import java.util.List;
import java.util.Stack;

public class Stack4ReverseAStackUsingRecursion {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        reverse(stack);

        while (!stack.isEmpty()) {
            System.out.print(stack.pop()+" ");
        }
    }

    private static void reverse (Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }

        int k = stack.pop();
        reverse(stack);

        insertAtBottom(stack, k);
    }

    private static void insertAtBottom(Stack<Integer> stack, int k) {
        if (stack.isEmpty())
            stack.push(k);
        else {
            int p = stack.pop();
            insertAtBottom(stack, k);
            stack.push(p);
        }
    }
}
