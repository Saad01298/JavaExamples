package Method;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(4,5,6,7,8);
        for (int i = 0; i<values.size(); i++){
            System.out.println(values.get(i));
        }

        for (int i : values){
            System.out.println(i);
        }

        // in lambda form
        values.forEach(i -> System.out.println(i)); // Lambda function in this line is implementation of consumer interface

        // forEach method takes object of Consumer

        Consumer<Integer> c = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };

        Consumer<Integer> c1 = (Integer i) -> {
            System.out.println(i);
        };

        Consumer<Integer> c2 = i -> System.out.println(i);

        values.forEach(c);
        values.forEach(c1);
        values.forEach(c2);
    }
}
