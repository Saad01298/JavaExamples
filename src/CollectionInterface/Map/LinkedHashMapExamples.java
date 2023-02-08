package CollectionInterface.Map;

import java.util.*;

public class LinkedHashMapExamples {
    public static void main(String[] args) {
        Map<Integer, String> integerStringMap = new LinkedHashMap<>(
                Map.of(3, "qwe", 4, "asd", 2, "cvb")
        );

        Iterator iterator = integerStringMap.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }

        System.out.println();

        Set<Integer> set = integerStringMap.keySet();
        for (Integer i : set) {
            System.out.print(integerStringMap.get(i)+" ");
        }

        integerStringMap.put(1, "Saad");
        integerStringMap.put(5, "Fahad");
        integerStringMap.put(10, "Umar");
        integerStringMap.put(11, "Umar");

        set = integerStringMap.keySet();
        for (Integer i : set) {
            System.out.print(i+" -> "+integerStringMap.get(i)+", \n");
        }
    }
}
