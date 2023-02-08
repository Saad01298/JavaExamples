package DS;

import java.util.LinkedList;

public class LinkList {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();

        // Adding elements to the linked list
        ll.add("A");
        System.out.println(ll);
        ll.add("B");
        System.out.println(ll);
        ll.add("W");
        System.out.println(ll);
        ll.addLast("C");
        System.out.println(ll);
        ll.addFirst("D");
        System.out.println(ll);
        ll.add(2, "E");
        System.out.println(ll);

        ll.remove("B");
        System.out.println(ll);
        ll.remove(3);
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
    }
}
