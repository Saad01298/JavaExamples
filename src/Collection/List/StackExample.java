package Collection.List;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack stack1 = new Stack();
        Stack<String> stack2 = new Stack<String>();

        // pushing the elements
        stack1.push(4);
        stack1.push(4.4);
        stack1.push("Allp");
        stack1.push("Geeks");

        stack2.push("Geeks");
        stack2.push("4");
        stack2.push("For");
        stack2.push("Geeks");

        // Printing the Stack Elements
        System.out.println(stack1);
        System.out.println(stack2);

        stack1.pop();
        System.out.println(stack1);

        System.out.println("Peek");
        String peek = (String) stack1.peek();
        System.out.println(peek);

        stack1.pop();
        double peek2 = (double) stack1.peek();
        System.out.println(peek2);
    }
}
