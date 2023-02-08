package Coding.Other;

public class ElementAtGivenIndexAfterANumberOfRotations {
    public static void main(String[] args) {
        int [] arr = new int[]{1, 2, 3, 4, 5};
        int m = 2, k = 1;
        int[][] ranges = { { 0, 2 }, { 3, 4 } };

        // Moving k
        for (int i = m-1; i >= 0; i--) {
            if(k>=ranges[i][0] && k<=ranges[i][1]) {
                if (k==0)
                    k=ranges[i][1];
                else
                    k--;
            }
        }
        System.out.println("Ans: "+arr[k]);
    }
}
