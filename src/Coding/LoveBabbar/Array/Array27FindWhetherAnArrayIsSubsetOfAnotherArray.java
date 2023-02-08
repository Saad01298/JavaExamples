package Coding.LoveBabbar.Array;

import java.util.HashSet;

public class Array27FindWhetherAnArrayIsSubsetOfAnotherArray {
    public static void main(String[] args) {
        int [] arr1 = new int[]{11, 1, 13, 21, 3, 7};
        int [] arr2 = new int[]{11, 3, 7, 1};

        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            hashSet.add(arr1[i]);
        }

        Boolean a = true;
        for (int i = 0; i < arr2.length; i++) {
            if (!hashSet.contains(arr2[i])) {
                a = false;
            }
        }

        System.out.print(a);
    }
}
