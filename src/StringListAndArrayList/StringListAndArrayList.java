package StringListAndArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StringListAndArrayList {
    public static void main(String[] args) {
        String sd = "p ";
        sd = sd + "kasw";
        System.out.println(sd);
        sd.toUpperCase();
        System.out.println(sd);

        StringBuffer pd = new StringBuffer("sd");
        pd.setCharAt(0, 'p');
        System.out.println(pd);

        System.out.println("Array List");
        ArrayList<Character> alChar = new ArrayList<>(10);
        alChar.add('s');
        alChar.set(0,'f');
        alChar.stream().forEach(System.out::println);

        ArrayList<String> alString = new ArrayList<String>(Collections.singleton("My name is Java"));
        ArrayList<Integer> alInt = new ArrayList<Integer>();

        List<String> lString = new ArrayList<String>(Collections.singleton("I am Java"));
        List<Integer> lInt = new ArrayList<Integer>();
        lInt.add(4);

        String a[] = new String[] { "I am Java", "No, you are not Java", "Yes", "No" };
        List<String> list = Arrays.asList(a);
        List<String> list1 = list.stream().collect(Collectors.toList());
        list.stream().forEach(System.out::println);

        List<Integer> list3 = new ArrayList<Integer>(List.of(1,2,3,4,5));
        list3 = new ArrayList<>(Arrays.asList(2,3,4,5));

        List<String> gfg = new ArrayList<>(List.of("Geeks","for","Geeks"));
        ArrayList<String> gfg2 = new ArrayList<String>(Arrays.asList("Geeks","for","Geeks","2"));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3));
    }
}
