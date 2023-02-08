package Collection.List;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExamples {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        list.add(3);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(1,10);

        linkedList.add(23);
        linkedList.add(12);
        linkedList.addLast(10);
        linkedList.add(23);
        linkedList.add(23);

        System.out.println(list);

        System.out.println("-------------------------------------");
        list.add(0,11);
        System.out.println(list);


        list.add(2, 29);
        System.out.println("-------");
        System.out.println(list);

        list.set(2,17);
        System.out.println("---Set----");
        System.out.println(list);

        linkedList.addFirst(10);
        System.out.println(linkedList);

        System.out.println(linkedList);
        System.out.println(list);

        linkedList.remove();
        System.out.println(linkedList);
        linkedList.remove(2);
        System.out.println(linkedList);
        linkedList.removeFirstOccurrence(23);
        System.out.println(linkedList);
        linkedList.removeLastOccurrence(23);
        System.out.println(linkedList);
        //linkedList.clear();
        linkedList.removeAll(list);

        System.out.println(linkedList);
        System.out.println(list);

        System.out.println(linkedList.get(2));
    }
}
