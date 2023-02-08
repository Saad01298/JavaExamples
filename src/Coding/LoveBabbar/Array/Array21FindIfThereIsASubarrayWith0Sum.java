package Coding.LoveBabbar.Array;

import java.util.HashSet;

class ImprovedHashSet extends HashSet {
    @Override
    public boolean add(Object o) {
        if (this.contains(o))
            return false;
        else {
            return super.add(o);
        }
    }
}

public class Array21FindIfThereIsASubarrayWith0Sum {
    public static void main(String[] args) {
        int [] arr = new int[]{1,-1,4,4}; // 1,1,4,-4  // 1,1,4,-4,1,1
        int c=0, sum = arr[0];
        ImprovedHashSet improvedHashSet = new ImprovedHashSet();
        Boolean b = true;

        // if arr contain 0, return true
        for (int i = 0; i < arr.length; i++)
            if (arr[i]==0) {
                System.out.println(true);
                return;
            }


        // if arr contain all positive, return false
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0)
                c++;
        }
        if (c == arr.length) {
            System.out.println(false);
            return;
        }


        // if arr contain both positive and negative numbers
        improvedHashSet.add(sum);
        for (int i = 1; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum==0) {
                System.out.println(true);
                return;
            }
            b = improvedHashSet.add(sum);
            if (b == false) {
                System.out.println(true);
                return;
            }
        }

        if (b==true)
            System.out.println(false);
    }
}
