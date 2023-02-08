package StreamExample;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Stream_Example {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(2,1,7,6,5,4,3,4);
        Stream<Integer> s = values.stream();
        //s.sorted();
        //values.stream().sorted().forEach(System.out::print);

        // Note: Stream could be utilized only once (i.e. can't be re-used)

        // filter only filtered data while map updated data in the given way
        values.stream().filter(a -> a < 4).map(n -> n*n).sorted().forEach(System.out::print);

        int [] arr = {3,1,5,7,2,6,9,8,4};
        Arrays.stream(arr).filter(a -> a > 3).sorted().forEach(System.out::print);

        // Why below code giving error?
        //List<Integer> list = Arrays.stream(arr).filter(a -> a > 4).sorted().collect(Collectors.toList());
        //List<Integer> list = Arrays.stream(arr).filter(a -> a > 4).sorted().collect(Collectors.toCollection(List::new));

        Stream<Integer> stream = Stream.of(1,2,3);

        System.out.println("");
        Stream<Integer> stream1 = Stream.iterate(1, k -> (k*2)+1).limit(10);
        stream1.forEach(k->System.out.print(k+" "));

        System.out.println("");
        Stream.generate(() -> new Random().nextInt(20)).limit(10).forEach(k->System.out.print(k+" "));

        //Didn't understood
        System.out.println("\nTake While");
        Stream.generate(()->(new Random()).nextInt(1000)).takeWhile(n->n<=500).forEach(k->System.out.print(k+" "));

        // Instead of range, if rangeClosed is used, then starting and ending values will also be considered
        System.out.println("\nRange");
        IntStream.range(0,10).forEach(System.out::print);

        List<Integer> list = Arrays.asList(1,6,2,9,3,4);
        List<Integer> list2 = list.stream().filter(k-> {
            if (k%2 == 0)
                return true;
            return false;
        }).collect(Collectors.toList());

        System.out.println("Collectors");
        list2.stream().forEach(System.out::print);


        List<Integer> primeNumbers = Arrays.asList(2,3,5,7,11);
        List<Integer> evenNumbers = Arrays.asList(2,4,6,8,10);
        List<Integer> oddNumbers = Arrays.asList(1,3,5,7,9,11);

        List<List<Integer>> listList =Arrays.asList(primeNumbers, evenNumbers, oddNumbers);

        //Unexpected result
        System.out.println("List in List");
        listList.stream().map(k -> k.stream().map(a->a>3).collect(Collectors.toList())).distinct().forEach(System.out::print);

        System.out.println("List in List");
        //flatMap - Converts list of list to list
        List<Integer> integerList = listList.stream().flatMap(list4 -> list4.stream()).collect(Collectors.toList());
        integerList.stream().filter(n->n!=3).filter(n->n!=2).forEach(k->System.out.print(k+" "));

        List<Integer> li = Arrays.asList(-9, -18, 0, 25, 4);
        list.stream().sorted().forEach(System.out::println);

        List<String> liStr = new ArrayList<String>(List.of("abc", "", "bc", "efg", "abcd","", "jkl"));
        String mergedString = liStr.stream().filter(string ->!string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("Merged String: " + mergedString);


        System.out.println("------------------- Set");
        Set<Integer> set = new HashSet<Integer>(Set.of(1,2,6,3));
        set.stream().forEach(System.out::print);


    }
}
