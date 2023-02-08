package Coding.LoveBabbar.Array;

import java.util.ArrayList;
import java.util.List;

public class Array2MaximumAndMinimumOfAnArrayUsingMinimumNumberOfComparisons {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(1000, 11, 445, 1, 330, 3000, 3, 12));
        int min, max, i=0;

        if (arrayList.size()%2==0) {
            if (arrayList.get(0)>arrayList.get(1)) {
                max = arrayList.get(0);
                min = arrayList.get(1);
            } else {
                max = arrayList.get(1);
                min = arrayList.get(0);
            }

            i = 2;
        } else {
            max = arrayList.get(0);
            min = arrayList.get(0);

            i = 1;
        }

        // if i > i + 1 then arr[i] can either be max or else nothing &&
        // arr[i+1] can either be min or else nothing
        while ( i < arrayList.size()-1) {
            if (arrayList.get(i)>arrayList.get(i+1)) {
                if (arrayList.get(i)>max)
                    max = arrayList.get(i);

                if (arrayList.get(i+1)<min)
                    min = arrayList.get(i+1);

            } else {
                if (arrayList.get(i+1)>max)
                    max = arrayList.get(i+1);

                if (arrayList.get(i)<min)
                    min = arrayList.get(i);
            }

            i=i+2;
        }

        System.out.println("min = "+min+" and max = "+max);
    }
}
