package Coding.LoveBabbar.Array;

import java.util.ArrayList;
import java.util.List;

public class Array11FindDuplicateInAnArrayOfNPlus1Integers {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(3,4,4,1,2));
        int swap;
        for (int i = 1; i < arrayList.size(); i++) {
            swap = arrayList.get(0);
            arrayList.set(0, arrayList.get(swap));
            arrayList.set(swap, swap);
        }

        System.out.println(arrayList.get(0));
    }
}
