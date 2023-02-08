package Coding.LoveBabbar.Array;

public class Array19FindCommonElementsInThreeSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 5, 10, 20, 40, 80};
        int[] arr2 = new int[]{6, 10, 20, 40, 80, 100};
        int[] arr3 = new int[]{3, 4, 10, 15, 20, 30, 70, 80, 120};
        Boolean a, b;

        for (int i = 0; i < arr1.length; i++) {
            a = fun(arr2, arr1[i]);
            b = fun(arr3, arr1[i]);

            if (a == b && a == true) {
                System.out.print(arr1[i] + " ");
            }

        }
    }

    private static Boolean fun(int[] arr2, int num) {
        int s = 0, e = arr2.length - 1, m = s + (e - s) / 2;

        while (s <= e) {
            if (arr2[m] == num)
                return true;
            else if (arr2[m] > num) {
                e = m - 1;
                m = s + (e - s) / 2;
            } else {
                s = m + 1;
                m = s + (e - s) / 2;
            }
        }
        return false;
    }
}
