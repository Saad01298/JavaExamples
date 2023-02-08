package CollectionInterface.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExamples {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>(Set.of(1,20,6,3,89,35));
        integerSet.add(3);
        integerSet.add(2);
        integerSet.add(4);
        integerSet.add(12);

        Iterator iterator = integerSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }

        for (Integer i : integerSet) {
            System.out.print(i+" ");
        }
    }
}
