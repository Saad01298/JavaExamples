package CollectionInterface.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExamples {
    public static void main(String[] args) {
        Set<Integer> integerSet = new LinkedHashSet<>();
        integerSet.add(23);
        integerSet.add(1);
        integerSet.add(34);
        integerSet.add(3);
        integerSet.add(45);
        integerSet.add(2);
        integerSet.add(3);
        integerSet.add(45);

        for (Integer i : integerSet) {
            System.out.print(i+" ");
        }
    }
}
