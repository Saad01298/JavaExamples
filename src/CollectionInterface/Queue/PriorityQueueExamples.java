package CollectionInterface.Queue;

import java.util.PriorityQueue;

class A {
    int a;
    int b;
    String c;

    A (int a, int b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
public class PriorityQueueExamples {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");

        System.out.println("Initial PriorityQueue " + pq);

        // using the method
        pq.remove("Geeks");

        System.out.println("After Remove - " + pq);

        System.out.println("Poll Method - " + pq.poll());


        PriorityQueue<A> pq1 = new PriorityQueue<>();

    }
}
