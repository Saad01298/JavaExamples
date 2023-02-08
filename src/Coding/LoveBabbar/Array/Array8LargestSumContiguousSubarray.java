package Coding.LoveBabbar.Array;

import java.util.ArrayList;
import java.util.List;

public class Array8LargestSumContiguousSubarray {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(5,1,2,-80,6,3,-5,10,-20));
        int maxSum = Integer.MIN_VALUE, sum = 0, start = 0, end = 0, s = 0;

        for (int i = 0; i < arrayList.size(); i++) {
            sum = sum + arrayList.get(i);

            if (maxSum < sum) {
                maxSum = sum;
                start = s;
                end = i;
            }

            if (sum <= 0) {
                sum = 0;
                s = i + 1;
            }
        }

        System.out.print("Sum: "+maxSum+"\nStart: "+start+"\nEnd: "+end);
    }
}
