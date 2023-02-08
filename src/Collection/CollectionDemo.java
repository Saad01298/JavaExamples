package Collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> stringCollection = new ArrayList<>();
        stringCollection.add("Hello,");
        stringCollection.add("I am String.");
        stringCollection.add("Who are");
        stringCollection.add("you?");

        System.out.println(stringCollection);

        stringCollection.remove("you?");
        System.out.println(stringCollection);

        stringCollection.add("you?");
        stringCollection.forEach(k->System.out.print(k+" "));

    }
}
