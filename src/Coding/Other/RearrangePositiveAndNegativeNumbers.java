package Coding.Other;

public class RearrangePositiveAndNegativeNumbers {
    public static void main(String[] args) {
        int [] arr = new int[]{5, 5, -3, 4, -8, 0, -7, 3, -9, -3, 9, -2, 1};
        int k = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0) {
                rightCirculate(arr,k,i);
                k++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void rightCirculate(int[] arr, int k, int l) {
        int temp;

        temp = arr[l];
        for (int i = l; i > k; i--) {
            arr[i]=arr[i-1];
        }
        arr[k]=temp;
    }
}
