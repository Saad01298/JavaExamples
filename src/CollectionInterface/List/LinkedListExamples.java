package CollectionInterface.List;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExamples {
    public static void main(String[] args) {
        List<String> stringList1 = new LinkedList<>();
        List<String> stringList2 = new LinkedList<>(List.of("asd", "asd", "qwe", "rty"));
        LinkedList<String> stringLinkedList = new LinkedList<String>(List.of("asd", "rty", "blvmk"));

        Iterator iterator = stringList2.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
    }
}
