package Coding.LoveBabbar.Array;

import java.util.ArrayList;
import java.util.List;

public class Array7ProgramToCyclicallyRotateAnArrayByOne {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(3,2,5,1,7));

        int swap = arrayList.get(arrayList.size()-1);
        for (int i = arrayList.size()-1; i > 0; i--) {
            arrayList.set(i, arrayList.get(i-1));
        }
        arrayList.set(0, swap);

        arrayList.forEach(k->System.out.print(k+" "));
    }
}
