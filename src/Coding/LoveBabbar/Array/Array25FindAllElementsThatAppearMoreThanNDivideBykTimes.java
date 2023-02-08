package Coding.LoveBabbar.Array;

import java.util.HashMap;
import java.util.Map;

public class Array25FindAllElementsThatAppearMoreThanNDivideBykTimes {
    public static void main(String[] args) {
        // traverse array, insert arr[i] in hashMap and if hashMap.contains(o)
        // then increase value by corresponding to that key

        int [] arr = new int[]{3, 1, 2, 5, 2, 1, 2, 3, 5, 5, 5, 3, 4, 1, 2, 3, 2, 2, 4, 1, 4, 5};
        int k = 5, a;

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (hashMap.containsKey(arr[i])) {
                a = hashMap.get(arr[i]) + 1;
                hashMap.put(arr[i],a);
            } else {
                hashMap.put(arr[i],1);
            }
        }

        for (Map.Entry<Integer,Integer> entry : hashMap.entrySet()) {
            if (entry.getValue()>arr.length/k) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
