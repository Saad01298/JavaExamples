package Coding.Other;

import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args) {
        // Question: Rearrange array such that arr[i] >= arr[j] if i is even and arr[i]<=arr[j] if i is odd and j < i

        int [] arr = new int[]{1, 2, 1, 4, 5, 6, 8, 8};
        int l = arr.length, flag = 1, k = l-1,i,j;
        int [] arr1 = new int[l];

        Arrays.sort(arr);
        /*for (i = 0; i < l; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println("");*/

        if (l%2==0)
            flag = 1;
        else
            flag = 0;

        i=l-1;
        j=0;
        while(i>=j) {
            if (flag == 1) {
                arr1[k--]=arr[i--];
                flag = 0;
            } else {
                arr1[k--]=arr[j++];
                flag = 1;
            }
        }

        for (i = 0; i < l; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
}
