package Coding.Other;

public class SplitTheArrayAndAddTheFirstPartToTheEnd {
    public static void main(String[] args) {
        int [] arr = new int[]{12, 10, 5, 6, 52, 36};
        int k = 2, l = 0, r = k-1, num = 0;

        while(l<r) {
            num = arr[l];
            arr[l] = arr[r];
            arr[r] = num;
            l++;
            r--;
        }

        l = k;
        r = arr.length-1;
        while(l<r) {
            num = arr[l];
            arr[l] = arr[r];
            arr[r] = num;
            l++;
            r--;
        }

        l = 0;
        r = arr.length-1;
        while(l<r) {
            num = arr[l];
            arr[l] = arr[r];
            arr[r] = num;
            l++;
            r--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
