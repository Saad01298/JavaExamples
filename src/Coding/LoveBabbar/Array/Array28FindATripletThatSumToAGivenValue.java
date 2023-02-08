package Coding.LoveBabbar.Array;

import java.util.Arrays;

public class Array28FindATripletThatSumToAGivenValue {
    public static void main(String[] args) {
        int [] arr = new int[]{1, 4, 45, 6, 10, 8};
        int sum = 22, l, r;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            l = 0; r = arr.length-1;
            while (l<r) {
                if (l==i) {
                    l++;
                } else if (r==i) {
                    r--;
                } else {
                    if (arr[i]+arr[l]+arr[r]>sum) {
                        r--;
                    } else if (arr[i]+arr[l]+arr[r]<sum) {
                        l++;
                    }
                    else {
                        System.out.print(arr[i]+", "+arr[l]+", "+arr[r]);
                        return;
                    }
                }
            }
        }
    }
}
