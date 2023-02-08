package CollectionInterface.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExamples {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(Map.of("asd", 3, "qsawe", 4, "tyu", 10));

        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }

        System.out.print("\n");
        map.forEach((m,n) -> {
            if (m.length()>4)
                System.out.print(m+" -> "+n);
        });

        map.get("asd");
        map.put("asd", 90);
        map.put(null, 34);

        System.out.println();
        for (Map.Entry <String, Integer> m : map.entrySet()) {
            System.out.println(m.getKey() + "::" + m.getValue());
        }
    }
}
