package Coding.Other;

public class ReorderAnArrayAccordingToGivenIndexes {
    public static void main(String[] args) {
        int [] arr1 = new int[]{20,60,23,9,40,3,91,6};
        int [] arr2 = new int[]{4,2,6,1,5,0,3,7};
        int l = arr1.length, temp, n, m, p;

        for (int i = 0; i < l; i++) {
            n = i; m = arr2[i]; p=i;

            if (n==m)
                continue;

            if (arr2[arr2[i]]!=i)
                p--;

            swapValues(arr1,n,m);
            swapValues(arr2,n,m);

            i=p;
        }

        for (int i = 0; i < l; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.print("\n");
        for (int i = 0; i < l; i++) {
            System.out.print(arr2[i]+" ");
        }
    }

    private static void swapValues(int[] arr, int n, int m) {
        int temp;

        temp = arr[n];
        arr[n]=arr[m];
        arr[m]=temp;
    }
}
