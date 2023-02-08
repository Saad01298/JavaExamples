package Coding.Notes.Array;

import java.util.Collections;
import java.util.PriorityQueue;

public class Array1MaximumOfAllSubarraysOfSizeK {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(
                Collections.reverseOrder());
        int [] arr = new int[]{1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3;

        for (int i = 0; i < k; i++) {
            maxHeap.add(arr[i]);
        }
        System.out.print(maxHeap.peek()+" ");
        for (int i = k; i < arr.length; i++) {
            maxHeap.remove(arr[i-k]);
            maxHeap.add(arr[i]);
            System.out.print(maxHeap.peek()+" ");
        }
    }
}
