package CollectionInterface.List;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorExamples {
    public static void main(String[] args) {
        List<String> stringList = new Vector<>();
        Vector<String> stringVector = new Vector<>(List.of("asd", "fgh", "jkl", "asd"));

        Iterator iterator = stringVector.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }

        stringVector.set(2, "rty");
        System.out.println(stringVector.size());
        stringVector.setSize(19);

        System.out.println(stringVector.size());


    }
}
