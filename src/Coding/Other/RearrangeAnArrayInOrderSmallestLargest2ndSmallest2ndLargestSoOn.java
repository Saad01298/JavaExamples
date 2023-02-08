package Coding.Other;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class RearrangeAnArrayInOrderSmallestLargest2ndSmallest2ndLargestSoOn {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>(List.of(30,50,40,10,20,60,70,100,80,90));
        linkedList = linkedList.stream().sorted().collect(Collectors.toList());

        int l = linkedList.size()-1,n,m,flip = 1;

        n=0; m=l;
        while (l>0) {
            l--;
            n=n+1;

            if (flip == 1) {
                linkedList.add(n,linkedList.get(m));
                linkedList.remove(m+1);
                flip = 0;
            } else {
                flip = 1;
            }
        }

        linkedList.stream().forEach(k->System.out.print(k+" "));
    }
}
