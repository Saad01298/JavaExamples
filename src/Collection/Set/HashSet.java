package Collection.Set;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class HashSet {
    public static void main(String[] args) {
        Set<String> set = new java.util.HashSet<>();
        set.add("Hello");
        set.add("Bye");
        set.add("Hello");

        System.out.println(set);

        set.add(null);
        set.add("Hallo");
        set.add(null);

        System.out.println("Checking null");
        System.out.println(set);

        Set<String> set1 = new java.util.HashSet<>(set);
        set1.add("Elements");
        System.out.println(set1);
        set.add("Element 2");

        set1.addAll(set);
        System.out.println(set1);

        set1.removeAll(set);
        System.out.println(set1);

        System.out.println(set1.remove("Hello"));
        System.out.println(set1.contains("Element 2"));
        System.out.println(set);

        for (String e : set) {
            System.out.print(e+" ");
        }

        List<String> stringList = set.stream().collect(Collectors.toList());
        stringList.stream().forEach(k->System.out.print(k+" "));


        System.out.println("\n\nIterator");
        for (Iterator<String> iterator = set.iterator(); iterator.hasNext();) {
            System.out.print(iterator.next() + " ");
        }
    }
}
