package Collection.Map;// Java program to demonstrate comparator() Method
// for Reverse Ordering

// Importing required classes
import java.util.*;

// Main class
public class TreeMapComparator {

    // Main driver method
    public static void main(String[] argv) throws Exception
    {

        // Try block to check for exceptions
        try {

            // Creating an empty TreeMap
            NavigableMap<Integer, String> treemap
                    = new TreeMap<Integer, String>(
                    Collections.reverseOrder());

            // Populating TreeMap
            // using put() method
            treemap.put(1, "one");
            treemap.put(2, "two");
            treemap.put(3, "three");
            treemap.put(4, "four");
            treemap.put(5, "five");

            // Printing the TreeMap
            System.out.println("TreeMap: " + treemap);

            // Getting used Comparator in the map
            // using comparator() method
            Comparator comp = treemap.comparator();

            // Printing the comparator value
            System.out.println("Comparator value: " + comp);
        }

        // Catch block to handle the exceptions
        catch (NullPointerException e) {

            // Display message if exception occurs
            System.out.println("Exception thrown : " + e);
        }
    }
}
