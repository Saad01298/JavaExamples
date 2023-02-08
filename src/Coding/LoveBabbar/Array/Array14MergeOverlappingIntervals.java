package Coding.LoveBabbar.Array;

import java.util.Arrays;
import java.util.Comparator;

class Interval {
    int s,e;

    public Interval(int s, int e) {
        this.s = s;
        this.e = e;
    }
}
public class Array14MergeOverlappingIntervals {
    public static void main(String[] args) {
        Interval arr[]=new Interval[6];
        arr[0]=new Interval(1,3);
        arr[1]=new Interval(2,6);
        arr[2]=new Interval(3,5);
        arr[3]=new Interval(9,12);
        arr[4]=new Interval(11,13);
        arr[5]=new Interval(14,16);


        // Sorting as per starting value
        Arrays.sort(arr, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.s-o2.s;
            }
        });

        int index = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[index].e>arr[i].s) {
                arr[index].e=Math.max(arr[index].e,arr[i].e);
            }
            else {
                index++;
                arr[index]=arr[i];
            }
        }

        for (int i = 0; i <= index; i++) {
            System.out.print("[" + arr[i].s + ","
                    + arr[i].e + "]");
        }
    }
}
