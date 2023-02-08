package Coding.LoveBabbar.Array;

import java.util.ArrayList;
import java.util.List;

public class Array15LexicographicallyNextPermutation {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3}; // 1,5,8,4,7,6,5,3,1  //1,2,3
        int n=0,num=0,m=arr.length-1,p,j;

        // move i from n-1 to 1; and find i-1 where arr[i]>arr[i-1]
        for (int i = arr.length-1; i > 0; i--) {
            if (arr[i]>arr[i-1]) {
                n=i-1;
                num=arr[n];
                break;
            }
        }

        // move i from n to length-1; and find i+1 where arr[i+1]>num
        for (int i = n; i < arr.length-1; i++) {
            if (arr[i+1]>num) {
                m=i+1;
            }
        }

        // swap arr[n] and arr[m]
        num=arr[n];
        arr[n]=arr[m];
        arr[m]=num;

        // reverse array from length-1 to n+1
        p=n+1; j= arr.length-1;
        while (p<j) {
            num=arr[p];
            arr[p]=arr[j];
            arr[j]=num;

            p++; j--;
        }

        // print answer
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k]+" ");
        }
    }
}
