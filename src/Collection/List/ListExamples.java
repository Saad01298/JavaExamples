package Collection.List;

import java.util.ArrayList;
import java.util.List;

public class ListExamples {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        // list allows to have duplicate elements
        list.add("element1");
        list.add("element1");
        list.add("element2");
        list.add("element1");
        System.out.println(list);

        // list can have null
        list.add(null);
        list.add("null");
        list.add(null);
        System.out.println(list);

        // list maintain insertion order

        // access element from list
        System.out.println(list.get(3));


    }
}
