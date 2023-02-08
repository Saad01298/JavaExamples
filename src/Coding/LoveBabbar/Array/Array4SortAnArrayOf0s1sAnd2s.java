package Coding.LoveBabbar.Array;

import java.util.ArrayList;
import java.util.List;

public class Array4SortAnArrayOf0s1sAnd2s {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(2,1,0,0,1,1,2,1,0,1,0,0,2,2));
        int n=0, m=arrayList.size()-1,swap;

        for (int i = 0; i <= m; i++) {
            if (arrayList.get(i)==0) {
                swap=arrayList.get(n);
                arrayList.set(n,0);
                arrayList.set(i,swap);

                n++;
            } else if (arrayList.get(i)==2) {
                swap=arrayList.get(m);
                arrayList.set(m,2);
                arrayList.set(i,swap);

                i--;
                m--;
            }
        }

        arrayList.stream().forEach(k->System.out.print(k+" "));
    }
}
