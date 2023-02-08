package Coding.Notes.LinkedList;

class Node3 {
    int val;
    Node3 next;

    public Node3(int val) {
        this.val = val;
        this.next = null;
    }
}

class LinkedList3 {
    Node3 start;

    void push(int x) {
        if (start == null) {
            start = new Node3(x);
        } else {
            Node3 t = start;
            while (t.next != null) {
                t = t.next;
            }

            t.next = new Node3(x);
        }
    }
}


public class LinkedList3ReverseALinkedListInGroupOfSizeK {
    public static void main(String[] args) {
        LinkedList3 linkedList3 = new LinkedList3();
        linkedList3.push(1);
        linkedList3.push(2);
        linkedList3.push(3);
        linkedList3.push(4);
        linkedList3.push(5);
        linkedList3.push(6);
        linkedList3.push(7);
        linkedList3.push(8);
        linkedList3.push(9);

        int k = 2;

        Node3 head = reverse(linkedList3.start, k);

        while(head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    private static Node3 reverse(Node3 start, int k) {

        if (start == null) {
            return start;
        }

        Node3 prev, curr, next;
        prev = null;
        curr = start;
        next = curr.next;

        int p = k;

        while(p!=0 && curr != null) {
            curr.next = prev;
            prev = curr;
            curr = next;

            if (curr!=null)
                next = curr.next;

            p--;
        }

        if (curr != null)
            start.next = reverse(curr, k);

        return prev;
    }
}
