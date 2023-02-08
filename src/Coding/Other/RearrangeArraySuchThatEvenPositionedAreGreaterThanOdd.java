package Coding.Other;

import java.util.Arrays;

public class RearrangeArraySuchThatEvenPositionedAreGreaterThanOdd {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        int l = arr.length,temp=0;
        int n,m,flip,swap;
        Arrays.sort(arr);

        if (l%2!=0) {
            m = 1;
            n = l - 1;
        } else {
            m = 1;
            n = l - 2;
        }

        flip=1;
        while(n>m) {
            if (flip==1) {
                swap=arr[n];
                arr[n]=arr[m];
                arr[m]=swap;
                flip = 0;
            }
            else {
                flip = 1;
            }
            n--;
            m++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
