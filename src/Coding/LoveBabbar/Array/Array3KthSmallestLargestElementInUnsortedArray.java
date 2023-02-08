package Coding.LoveBabbar.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class Array3KthSmallestLargestElementInUnsortedArray {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(3,12,7,107,235,1,90,2,28,31,10,43,20));
        int k = 4; //kth smallest and kth largest

        // nlogk - IMPORTANT
        /*
        We use PriorityQueue class to implement Heaps in Java. By default, Min Heap is implemented by
        this class. To implement Max Heap, we use Collections.reverseOrder() method.
        */

        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());

        for (int i = 0; i < arrayList.size(); i++) {
            minHeap.add(arrayList.get(i));
            maxHeap.add(arrayList.get(i));

            // because we are removing when size > k, so everytime the smallest element will be removed
            // and at the end, we will get kth largest element as root node, because if we remove smallest
            // element n - k times, then we will move to kth largest element.
            if (minHeap.size()>k)
                minHeap.remove();

            // because we are removing when size > k, so everytime the largest element will be removed
            // and at the end, we will get kth smallest element as root node
            if (maxHeap.size()>k)
                maxHeap.remove();
        }

        arrayList = (ArrayList<Integer>) arrayList.stream().sorted().collect(Collectors.toList());
        arrayList.stream().forEach(q->System.out.print(q+" "));

        System.out.println("\n"+k+"'th largest = "+minHeap.peek()+"\n"+k+"'th smallest = "+maxHeap.peek());
    }
}