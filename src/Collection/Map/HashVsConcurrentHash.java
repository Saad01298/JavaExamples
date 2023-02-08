package Collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashVsConcurrentHash {
    public static void main(String[] args) {
        Map<Integer, String> mapHash = new HashMap<>();

        mapHash.put(1, "One");
        mapHash.put(1, "Two");
        mapHash.put(1, "One");
        mapHash.put(2, "One");

        System.out.println(mapHash);

        System.out.println("10");
        mapHash.put(null, null);
        System.out.println("11");
        mapHash.put(1, null);
        System.out.println("12");
        mapHash.put(null, "1");
        System.out.println("13");
        mapHash.put(2, "2");
        System.out.println("14");

        Map<Integer, String> mapConcurrent = new ConcurrentHashMap<>();
        //mapConcurrent.put(null, null);
        System.out.println("15");
        //mapConcurrent.put(1, null);
        System.out.println("16");
        //mapConcurrent.put(null, "1");
        System.out.println("17");
        mapConcurrent.put(2, "2");
        System.out.println("18");

    }
}
