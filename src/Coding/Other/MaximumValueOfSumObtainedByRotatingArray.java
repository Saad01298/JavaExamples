package Coding.Other;

public class MaximumValueOfSumObtainedByRotatingArray {
    public static void main(String[] args) {
        // Find maximum value of Sum( i*arr[i]) with only rotations on given array allowed

        // Hint: R0 = summation of (i*arr[i])
        // and   R1 = R0 + sum of all array elements - (n*arr[n-1])
        // and   R2 = R1 + sum of all array elements - (n*arr[n-2))


        // Hint Explanation:
        // Let us calculate initial value of i*arr[i] with no rotation
        // R0 = 0*arr[0] + 1*arr[1] +…+ (n-1)*arr[n-1]
        //
        // After 1 rotation arr[n-1], becomes first element of array,
        //
        // arr[0] becomes second element, arr[1] becomes third element and so on.
        // R1 = 0*arr[n-1] + 1*arr[0] +…+ (n-1)*arr[n-2]
        // R1 – R0 = arr[0] + arr[1] + … + arr[n-2] – (n-1)*arr[n-1]
        // After 2 rotations arr[n-2], becomes first element of array,
        //
        // arr[n-1] becomes second element, arr[0] becomes third element and so on.
        // R2 = 0*arr[n-2] + 1*arr[n-1] +…+ (n-1)*arr[n-3]
        // R2 – R1 = arr[0] + arr[1] + … + arr[n-3] – (n-1)*arr[n-2] + arr[n-1]
        // If we take a closer look at above values, we can observe below pattern
        // Rj – Rj-1 = arrSum – n * arr[n-j],
        // Where arrSum is sum of all array elements, i.e.,  arrSum = ∑ arr[i] , 0 ≤ i ≤ N-1



        int [] arr = new int[] {10, 1, 2, 3, 4, 5, 6, 7, 8, 9}; // {1, 20, 2, 10};
        int sum = 0, R0 = 0, ans = R0, Ri;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            R0 = R0 + i*arr[i];
        }

        ans = R0;
        Ri = R0;
        for (int i = 1; i < arr.length; i++) {
            Ri = Ri + sum - (arr.length * arr[arr.length - i]);
            if(ans<Ri) {
                ans = Ri;
            }
        }

        System.out.print("Answer: "+ans);
    }
}
