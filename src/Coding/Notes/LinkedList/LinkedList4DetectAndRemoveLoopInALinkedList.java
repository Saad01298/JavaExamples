package Coding.Notes.LinkedList;

class Node4 {
    int val;
    Node4 next;

    public Node4(int val) {
        this.val = val;
        this.next = null;
    }
}

class LinkedList4 {
    Node4 start;

    void push (int x) {
        if (start == null) {
            start = new Node4(x);
        } else {
            Node4 t = start;
            while (t.next!=null) {
                t=t.next;
            }
            t.next = new Node4(x);
        }
    }


    void createLoop(int y) {
        Node4 t = start;
        while (t.val != y)
            t = t.next;

        Node4 t1 = start;
        while (t1.next != null)
            t1 = t1.next;

        t1.next = t;
    }
}

public class LinkedList4DetectAndRemoveLoopInALinkedList {
    public static void main(String[] args) {
        LinkedList4 linkedList4 = new LinkedList4();
        linkedList4.push(1);
        linkedList4.push(2);
        linkedList4.push(3);
        linkedList4.push(4);
        linkedList4.push(5);
        linkedList4.push(6);
        linkedList4.push(7);
        linkedList4.push(8);
        linkedList4.push(9);
        linkedList4.push(10);
        linkedList4.push(11);
        linkedList4.push(12);

        linkedList4.createLoop(4);


        Node4 p1 = linkedList4.start, p2 = linkedList4.start;
        while (true) {
            p1 = p1.next;
            p2 = p2.next.next;

            if (p1 == p2)
                break;
        }

        Node4 p3 = linkedList4.start;
        while (true) {
            int flag = 0;
            while (p2.next!=p1) {
                if (p2.next == p3) {
                    flag = 1;
                    p2.next = null;
                    break;
                }
                p2=p2.next;
            }
            if (flag == 1) {
                break;
            }

            p3 = p3.next;
            p2=p1;
        }

        Node4 t = linkedList4.start;
        while (t!=null) {
            System.out.print(t.val+" ");
            t=t.next;
        }
    }
}
