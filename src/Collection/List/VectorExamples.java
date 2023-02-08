package Collection.List;

import java.util.List;
import java.util.Vector;

public class VectorExamples {
    public static void main(String[] args) {

        // Interface referencing variable = object of class that implemented it
        List<Integer> listVector = new Vector<>();
        listVector.add(2);
        listVector.add(0,1);
        listVector.add(2,10);
        listVector.add(1, 9);
        listVector.add(0,1);
        listVector.add(2,10);
        listVector.add(1, 9);

        System.out.println(listVector);

        for (int i : listVector) {
            System.out.print(i+" ");
        }
    }
}
