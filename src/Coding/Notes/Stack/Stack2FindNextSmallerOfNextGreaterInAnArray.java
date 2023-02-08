package Coding.Notes.Stack;

public class Stack2FindNextSmallerOfNextGreaterInAnArray {
    public static void main(String[] args) {
        int [] arr = new int[]{4, 8, 2, 1, 9, 5, 6, 3};
        int flip = 0, a, check = 0;

        for (int i = 0; i < arr.length; i++) {
            a = arr[i];
            for (int j = i; j < arr.length; j++) {
                if (flip == 0) {
                    if (arr[j]>a) {
                        a = arr[j];
                        flip = 1;
                    }
                } else {
                    if (arr[j]<a) {
                        check = 1;
                        System.out.print(arr[j]+" ");
                        break;
                    }
                }
            }

            if (check == 0)
                System.out.print(-1+" ");

            flip = 0;
            check = 0;
        }
    }
}
