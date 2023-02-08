package Collection.Map;

import java.util.LinkedHashMap;

public class LinkedHashMap_Example {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> hm
                = new LinkedHashMap<Integer, String>();

        // Inserting the Elements
        // using put() method
        hm.put(3, "Geeks");
        hm.put(2, "Geeks");
        hm.put(1, "Geeks");
        hm.put(4, "For");

        // Printing the mappings to the console
        System.out.println("Initial Map : " + hm);

        // Removing the mapping with Key 4
        hm.remove(4);

        // Printing the updated map
        System.out.println("Updated Map : " + hm);
    }
}
