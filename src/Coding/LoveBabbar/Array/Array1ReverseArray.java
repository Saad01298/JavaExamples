package Coding.LoveBabbar.Array;

import java.util.ArrayList;
import java.util.List;

public class Array1ReverseArray {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(2,31,4,6,3));
        int i = 0, j = arrayList.size()-1, swap;

        // traverse array from 0 to n/2 and swap arr[i++] with arr[j--]
        while (i<=j) {
            swap=arrayList.get(i);
            arrayList.set(i,arrayList.get(j));
            arrayList.set(j,swap);

            i++; j--;
        }

        arrayList.stream().forEach(k->System.out.print(k+" "));
    }
}
