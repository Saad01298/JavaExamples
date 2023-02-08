package Coding.Other;

public class DoubleTheFirstElementAndMoveZeroToEnd {
    public static void main(String[] args) {
        int [] arr = new int[]{0, 2, 2, 2, 0, 6, 6, 0, 0, 8};

        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==arr[i+1]&&arr[i]!=0) {
                arr[i]=arr[i]*2;
                arr[i+1]=0;
            }
        }

        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0) {
                arr[k++]=arr[i];
            }
        }

        for (int i = k; i < arr.length; i++) {
            arr[i]=0;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
