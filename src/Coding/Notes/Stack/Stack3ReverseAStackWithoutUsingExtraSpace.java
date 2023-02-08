package Coding.Notes.Stack;

class Node {
    int val;
    Node next;

    Node (int val) {
        this.val = val;
        next = null;
    }
}

class Stack {
    Node top;

    void push (int val) {
        if (this.top==null) {
            Node node = new Node(val);
            this.top = node;
        } else {
            Node node = new Node(val);
            node.next = this.top;
            this.top = node;
        }
    }

    int pop () {
        int a = this.top.val;
        this.top = this.top.next;
        return a;
    }

    void reverse () {
        Node prev, cur, succ;
        cur = prev = this.top;
        cur = cur.next;
        prev.next = null;
        while (cur != null) {
            succ = cur.next;
            cur.next = prev;
            prev = cur;
            cur = succ;
        }
        this.top = prev;
    }
}

public class Stack3ReverseAStackWithoutUsingExtraSpace {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(9);
        stack.push(1);
        stack.push(23);
        stack.push(6);
        stack.push(19);
        stack.push(46);
        stack.push(500);
        stack.push(39);

        System.out.print(stack.pop()+" ");
        System.out.print(stack.pop()+" ");

        stack.reverse();

        System.out.print(stack.pop()+" ");
        System.out.print(stack.pop()+" ");
    }
}
