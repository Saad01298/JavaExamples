package Lambda;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

interface StringToPrint {
    void STPrint (String s);
}

interface Division {
    int operate (int a, int b);
}

interface Program {
    void result (List list);
}

class forMethod {
    public void IAmMethod(StringToPrint stringToPrint){
        stringToPrint.STPrint("Saad");
    }

    public void MethodForDivision(Division division){
        int x = division.operate(22,2);
        System.out.println(x);
    }

    public void givenProgram (Program program){
        List<String> list = Arrays.asList("Saad", "Fahad", "Umar", "Bilal", "Talha");
        program.result(list);
    }


    public Boolean tryingPredicate (Predicate predicate) {
        Boolean b;
        b = predicate.test(7);
        return b;
    }
}

public class FunctionalProgramingExample {
    public static void main(String[] args) {
        /*StringToPrint stringToPrint = s -> {
            String string = s + "Hello";
            System.out.println(string);
        };

        stringToPrint.STPrint("Saad ");*/

        System.out.println("--- Checking Optional ---");
        Optional<String> optional1 = Optional.empty();
        System.out.println(optional1);
        optional1 = Optional.of("I am Not Null");

        System.out.println(optional1);

        optional1.ifPresent(a -> System.out.println(a));
        Boolean ba = optional1.isPresent();
        System.out.println(ba);

        optional1 = Optional.empty();
        ba = optional1.isPresent();
        System.out.println(ba);

        String [] arr = new String[2];
        arr[0] = "R";

        Optional<String> optionalString = Optional.ofNullable(arr[1]);
        if (optionalString.isPresent())
            System.out.println(arr[1].toLowerCase(Locale.ROOT));
        else
            System.out.println("--  String not present  --");

        System.out.println("End this checking");

        Optional<String> optional = Optional.empty();
        optional.ifPresent(s -> System.out.println(s));

        optional = Optional.of("String - String");
        optional.ifPresent(s -> System.out.println(s));

        boolean present = optional.isPresent();
        System.out.println(present);

        System.out.println("------------------------------------------------------------------------");

        System.out.println("For Method");
        forMethod f = new forMethod();

        Predicate<Integer> predicateInt = k -> k.equals(7);
        predicateInt.test(4);

        Boolean dslr = (new forMethod()).tryingPredicate(predicateInt);
        System.out.println("Boolean Checking " + dslr);


        Boolean predicateResult = f.tryingPredicate((k)->{
            if (k.equals(5)) {
                return true;
            }
            else if (k.equals(6))
                return true;
            else
                return false;
        });
        System.out.println(predicateResult);

        Boolean result = f.tryingPredicate(a -> {
            Boolean b = false;
            if(a.equals(7))
                b = true;
            return b;
        });
        System.out.println(result);

        System.out.println("----------------------------------------");
        System.out.println("Simplified Predicate");
        //another simplified Predicate example, which doesn't require forMethod class!
        Predicate<Integer> predicate = x -> {
            if (x.equals(3))
                return true;
            else
                return false;
        };
        predicate.test(4);

        Predicate<String> predicate1 = s -> {
            if (s!=null)
                return true;
            else
                return false;
        };
        System.out.println(predicate1.test("Saad"));

        Predicate<Integer> predicate3 = s -> s.equals(4);
        predicate3.test(3);

        Predicate<String> predicate2 = s -> s.length()>4;

        Boolean b1 = predicate1.and(predicate2).test("Saad");
        System.out.println(b1);

        Boolean b2 = predicate1.and(predicate2).test("Saad Ali");
        System.out.println(b2);


        System.out.println("----------------------------------------");
        System.out.println("Example of Function<>");
        Function<String, Integer> functionNewI = k -> k.length();

        Function<Integer, String> function = d -> {
            if (d.equals(4))
                return "4";
            else
                return null;
        };
        System.out.println(function.apply(4));
        System.out.println(function.apply(3));

        Function<String, Integer> function1 = s -> s.length();
        System.out.println(function1.apply("Fahad"));

        Function<String, Boolean> function2 = s -> s.length()>5;
        System.out.println(function2.apply("Fahad"));

        Function<Integer, Integer> functionMul = n -> n*n;
        Function<Integer, Integer> functionAdd = n -> n+n;

        System.out.println("Function chaining");

        Function<Integer, Integer> square = k -> k*k;
        Function<Integer, Integer> sub = k -> k - 2;
        Function<Integer, Integer> mul = k -> k*3;

        int aR = square.andThen(sub).andThen(mul).apply(2);
        System.out.println("Result of Function Chaining: " + aR);

        int x = functionMul.andThen(functionAdd).apply(2);
        System.out.println(x);

        List<Integer> integerList1 = new ArrayList<Integer>(List.of(1,2,3,4,22,1,3,2,3,4,1,5));
        //List<Integer> integerList1 = new ArrayList<Integer>(List.of(1,3,2,3,4,1,5));
        List<Integer> finalresult = integerList1.stream().map(n->n*n).filter(n->n>4).distinct().collect(Collectors.toList());
        finalresult.stream().forEach(k->System.out.print(k + " "));


        System.out.println("------------------------------------------------------------------------");
        f.IAmMethod(s -> {
            String string = "Hello " + s;
            System.out.println(string);
        });

        f.IAmMethod(s -> {
            String s1 = "Bye " + s;
            System.out.println(s1);
        });


        f.MethodForDivision((a, b) -> a/b);

        f.MethodForDivision((a, b) -> {
            a = a+20;
            b = a-b-10;
            return (int)a/b;
        });


        f.givenProgram(list -> {
            for(Object s : list)
                System.out.println(s);
        });

        f.givenProgram(list -> {
            List<String> list1 = (List<String>) list.stream().sorted().collect(Collectors.toList());
            for(Object s : list1)
                System.out.println(s);
        });

        f.givenProgram(list -> {
            List<String> list1 = (List<String>) list.stream().sorted().collect(Collectors.toList());
            for (int i = 0; i<list1.size(); i++){
                if(list1.get(i).length()>4)
                    System.out.println(list1.get(i));
            }
        });
    }
}
