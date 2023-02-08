package Lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodRef {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ABC", "qwerty", "pqrst");

        Consumer<String> con = new Consumer<String>() { //inbuilt interface
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        names.forEach(con);


        // Or we can write above as

        Consumer<String> con1 = s -> System.out.println(s);
        names.forEach(con1);

        // Above can be written as
        names.forEach(s->System.out.println(s));

        //Converting above code to method reference

        names.forEach(System.out::println);
      //i.e. names.forEach(Class::method);

    }
}
