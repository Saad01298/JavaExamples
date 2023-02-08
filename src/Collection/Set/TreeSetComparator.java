package Collection.Set;// Java code to illustrate the use of comparator()
// While using a specific comparator

// Importing Comparator and TreeSet classes
// from java.util package
import java.util.Comparator;
import java.util.TreeSet;

// Class 1
// Helper class
class Helper implements Comparator<String> {

    // Method
    // To compare two strings
    public int compare(String str1, String str2)
    {

        String first_Str;
        String second_Str;

        first_Str = str1;
        second_Str = str2;

        // using compareTo() to ensure
        return second_Str.compareTo(first_Str);
    }
}

// Main class
// TreeSetDemo class
public class TreeSetComparator {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating an empty TreeSet of string type
        TreeSet<String> tree_set = new TreeSet<String>();

        // Adding elements to our TreeSet object
        // using add() method
        tree_set.add("G");
        tree_set.add("E");
        tree_set.add("E");
        tree_set.add("K");
        tree_set.add("S");
        tree_set.add("4");

        // Printing elements in set before using comparator
        System.out.println("Set before using the comparator: " + tree_set);

        // Again creating an empty TreeSet of string type
        // with reference to Helper class
        TreeSet<String> tree_set1 = new TreeSet<String>(new Helper());

        // Adding elements to our TreeSet object
        // using add() method
        tree_set1.add("G");
        tree_set1.add("E");
        tree_set1.add("E");
        tree_set1.add("K");
        tree_set1.add("S");
        tree_set1.add("4");

        // Printing elements in set before using comparator
        System.out.println("The elements sorted in descending order:" + tree_set1);
    }
}
