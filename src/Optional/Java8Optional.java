package Optional;

import java.util.Optional;

public class Java8Optional {
    public static void main(String[] args) {
        Optional<String> optional1 = Optional.empty();
        System.out.println(optional1);

        Optional<String> optional2 = Optional.of("Second");
        System.out.println(optional2);

        Optional<String> optional2b = Optional.of("Second");
        System.out.println(optional2b.get());

        Optional<String> optional3 = Optional.ofNullable("Third");
        System.out.println(optional3);

        Optional<String> optional3b = Optional.ofNullable("Third");
        System.out.println(optional3b.get());


        String [] arr = new String[2];
        arr[0] = "ABC";

        Optional<String> optionalR2 = Optional.ofNullable(arr[1]);
        if (optionalR2.isPresent())
            System.out.println("Present -------");

        System.out.println("-------------------ASD------------------");

        /*Optional<String> optionalR = Optional.of(arr[1]);
        if (optionalR.isPresent())
            System.out.println("Present -------");*/



        //See below 2 results are different!
        System.out.println("orElse example");
        String s1 = "nullpp", s4 = null;
        String s2 = Optional.ofNullable(s1).orElse("Other value");
        String s3 = Optional.ofNullable(s4).orElse("Other value");
        String s5 = Optional.of(s1).orElse("Other value 2");
        //String s6 = Optional.of(s4).orElse("Other value 2");
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("Optional.of -------");
        System.out.println(s5);
        //System.out.println(s6);

        System.out.println("-------------------------");
        Optional<String> optional4 = Optional.ofNullable(s1);
        System.out.println(optional4);

        String country = null;
        Optional<String> opt = Optional.ofNullable(country);
        System.out.println(opt.orElse("India"));

        String city = null;
        String s56 = Optional.ofNullable(city).orElse("kanpur");

    }
}
