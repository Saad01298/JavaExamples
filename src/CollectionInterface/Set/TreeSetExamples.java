package CollectionInterface.Set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExamples {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(30);
        treeSet.add(29);
        treeSet.add(13);
        //treeSet.add(null);
        treeSet.add(29);
        //treeSet.add(null);

        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }

        System.out.print("\n");
        for (Integer i : treeSet) {
            System.out.print(i+" ");
        }
    }
}
