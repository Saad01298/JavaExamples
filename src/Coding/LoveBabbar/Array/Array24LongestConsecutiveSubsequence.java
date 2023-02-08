package Coding.LoveBabbar.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Array24LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        int [] arr = new int[]{36, 37, 38, 39, 46, 41, 56, 35, 45, 44, 33, 34, 92, 43, 31, 32, 42, 47};
        int ans = 1, num, c = 0;

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++)
            hashSet.add(arr[i]);

        for (int i = 0; i < arr.length; i++) {
            num = arr[i];
            if (!hashSet.contains(num-1)) { // Check if num is starting of sequence or not
                c++;
                num++;
                while (hashSet.contains(num)) {
                    c++;
                    num++;

                    if (ans < c)
                        ans = c;
                }
            }
            c = 0;
        }

        System.out.println(ans);
    }
}
