package Coding.LoveBabbar.Array;

public class Array31SmallestSubarrayWithSumGreaterThanAGivenValue {
    public static void main(String[] args) {
        int [] arr = new int[]{1, 4, 45, 6, 0, 19, 51};
        int n = arr.length, curr_sum = 0, min_len = n + 1;
        int x = 50;

        // Initialize starting and ending indexes
        int start = 0, end = 0;
        while (end < n) {
            // Keep adding array elements while current sum
            // is smaller than or equal to x
            while (curr_sum <= x && end < n)
                curr_sum += arr[end++];

            // If current sum becomes greater than x.
            while (curr_sum > x && start < n) {
                // Update minimum length if needed
                if (end - start < min_len)
                    min_len = end - start;

                // remove starting elements
                curr_sum -= arr[start++];
            }
        }

        System.out.println(min_len);
    }
}
