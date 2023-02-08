package CollectionInterface.Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExamples {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "asd");
        treeMap.put(10, "qwe");
        treeMap.put(2, "try");
        treeMap.put(7, "cvb");
        treeMap.put(5, "una");

        System.out.print(treeMap);

        Iterator iterator = treeMap.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }

        Set<Integer> set = treeMap.keySet();
        for (Integer i : set) {
            System.out.print(i+" -> " + treeMap.get(i) + ", \n");
        }

    }
}
