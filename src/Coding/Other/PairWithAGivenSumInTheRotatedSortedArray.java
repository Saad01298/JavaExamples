package Coding.Other;

import java.util.HashSet;

class ImprovedHashSet extends HashSet {
    public boolean add(Object o) {
        if (this.contains(o)) {
            return false;
        } else {
            super.add(o);
            return true;
        }
    }
}

public class PairWithAGivenSumInTheRotatedSortedArray {
    public static void main(String[] args) {
        int [] arr = new int[]{11, 15, 26, 38, 9, 10}; // {11, 15, 6, 8, 9, 10}
        int k = 45, flag = 0; // k = 16
        boolean check = true;

        ImprovedHashSet improvedHashSet = new ImprovedHashSet();
        for (int i = 0; i < arr.length; i++) {
            check = improvedHashSet.add(arr[i]);
            if (!check) {
                System.out.print("Yes, pair exists");
                flag = 1;
                break;
            }

            improvedHashSet.add(k-arr[i]);
        }

        if (flag == 0) {
            System.out.print("No, pair doesn't exists");
        }
    }
}