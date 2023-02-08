package Coding.LoveBabbar.Array;

import java.util.ArrayList;
import java.util.HashMap;

public class Array18CountPairsWithGivenSum {
    public static void main(String[] args) {
        int [] arr = new int[]{1, 5, 7, -1, 5, 1, 1, 5};
        int sum = 6, count = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        HashMap<Integer, ArrayList<Integer>> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (hashMap.containsKey(arr[i])) {
                count += hashMap.get(arr[i]).size();
            }

            if (hashMap.containsKey(sum-arr[i])) {
                arrayList = hashMap.get(sum-arr[i]);
                arrayList.add(i);
                hashMap.put(sum-arr[i],arrayList);
            } else {
                arrayList = new ArrayList<>();
                arrayList.add(i);
                hashMap.put(sum-arr[i],arrayList);
            }
        }

        System.out.println(count);
    }
}
