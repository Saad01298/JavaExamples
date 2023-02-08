package Coding.Notes.LinkedList;

class Node {
    int val;
    Node next;
    Node (int val) {
        this.val = val;
        this.next = null;
    }
}

class LinkedList {
    Node start;

    void push (int x) {
        if (start == null) {
            start = new Node(x);
        } else {
            Node t = start;
            while (t.next != null) {
                t = t.next;
            }

            t.next = new Node(x);
        }
    }

    int remove () {
        return 0;
    }

    void swap (int a, int b) {
        Node xp, x, yp, y;

        x = start;
        while (x.val!=a) {
            x=x.next;
        }

        if (x.val != start.val) {
            xp=start;
            while (xp.next!=x) {
                xp=xp.next;
            }
        } else {
            xp = null;
        }


        y = start;
        while (y.val!=b) {
            y=y.next;
        }

        yp=start;
        while (yp.next!=y) {
            yp=yp.next;
        }

        if (xp!=null)
            xp.next = y;
        else
            start = y;
        yp.next = x;


        xp = x.next;
        yp = y.next;

        x.next = yp;
        y.next = xp;
    }
}

public class LinkedList2SwapNodesInALinkedListWithoutSwappingData {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.push(9);
        linkedList.push(2);
        linkedList.push(10);
        linkedList.push(6);
        linkedList.push(1);
        linkedList.push(8);
        linkedList.push(4);
        linkedList.push(11);
        linkedList.push(3);

        for (Node n = linkedList.start; n != null; n=n.next) {
            System.out.print(n.val+" ");
        }
        System.out.print("\n");
        linkedList.swap(9,3);

        for (Node n = linkedList.start; n != null; n=n.next) {
            System.out.print(n.val+" ");
        }
        System.out.print("\n");
        linkedList.swap(10,4);

        for (Node n = linkedList.start; n != null; n=n.next) {
            System.out.print(n.val+" ");
        }
    }
}
