package Coding.Other;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,5,6,7,8,9};
        int d = 2;

        // if only printing is required
        int k = d%arr.length, j = 0;
        while(j < arr.length) {
            System.out.print(arr[k]+" ");
            k = (k+1)%arr.length;
            j++;
        }


        // Changing in origional array with O(n) extra space
        d = d%arr.length;
        int[] subArray1 = Arrays.copyOfRange(arr, 0, d);
        int[] subArray2 = Arrays.copyOfRange(arr, d, arr.length);

        System.out.println("\n\nAsk regarding below results/lengths");
        System.out.println(subArray1.length);
        System.out.println(subArray1.length);
        System.out.println(arr.length);

        System.arraycopy(subArray2, 0, arr, 0, subArray2.length);
        System.arraycopy(subArray1, 0, arr, subArray2.length, subArray1.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
