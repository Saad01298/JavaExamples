package Coding.LoveBabbar.Array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class ImprovedHashMap extends HashMap {
    static HashMap<Integer, Integer> intersectingHashMap = new HashMap<>();

    @Override
    public Object put(Object key, Object value) {
        if (this.containsKey(key)&&value!=this.get(key)) {
            intersectingHashMap.put((Integer) key, (Integer) value);
            return null;
        } else {
            return super.put(key, value);
        }
    }
}

public class Array6UnionAndIntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>(List.of(1,2,3,7,8,9));
        ArrayList<Integer> arrayList2 = new ArrayList<>(List.of(2,3,1,5,5,3,4,6,7));

        ImprovedHashMap improvedHashMap = new ImprovedHashMap();

        for (int i = 0; i < arrayList1.size(); i++)
            improvedHashMap.put(arrayList1.get(i),1);

        for (int i = 0; i < arrayList2.size(); i++)
            improvedHashMap.put(arrayList2.get(i),2);

        System.out.print("Union: ");
        improvedHashMap.forEach((m,n)->System.out.print(m+" "));
        System.out.print("\nIntersection: ");
        ImprovedHashMap.intersectingHashMap.forEach((m,n)->System.out.print(m+" "));
    }
}
