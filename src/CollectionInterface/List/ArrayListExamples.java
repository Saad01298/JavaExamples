package CollectionInterface.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExamples {
    public static void main(String[] args) {
        List<String> stringList1 = new ArrayList<>();
        List<String> stringList2 = new ArrayList<>(3);
        List<String> stringList3 = new ArrayList<>(List.of("1", "2", "3"));
        List<String> stringList4 = new ArrayList();

        ArrayList<String> arrayList = new ArrayList<>();

        stringList1.add("asd");
        stringList1.add(null);
        stringList1.add("qwe");
        stringList1.add("rty");
        stringList1.add(null);
        stringList1.add("qwe");

        for (String l : stringList1) {
            System.out.print(l+" ");
        }

        System.out.print("\n");

        Iterator iterator = stringList1.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
    }
}
