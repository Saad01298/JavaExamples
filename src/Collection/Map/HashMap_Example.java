package Collection.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap_Example {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Saad", 4);
        map.put("Zeba", 1);
        map.put("Siddiqa", 2);
        map.put("Urusa", 1);
        map.put("Fahad",9);

        System.out.println(map);

        map.put("Zeba", 10); // Override the previous value
        System.out.println(map);

        map.isEmpty();
        //map.clear();

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Fahad",9);
        System.out.println(map);

        // Below is Error
        //map.replaceAll(map2);

        /*BiFunction<String, Integer, Integer> biFunction = new BiFunction<String, Integer, Integer>() {
            @Override
            public Integer apply(String s, Integer integer) {
                return 1;
            }
        };*/

        System.out.print(map.keySet());
        Collection<Integer> collection = map.values();
        System.out.print("\n"+collection+"\n");


        for (Map.Entry<String,Integer> e : map.entrySet()) {
            System.out.print(e.getValue()+" ");
        }

        System.out.println("\nIterator");
        for (Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator(); iterator.hasNext();) {
            System.out.print(iterator.next().getValue()+" ");
        }

        // Java 8
        //System.out.println("\n");
        map.forEach((k,v)->System.out.print(v+" "));
    }
}
