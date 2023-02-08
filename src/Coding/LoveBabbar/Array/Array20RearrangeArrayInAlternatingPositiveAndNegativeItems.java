package Coding.LoveBabbar.Array;

public class Array20RearrangeArrayInAlternatingPositiveAndNegativeItems {
    public static void main(String[] args) {

        int [] arr = new int[]{-5, -2, 5, 2, 4, -4, 6, -19, -3, 7, 1, 8, 0, -8};
        int l = arr.length, t = 0, p = 0;

        for (int i = 0; i < l; i++) {
            for (int j = 1; j < l; j++) {
                if(arr[j-1]>=0 && arr[j]<0) {
                    t = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=t;
                }
            }
        }

        for (int i = 0; i < l; i++) {
            if (arr[i]<0)
                p++;
        }

        int x = 1, m = 1, r = p;
        while(x<r) {
            rightCirculateArr(arr,m,p);
            x = x + 1;
            m = m + 2;
            p = p + 1;
        }

        for (int i = 0; i < l; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void rightCirculateArr(int[] arr, int m, int n) {
        int temp = 0;
        for (int i = n; i > m; i--) {
            temp = arr[i-1];
            arr[i-1]=arr[i];
            arr[i]=temp;
        }
    }
}
