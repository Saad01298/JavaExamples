package Collection.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExamples {
    public static void main(String[] args) {

        // interface reference variable could point object of class that implemented it
        List<String> stringList1 = new ArrayList<>();
        stringList1.add("Mango");

        // Different constructors
        List<String> stringList2 = new ArrayList<>(3);
        List<String> stringList3 = new ArrayList<>(List.of("1", "2", "3"));
        List<String> stringList4 = new ArrayList();

        List list12 = Collections.synchronizedList(stringList3);

        List<Integer> primeNumbers = new ArrayList<Integer>(List.of(2,3,5,7,11));
        primeNumbers.add(13);
        System.out.println(primeNumbers);

        List<Integer> morePrimeNumbers = new ArrayList<>(primeNumbers);
        morePrimeNumbers.add(17);
        morePrimeNumbers.addAll(List.of(19,23));
        System.out.println(morePrimeNumbers);

        System.out.println("------------------------------------- Difference b/w add and set");
        morePrimeNumbers.set(3,29);
        System.out.println(morePrimeNumbers);

        morePrimeNumbers.add(3,167);
        System.out.println(morePrimeNumbers);

        morePrimeNumbers.remove(2); // this will shift elements left
        System.out.println(morePrimeNumbers);
        System.out.println(morePrimeNumbers.get(3));

        morePrimeNumbers.remove(3);
        System.out.println(stringList3);
        stringList3.remove("1");
        System.out.println(stringList3);

        morePrimeNumbers.add(3,7);
        System.out.println(morePrimeNumbers);

        System.out.println("Check: "+!morePrimeNumbers.isEmpty());

        List<String> firstList = new ArrayList<>(List.of("Saad", "Fahad", "Umar", "Aman", "Waji", "Adnan"));
        List<String> secondList = new ArrayList<>(List.of("Saad", "Aman"));

        System.out.println(firstList);
        firstList.removeAll(secondList);
        System.out.println(firstList);
        firstList.clear();
        System.out.println(firstList);

        System.out.println(morePrimeNumbers);

        for (Integer i : morePrimeNumbers) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < morePrimeNumbers.size(); i++) {
            System.out.print(" "+morePrimeNumbers.get(i));
        }

        // Iterator
        System.out.println("\nIterator Result");
        for (Iterator<Integer> iterator = morePrimeNumbers.iterator(); iterator.hasNext();) {
            System.out.print(String.valueOf(iterator.next())+" ");
        }
        
        morePrimeNumbers.stream().forEach(System.out::print);



    }
}
