package Coding.Other;

public class MoveAllZeroesToEndOfArray {
    public static void main(String[] args) {
        int [] arr = new int[]{1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};
        int n = 0, p = arr.length - 1, q = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0) {
                arr[q++]=arr[i];
            }
        }

        for (int i = q; i < arr.length; i++) {
            arr[i]=0;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    /*private static int nearestNonZero(int[] arr, int p) {
        int k = p;
        for (int i = p; i >= 0; i--) {
            if(arr[i]>0) {
                k=i;
                break;
            }
        }
        return k;
    }

    private static int nearestZero(int[] arr, int n) {
        int k = n;
        for (int i = n; i < arr.length; i++) {
            if(arr[i]==0) {
                k=i;
                break;
            }
        }
        return k;
    }*/
}
